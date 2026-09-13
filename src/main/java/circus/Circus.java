package circus;

import circus.animal.*;
import circus.equipment.Equipment;
import circus.equipment.Cannon;
import circus.equipment.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Number of animals in the circus: " + animals.length);

        //printAllAnimals();

        // throws error --> need arraylist
       // animals[3] = new Elephant(name:"StrongOne")

       // System.out.println("(Using Array) Number of animals in the circus" + animals.length);

        // print elements in the array
//        for (Animal a : animals){
//            System.out.println(a);
//        }

        ArrayList<Animal> animalArrayList = new ArrayList <>(Arrays.asList(animals));
//        printAllAnimals(animalArrayList);

        System.out.println("(using AL) Number of animals in the circus: " + animalArrayList.size());




        animalArrayList.add(new Elephant("StrongOne"));
//        System.out.println("Add a new elephant");


        Parrot andy = new Parrot("Andy");
        animalArrayList.add(andy);


        System.out.println("\n \n Before sorting:");
        printAllAnimals(animalArrayList);
//        System.out.println("(using AL) Number of animals in the circus" + animalArrayList.size());
//        System.out.println("Position of Andy in AL is:" + animalArrayList.indexOf(andy));

        Animal candidate = findAnimalReference(animalArrayList,"Polly");
        System.out.println("Position of Candidate in AL is:" + animalArrayList.indexOf(candidate));



        animalArrayList.sort(Animal.animalNameComparator);
        System.out.println("\n\n After Sorting: " );
        printAllAnimals(animalArrayList);



//        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    /**
     * prints all elements in the array list (of type Animal)
     */

    private static void printAllAnimals(ArrayList<Animal> animals) {
        for (Animal a : animals){
            System.out.println(a);
        }
    }

    private static Animal findAnimalReference(ArrayList<Animal> animals, String nameOfAnimal){
        for(Animal a: animals){
            if(a.name == nameOfAnimal){
                return a;
            }

        }
        return null;
    }
}
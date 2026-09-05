package circus.Animal;

import circus.Asset;

public abstract class Animal implements Asset {
    // contract --> anything that inherits must provide this behaviour
    public abstract String speak();

    // abstract method needs an abstract class!!!!!!!

//    public int getValue(){
//        return 5;
//    }
}

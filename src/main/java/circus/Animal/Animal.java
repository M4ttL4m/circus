package circus.Animal;

import circus.Asset;

public abstract class Animal implements Asset {
    // contract --> must provide
    public abstract String speak();

    public int getValue(){
        return 5;
    }
}

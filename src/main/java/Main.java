package main.java;

import main.java.factory.FactoryDemo;
import main.java.flyweight.FlyweightDemo;
import main.java.mediator.MediatorDemo;
import main.java.singleton.SingletonDemo;

public class Main {

    /**
     * Description: Runs all the design pattern demos.
     * 
     * @param args - oh ya!
     */
    public static void main(String[] args) {
        System.out.println("This Project is the Bees Knees!");
        
        SingletonDemo.main(args);
        
        FlyweightDemo.main(args);
        
        FactoryDemo.main(args);
        
        MediatorDemo.main(args);
    }
}

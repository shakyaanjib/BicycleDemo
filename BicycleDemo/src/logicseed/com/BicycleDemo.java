package logicseed.com;

public class BicycleDemo {

	public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        Bicycle bike3 = new Bicycle();
        Bicycle bike4 =new Bicycle();
        Bicycle bike5 =new Bicycle();


        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        
        bike3.changeGear(4);
        bike3.changeGear(3);
        bike3.printStates();
        
        bike4.changeGear(4);
        bike4.changeGear(3);
        bike4.printStates();
        
        bike5.changeGear(4);
        bike5.changeGear(3);
        bike5.printStates();
    }

}

/*• We are going back to the Car analogy.
• Create a base class called Car. It should have a few fields that would be appropriate for
a generic Car class (as engine, cylinders, wheels etc.).
• Constructor should initialize cylinders (number of) and name and set wheels to 4 and engine to true. 
Cylinders and names will be passed parameters.
 • Create appropriate getters. 
• Create some methods like start engine, accelerate and brake. Show a message for each in the base class. 
• Now create 3 subclasses for your favorite vehicles.
• Overwrite the appropriate methods to demonstrate polymorphism in use. 
• Put all classes in one java file. */
package Challenge6;

public class Car {
    public boolean engine=true;
    public int NoOfcylinders;
    public int wheels=4;
    public String name;

public Car(int NoOfcylinders, String name,int wheels, boolean engine ){
    this.name= name;
    this.NoOfcylinders=NoOfcylinders;
    this.wheels=wheels;
    this.engine=engine;     
    }

public int getNoOfcylinders(){
    return NoOfcylinders;
}

public boolean getengine(){
    return engine;
}

public int getwheels(){
    return wheels;
}

public String getname(){
    return name;
}

public void setNoOfCylinders(int NoOfcylinders){
    this.NoOfcylinders= NoOfcylinders;

}
public void setName(String name){
    this.name=name;
}

public void setwheels(int wheels){
    this.wheels=wheels;
}

public void setengine(boolean engine){
    this.engine=engine;
}
public void startengine(){
    System.out.println("START ENGINE:");
}
public void accelerate(){
    System.out.println("ACCELERATE:");
}

public void brake(){
    System.out.println("BRAKE:");
}

}

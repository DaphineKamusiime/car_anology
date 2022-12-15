package Challenge6;

public class Hatchback  extends Car{


    public Hatchback(int NoOfcylinders, String name, int wheels, boolean engine) {
        super(NoOfcylinders, name, wheels, engine);
       
        //TODO Auto-generated constructor stub
    }


    public void accelerate() {
        System.out.println("acceleration needed");
    }

    public void brake() {
        System.out.println("please break");
    }

    public void startengine() {

        System.out.println("turn on engine");
    }
}


package javaprogram.AnnoymousClass;

public class Driver {
    public static void main(String[] args) {
        Car c=new Car()
        {
            @Override
            public void start() {
                System.out.println("Car Started");
            }

            @Override
            public void stop() {
                System.out.println("Car Stoped");
            }
        };
        c.start();
        c.stop();
    }
}

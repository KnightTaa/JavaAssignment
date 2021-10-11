//Example of Abstract class that has an abstract method

package q10;

abstract class Car {
    abstract void run();
}

class Civic extends Car{
    void run(){
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Car obj = new Civic();
        obj.run();
    }
}

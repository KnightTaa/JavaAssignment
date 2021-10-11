package q11;

//Create interface A
interface A {
    void meth1();
    void meth2();
}

//Extends interface A to B
//Now B has A methods
//Add new meth3
interface B extends A{
    void meth3();
}

//Create MyClass
class MyClass implements B{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }

}

public class InterfaceTest1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}

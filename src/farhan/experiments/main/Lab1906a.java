//19.06.2025 java lab
package farhan.experiments.main;

class MyClass {

    String printHello() {
        return "Hello Farhan";
    }

}

public class Lab1906a {

    public static void main(String args[]) {
        MyClass obj1 = new MyClass();
        System.out.println(obj1.printHello());
        obj1 = null; //nullifying the object using null make it eligible for GC
        try {
            System.out.println(obj1.printHello());
        } catch (Exception e) {
            System.out.println("Obj1 was nullified and with error: " + e);
        }
        MyClass obj2 = new MyClass();
        System.out.println(obj2.printHello());
        MyClass obj3 = new MyClass();
        obj3 = obj2; //resigning reference to another object makes it eligible for GC
        System.out.println(obj3.printHello());
        System.out.println("hello");
    }
}

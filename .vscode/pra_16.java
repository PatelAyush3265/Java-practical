

class pra_16 {
    public void printParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("This is child class");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Parent parentObject = new Parent();
        Child childObject = new Child();
    
        parentObject.printParent();

   
        childObject.printChild();


        childObject.printParent();
    }
}
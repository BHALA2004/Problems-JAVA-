
class  ParentDone{
    public void PrintData() {
        System.out.println("method of parent class");
    }
}

class Child extends ParentDone {
   @Override
    public void PrintData() {
        System.out.println("method of child class");
    }
}
public class Parent {
    public static void main(String[] args) {
// error
//        ParentDone parentDone = new ParentDone();
//        Child c = (Child) parentDone;
//        System.out.println(parentDone);
//        System.out.println(c);

        //Upcasting
        ParentDone parentDone1 = new Child();
        System.out.println(parentDone1);


        //Downcasting
        ParentDone parentDone = new Child();
        Child c =(Child) parentDone;
        System.out.println(c);

    }


}

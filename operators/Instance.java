package operators;

class ParentClass {

}
interface MyInterface {

}

class Childclass extends ParentClass implements MyInterface {

}
public class Instance {
    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        Childclass obj2 = new Childclass();

        System.out.println(obj1 instanceof ParentClass);
        System.out.println(obj1 instanceof Childclass);
        System.out.println(obj1 instanceof MyInterface);
        System.out.println(obj2 instanceof MyInterface);
    }
}

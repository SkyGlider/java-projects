
public class ApplicationDriver {
    public static void main(String[] args) {
        Person tania = new Person();

        tania.setAge(21);
        System.out.println("Tania is " + tania.getAge() + " years old.");

        tania.setName("Tania Chin");
        System.out.println("Object's name is " + tania.getName());

        tania.setName("LongLongLongLongLongLong");
        System.out.println("Object's name is " + tania.getName());

    }
}



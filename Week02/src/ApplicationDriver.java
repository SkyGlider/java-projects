
public class ApplicationDriver {
    public static void main(String[] args) {

        Person tania = new Person();

        tania.setAge(21);
        System.out.println("Tania is " + tania.getAge() + " years old.");

        String colour1 = "Red";

        if (tania.setFavouriteColour(colour1)){
            System.out.println("Object's favourite colour is " + tania.getFavouriteColour());
        }
        else{
            System.out.println("Invalid colour, previous value retained");
        }
        
        String name1 = "Tania Chin";
        
        if (tania.setName(name1)){
            System.out.println("Object's name is " + tania.getName());
        }
        else{
            System.out.println("Invalid name, previous value retained");
        }

    }
}



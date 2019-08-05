
public class Person {
    private int age;
    private String name;


    public void setAge(int newAge){
        if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void setName(String newName){

        if (newName.length() > 0 && newName.length() < 21) {
            name = newName;
        }
        else{
            System.out.println("Invalid name!");
        }
    }

    public String getName() {
        return name;
    }
}



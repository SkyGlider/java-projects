
public class Person {

    private String favouriteColour;
    private  String name;
    private int age;

    public boolean setFavouriteColour(String newColour){

        if (newColour.length() >= 1 && newColour.length() <= 10) {
            favouriteColour = newColour;
            return true;
        }
        else {
            return false;
        }
    }

    public String getFavouriteColour(){
        return favouriteColour;
    }

    public boolean setName(String newName){

        if (newName.length() > 0 && newName.length() < 21) {
            name = newName;
            return true;
        }
        else{
            return false;
        }
    }

    public String getName() { return name; }

    public void setAge(int newAge){

        if (newAge > 0 && newAge <= 120) {
            age = newAge;
        }
    }

    public int getAge(){ return age; }


}



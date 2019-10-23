package hobby;

public abstract class HobbyBaseClass {
    private String hobbyName;
    private String hobbyDescription;
    private int myExperience;


    public HobbyBaseClass(String hobbyName, String hobbyDescription, int myExperience){
        this.hobbyName = hobbyName;
        this.hobbyDescription = hobbyDescription;
        this.myExperience = myExperience;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public String getHobbyDescription() {
        return hobbyDescription;
    }

    public int getMyExperience() {
        return myExperience;
    }

    public abstract String tellAboutHobby();
}

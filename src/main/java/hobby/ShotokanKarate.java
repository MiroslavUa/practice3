package hobby;

public class ShotokanKarate extends HobbyBaseClass {
    private static byte methodsOfTraining = 3;
    private static String kihon ="Kihon is base of Krate techniques";
    private static String kata ="Kata is tradition form of training. Kata is a soul of Karate";
    private static String kumite ="Kumite is free fight";
    private String mostDifficult;

    ShotokanKarate(String hobbyName, String hobbyDescription, int myExperience, String mostDifficult){
        super(hobbyName, hobbyDescription, myExperience);
        this.mostDifficult = mostDifficult;
    }

    public String tellAboutHobby(){
            return "In " + super.getHobbyName() + " there are " + methodsOfTraining + " methods of training:\n1." + kihon + ".\n2." +
                    kata + ".\n3." + kumite + ".\n" +
                    super.getHobbyDescription() + ".\n" + "The " + mostDifficult + " is most dangerous method of training" +
                    "\nMy experience in " + super.getHobbyName() + " is about " + super.getMyExperience() + " years.";
        }
}

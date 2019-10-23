package hobby;

public class ArtisticGymnastics extends HobbyBaseClass {
        private static byte gymnasticsApparatus = 6;
        private static String firstApp ="Horizontal bar";
        private static String secondApp ="Parallel bar";
        private static String thirdApp ="Still Rings";
        private static String fourthApp ="Pommel Horse";
        private static String fifthApp ="Vault";
        private static String sixthApp ="Floor Exercise";
        private String mostDifficultApp;

        ArtisticGymnastics(String hobbyName, String hobbyDescription, int myExperience, String mostDifficultApp){
            super(hobbyName, hobbyDescription, myExperience);
            this.mostDifficultApp = mostDifficultApp;
        }

        public String tellAboutHobby(){
            return "In " + super.getHobbyName() + " there are " + gymnasticsApparatus + " different gymnastics apparatus: " +
                    firstApp + ", " + secondApp + ", " + thirdApp + ", " + fourthApp + ", " + fifthApp + ", " + sixthApp
                    + ".\nIt is an " + super.getHobbyDescription() + ".\n" + "The " + mostDifficultApp + " elements are most difficult." +
                    "\nMy experience in " + super.getHobbyName() + " is about " + super.getMyExperience() + " years.";
        }
}

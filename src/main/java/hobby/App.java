package hobby;

public class App{

    public static void main( String[] args ) {
        createArray();
    }

    public static void createArray(){
        HobbyBaseClass artisticGymnastics = new ArtisticGymnastics("Artistic Gymnastics", "Olympic sports ",
                3,"Still Rings");
        HobbyBaseClass shotokanKarate = new ShotokanKarate("Shotokan Karate", "Shotokan Karate will be presented on Olympic Games in Tokyo",
                10,"Kumite");

        HobbyBaseClass[] arrayHobby = new HobbyBaseClass[2];
        arrayHobby[0] = artisticGymnastics;
        arrayHobby[1] = shotokanKarate;

        for (HobbyBaseClass hobby: arrayHobby){
            System.out.println(hobby.tellAboutHobby());
            System.out.print("\n");
        }
    }

}

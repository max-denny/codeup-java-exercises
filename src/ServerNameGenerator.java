import java.util.Arrays;


public class ServerNameGenerator {

    public static String[] nouns = {"threat", "jaguar", "sword"};
    public static String[] adjectives = {"crimson", "cunning", "dominant"};

    public static void makeRandom(){
        int rand  = (int)(Math.random() * adjectives.length);
        int rand2  = (int)(Math.random() * nouns.length);
        System.out.println(adjectives[rand] + "-" + nouns[rand2]);
    }


//    nouns = new String[10];
//
//    nouns[0] = "electricity";
//    nouns[1] = "aubergine";
//    nouns[2] = "threat";
//    nouns[3] = "celerity";
//    nouns[4] = "jaguar";
//    nouns[5] = "rifle";
//    nouns[6] = "gear";
//    nouns[7] = "vendetta";
//    nouns[8] = "sword";
//    nouns[9] = "alamo";

//    adjectives = new String[10];
//
//    adjectives[0] = "electricity";
//    adjectives[1] = "aubergine";
//    adjectives[2] = "crimson";
//    adjectives[3] = "alabaster";
//    adjectives[4] = "cunning";
//    adjectives[6] = "dominant";
//    adjectives[7] = "ominous";
//    adjectives[8] = "spiteful";
//    adjectives[5] = "vigilant";
//    adjectives[9] = "subterranean";


//        for(String noun : nouns) {
//        System.out.println(noun);
//    }
//
//        for(String adjective : adjectives) {
//        System.out.println(adjective);
//    }



    public static void main(String[] args) {

        makeRandom();

    }



}

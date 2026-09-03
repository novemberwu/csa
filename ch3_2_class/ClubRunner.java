package ch3_2_class;


public class ClubRunner {
    public static void main(String[] args) {

        ArtClubMember eva = new ArtClubMember("Eva");
        ArtClubMember jacob = new ArtClubMember("Jacob");
        ArtClubMember anita = new ArtClubMember("Anita");

        //className+ methodName
        System.out.println(ArtClubMember.getNumMembers());
        // objectName + methodName
        System.out.println(eva.getNumMembers());

        eva.printNumMember();


        /* ---- 🔎 ADD YOUR CODE BELOW THIS LINE ---- */





    }
}


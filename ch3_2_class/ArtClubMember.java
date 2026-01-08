package ch3_2_class;

/*
 * Represents a member of an art club
 */
public class ArtClubMember {

    private String name;                 // The name of the club member
    public static int numMembers = 0;   // The number of club members

    /*
     * Sets name to the specified name
     */
    public ArtClubMember(String name) {
        this.name = name;
        numMembers++;
    }

    /*
     * Returns the name of the club member
     */
    public String getName() {
        return name;
    }


    public void printNumMember(){
        System.out.println("This is:"+numMembers);
    }

    /*
     * Returns the number of club members
     */
    public static String getNumMembers() {
        return "The Art Club has " + numMembers + " members.";
    }

}

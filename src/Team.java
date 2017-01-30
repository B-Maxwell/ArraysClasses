/**
 * Created by Ben Maxwell on 1/30/17.
 * This class tracks sports team information
 *
 */
public class Team {

    String sport; //i.e. football, basketball, baseball, etc.
    String name;
    String location;
    int numPlayers; //number of players on team roster (does not include players of practice squad)
    int wins; //number of wins
    int losses; //number of losses
    int ties; //number of ties
    int rank; //latest ranking of the team in the league

    public static void main(String[] args) {
        Team t1 = new Team();
        t1.sport = "Pro Football";
        t1.name = "Titans";
        t1.location = "Nashville, TN";
        t1.numPlayers = 53;
        t1.wins = 9;
        t1.losses = 7;
        t1.ties = 0;
        t1.rank = 7;

        System.out.println("The " + t1.sport + " " + t1.name + " located in " + t1.location + " has " + t1.numPlayers + " Players."
                + " This season they had " + t1.wins + " and " + t1.losses + " losses." );



    }

}

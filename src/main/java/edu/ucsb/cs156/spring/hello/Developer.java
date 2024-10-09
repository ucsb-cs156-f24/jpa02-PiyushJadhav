package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {
    }

    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Piyush";
    }

    /**
     * Get the github id of the developer
     * 
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "PiyushJadhav";
    }

    /**
     * Get the developers team
     * 
     * @return developers team as a Java object
     */

    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("f24-04");
        team.addMember("Piyush");
        team.addMember("Nilay");
        team.addMember("Nikhil");
        team.addMember("Jackie");
        team.addMember("Alvin");
        team.addMember("Michael H");
        return team;
    }
}

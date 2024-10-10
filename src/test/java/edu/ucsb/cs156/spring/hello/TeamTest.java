package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;
    Team team3;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
        team2 = new Team("test-team2");
        team2.addMember("test");
        team3 = new Team("test-team");
        team3.addMember("test");
    }

    @Test
    public void getName_returns_correct_name() {
        assert (team.getName().equals("test-team"));
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_correct() {
        assert (team.equals(team));
        assert !(team.equals("hello"));
        assert !(team.equals(team2));
        assert !(team.equals(team3));
    }

    @Test
    public void hashCode_returns_correct() {
        int result = team2.hashCode();
        int expectedResult = 641690875;

        assertEquals(expectedResult, result);

    }
}

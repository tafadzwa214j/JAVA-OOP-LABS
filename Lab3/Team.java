package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private final List<String> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(name);
    }

    // Unsafe: returns the original list
    public List<String> getMembersUnsafe() {
        return members;
    }

    // Safe: prevents outside modification
    public List<String> getMembersSafe() {
        return Collections.unmodifiableList(
                new ArrayList<>(members));
    }

    public static void main(String[] args) {

        Team team = new Team();

        team.addMember("Tendai");
        team.addMember("Rudo");

        team.getMembersUnsafe().clear();
        System.out.println("After unsafe clear: "
                + team.getMembersSafe().size());

        team.addMember("Tendai");
        team.addMember("Rudo");

        try {
            team.getMembersSafe().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "Safe getter blocked modification");
        }
    }
}
class RescueTeam {
    String teamId;
    String location;

    RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    public void performDuty() {
        System.out.println("Rescue team is performing duty.");
    }

    public void display() {
        System.out.println("Team ID: " + teamId);
        System.out.println("Location: " + location);
    }
}

class MedicalTeam extends RescueTeam {
    MedicalTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("Medical Team is treating injured people.");
    }
}

class FireRescueTeam extends RescueTeam {
    FireRescueTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("Fire Rescue Team is controlling fire and rescuing people.");
    }
}

class FoodSupplyTeam extends RescueTeam {
    FoodSupplyTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("Food Supply Team is distributing food and water.");
    }
}

public class DisasterRescueManagement {

    public static void findTeamByLocation(RescueTeam[] teams, String location) {
        boolean found = false;

        for (RescueTeam team : teams) {
            if (team.location.equalsIgnoreCase(location)) {
                team.display();
                team.performDuty();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No team found at this location.");
        }
    }

    public static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
        System.out.println("Teams with ID starting with \"" + prefix + "\":");

        for (RescueTeam team : teams) {
            if (team.teamId.startsWith(prefix)) {
                team.display();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        RescueTeam[] teams = {
                new MedicalTeam("M101", "Delhi"),
                new FireRescueTeam("F201", "Noida"),
                new FoodSupplyTeam("FS301", "Delhi"),
                new MedicalTeam("M102", "Lucknow"),
                new FireRescueTeam("F202", "Delhi"),
                new FoodSupplyTeam("FS302", "Agra")
        };

        int medical = 0, fire = 0, food = 0;

        for (RescueTeam team : teams) {
            team.display();
            team.performDuty();
            System.out.println();

            if (team instanceof MedicalTeam)
                medical++;
            else if (team instanceof FireRescueTeam)
                fire++;
            else if (team instanceof FoodSupplyTeam)
                food++;
        }

        System.out.println("Medical Teams: " + medical);
        System.out.println("Fire Rescue Teams: " + fire);
        System.out.println("Food Supply Teams: " + food);

        if (medical >= fire && medical >= food)
            System.out.println("Maximum Deployments: Medical Team");
        else if (fire >= medical && fire >= food)
            System.out.println("Maximum Deployments: Fire Rescue Team");
        else
            System.out.println("Maximum Deployments: Food Supply Team");

        System.out.println();
        findTeamByLocation(teams, "Delhi");

        System.out.println();
        displayTeamsByPrefix(teams, "M");
    }
}
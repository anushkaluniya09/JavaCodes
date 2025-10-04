package defaultconstructor.default5;

public class SpaceMission {
    String missionName;
    boolean launched;

    SpaceMission() {
        missionName = "Apollo-X";
        launched = false;
    }

    void details() {
        System.out.println("Mission: " + missionName + ", Launched: " + launched);
    }
}

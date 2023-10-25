public class Electricals {
	private int numberOfLights;
    private int numberOfFans;
    private int numberOfACs;
    private int numberOfEscalators;
    private int numberOfLifts;

    public Electricals(int numberOfLights, int numberOfFans, int numberOfACs, int numberOfEscalators, int numberOfLifts) {
        this.numberOfLights = numberOfLights;
        this.numberOfFans = numberOfFans;
        this.numberOfACs = numberOfACs;
        this.numberOfEscalators = numberOfEscalators;
        this.numberOfLifts = numberOfLifts;
    }

    public void electricalsDetails() {
        System.out.println("Number of Lights: " + numberOfLights);
        System.out.println("Number of Fans: " + numberOfFans);
        System.out.println("Number of ACs: " + numberOfACs);
        System.out.println("Number of Escalators: " + numberOfEscalators);
        System.out.println("Number of Lifts: " + numberOfLifts);
    }

    public void calcPowerConsumption() {
        int totalPowerConsumption = (numberOfLights * 100) + (numberOfFans * 75) + (numberOfACs * 1500);
        System.out.println("Total Power Consumption: " + totalPowerConsumption + " watts");
    }

    // Getters and setters for the attributes
    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public void setNumberOfFans(int numberOfFans) {
        this.numberOfFans = numberOfFans;
    }

    public int getNumberOfACs() {
        return numberOfACs;
    }

    public void setNumberOfACs(int numberOfACs) {
        this.numberOfACs = numberOfACs;
    }

    public int getNumberOfEscalators() {
        return numberOfEscalators;
    }

    public void setNumberOfEscalators(int numberOfEscalators) {
        this.numberOfEscalators = numberOfEscalators;
    }

    public int getNumberOfLifts() {
        return numberOfLifts;
    }

    public void setNumberOfLifts(int numberOfLifts) {
        this.numberOfLifts = numberOfLifts;
    }
}

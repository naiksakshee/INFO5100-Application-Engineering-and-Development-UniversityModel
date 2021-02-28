package patienthistory;

public class VitalSigns {
    private String ageGroup;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double weightInKG;
    private double weightInLB;

    public VitalSigns(String ageGroup,
            int respiratoryRate,
            int heartRate,
            int bloodPressure,
            double weightInKG,
            double weightInLB) {
        this.ageGroup = ageGroup;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weightInKG = weightInKG;
        this.weightInLB = weightInLB;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setWeightInKG(double weightInKG) {
        this.weightInKG = weightInKG;
    }

    public void setWeightInLB(double weightInLB) {
        this.weightInLB = weightInLB;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public double getWeightInLB() {
        return weightInLB;
    }
}

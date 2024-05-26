package Task2;

public class Main {
    public static void main(String[] args) {
        TreatmentPlan plan1 = new TreatmentPlan(1);
        Patient patient = new Patient(plan1);
        assignDoctor(plan1);
    }
    public static void assignDoctor(TreatmentPlan plan) {
        Doctor doctor;
        if (plan.getTreatmentCode() == 1) {
            doctor = new Surgeon();
        } else if (plan.getTreatmentCode() == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
        doctor.treat();
    }
}

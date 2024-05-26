package Task2;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечение проводит терапевт");
    }
}
package Task2;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечение проводит стоматолог");
    }
}

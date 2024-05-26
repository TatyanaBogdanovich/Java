package Task2;

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечение проводит хирург");
    }
}

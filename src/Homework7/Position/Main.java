package Homework7.Position;

public class Main {
        public static void main(String[] args) {
        Person director = new Director("Директор");
        director.showPosition();
        Person accountant = new Bookkeeper("Бухгалтер");
        accountant.showPosition();
        Person worker = new Employee("Рабочий");
        worker.showPosition();
    }
}


package Homework7.Position;

class Director implements Person {
    public Director(String post) {
    }
    @Override
    public void showPosition() {
        String post = "Директор";
        System.out.println("Название должности: " + post);
    }
}
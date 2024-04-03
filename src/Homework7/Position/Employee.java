package Homework7.Position;
class Employee implements Person {
    private String post = "Employee";
    public Employee(String post) {
        this.post = post;
    }
    @Override
    public void showPosition() {
        System.out.println("Название должности: " + post);
    }
}
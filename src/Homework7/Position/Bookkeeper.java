package Homework7.Position;

class Bookkeeper implements Person {
    private String post = "Bookkeeper";
    public Bookkeeper(String post) {
        this.post = post;
    }
    @Override
    public void showPosition() {
        System.out.println("Название должности: " + post);
    }
}

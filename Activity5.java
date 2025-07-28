package Activities;

public class Activity5 {

    // Abstract class
    abstract static class Book {
        String title;
        abstract void setTitle(String s);

        // Concrete method
        String getTitle() {
            return title;
        }
    }

    // Subclass that implements abstract method
    static class MyBook extends Book {
        @Override
        public void setTitle(String s) {
            title = s;
        }
    }

    // main method
    public static void main(String[] args) {
        String title = "Hover Car Racer";

        Book newNovel = new MyBook();
        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}
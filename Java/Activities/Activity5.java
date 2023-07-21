package activities;

    abstract class Book{
        //Abstract class
        String title;
        abstract void setTitle(String T);
        String getTitle()
        {
            return title;
        }
    }
    class MyBook extends Book{
        public void setTitle(String s) {
            title = s;
        }

    }
public class Activity5 {
    public static void main(String[] args) {
        String title = "My book";
        //MyBook newNovel = new MyBook();
        Book newNovel = new MyBook();
        //Set title
        newNovel.setTitle(title);

        //Print result
        System.out.println("The title of book is: " + newNovel.getTitle());
    }
}

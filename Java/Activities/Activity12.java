package activities;

interface Addable{
    int add(int num1, int num2);
}
public class Activity12{
    public static void main(String[] args) {
        Addable ad1 = (int a, int b) -> (a + b);
        System.out.println(ad1.add(12, 22));

        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad1.add(400, 10));
    }
}

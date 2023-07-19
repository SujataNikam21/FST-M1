package activities;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000; //1000000000/31557600/0.2408467
        double [] planet = {31557600,0.2408467,0.61519726,1.8808158,11.862615,29.447498,84.016846,164.79132};
        String [] name= {"Earth","Mercury","Venus","Mars","Jupiter","Saturn","Uranus","Neptune"};
      //Calculations in loop
        for(int i=0;i<8;i++)
        {
            System.out.println("Age on "+ name[i] + ": "+ seconds / planet[0] / planet[i]);
        }

    }
}


package activities;

public class Activity2 {
    public static void main(String[] args){
        int Array[]=  {10, 77, 10, 54, -11, 10};
        int len = Array.length;
        int num=0;
        for (int i =0;i<=len-1;i++)
        {
            if(Array[i]==10)
                num=num+Array[i];
        }
        if(num==30)
            System.out.println("true");
        else
            System.out.println("false");

    }
}

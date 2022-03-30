package March282022;

import java.util.HashMap;

public class Lockers {
    public static void main(String[] args) {
        //To keep track of how lockers are being opened.
        int counter = 0;
        //to iterate through the total of 100 lockers
        for(int i = 1; i < 101; i++){
            //to make sure it's actually being open if so, to check.
            boolean yes = true;
            //to iterate the i with another nested for loop
            for(int j = 1; j <= i; j++){
                //Making sure that it's 0, which would result being true, that meaning it wasn't open
                if(i % j == 0){
                    yes = !yes;
                }
            }
            //to check if it's false, if so, to add increment to the  counter to see the lockers left.
            if(!yes){
                counter++;
            }
        }
        System.out.println(counter);
    }


}


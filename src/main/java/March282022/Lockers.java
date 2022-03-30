package March282022;

import java.util.HashMap;

public class Lockers {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 1; i < 101; i++){
            boolean yes = true;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    yes = !yes;
                }
            }
            if(!yes){
                counter++;
            }
        }
        System.out.println(counter);
    }


}


package sum;

import java.util.*;

public class SumN {
    public static void main(String[] args){

        int n = 5, i;
        int sum=0;
        List<Integer> l1list = Arrays.asList(1,2,3,4,5);

        for (i=0;i<n;i++)
            sum+=l1list.get(i);
        System.out.println(sum);

    }


    }

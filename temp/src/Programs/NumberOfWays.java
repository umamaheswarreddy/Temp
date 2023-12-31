package Programs;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 07/08/22
 */
public class NumberOfWays {
    public static long numberOfWays(String s) {
        // Write your code here
        int n=s.length();
        long res=0;
        int count0=0;
        int count1=0;

        int[] left0=new int[n];
        int[] left1=new int[n];

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0')
                count0++;
            else
                count1++;

            left0[i]=count0;
            left1[i]=count1;
        }

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0')   //for 101
                res+=left1[i]*(count1-left1[i]);
            else                   //for 010
                res+=left0[i]*(count0-left0[i]);
        }

        return res;

    }

    public static void main(String[] args) {

        String str="10111";
        long l = NumberOfWays.numberOfWays(str);
        System.out.println(l);


    }

}

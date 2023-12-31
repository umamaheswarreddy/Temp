package Programs;

import java.util.Arrays;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 06/11/22
 */
public class singaloor {

    public static String password( String[] passwords, String checkString ) {


        char d=checkString.charAt(0);
        int i1 = Integer.parseInt(String.valueOf(d));
        String substring = checkString.substring(1, 4);
        char c = checkString.charAt(checkString.length() - 1);
        String nstr="";
        char ch;
        int sum=0;
        for (int i=0; i<substring.length(); i++)
        {
            ch= substring.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }


        int dcount=0;
        for(String str:passwords){
            char[] chars = str.toCharArray();
            for(Character value:chars){
                if (Character.isUpperCase(value)) {
                    dcount++;
                }
                else if (Character.isDigit(value)) {
                    sum=sum+Integer.parseInt(String.valueOf(value));
                }
            }
            String substring1 = str.substring(str.length() - 3, str.length());
            if(dcount==i1 && substring1.equals(nstr) && sum ==c){
                System.out.println(str);
            }

        }




        return null;
    }

    public static void main(String[] args) {
        String[] list={"PASS6word","fdyfeyev"};
        password(list,"4dro6");

    }

}

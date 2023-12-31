/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 22/03/22
 */
public class palindrome {
    public static void main(String[] args) {
        String str="madamq";
        int i;
        boolean flag=true;
        int j=str.length();
        for(i=0,j=j-1;i>j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
               flag=false;
            }
        }
        if(flag) System.out.println(str +" is palindrome");
        else System.out.println(str +" is NOT palindrome");

    }
}

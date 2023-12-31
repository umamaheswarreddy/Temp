package Programs;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 28/09/22
 */
public class BY {

    public  static int add(int a, int b){
        return  a+b;
    }
    public static int add(int a, int b,int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(4,4));
        add(4,4,5);

    }

}

package Programs;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 17/08/22
 */
public class WordReverse {

    public static void main(String[] args) {

        String input= "My Name Uma";
        String[] strList = input.split(" ");

        for(int i=strList.length-1;i>=0;i--){

            System.out.print(strList[i]+" ");
        }
        System.out.println();
        System.out.println(division(10,2));
        System.out.println(division(2,10));

    }

    public static int division(int number1, int number2){
        int result=0;
        if(number1>number2){
             result=number1/number2;
        }
        else result=number2/number1;

        return result;
    }


      // product orders

    /**
     *
     * SELECT p.productName,productId,O.orderId
     * FROM PRODUCT
     * OuterJOIN ORDERS ON
     * p.productid=o.productId and order.date="17-08-2022"
     *  nokia analytics
     */


}

package Java8;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 15/09/22
 */
public class FuncInterImpl {

    public static void main(String[] args) {
//        FuncInterface iface=()-> System.out.println("hello hello");
//        iface.hello();

        FuncInterface iface = (a, b) -> a + b;
        int add = iface.add(4, 5);
        System.out.println(add);

        FuncInterface.util();

        FuncInterface face=new FuncInterface() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(face.add(5,5));

    }
}

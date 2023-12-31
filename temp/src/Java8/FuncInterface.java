package Java8;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 15/09/22
 */
@FunctionalInterface
public interface FuncInterface {
    //    void hello();
    int add(int a, int b);

    default void print() {
        System.out.println("default print method ");
    }

    static void util() {
        System.out.println("static util method ");
    }
}

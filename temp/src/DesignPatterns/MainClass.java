package DesignPatterns;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 19/07/22
 */
public class MainClass {

    public static void main(String[] args) {

        SingletonClass singletonObject = SingletonClass.getInstance();
        singletonObject.simpleMethod();

        SingletonClass singletonObject2 = SingletonClass.getInstance();
        singletonObject2.simpleMethod();

       //we will get the same hashcode for both Singleton Objects because only one instance Created

    }
}

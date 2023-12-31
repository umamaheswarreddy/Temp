package DSA.LINKEDLIST;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 25/08/22
 */
public class MainDLL {

    public static void main(String[] args) {
        DLL dl =new DLL();

        dl.insertFirst(3);
        dl.insertFirst(4);
        dl.insertFirst(5);

        dl.display();
        dl.insertLast(6);
        dl.display();
        dl.insert(3,4);
        dl.display();

    }

}

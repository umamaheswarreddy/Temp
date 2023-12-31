package DSA.LINKEDLIST;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 24/08/22
 */
public class MainLL {

    public static void main(String[] args) {

        LL lList=new LL();

        lList.insertFirst(2);
        lList.insertFirst(3);
        lList.insertFirst(4);
        lList.insertFirst(5);
        lList.insertFirst(6);
        lList.display();
        lList.reverse();
        lList.display();

    /*    lList.insertLast(9);
//        lList.insertLastWithOutUsingTail(10);

//        lList.display();
//        lList.insert(40,3);
//        System.out.println(lList.deleteFirst());
        lList.display();
        System.out.println(lList.deleteLast());
        lList.display();
        System.out.println(lList.delete(1));
        lList.display();
        lList.find(3);
*/





    }
}

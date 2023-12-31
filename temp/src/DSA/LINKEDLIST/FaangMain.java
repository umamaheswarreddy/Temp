package DSA.LINKEDLIST;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 26/08/22
 */
public class FaangMain {
    public static void main(String[] args) {

/*        LL l=new LL();
        l.insertFirst(1);
        l.insertLast(1);
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(4);
        l.insertLast(4);

        l.duplicates();
        l.display();*/

        LL first=new LL();
        LL second=new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(6);
        second.insertLast(9);
        second.insertLast(10);

        LL mergeResult = LL.merge(first, second);
        InterviewQuestions q=new InterviewQuestions();
        q.isHappy(19);

        mergeResult.display();


    }
}

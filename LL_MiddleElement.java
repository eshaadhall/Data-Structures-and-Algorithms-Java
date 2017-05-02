/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_middleelement;
import java.util.*;
import java.util.ListIterator;
/**
 *
 * @author eshaa.dhall
 */
public class LL_MiddleElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //create a linkedlists
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(31);
        ll.add(32);
        ll.add(90);
        ll.add("Chocolate");
        ll.add("Shake");
        ll.add(20);
        ll.add(19);
        int length=ll.size();
        int middle=(length/2);
        System.out.println(ll.get(middle).toString());
    }
 
    }


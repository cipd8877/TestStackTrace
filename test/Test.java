/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Guess
 */
public class Test {
    public static void function1(){
        Test.function2();
    }
    
    public static void function2(){
       int i;
        int len = Thread.currentThread().getStackTrace().length;
        String whoCallsMe = "";
        if (1 == 1) {
            for (i = 0; i < len; i++) {
               whoCallsMe += Thread.currentThread().getStackTrace()[i].getMethodName();
            }
        }
        System.out.println("I am function 2, and tthis funtions call me: " + whoCallsMe );
        function4();
    }
    public static void function4(){
        Test2 f3 = new Test2();
       
       f3.function3();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        function1();
    }
}


class Test2 {

    public void function3() throws ArrayIndexOutOfBoundsException {
        int i;
        int len = Thread.currentThread().getStackTrace().length;
        String whoCallsMe = "";
        if (1 == 1) {
            for (i = 0; i < len; i++) {
              whoCallsMe += Thread.currentThread().getStackTrace()[i].getMethodName();
            }
        }
        System.out.println("I am function 3 in "+ Test2.class.getName()+", and tthis funtions call me: " + whoCallsMe );
    }
}
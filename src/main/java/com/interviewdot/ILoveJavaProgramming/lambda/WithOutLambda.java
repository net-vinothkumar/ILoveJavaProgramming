package com.interviewdot.ILoveJavaProgramming.lambda;

// A lambda EXPRESSION is a BLOCK OF CODE that can be PASSED AROUND to execute.

public class WithOutLambda {
    public static void main(String[] args) {
        search();
        purchase();
    }

    private static void search() {
        try {
            auditEntry();           // DUPLICATE
            checkItemInDB();        // DUPLICATE

            searchOrder();          // specific code     => LAMBDA

            auditExit();            // DUPLICATE
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void purchase() {
        try {
            auditEntry();           // DUPLICATE
            checkItemInDB();        // DUPLICATE

            purchaseOrder();        // specific code     => LAMBDA

            auditExit();            // DUPLICATE
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void searchOrder() {
        System.out.println("I am searching an order");
    }

    private static void purchaseOrder() {
        System.out.println("I am purchasing an order");
    }

    private static void auditExit() {
        // code..
    }

    private static void auditEntry() {
        // code..
    }

    private static void checkItemInDB() {
        // code..
    }
}


package com.interviewdot.ILoveJavaProgramming.lambda;

public class WithLambda {
    public static void main(String[] args) {
        Order searchOrder = () -> System.out.println("I am searching an order");
        Order purchaseOrder = () -> System.out.println("I am purchasing an order");

        order(searchOrder);
        order(purchaseOrder);
        order(purchaseOrder);
        order(purchaseOrder);
        order(purchaseOrder);
        order(purchaseOrder);
        order(purchaseOrder);
        order(purchaseOrder);
    }

    private static void order(Order order) { // Search or Purchase
        try {
            auditEntry();       // ONE TIME
            checkItemInDB();    // ONE TIME

            order.execute();    // specific code

            auditExit();        // ONE TIME
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void checkItemInDB() {
        // code..
    }

    private static void auditEntry() {
        // code..
    }

    private static void auditExit() {
        // code..
    }
}

@FunctionalInterface
interface Order {
    void execute();
}

package com.company;

public interface Menu {
    public static void menu() {
        System.out.println("***** MENU *****");
        System.out.println("1. USER");
        System.out.println("2. TODOS");
        System.out.println("3. POST");
        System.out.println("4. COMMENT");
        System.out.println("0. EXIT");
    }

    public static void userMenu() {
        System.out.println("***** USER MENU *****");
        System.out.println("1. CREATE USER");
        System.out.println("2. GET USER");
        System.out.println("3. UPDATE USER");
        System.out.println("4. DELETE USER");
        System.out.println("0. EXIT");
    }

    public static void toDosMenu() {
        System.out.println("***** TODOS MENU *****");
        System.out.println("1. CREATE TODOS");
        System.out.println("2. GET TODOS");
        System.out.println("3. UPDATE TODOS");
        System.out.println("4. DELETE TODOS");
        System.out.println("0. EXIT");
    }

    public static void postMenu() {
        System.out.println("***** POST MENU *****");
        System.out.println("1. CREATE POST");
        System.out.println("2. GET POST");
        System.out.println("3. UPDATE POST");
        System.out.println("4. DELETE POST");
        System.out.println("0. EXIT");
    }

    public static void commentMenu() {
        System.out.println("***** COMMENT MENU *****");
        System.out.println("1. CREATE COMMENT");
        System.out.println("2. GET COMMENT");
        System.out.println("3. UPDATE COMMENT");
        System.out.println("4. DELETE COMMENT");
        System.out.println("0. EXIT");
    }
}

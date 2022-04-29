package com.company.controller;

import com.company.ComponentContainer;
import com.company.entity.User;
import com.company.enums.Genders;
import com.company.enums.UserStatus;
import com.google.gson.Gson;

import java.util.Scanner;

public class UserController {

    public void createUser() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("- Enter user name -");
        String name = scanner.next();
        System.out.println("- Enter email -");
        String email = scanner.next();
        System.out.println("- Choose gender -");
        System.out.println("1. Male");
        System.out.println("2. Female");
        int action = scanner.nextInt();
        Genders genders = Genders.male;
        if (action == 2) {
            genders = Genders.female;
        } else {
            System.out.println("Your gender is entered -> male");
        }
        System.out.println("- Choose User Status -");
        System.out.println("1. Active");
        System.out.println("2. Inactive");
        int actions = scanner.nextInt();
        UserStatus status = UserStatus.active;
        switch (actions) {
            case 1:
                break;
            case 2:
                status = UserStatus.inactive;
                break;
            default:
                System.out.println("Your status is entered -> active");
                break;
        }

        user.setName(name);
        user.setEmail(email);
        user.setGender(genders);
        user.setStatus(status);
        Gson gson = new Gson();
        String str = gson.toJson(user);
        System.out.println(str);

        ComponentContainer.userService.createUser(str);
    }

    public void updateUser() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("- Enter userId -");
        Integer userId = ComponentContainer.scanner.nextInt();
        System.out.println("- Enter user name -");
        String name = scanner.next();
        System.out.println("- Enter email -");
        String email = scanner.next();
        System.out.println("- Choose gender -");
        System.out.println("1. Male");
        System.out.println("2. Female");
        int action = scanner.nextInt();
        Genders genders = Genders.male;
        if (action == 2) {
            genders = Genders.female;
        } else {
            System.out.println("Your gender is entered -> male");
        }
        System.out.println("- Choose User Status -");
        System.out.println("1. Active");
        System.out.println("2. Inactive");
        int actions = scanner.nextInt();
        UserStatus status = UserStatus.active;
        switch (actions) {
            case 1:
                break;
            case 2:
                status = UserStatus.inactive;
                break;
            default:
                System.out.println("Your status is entered -> active");
                break;
        }

        user.setName(name);
        user.setEmail(email);
        user.setGender(genders);
        user.setStatus(status);
        Gson gson = new Gson();
        String str = gson.toJson(user);
        System.out.println(str);

        ComponentContainer.userService.updateUser(userId, str);
    }

    public void getUser() {
        System.out.println("- Enter User Id To Get User -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.userService.getUser(id);
    }

    public void deleteUser() {
        System.out.println("- Enter User Id To Delete User -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.userService.deleteUser(id);
    }
}
package com.company.controller;

import com.company.ComponentContainer;
import com.company.entity.UserToDo;
import com.company.enums.UserToDoStatus;
import com.google.gson.Gson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ToDoController {


    public void createToDo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter userId");
        Integer userId = scanner.nextInt();
        String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'+05:00'"));
        Scanner scanners = new Scanner(System.in);
        UserToDo userToDo = new UserToDo();
        System.out.println("- Enter title -");
        String title = scanners.nextLine();
        System.out.println("- Choose status -");
        System.out.println("1. pending");
        System.out.println("2. completed");
        int actions = scanner.nextInt();
        UserToDoStatus status = UserToDoStatus.pending;
        switch (actions) {
            case 1:
                break;
            case 2:
                status = UserToDoStatus.completed;
                break;
            default:
                System.out.println("Your status is entered -> pending");
                break;
        }
        userToDo.setUser_id(userId);
        userToDo.setTitle(title);
        userToDo.setDue_on(localDateTime);
        userToDo.setStatus(status);
        Gson gson = new Gson();
        String toDo = gson.toJson(userToDo);
        System.out.println(toDo);
        ComponentContainer.toDoService.createJsonTDO(toDo);

    }

    public void getToDo() {
        System.out.println("- Enter ToDo Id To Get ToDo -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.toDoService.getTDO(id);
    }

    public void updateToDo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Enter ToDo id ***");
        int id = ComponentContainer.scanner.nextInt();
        System.out.println("*** Enter userId ***");
        Integer userId = ComponentContainer.scanner.nextInt();
        String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'+05:00'"));
        Scanner scanners = new Scanner(System.in);
        UserToDo userToDo = new UserToDo();
        System.out.println("- Enter title -");
        String title = scanners.nextLine();
        System.out.println("- Choose status -");
        System.out.println("1. pending");
        System.out.println("2. completed");
        int actions = scanner.nextInt();
        UserToDoStatus status = UserToDoStatus.pending;
        switch (actions) {
            case 1:
                break;
            case 2:
                status = UserToDoStatus.completed;
                break;
            default:
                System.out.println("Your status is entered -> pending");
                break;
        }
        userToDo.setUser_id(userId);
        userToDo.setTitle(title);
        userToDo.setDue_on(localDateTime);
        userToDo.setStatus(status);
        Gson gson = new Gson();
        String toDo = gson.toJson(userToDo);
        System.out.println(toDo);
        ComponentContainer.toDoService.updateTDO(id, toDo);
    }

    public void deleteToDo() {
        System.out.println("- Enter ToDoS Id To Delete ToDo -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.toDoService.deleteTDO(id);
    }
}

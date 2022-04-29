package com.company.controller;

import com.company.ComponentContainer;
import com.company.entity.Post;
import com.company.entity.User;
import com.company.entity.UserToDo;
import com.company.enums.Genders;
import com.company.enums.UserStatus;
import com.company.enums.UserToDoStatus;
import com.google.gson.Gson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PostController {

    public void createPost() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("- Enter userId -");
        Integer userId = ComponentContainer.scanner.nextInt();
        System.out.println("- Enter title -");
        String title = scanner.nextLine();
        System.out.println("- Enter body -");
        String body = scanner.nextLine();
        Post post = new Post();
        post.setUser_id(userId);
        post.setTitle(title);
        post.setBody(body);

        Gson gson = new Gson();
        String toDo = gson.toJson(post);
        System.out.println(toDo);
        ComponentContainer.postService.createPost(toDo);

    }

    public void getPost() {
        System.out.println("- Enter Post Id To Get Post -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.postService.getPost(id);
    }

    public void updatePost() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Enter POST id to Update ***");
        int id = ComponentContainer.scanner.nextInt();
        System.out.println("- Enter userId -");
        Integer userId = ComponentContainer.scanner.nextInt();
        System.out.println("- Enter title -");
        String title = scanner.nextLine();
        System.out.println("- Enter body -");
        String body = scanner.nextLine();
        Post post = new Post();
        post.setUser_id(userId);
        post.setTitle(title);
        post.setBody(body);

        Gson gson = new Gson();
        String toDo = gson.toJson(post);
        System.out.println(toDo);
        ComponentContainer.postService.updatePost(id, toDo);
    }

    public void deletePost() {
        System.out.println("- Enter POST Id To Delete POST -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.postService.deletePost(id);
    }
}

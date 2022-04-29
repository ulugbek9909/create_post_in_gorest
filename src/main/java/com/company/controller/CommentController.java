package com.company.controller;

import com.company.ComponentContainer;
import com.company.entity.Comment;

import com.google.gson.Gson;

import java.util.Scanner;

public class CommentController {
    public void createComment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Enter postId -");
        Integer postId = ComponentContainer.scanner.nextInt();
        System.out.println("- Enter name -");
        String name = ComponentContainer.scanner.next();
        System.out.println("- Enter email -");
        String email = ComponentContainer.scanner.next();
        System.out.println("- Enter body -");
        String body = scanner.nextLine();
        Comment comment = new Comment();
        comment.setPost_id(postId);
        comment.setName(name);
        comment.setEmail(email);
        comment.setBody(body);

        Gson gson = new Gson();
        String toDo = gson.toJson(comment);
        System.out.println(toDo);
        ComponentContainer.commentService.createComment(toDo);
    }

    public void getComment() {
        System.out.println("- Enter Comment Id To Get Comment -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.commentService.getComment(id);
    }

    public void updateComment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Enter COMMENT id to Update ***");
        int id = ComponentContainer.scanner.nextInt();
        System.out.println("- Enter postId -");
        Integer postId = ComponentContainer.scanner.nextInt();
        System.out.println("- Enter name -");
        String name = ComponentContainer.scanner.next();
        System.out.println("- Enter email -");
        String email = ComponentContainer.scanner.next();
        System.out.println("- Enter body -");
        String body = scanner.nextLine();
        Comment comment = new Comment();
        comment.setPost_id(postId);
        comment.setName(name);
        comment.setEmail(email);
        comment.setBody(body);

        Gson gson = new Gson();
        String toDo = gson.toJson(comment);
        ComponentContainer.commentService.updateComment(id, toDo);
    }

    public void deleteComment() {
        System.out.println("- Enter COMMENT Id To Delete COMMENT -");
        int id = ComponentContainer.scanner.nextInt();
        ComponentContainer.commentService.deleteComment(id);
    }
}

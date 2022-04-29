package com.company;

import com.company.controller.CommentController;
import com.company.controller.PostController;
import com.company.controller.ToDoController;
import com.company.controller.UserController;
import com.company.service.CommentService;
import com.company.service.PostService;
import com.company.service.ToDoService;
import com.company.service.UserService;

import java.util.Scanner;

public interface ComponentContainer {
    UserController userController = new UserController();
    UserService userService = new UserService();
    ToDoService toDoService = new ToDoService();
    ToDoController toDoController = new ToDoController();
    CommentController commentController = new CommentController();
    CommentService commentService = new CommentService();
    PostService postService = new PostService();
    PostController postController = new PostController();
    Scanner scanner = new Scanner(System.in);

}

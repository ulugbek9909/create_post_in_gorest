package com.company;


public class Main {

    public static void main(String[] args) {


        while (true) {
            Menu.menu();
            int action = ComponentContainer.scanner.nextInt();
            switch (action) {
                case 0:
                    return;
                case 1:
                    Menu.userMenu();
                    action = ComponentContainer.scanner.nextInt();
                    userAction(action);
                    break;
                case 2:
                    Menu.toDosMenu();
                    action = ComponentContainer.scanner.nextInt();
                    toDoAction(action);
                    break;
                case 3:
                    Menu.postMenu();
                    action = ComponentContainer.scanner.nextInt();
                    postAction(action);
                    break;
                case 4:
                    Menu.commentMenu();
                    action = ComponentContainer.scanner.nextInt();
                    commentAction(action);
                    break;
                default:
                    break;
            }
        }


    }


    public static void userAction(int action) {
        switch (action) {
            case 1 -> ComponentContainer.userController.createUser();
            case 2 -> ComponentContainer.userController.getUser();
            case 3 -> ComponentContainer.userController.updateUser();
            case 4 -> ComponentContainer.userController.deleteUser();
            default -> {
            }
        }

    }

    public static void toDoAction(int action) {
        switch (action) {
            case 1 -> ComponentContainer.toDoController.createToDo();
            case 2 -> ComponentContainer.toDoController.getToDo();
            case 3 -> ComponentContainer.toDoController.updateToDo();
            case 4 -> ComponentContainer.toDoController.deleteToDo();
            default -> {
            }
        }

    }

    public static void postAction(int action) {
        switch (action) {
            case 1 -> ComponentContainer.postController.createPost();
            case 2 -> ComponentContainer.postController.getPost();
            case 3 -> ComponentContainer.postController.updatePost();
            case 4 -> ComponentContainer.postController.deletePost();
            default -> {
            }
        }
    }

    public static void commentAction(int action) {
        switch (action) {
            case 1 -> ComponentContainer.commentController.createComment();
            case 2 -> ComponentContainer.commentController.getComment();
            case 3 -> ComponentContainer.commentController.updateComment();
            case 4 -> ComponentContainer.commentController.deleteComment();
            default -> {
            }
        }
    }
}

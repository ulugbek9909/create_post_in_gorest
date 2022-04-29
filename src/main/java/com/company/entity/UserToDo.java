package com.company.entity;

import com.company.enums.UserToDoStatus;

import java.time.LocalDateTime;

public class UserToDo {
    private Integer id;
    private Integer user_id;
    private String title;
    private String due_on;
    private UserToDoStatus status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDue_on() {
        return due_on;
    }

    public void setDue_on(String due_on) {
        this.due_on = due_on;
    }

    public UserToDoStatus getStatus() {
        return status;
    }

    public void setStatus(UserToDoStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserToDo{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", due_on='" + due_on + '\'' +
                ", status=" + status +
                '}';
    }
}
/*"id":1965,
"user_id":3938,
"title":"Cervus crepusculum cilicium cetera abbas perferendis arx.",
"due_on":"2022-03-07T00:00:00.000+05:30",
"status":"completed"*/
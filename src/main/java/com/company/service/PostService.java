package com.company.service;

import com.company.entity.Post;
import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class PostService {

    public void createPost(String toDo) {
        try {
            URL url = new URL("https://gorest.co.in/public/v2/posts");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer 344b1639f8dbd070e2858ed25703fe3f20342479424a0d1fbb37ffefe2c21fbc");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);

            OutputStream outputStream = httpURLConnection.getOutputStream();
            byte[] bytes = toDo.getBytes(StandardCharsets.UTF_8);
            outputStream.write(bytes, 0, bytes.length);
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line);
            }
            bufferedReader.close();
            Gson gson = new Gson();
            Post post = gson.fromJson(builder.toString(), Post.class);
            //toDoIdList.add(userToDo.getId());
            System.out.println(post);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getPost(int id) {
        try {
            URL url = new URL("https://gorest.co.in/public/v2/posts/" + id);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer 344b1639f8dbd070e2858ed25703fe3f20342479424a0d1fbb37ffefe2c21fbc");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoOutput(true);

            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line);
            }
            bufferedReader.close();
            Gson gson = new Gson();
            Post post = gson.fromJson(builder.toString(), Post.class);
            System.out.println(post);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void updatePost(Integer id, String str) {

        try {
            URL url = new URL("https://gorest.co.in/public/v2/posts/" + id);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer 344b1639f8dbd070e2858ed25703fe3f20342479424a0d1fbb37ffefe2c21fbc");
            httpURLConnection.setRequestMethod("PUT");
            httpURLConnection.setDoOutput(true);

            OutputStream outputStream = httpURLConnection.getOutputStream();
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            outputStream.write(bytes, 0, bytes.length);
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            bufferedReader.close();
            Gson gson = new Gson();
            Post post = gson.fromJson(stringBuilder.toString(), Post.class);
            System.out.println(post);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deletePost(int id) {
        try {
            URL url = new URL("https://gorest.co.in/public/v2/posts/" + id);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer 344b1639f8dbd070e2858ed25703fe3f20342479424a0d1fbb37ffefe2c21fbc");
            httpURLConnection.setRequestMethod("DELETE");
            httpURLConnection.setDoOutput(true);
            InputStream inputStream = httpURLConnection.getInputStream();
            inputStream.close();
            System.out.println("Post deleted");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

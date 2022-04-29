package com.company.service;

import com.company.entity.User;
import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class UserService {

    public void createUser(String str) {
        try {
            URL url = new URL("https://gorest.co.in/public/v2/users");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer 344b1639f8dbd070e2858ed25703fe3f20342479424a0d1fbb37ffefe2c21fbc");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);

            OutputStream outputStream = httpURLConnection.getOutputStream();
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            outputStream.write(bytes, 0, bytes.length);
            InputStream inputStream = httpURLConnection.getInputStream();
            System.out.println("User Created");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            bufferedReader.close();
            Gson gson = new Gson();
            User user = gson.fromJson(stringBuilder.toString(), User.class);
            Integer userId = user.getId();

            System.out.println(userId);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getUser(int id) {
        try {
            URL url = new URL("https://gorest.co.in/public/v2/users/" + id);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer 344b1639f8dbd070e2858ed25703fe3f20342479424a0d1fbb37ffefe2c21fbc");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoOutput(true);

            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            bufferedReader.close();
            Gson gson = new Gson();
            User user = gson.fromJson(stringBuilder.toString(), User.class);
            // Integer userId = user.getId();
            System.out.println(user);
            // createToDo(userId);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(Integer id, String str) {
        try {
            URL url = new URL("https://gorest.co.in/public/v2/users/" + id);
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
            User user = gson.fromJson(stringBuilder.toString(), User.class);
            Integer userId = user.getId();
            System.out.println(userId);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        try {
            URL url = new URL("https://gorest.co.in/public/v2/users/" + id);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer 344b1639f8dbd070e2858ed25703fe3f20342479424a0d1fbb37ffefe2c21fbc");
            httpURLConnection.setRequestMethod("DELETE");
            httpURLConnection.setDoOutput(true);
            InputStream inputStream = httpURLConnection.getInputStream();
            inputStream.close();
            System.out.println("User deleted");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

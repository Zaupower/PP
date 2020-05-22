package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JsonFormater {


   String filePath = "exampleWrite.json";
   public String formater(Order order) throws IOException {
 /*
      File f = new File(filePath);
      System.out.println(f.getAbsolutePath());
      Gson json = new Gson();
      json.toJson(order, new FileWriter("C:\Users\marce\Desktop\test\exampleWrite.json"));


      try (Writer writer = new FileWriter(filePath)) {
         Gson gson = new GsonBuilder().create();
         gson.toJson(order, writer);
      }

      try {
         //create the file using FileWriter
         FileWriter fw = new FileWriter(filePath);
         //create a File linked to the same file using the name of this one;
         File f = new File(filePath);
         //Print absolute path
         System.out.println(f.getAbsolutePath());

      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }*/

      Gson gson = new Gson();
      FileWriter fileWriter = new FileWriter(filePath);
      gson.toJson(order, fileWriter);
      fileWriter.close();
      System.out.println("JSON string write to a file successfully");

      return "response funcionou";
   }

}

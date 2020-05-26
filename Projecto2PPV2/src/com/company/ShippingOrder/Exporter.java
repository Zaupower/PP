package com.company.ShippingOrder;

import com.google.gson.Gson;
import shippingorder.IExporter;
import shippingorder.IShippingOrder;

import java.io.FileWriter;
import java.io.IOException;

public class Exporter implements IExporter {
    String filePath = "exampleWrite.json";

    @Override
    public void export(IShippingOrder iShippingOrder) throws IOException {

        try {
            Gson gson = new Gson();
            FileWriter fileWriter = new FileWriter(filePath);
            gson.toJson(iShippingOrder, fileWriter);
            fileWriter.close();
            System.out.println("JSON string write to a file successfully");
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}

package com.utils;

import com.google.gson.Gson;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class IOUtils {

    public static InputStream convertObjectToStream(Object object) {
        Gson gson = new Gson();
        String coffeeMessage = gson.toJson(object);
        return new ByteArrayInputStream(coffeeMessage.getBytes());
    }
}

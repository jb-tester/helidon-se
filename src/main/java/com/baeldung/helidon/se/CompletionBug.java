package com.baeldung.helidon.se;

import java.net.MalformedURLException;
import java.net.URL;

public class CompletionBug {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/");
    }
}

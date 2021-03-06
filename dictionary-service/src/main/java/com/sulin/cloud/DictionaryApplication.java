package com.sulin.cloud;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

/**
 * @author slc
 */
@SpringBootApplication
public class DictionaryApplication {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String port = scanner.nextLine();
        SpringApplicationBuilder builder = new SpringApplicationBuilder(DictionaryApplication.class);
        builder.properties("server.port="+port).run(args);
    }
}

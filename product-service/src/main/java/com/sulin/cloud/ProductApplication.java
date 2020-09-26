package com.sulin.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Scanner;

/**
 * @author slc
 */
@SpringBootApplication
@EnableFeignClients
public class ProductApplication {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String port = scanner.nextLine();
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ProductApplication.class);
        builder.properties("server.port="+port).run(args);
    }
}

package com.sulin.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

/**
 * @author slc
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RawApplication {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String port = scanner.nextLine();
        SpringApplicationBuilder builder = new SpringApplicationBuilder(RawApplication.class);
        builder.properties("server.port="+port).run(args);
    }
}

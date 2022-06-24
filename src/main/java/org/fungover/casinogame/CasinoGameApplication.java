package org.fungover.casinogame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CasinoGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasinoGameApplication.class, args);
    }
}

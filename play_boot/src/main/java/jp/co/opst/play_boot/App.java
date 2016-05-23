package jp.co.opst.play_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(jp.co.opst.play_boot.controller.Index.class, args);
	}
}

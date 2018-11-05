package com.verizon.sju;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.verizon.sju.controller.WelcomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJunitDemoApplicationTests {

	@Test
	public void contextLoads() {
		assertThat(WelcomeController.class).isNotNull().hasMethods("showHome");
	}

}

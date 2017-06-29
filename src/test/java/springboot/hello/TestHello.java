package springboot.hello;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import springboot.hello.model.Users;
import springboot.hello.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHello {

	@Autowired
	private HelloService helloService;
	
	@Test
	public void test() {
		List<Users> result = helloService.getUserList();
		System.out.println(result);
		//fail("Not yet implemented");
	}
}

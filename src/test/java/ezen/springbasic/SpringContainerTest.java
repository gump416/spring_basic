package ezen.springbasic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ezen.springbasic.core.AutoAppConfig;
import ezen.springbasic.core.Unit;


public class SpringContainerTest {
	
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoAppConfig.class);
	
	@Test
	public void containerTest() {
		Unit unit = applicationContext.getBean("marine", Unit.class);
		unit.offense();
		unit.deffense();
		
		// 빈의 타입으로 조회
		Unit unit2 = applicationContext.getBean(Unit.class);
		System.out.println(unit == unit2);
		
		// 등록된 빈 모두 조회
		int count = applicationContext.getBeanDefinitionCount();
		System.out.println("빈의 갯수 : " + count);
		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName+" : " + applicationContext.getBean(beanName));
		}
	}
	

}

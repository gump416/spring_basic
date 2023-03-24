package ezen.springbasic.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoAppConfig.class);
		
		// 스프링 컨테이너에서 빈 조회(빈의 이름으로)
		Unit unit = applicationContext.getBean("marine", Unit.class);
		unit.offense();
		unit.deffense();
		
		// 빈의 타입으로 조회
		Unit unit2 = applicationContext.getBean(Unit.class);
		System.out.println(unit == unit2);
		
		// 등록된 빈 모두 조회
//		int count = applicationContext.getBeanDefinitionCount();
//		System.out.println("빈의 갯수 : " + count);
//		String[] beanNames = applicationContext.getBeanDefinitionNames();
//		for (String beanName : beanNames) {
//			System.out.println(beanName+" : " + applicationContext.getBean(beanName));
//		}
	}
}








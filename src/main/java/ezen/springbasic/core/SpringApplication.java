package ezen.springbasic.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		// 스프링 빈 컨테이너 생성
		//new ClassPathXmlApplicationContex("spring-config.xml");  옛날방식
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// 스프링 컨테이너에서 빈 조회(빈의 이름으로)
//		Unit unit = (Unit)applicationContext.getBean("unit"); //reflection내부적으로 동작함,getBean은 object타입, marine이 리턴된것,IOC+Di방식임 ,Unit은 인터페이스
		Unit unit = applicationContext.getBean("unit", Unit.class); //reflection 이용한 방식,권장
		unit.offense();
		
		// 빈의 타입으로 조회
		unit = applicationContext.getBean(Unit.class); //오버로딩
		unit.offense();
		unit.deffense();
		
		// 등록된 빈 모두 조회
		int count = applicationContext.getBeanDefinitionCount(); //applicationContext=스프링컨테이너
		System.out.println("빈의 갯수 : " + count);
		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName+" : " + applicationContext.getBean(beanName));
		}
	}
}








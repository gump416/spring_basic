package ezen.springbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 객체 생성 및 생성된 객체간의 의존관계 설정(조립자 역할) - 기존의 ServiceFactory 역할 
//@Configuration //스프링설정파일이야~라고 스프링컨테이너에 알려주는 마커어노테이션
// 스프링 컨테이너 설정 파일로 사용, xml같은 설정파일이라생각하면됨
public class AppConfig {
	
	@Bean //스프링컨테이너가 메모리상에 bean어노테이션으로 선언된것들 메모리에 할당
	public Weapon weapon() {
		return new Gun();
	}
	
	@Bean
	public Unit unit() {
		return new Marine("방그리", 1, weapon()); //weapon 요청하듯이 스프링 컨테이너한테 요청하면됨
	}
	
	@Bean
	String string() {
		return new String("김기정바보");
	}
	
}

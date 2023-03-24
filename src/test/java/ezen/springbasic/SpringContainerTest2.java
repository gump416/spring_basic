package ezen.springbasic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import ezen.springbasic.core.Unit;
import ezen.springbasic.core.Weapon;

@SpringBootTest // 자동으로 applicationContext 생성해줌, 갈수록 추상적임
public class SpringContainerTest2 {
	
	@Autowired	//getBean("marine", Unit.class); 이 역할을 해줌, @Autowired는 생성된 타입으로 찾아서 가져옴
	Unit unit;
	
	@Autowired
	@Qualifier("club")
	Weapon weapon;
		
	@Test
	public void containerTest() {
		unit.offense();
		unit.deffense();
	}
	
	@Test
	public void containerTest2() {
		weapon.attack();
	}
}

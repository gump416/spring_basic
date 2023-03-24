package ezen.springbasic.core;

import org.springframework.stereotype.Component;

@Component("club")
public class Club implements Weapon {

	@Override
	public void attack() {
		System.out.println("곤봉으로 공격합니다...");
	}
}

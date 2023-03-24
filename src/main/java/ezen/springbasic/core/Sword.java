package ezen.springbasic.core;

import org.springframework.stereotype.Component;

@Component("sword")
public class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("긴칼로 공격합니다...");
	}
}

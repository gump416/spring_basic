package ezen.springbasic.core;

import org.springframework.stereotype.Component;

@Component("gun")
public class Gun implements Weapon {

	@Override
	public void attack() {
		System.out.println("장총으로 공격합니다...");
	}
}

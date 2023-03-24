package ezen.springbasic.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//Spring Container에 빈으로 등록하라는 어노테이션, @Component ("marine")안에 지정한 이름으로 등록, 하지만 안써줘도 M이m 소문자로 등록되서 지정안해줌
public class Marine implements Unit {
	
	private String name;
	private int level;
	
	@Autowired //마린이 사용하는 웨폰을 byType으로 자동으롱 엮어주는데 (건,소드,클럽)중 하나를 밑에 Qualifier에 값하나를 설정해줘야함
	@Qualifier("club") //의존관계설정,후보객체지정, weapon을 구현한게 여러개라서.. xml방식중 ref에 해당, usebean에서 property같은 개념
	private Weapon weapon;
	
	public Marine() {}

	public Marine(String name, int level, Weapon weapon) {
		this.name = name;
		this.level = level;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void offense() {
		weapon.attack();
	}

	@Override
	public void deffense() {
		System.out.println("방어합니다..");
	}

	@Override
	public String toString() {
		return "Marine [name=" + name + ", level=" + level + ", weapon=" + weapon + "]";
	}
}

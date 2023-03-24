package ezen.springbasic.core;

public class AdvancedApplication {

	public static void main(String[] args) {
		//애플리케이션의 객체를 생성 생성된 객체간의 의존관계를 설정 역할의 객체
		//조립자 역할
		//이것이 제대로된 객체지향이다, 기존의 new로 일일히 선언해서하는방식은 완벽한 객체지향은아님
		AppConfig appConfig = new AppConfig();
		Weapon weapon = appConfig.weapon();
		Unit unit = appConfig.unit();
		unit.offense();
		unit.deffense();
	}
}

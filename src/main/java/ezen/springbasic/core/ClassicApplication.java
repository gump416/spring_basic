package ezen.springbasic.core;

public class ClassicApplication {

	public static void main(String[] args) {
		Weapon weapon = new Gun();
//		Weapon weapon = new Sword();
		Unit unit = new Marine("기정", 1, weapon);
		unit.offense();
		unit.deffense();
	}
}
// 다형성 원리를 잘 적용하여 역할과 구현을 분리하여 잘 구현하였지만 
// 문제점) 객체 생성 및 생성된 객체간의 의존관계 설정코드 분리 안됨
// 개선 -> 애플리케이션의 전체 동작방식을 구성하는 별도의 설정 클래스 작성 필요
// 애플리케이션에 관계된 구현 객체 생성 및 관계 설정을 책임지는 별도의 조립 클래스 작성



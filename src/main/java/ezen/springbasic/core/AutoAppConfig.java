package ezen.springbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
//@ComponentScan(basePackages = "ezen.springbasic") // ezen.springbasic라는 패키지 이름 등록하면 그안에 있는 class들 자동등록
//@ComponentScan(basePackages = {"ezen.springbasic", "xxx.yyy.zzz"}) //basePackages배열형식이라서 여러패키지 등록가능
@ComponentScan // AutoAppConfig가 들어있는 현재패키지로 등록됨
public class AutoAppConfig {} 

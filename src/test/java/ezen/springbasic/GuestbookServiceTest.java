package ezen.springbasic;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ezen.springbasic.guestbook.dto.Guestbook;
import ezen.springbasic.guestbook.service.GuestbookService;

@SpringBootTest //이 한줄로 모든 패키지의 클래스가 applicationConText에 등록
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GuestbookServiceTest {
	
	@Autowired //컨테이너한테 guestbookService구현한 구현제 알아서 구현하게하는 어노테이션
	GuestbookService guestbookService;
		
	@Test //Junit으로 실행
//	@Disabled //필요에따라 중지
	@Order(1) //순서
	public void registerTest() {
		Guestbook guestbook = new Guestbook();
		guestbook.setWriter("방그리");
		guestbook.setMessage("잘 보고 갑니다....");
		guestbookService.registerGuestbook(guestbook);
		System.out.println("방명록 등록 완료!");
	}
	
	@Test
//	@Disabled
	@Order(2)
	public void listTest() {
		List<Guestbook> list = guestbookService.findGuestbooks();
		System.out.println("방명록 리스트 : " + list);
	}
	
}







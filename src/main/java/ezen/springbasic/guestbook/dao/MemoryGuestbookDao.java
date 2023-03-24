package ezen.springbasic.guestbook.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ezen.springbasic.guestbook.dto.Guestbook;


//@Component
@Repository //좀더 명확하게 레이어기반의 @Repository씀, component x
public class MemoryGuestbookDao implements GuestbookDao {
	
	private Map<Integer, Guestbook> repository = new HashMap<Integer, Guestbook>();
	
	private static Integer sequence = 0; 
	
	@PostConstruct //의존관계형성하는 작업후에 init을 자동으로 실행해주기위한 어노테이션, servlet에서 lifecycle생각하면됨
	public void init() { //이름은 임의로init이라 한것
		System.out.println("Spring Container에 의해 자동 호출됨..");
		repository.put(++sequence, new Guestbook("aaa", "내용입니다~~"));
		repository.put(++sequence, new Guestbook("bbb", "내용입니다~~"));
		repository.put(++sequence, new Guestbook("ccc", "내용입니다~~"));
	}
	
	@Override
	public void create(Guestbook guestbook) {
		repository.put(++sequence, guestbook); //데이터베이스 시퀀스 활용
		System.out.println("신규 방명록 등록 : " + guestbook);
	}
	

	@Override
	public List<Guestbook> findAll() {
		return new ArrayList<Guestbook>(repository.values());
	}
}






package ezen.springbasic.guestbook.service;

import java.util.List;

import ezen.springbasic.guestbook.dto.Guestbook;

public interface GuestbookService {
	
	public void registerGuestbook(Guestbook guestbook);
	public List<Guestbook> findGuestbooks();

}

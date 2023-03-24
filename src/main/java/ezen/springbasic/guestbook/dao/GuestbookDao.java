package ezen.springbasic.guestbook.dao;

import java.util.List;

import ezen.springbasic.guestbook.dto.Guestbook;

public interface GuestbookDao {
	
	public void create(Guestbook bookGuestbook);
	public List<Guestbook> findAll();

}

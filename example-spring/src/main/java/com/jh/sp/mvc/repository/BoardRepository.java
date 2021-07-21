package com.jh.sp.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jh.sp.mvc.domain.Board;
import com.jh.sp.mvc.parameter.BoardParameter;

/*
 * 게시판 Repository
 * @author JeongHwa
 * */
@Repository
public interface BoardRepository {
	
	// 메소드 만들기(5개)
	
	List<Board> getList();
	
	Board get(int boardSeq);
	
	int save(BoardParameter board);
	
	void update(BoardParameter board);
	
	void delete(int boardSeq);
}

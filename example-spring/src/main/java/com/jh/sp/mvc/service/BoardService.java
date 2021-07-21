package com.jh.sp.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.sp.mvc.domain.Board;
import com.jh.sp.mvc.parameter.BoardParameter;
import com.jh.sp.mvc.repository.BoardRepository;

/*
 * 게시판 서비스
 * @author JeongHwa
 * */
@Service
public class BoardService {
	
	@Autowired
	private BoardRepository repository;
	
	/*
	 * 목록 리턴
	 * @return
	 * */
	public List<Board> getList(){
		return repository.getList();
	}
	
	
	/*
	 * 상세정보 리턴
	 * @param boardSeq
	 * @return
	 * */
	public Board get(int boardSeq) {
		return repository.get(boardSeq);
	}
	
	/*
	 * 등록/수정 처리.
	 * @param board
	 * */
	public int save(BoardParameter parameter) {
		// 조회하여 리턴된 정보
		Board board = repository.get(parameter.getBoardSeq());
		if (board == null) {
			// 등록
			repository.save(parameter);
		} else{
			// 수정
			repository.update(parameter);
		}
		return parameter.getBoardSeq();
	}
	
	/*
	 * 삭제 처리.
	 * @param boardSeq
	 * */
	public boolean delete(int boardSeq) {
		repository.delete(boardSeq);
		return true;
	}

}

package com.raon.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raon.domain.Board;

@RestController
@RequestMapping("/boards")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="", method=GET)
	public ResponseEntity<List<Board>> list(){
		logger.info("list");

		List<Board> boardList = new ArrayList<>();
		Board board = new Board();
		board.setBoardNo(1);
		board.setTitle("향수");
		board.setContent("넓은벌 동쪽으로");
		board.setWriter("raon");
		board.setRegDate(new Date());
		
		boardList.add(board);
		
		board = new Board();
		board.setBoardNo(2);
		board.setTitle("향수2");
		board.setContent("넓은벌 동쪽으로2");
		board.setWriter("raon2");
		board.setRegDate(new Date());
		
		boardList.add(board);
		ResponseEntity<List<Board>> entity = new ResponseEntity<List<Board>>(boardList,HttpStatus.OK);
		return entity; 
	}
	
	@RequestMapping(value="", method=POST)
	public ResponseEntity<String> register(@RequestBody Board board){
		logger.info("register");
		
		ResponseEntity<String> entity = new ResponseEntity<>("Success",HttpStatus.OK);
		return entity;
	}
	
	
	@RequestMapping(value="/{boardNo}", method=GET)
	public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo){
		logger.info("read");
		
		Board board = new Board();
		
		board.setBoardNo(1);
		board.setTitle("향수");
		board.setContent("넓은벌 동쪽으로");
		board.setWriter("raon");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board,HttpStatus.OK);
		return entity;
	}
	
	
	@RequestMapping(value="/{boardNo}", method=DELETE)
	public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo){
		logger.info("remove");
		ResponseEntity<String> entity = new ResponseEntity<String>("Success",HttpStatus.OK);
		return entity;
	}
	
	
	//@RequetBody -> 파라미터에만 사용가능 , Http요청의 body내용을 자바 객체로 매핑하는 역할을 한다. Http요청의 body를 HttpMessageConverter로 변환한 결과가 설정됨.
	@RequestMapping(value="/{boardNo}", method=PUT)
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board){
		logger.info("modify");
		ResponseEntity<String> entity = new ResponseEntity<String>("Success",HttpStatus.OK);
		return entity;
	}
	
}


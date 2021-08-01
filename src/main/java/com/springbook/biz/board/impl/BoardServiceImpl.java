package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAOSpring;
	//private BoardDAO boardDAO;
	//private Log4jAdvice log;
	
	//public BoardServiceImpl() {
	//	log = new Log4jAdvice();
	//}
	
	@Override
	public void insertBoard(BoardVO vo) {
//		if(vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		//log.printLogging();
		boardDAOSpring.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		//log.printLogging();
		boardDAOSpring.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		//log.printLogging();
		boardDAOSpring.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		//log.printLogging();
		return boardDAOSpring.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		//log.printLogging();
		return boardDAOSpring.getBoardList(vo);
	}

}

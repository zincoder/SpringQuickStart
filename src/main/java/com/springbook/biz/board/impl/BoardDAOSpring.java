package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

//DAO(Data Access object)
@Repository
//public class BoardDAOSpring extends JdbcDaoSupport {
public class BoardDAOSpring {	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//SQL ��ɾ��
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values(?,?,?,?)";
	//private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values((select nvl(max(seq),0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
//	@Autowired
//	public void setSuperDataSource(DataSource dataSource) {
//		super.setDataSource(dataSource);
//	}
	
	//CRUD ����� �޼ҵ� ����
	//�� ��� 
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Sorung JDBC�� insertBoard() ��� ó��");
		jdbcTemplate.update(BOARD_INSERT, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getSeq());
		//jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getSeq());
		//getJdbcTemplate().update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getSeq());
	}
	
	//�� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC�� updateboard() ��� ó��");
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
		//getJdbcTemplate().update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}
	
	//�� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC�� deleteBoard() ��� ó��");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	    //getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
	}
	
	//�� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC�� getBoard() ��� ó��");
		Object[] args= {vo.getSeq()};
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
		//return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	
	//�� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> Spring JDBC�� getBoardList() ��� ó��");
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
		//return getJdbcTemplate().query(BOARD_LIST, new BoardRowMapper());
	}
}

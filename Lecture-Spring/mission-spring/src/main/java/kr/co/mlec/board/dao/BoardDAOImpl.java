package kr.co.mlec.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 * 오라클용 게시판 CRUD(MyBatis 적용)
 */
import kr.co.mlec.board.vo.BoardVO;
@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSessionTemplate session;
	
	
	public List<BoardVO> selectAll(){
		List<BoardVO> boardList = session.selectList("board.dao.BoardDAO.selectAll");
		return boardList;
	}
	

}

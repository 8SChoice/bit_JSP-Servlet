package kr.co.mlec.board.dao;
/*
 * Database를 통한 게시글 CRUD
 */

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

public interface BoardDAO {
	/*
	 * 전체 게시글 조회서비스
	 * @return 전체 게시글
	 */
	public List<BoardVO> selectAll();
	

}

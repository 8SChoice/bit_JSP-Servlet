package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.MyMemberDTO;
import conn.ConnDriver;


public class MemberDao implements MemberInter{
	private static MemberDao dao;

	public static synchronized MemberDao getDao() { //싱글톤으로 생성. 
		if (dao == null)
			dao = new MemberDao();
		return dao;
	}

	public void addMember(MyMemberDTO vo) throws SQLException { //MymemberDTO에 멤버를 추가하는 addMember함수
		// 필요한 것 : connection, pstm, sql문, pstm에 sql넣기. 사용자로부터 받을 값은 ?로.
		Connection con = ConnDriver.getMyConnection();
		PreparedStatement pstm = null;
		String sql="insert into mymember values(mymember_seq.nextval, ?,?,?,sysdate)";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, vo.getId()); //값 넣기. 1: 첫번째 물음표 라는 뜻. 물음표 수 만큼 만들어야한다.
		pstm.setString(2, vo.getPwd());
		pstm.setString(3, vo.getName());
		pstm.executeUpdate(); //값을 보내기  : excuteUpdate()
		if(pstm!=null) { //끝나면 닫아준다. LIFO-> pstm부터 닫아준다.
			pstm.close();
		}
		if(con!=null) {
			con.close();
		}
	}

	@Override
	public List<MyMemberDTO> getListmember(String searchValue) throws SQLException {
		Connection con = ConnDriver.getMyConnection();
		PreparedStatement pstm = null;
		String sql = "select * from mymember where name Like ?";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, "%"+searchValue+"%");
		ResultSet rs = pstm.executeQuery();  //결과값이 필요하므로 ResultSet 생성
		List<MyMemberDTO> li = new ArrayList<>();
		while(rs.next()) {
			MyMemberDTO dto = new MyMemberDTO();
				// num id pwd name edate
			dto.setNum(rs.getInt("num"));
			dto.setId(rs.getString("id"));
			dto.setPwd(rs.getString("pwd"));
			dto.setName(rs.getString("name"));
			dto.setEdate(rs.getString("edate"));
			li.add(dto);
		}
		if(rs!=null) {
			rs.close();
		}
		if(pstm!=null) {
			pstm.close();
		}
		if(con!=null) {
			con.close();
		}
		return li;
	}
}

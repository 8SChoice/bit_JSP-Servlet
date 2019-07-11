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

	public static synchronized MemberDao getDao() { //�̱������� ����. 
		if (dao == null)
			dao = new MemberDao();
		return dao;
	}

	public void addMember(MyMemberDTO vo) throws SQLException { //MymemberDTO�� ����� �߰��ϴ� addMember�Լ�
		// �ʿ��� �� : connection, pstm, sql��, pstm�� sql�ֱ�. ����ڷκ��� ���� ���� ?��.
		Connection con = ConnDriver.getMyConnection();
		PreparedStatement pstm = null;
		String sql="insert into mymember values(mymember_seq.nextval, ?,?,?,sysdate)";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, vo.getId()); //�� �ֱ�. 1: ù��° ����ǥ ��� ��. ����ǥ �� ��ŭ �������Ѵ�.
		pstm.setString(2, vo.getPwd());
		pstm.setString(3, vo.getName());
		pstm.executeUpdate(); //���� ������  : excuteUpdate()
		if(pstm!=null) { //������ �ݾ��ش�. LIFO-> pstm���� �ݾ��ش�.
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
		ResultSet rs = pstm.executeQuery();  //������� �ʿ��ϹǷ� ResultSet ����
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

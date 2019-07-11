package dao;

import java.sql.SQLException;
import java.util.List;

import DTO.MyMemberDTO;

public interface MemberInter {
	public void addMember(MyMemberDTO dto) throws SQLException;

	public List<MyMemberDTO> getListmember(String searchValue) throws SQLException;

}

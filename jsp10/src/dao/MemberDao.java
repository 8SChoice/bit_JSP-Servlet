package dao;

import org.apache.ibatis.session.SqlSession;

import DTO.MyMemberDTO;
import service.FactoryService;

public class MemberDao {
	private static MemberDao dao;

	private MemberDao() {
	}

	public static synchronized MemberDao getDao() { // 싱글톤으로 생성.
		if (dao == null)
			dao = new MemberDao();
		return dao;
	}

	public void addMember(MyMemberDTO dto) { 
		// mybatis환경설정으로부터 버퍼에 접속할 수 있는 Session객체를 생성
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("mymember.add", dto);
		ss.commit();
		ss.close();
	}

	//id 중복확인용
	public int getIdCount(String id) {
		//단일행
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt=ss.selectOne("mymember.idcheck",id);
		ss.close();
		return cnt;
	}

}

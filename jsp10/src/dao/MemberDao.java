package dao;

import org.apache.ibatis.session.SqlSession;

import DTO.MyMemberDTO;
import service.FactoryService;

public class MemberDao {
	private static MemberDao dao;

	private MemberDao() {
	}

	public static synchronized MemberDao getDao() { // �̱������� ����.
		if (dao == null)
			dao = new MemberDao();
		return dao;
	}

	public void addMember(MyMemberDTO dto) { // MymemberDTO�� ����� �߰��ϴ� addMember�Լ�
		// mybatisȯ�漳�����κ��� ���ۿ� ������ �� �ִ� Session��ü�� ����
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("mymember.add", dto);
		ss.commit();
		ss.close();
	}


	public int getIdCount(String id) {
		//������
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt=ss.selectOne("mymember.idcheck",id);
		ss.close();
		return cnt;
	}

}

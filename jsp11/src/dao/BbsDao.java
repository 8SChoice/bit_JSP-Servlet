package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.BbsVO;

public class BbsDao {
	private static BbsDao dao;

	private BbsDao() {
	}

	public static synchronized BbsDao getDao() { // ½Ì±ÛÅæÀ¸·Î »ý¼º.
		if (dao == null)
			dao = new BbsDao();
		return dao;
	}
	
	public void bbsadd(BbsVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("bbssql.bbs_add",vo);
		ss.commit();
		ss.close();
	}
	
	public List<BbsVO> getList(Map<String, Integer> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<BbsVO> list = ss.selectList("bbs_list",map);
		ss.close();
		return list;
	}
	
	public int getCnt() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.selectOne("totalCount");
		ss.close();
		return cnt;
	}
	

}

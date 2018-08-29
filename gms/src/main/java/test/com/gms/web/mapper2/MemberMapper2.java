/*package test.com.gms.web.mapper2;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
@Repository //템플릿 패턴역활
public class MemberMapper2 implements MemberMapper{
	@Autowired SqlSessionFactory factory;
	private static final String ns =
			"com.gms.web.mapper.MemberMapper";
	
	@Override
	public void insert(MemberDTO p) {
		System.out.println("MemberMapper_insert");
		SqlSession sqlSession = factory.openSession();
		sqlSession.insert(ns+".insert",p);
		System.out.println("MemberMapper_insert_complete");
	}

	@Override
	public List<?> selectList(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectSome(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectOne(Map<?, ?> p) {
		System.out.println("MemberMapper_selectOne");
		SqlSession sqlSession = factory.openSession();
		System.out.println("MemberMapper_selectOne_complete");
		return (MemberDTO) sqlSession.selectOne(ns+".selectOne",p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDTO update(MemberDTO p) {
		System.out.println("MemberMapper_update");
		System.out.println("memberId : "+p.getMemberId());
		SqlSession sqlSession = factory.openSession();
		sqlSession.update(ns+".update",p);
		System.out.println("MemberMapper_update_complete");
		return null;
		
	}

	@Override
	public void remove(MemberDTO p) {
		System.out.println("MemberMapper_remove");
		System.out.println("memberId : "+p.getMemberId());
		SqlSession sqlSession = factory.openSession();
		sqlSession.delete(ns+".delete",p);
		System.out.println("MemberMapper_remove_complete");
	}

	@Override
	public boolean login(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return false;
	}

}
*/
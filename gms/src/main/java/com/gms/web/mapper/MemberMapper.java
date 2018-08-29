package com.gms.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;

@Repository
public interface MemberMapper {
	public void insert(MemberDTO p);
	public List<?> selectList(Map<?,?>p);
	public List<?> selectSome(Map<?,?>p);
	public MemberDTO selectOne(Map<?,?>p);
	public int count(Map<?,?>p);
	public MemberDTO update(MemberDTO p);
	public void remove(MemberDTO p);
	//public void remove(Map<?,?>p);
	public boolean login(Map<?,?>p);
}

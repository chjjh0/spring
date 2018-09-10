package com.gms.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
import com.gms.web.service.MemberService;
@Service  //싱글톤 패턴
public class MemberServiceImpl implements MemberService {
	@Autowired MemberMapper memberMapper;
	//@Autowired MemberDAO memberDAO;
	@Override
	public void add(MemberDTO p) {
		memberMapper.insert(p);
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO retrieve(MemberDTO p) {
		return memberMapper.selectOne(p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(MemberDTO p) {
		memberMapper.update(p);
	}

	@Override
	public void remove(MemberDTO p) {
		memberMapper.remove(p);
	}

	@Override
	public MemberDTO login(MemberDTO p) {
		return memberMapper.login(p);
	}

}

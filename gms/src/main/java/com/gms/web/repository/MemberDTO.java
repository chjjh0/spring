package com.gms.web.repository;

import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public interface MemberDTO {
	public void insert(MemberDTO p);
	public List<?> selectList(Map<?,?> p);
	public List<?> selectSome(Map<?,?> p);
	public MemberDTO selectOne(Map<?,?> p);
	public int count(Map<?,?> p);
	public void update(Map<?,?> p);
	public void delete(Map<?,?> p);
	public boolean login(Map<?,?> p);
}

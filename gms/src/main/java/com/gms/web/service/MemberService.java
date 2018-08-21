package com.gms.web.service;

import java.util.List;
import com.gms.web.repository.MemberDTO;
import com.sun.javafx.collections.MappingChange.Map;

public interface MemberService {
	public void add(MemberDTO p);
	public List<?> list(Map<?,?> p);
	public List<?> search(Map<?,?> p);
	public MemberDTO retrieve(Map<?,?> p);
	public int count(Map<?,?> p);
	public void modify(Map<?,?> p);
	public void remove(Map<?,?> p);
	public boolean login(Map<?,?> p);
}

package com.gms.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class MemberVO {
	private String memberId,teamId,name,ssn,roll,pass,age,gender,subject;

	@Override
	public String toString() {
		return "MemberBean [memberId=" + memberId + ", teamId=" + teamId + ", name=" + name + ", ssn=" + ssn + ", roll="
				+ roll + ", pass=" + pass + ", age=" + age + ", gender=" + gender + ", subject=" + subject + "]";
	}
}
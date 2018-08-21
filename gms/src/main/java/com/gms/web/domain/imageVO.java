package com.gms.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class imageVO {
	private String 
	imgseq,
	imgName, 
	extension,
	memberId;
}

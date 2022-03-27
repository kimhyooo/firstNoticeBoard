package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	//글번호
	private Long bno;
	//글제목
	private String title;
	//글내용
	private String content;
	//글쓴이
	private String writer;
	//등록일자
	private Date regdate;
	//수정일자
	private Date updateDate;
}

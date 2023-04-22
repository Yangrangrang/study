package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardDTO {
    private int seq;
    private String title;
    private String content;
    private String writer;
    private Date createDate;
    private Date updateDate;
    private Date deleteDate;
}

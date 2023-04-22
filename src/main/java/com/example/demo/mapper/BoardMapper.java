package com.example.demo.mapper;

import com.example.demo.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BoardMapper {
    public ArrayList<BoardDTO> getBoardList();
}

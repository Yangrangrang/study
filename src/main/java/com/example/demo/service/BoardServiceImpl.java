package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    private BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public ArrayList<BoardDTO> getBoard() {
        return boardMapper.getBoardList();
    }
}

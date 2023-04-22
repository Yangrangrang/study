package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequestMapping("/api/boards")
@RestController
public class BoardAPIController {
    BoardService boardService;

    @Autowired
    public BoardAPIController(BoardService  boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public ArrayList<BoardDTO> Index() {
        ArrayList<BoardDTO> boards = boardService.getBoard();
        System.out.println(boards);

        return boards;
    }
}

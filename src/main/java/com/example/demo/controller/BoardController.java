package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
    BoardService boardService;

    @Autowired
    public BoardController(BoardService  boardService) {
        this.boardService = boardService;
    }

    @RequestMapping("/")
    public String Index(Model model) {
        ArrayList<BoardDTO> boards = boardService.getBoard();
        System.out.println(boards);

        model.addAttribute("boards", boards);

        return "index";
    }

    @GetMapping("/boards")
    public String Boards() {
        return "boards";
    }
}

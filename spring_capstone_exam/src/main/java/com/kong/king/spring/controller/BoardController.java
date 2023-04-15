package com.kong.king.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kong.king.spring.dto.BoardDTO;
import com.kong.king.spring.entity.Board;
import com.kong.king.spring.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	BoardService service = new BoardService();

	@PostMapping("/addboard")
	public String addUser(BoardDTO b) {
		service.InsertBoard(b);
		return null;
	}

	@GetMapping("/listboard")
	public String listUser(Model m) {
		List<Board> list = service.ReadBoard();
		m.addAttribute("list", list);
		return null;
	}

	@PostMapping("/updateuser")
	public String updateUser(BoardDTO b) {
		service.UpdateBoard(b);
		return null;
	}

	@GetMapping("/deleteplan")
	public String deletePlan(BoardDTO b) {
		service.DeleteBoard(b.getU_id());

		return null;
	}
}

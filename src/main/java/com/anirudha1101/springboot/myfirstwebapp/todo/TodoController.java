package com.anirudha1101.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;
	
	// /todo
	@RequestMapping("/todos")
	public String listAllTodos(ModelMap model){
		List<Todo> todos = todoService.findByUsername("Anirudha1101");
		model.addAttribute("todos", todos);
		return "todo";
	}
	@RequestMapping(value="addtodo" , method = RequestMethod.GET)
	public String showNewTodoPage(){
		return "todoDetails";
	}
	
	@PostMapping("addtodo")
	public String addNewTodo(@RequestParam String description ,ModelMap model){
		todoService.addTodo((String)model.get("name"), description, LocalDate.now().plusYears(1), false);
		
		return "redirect:todos";
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id){
		todoService.deleteById(id);
		//delete todo 
		return "redirect:todos";
	}
	@RequestMapping("update-todo")
	public String updateTodoPage(@RequestParam int id ,ModelMap model){
		Todo todo =todoService.findById(id);
		model.addAttribute("todo",todo);
		
		return "redirect:todoDetails";
	}
	
}

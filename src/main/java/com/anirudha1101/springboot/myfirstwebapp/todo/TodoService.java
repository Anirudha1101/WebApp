package com.anirudha1101.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
		private static List<Todo> todos = new ArrayList<>(); 
		private static int count =0;
		static{
			todos.add(new Todo(++count ,"Anirudha1101" ,"LearnsAws",LocalDate.now().plusYears(2),false));
			todos.add(new Todo(++count ,"Anirudha1101", "Learns DEVOPS", LocalDate.now().plusYears(2),false));
		
		}

		public List<Todo> findByUsername(String username){
			return todos;
			
		}
		
		public void addTodo(String username, String description,  LocalDate targetDate, boolean done) {
			Todo todo =new Todo(++count,username,description,targetDate,done);
			todos.add(todo);
		}
		
		public void deleteById(int id ) {
			//todo.getId()=id
			Predicate<? super Todo> predicate = todo -> todo.getId()==id;
			todos.removeIf(predicate);
			
		}

		public Todo findById(int id) {
			Predicate<? super Todo> predicate = todo -> todo.getId()==id;
			Todo todo=todos.stream().filter(predicate).findFirst().get();
			
			return todo;
		}
}



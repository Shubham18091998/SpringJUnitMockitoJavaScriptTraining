package com.cts.impl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.mockito.Mockito.*;

import com.cts.app.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		TodoService todoServiceMock=mock(TodoService.class);
		List<String> todos=Arrays.asList("Learn Spring MVC","Learn Spring Mock","Learn to Dance");
		when(todoServiceMock.retrieveTodo("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos=todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}

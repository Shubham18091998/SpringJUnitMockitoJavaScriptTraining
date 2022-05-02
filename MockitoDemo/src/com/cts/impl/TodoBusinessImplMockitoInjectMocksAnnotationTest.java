package com.cts.impl;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import com.cts.app.TodoService;

//@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockitoInjectMocksAnnotationTest {
	
	@Rule
	public MockitoRule mockitoRule=MockitoJUnit.rule();
	
	@Mock
	TodoService todoServiceMock;
	
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;

	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		List<String> todos=Arrays.asList("Learn Spring MVC","Learn Spring Mock","Learn to Dance");
		when(todoServiceMock.retrieveTodo("Dummy")).thenReturn(todos);
		List<String> filteredTodos=todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}

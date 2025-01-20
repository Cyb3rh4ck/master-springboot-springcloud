package com.codigojava.mockito.mockito_demo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListTest {
	
	@Mock
	List listMock;

	@Test
	void simpleTest() {
		//listMock.size() => 3
		when(listMock.size()).thenReturn(3);
		assertEquals(3, listMock.size());
	}
	
	@Test
	void multipleTest() {
		when(listMock.size()).thenReturn(1).thenReturn(2);
		assertEquals(1, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	void specificParameters() {
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	void genericParameters() {
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");
		assertEquals("SomeOtherString", listMock.get(0));
		assertEquals("SomeOtherString", listMock.get(1));
	}
	
}

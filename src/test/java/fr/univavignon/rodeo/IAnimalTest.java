package fr.univavignon.rodeo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest {

	@Test
	public void test() {
		
		//mock creation
		IAnimal mockedAnimal = mock(IAnimal.class);
		
		//mock methods setup
		when(mockedAnimal.getXP()).thenReturn(10);
		when(mockedAnimal.isSecret()).thenReturn(true);
		when(mockedAnimal.isEndangered()).thenReturn(true);
		when(mockedAnimal.isBoss()).thenReturn(true);
		
		//junit tests
		assertEquals(mockedAnimal.getXP(), 10);
		assertTrue(mockedAnimal.isSecret());
		assertTrue(mockedAnimal.isEndangered());
		assertTrue(mockedAnimal.isBoss());
	}

}

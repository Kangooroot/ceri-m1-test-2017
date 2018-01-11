package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {

	@Test
	public void test() {

		//mock creation
		ISpecie mockedSpecie = mock(ISpecie.class);
		
		//mocked list of animals
		List<IAnimal> mockedAnimalList = mock(List.class);
		
		//mock methods setup
		when(mockedSpecie.getArea()).thenReturn(1);
		when(mockedSpecie.getAnimals()).thenReturn(mockedAnimalList);
		
		//junit tests
		assertEquals(mockedSpecie.getArea(), 1);
		assertEquals(mockedSpecie.getAnimals(), mockedAnimalList);
	}

}

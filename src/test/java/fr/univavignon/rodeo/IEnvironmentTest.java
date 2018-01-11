package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;

import fr.univavignon.rodeo.api.*;

public class IEnvironmentTest {

	@Test
	public void test() {

		//mock creation
		IEnvironment mockedEnvironment = mock(IEnvironment.class);
		
		//mock methods setup
		when(mockedEnvironment.getAreas()).thenReturn(3);
		ArrayList<ISpecie> species = new ArrayList<ISpecie>();
		when(mockedEnvironment.getSpecies()).thenReturn(species);

		//junit tests
		assertEquals(mockedEnvironment.getAreas(), 3);
		assertEquals(mockedEnvironment.getSpecies(), species);
	}

}

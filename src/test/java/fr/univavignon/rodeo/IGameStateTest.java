package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

public class IGameStateTest {

	@Test
	public void test() {

		IGameState mockedGameState = mock(IGameState.class);
		
		when(mockedGameState.getProgression()).thenReturn(100);
		
		assertEquals(mockedGameState.getProgression(), 100);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullSpecie() {
		
		IGameState mockedGameState = mock(IGameState.class);
		
		when(mockedGameState.getSpecieLevel(null)).thenThrow(new IllegalArgumentException());
		
		mockedGameState.getSpecieLevel(null);
	}

}

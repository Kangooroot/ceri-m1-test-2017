package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {

	@Test
	public void test() {

		//mock creation
		IGameStateProvider mockedGameStateProvider = mock(IGameStateProvider.class);
		
		IGameState mockedGameState = mock(IGameState.class);

		when(mockedGameStateProvider.get("name")).thenReturn(mockedGameState);
		
		assertEquals(mockedGameStateProvider.get("name"), mockedGameState);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getNullNameTest() {
		
		IGameStateProvider mockedGameStateProvider = mock(IGameStateProvider.class);

		when(mockedGameStateProvider.get(null)).thenThrow(new IllegalArgumentException());
		
		mockedGameStateProvider.get(null);
	}

}

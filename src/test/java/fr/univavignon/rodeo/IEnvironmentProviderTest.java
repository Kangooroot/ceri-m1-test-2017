package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentProviderTest {

	@Test
	public void test() {
		
		//mock creation
		IEnvironmentProvider mockedEnvironmentProvider = mock(IEnvironmentProvider.class);
		
		//mock methods setup
		ArrayList<String> availableEnvironments = new ArrayList<String>();
		availableEnvironments.add("Forest");		
		when(mockedEnvironmentProvider.getAvailableEnvironments()).thenReturn(availableEnvironments);
		when(mockedEnvironmentProvider.getEnvironment("Desert")).thenReturn(null);

		//junit tests
		assertEquals(mockedEnvironmentProvider.getAvailableEnvironments(), availableEnvironments);
		assertEquals(mockedEnvironmentProvider.getEnvironment("Desert"), null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getEnvironmentNullNameTest() {
		
		//mock creation
		IEnvironmentProvider mockedEnvironmentProvider = mock(IEnvironmentProvider.class);

		when(mockedEnvironmentProvider.getEnvironment(null)).thenThrow(new IllegalArgumentException());
		
		//junit tests
		mockedEnvironmentProvider.getEnvironment(null);
	}

}

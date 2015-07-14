package com.laboon;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

/**
 * Test toString() in World class
 * @author Chenyi Wang
 *
 */
public class WorldToStringTest {

	//	IDENTIFIER: FUN-WorldToString-TEST-SizeZero
	//	TEST CASE: ensure that user can get nothing
	//	INPUT VALUES: set size=0, seed=5, percent=4
	//	EXECUTION STEPS: enter the input values
	//	OUTPUT VALUES: user should see nothing from output

	@Test
	public void testSizeZero() {

		World world = new World(0, 5, 4);	
		String actualReturn = world.toString();
		assertEquals("  \n", actualReturn);
	}


	//	IDENTIFIER: FUN-WorldToString-TEST-SizeOne
	//	TEST CASE: ensure that user can have one cell
	//	INPUT VALUES: set size=1, seed=5, percent=4
	//	EXECUTION STEPS: enter the input values
	//	OUTPUT VALUES: user should see one row, one column and a given state of the cell

	@Test
	public void testSizeOne(){

		World world = new World(1, 5, 4);
		Cell cell = mock(Cell.class);
		when(cell.getStateRep()).thenReturn('$');
		world._world[0][0] = cell;
		String actualReturn = world.toString();
		assertEquals("  0\n0 $\n", actualReturn);
	}


	//	IDENTIFIER: FUN-WorldToString-TEST-SizeTen
	//	TEST CASE: ensure that user can get ten columns
	//	INPUT VALUES: set size=10, seed=5, percent=4
	//	EXECUTION STEPS: enter the input values
	//	OUTPUT VALUES: user should see it has ten columns: 0123456789

	@Test
	public void testSizeTen(){

		World world = new World(10, 5, 4);
		String actualReturn = world.toString();
		String[] str = actualReturn.split("\n");
		assertEquals("  0123456789", str[0]);
	}


	//	IDENTIFIER: FUN-WorldToString-TEST-SizeEleven
	//	TEST CASE: ensure that user can get eleven columns
	//	INPUT VALUES: set size=11, seed=5, percent=4
	//	EXECUTION STEPS: enter the input values
	//	OUTPUT VALUES: user should see it has eleven columns: 01234567890

	@Test
	public void testSizeEleven(){

		World world = new World(11, 5, 4);
		Cell cell = mock(Cell.class);
		world._world[10][10] = cell;
		String actualReturn = world.toString();
		String[] str = actualReturn.split("\n");
		assertEquals("  01234567890", str[0]);
		verify(cell, times(1)).getStateRep();
	}


	//	IDENTIFIER: FUN-WorldToString-TEST-SizeInf
	//	TEST CASE: ensure that user can get the number of size rows
	//	INPUT VALUES: set size=1050, seed=5, percent=4
	//	EXECUTION STEPS: enter the input values
	//	OUTPUT VALUES: user should see rows in the number of size+1

	@Test
	public void testSizeInf(){

		World world = new World(1050, 5, 4);
		String actualReturn = world.toString();
		String[] str = actualReturn.split("\n");
		assertEquals(1051, str.length);
	}

}

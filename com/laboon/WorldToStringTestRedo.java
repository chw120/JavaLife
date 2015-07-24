package com.laboon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WorldToStringTestRedo {

	//test case 1
	//set size=0, seed=1, percent=100
	@Test
	public void testSizeZero() {
		World world = new World(0, 1, 100);	
		String actualReturn = world.toString();
		assertEquals("  \n", actualReturn);
	}

	//test case 2
	//set size=1, seed=1, percent=0
	@Test
	public void testPercentZero(){
		World world = new World(1, 1, 0);
		String actualReturn = world.toString();
		assertEquals("  0\n0 .\n", actualReturn);
	}

	//test case 3
	//set size=1, seed=1, percent=100
	@Test
	public void testPercentOneHundred(){
		World world = new World(1, 1, 100);
		String actualReturn = world.toString();
		assertEquals("  0\n0 X\n", actualReturn);
	}

	//test case 4
	//set size=1, seed=1, percent=200
	@Test
	public void testPercentTwoHundred(){
		World world = new World(1, 1, 200);
		String actualReturn = world.toString();
		assertEquals("  0\n0 X\n", actualReturn);
	}

	//test case 5
	//set size=1, seed=1, percent=50
	@Test
	public void testPercentHalfSeedOne(){
		World world = new World(1, 1, 50);
		String actualReturn = world.toString();
		assertEquals("  0\n0 .\n", actualReturn);
	}

	//test case 6
	//set size=2, seed=0, percent=50
	@Test
	public void testPercentHalfSeedTwo(){
		World world = new World(2, 0, 50);
		String actualReturn = world.toString();
		assertEquals("  01\n0 .X\n1 XX\n", actualReturn);
	}

	//test case 7
	//set size=2, seed=75, percent=50
	@Test
	public void testPercentHalfSeedThree(){
		World world = new World(2, 75, 50);
		String actualReturn = world.toString();
		assertEquals("  01\n0 ..\n1 ..\n", actualReturn);
	}

	//test case 8
	//set size=2, seed=75, percent=0
	@Test
	public void testPercentSeedFour(){
		World world = new World(2, 75, 0);
		String actualReturn = world.toString();
		assertEquals("  01\n0 ..\n1 ..\n", actualReturn);
	}
}

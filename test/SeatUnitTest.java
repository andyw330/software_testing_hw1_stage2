package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;

import system.FOOD;
import system.Plane;
import system.RandomCode;
import system.Seat;
import system.TYPE;

public class SeatUnitTest {
	
	Seat s1;

	@Before
	public void setUp() throws Exception {
		s1 = new Seat();
	}

	@After
	public void tearDown() throws Exception {
		s1 = null;
	}

	@Test
	public void testOrderFood_BoundaryValueTesting() {
		s1.orderFood(FOOD.BEEF);
		assertEquals("Beef", s1.foodType());
	}

	@Test
	public void testOrderFood_EquivalenceTesting() {
		s1.orderFood(FOOD.BEEF);
		assertEquals("Beef", s1.foodType());
	}
	
	@Test
	public void testOrderFood_EdgeValueTesting() {
		s1.orderFood(FOOD.BEEF);
		assertEquals("Beef", s1.foodType());
	}

	@Test
	public void testOrderFood_DecisionTableBasedTesting() {
		s1.orderFood(FOOD.BEEF);
		assertEquals("Beef", s1.foodType());
		s1.orderFood(FOOD.PORK);
		assertEquals("Pork", s1.foodType());
		s1.orderFood(FOOD.VEGETABLE);
		assertEquals("Vegetable", s1.foodType());
		s1.orderFood(FOOD.NONE);
		assertEquals("None", s1.foodType());
	}
}
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

	@Test
	public void testGetSeatPrice_BoundaryValueTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		assertEquals(5000, s1.getSeatPrice());
	}

	@Test
	public void testGetSeatPrice_EquivalenceTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		assertEquals(5000, s1.getSeatPrice());
	}
	
	@Test
	public void testGetSeatPrice_EdgeValueTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		assertEquals(5000, s1.getSeatPrice());
	}

	@Test
	public void testGetSeatPrice_DecisionTableBasedTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		assertEquals(5000, s1.getSeatPrice());
		s1 = new Seat(TYPE.EDC, 27, 'A');
		assertEquals(20000, s1.getSeatPrice());
		s1 = new Seat(TYPE.SBC, 6, 'A');
		assertEquals(50000, s1.getSeatPrice());
		s1 = new Seat(TYPE.SFC, 1, 'A');
		assertEquals(100000, s1.getSeatPrice());
	}

	@Test
	public void TestGetPrice_BoundaryValueTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		s1.orderFood(FOOD.BEEF);
		assertEquals(7000, s1.getPrice());
	}

	@Test
	public void TestGetPrice_EquivalenceTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		s1.orderFood(FOOD.BEEF);
		assertEquals(7000, s1.getPrice());
	}
	
	@Test
	public void TestGetPrice_EdgeValueTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		s1.orderFood(FOOD.BEEF);
		assertEquals(7000, s1.getPrice());
	}

	@Test
	public void TestGetPrice_DecisionTableBasedTesting() {
		s1 = new Seat(TYPE.EC, 1, 'A');
		s1.orderFood(FOOD.NONE);
		assertEquals(5000, s1.getPrice());
		s1.orderFood(FOOD.VEGETABLE);
		assertEquals(5500, s1.getPrice());
		s1.orderFood(FOOD.PORK);
		assertEquals(6000, s1.getPrice());
		s1.orderFood(FOOD.BEEF);
		assertEquals(7000, s1.getPrice());

		s1 = new Seat(TYPE.EDC, 27, 'A');
		s1.orderFood(FOOD.NONE);
		assertEquals(20000, s1.getPrice());
		s1.orderFood(FOOD.VEGETABLE);
		assertEquals(20500, s1.getPrice());
		s1.orderFood(FOOD.PORK);
		assertEquals(21000, s1.getPrice());
		s1.orderFood(FOOD.BEEF);
		assertEquals(22000, s1.getPrice());
	
		s1 = new Seat(TYPE.SBC, 6, 'A');
		s1.orderFood(FOOD.NONE);
		assertEquals(50000, s1.getPrice());
		s1.orderFood(FOOD.VEGETABLE);
		assertEquals(50500, s1.getPrice());
		s1.orderFood(FOOD.PORK);
		assertEquals(51000, s1.getPrice());
		s1.orderFood(FOOD.BEEF);
		assertEquals(52000, s1.getPrice());

		s1 = new Seat(TYPE.SFC, 1, 'A');
		s1.orderFood(FOOD.NONE);
		assertEquals(100000, s1.getPrice());
		s1.orderFood(FOOD.VEGETABLE);
		assertEquals(100500, s1.getPrice());
		s1.orderFood(FOOD.PORK);
		assertEquals(101000, s1.getPrice());
		s1.orderFood(FOOD.BEEF);
		assertEquals(102000, s1.getPrice());
	}

	@Test
	public void TestRegister_BoundaryValueTesting() {
		s1.register(1);
		assertEquals(1, s1.getCode());
		assertEquals(true, s1.isRegistered());
	}

	@Test
	public void TestRegister_EquivalenceTesting() {
		s1.register(1);
		assertEquals(1, s1.getCode());
		assertEquals(true, s1.isRegistered());
	}
	
	@Test
	public void TestRegister_EdgeValueTesting() {
		s1.register(1);
		assertEquals(1, s1.getCode());
		assertEquals(true, s1.isRegistered());
	}

	@Test
	public void TestRegister_DecisionTableBasedTesting() {
		s1.register(1);
		assertEquals(1, s1.getCode());
		assertEquals(true, s1.isRegistered());
	}
}
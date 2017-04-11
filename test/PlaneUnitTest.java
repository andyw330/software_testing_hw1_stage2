package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import system.Plane;
import system.TYPE;
import system.FOOD;

public class PlaneUnitTest {
	
	Plane p;

	@Before
	public void setUp() throws Exception {
		p = new Plane();
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test
	public void bootTest_BoundaryValueTesting() {
		//test boot(), which is called in constructor
		assertEquals(true, p.seatList[0].equals(p.A));
		assertEquals(true, p.seatList[1].equals(p.B));
		assertEquals(true, p.seatList[4].equals(p.E));
		assertEquals(true, p.seatList[8].equals(p.J));
		assertEquals(true, p.seatList[9].equals(p.K));

		assertEquals(true, p.foodList[0].equals(FOOD.NONE));
		assertEquals(true, p.foodList[1].equals(FOOD.VEGETABLE));
		assertEquals(true, p.foodList[2].equals(FOOD.PORK));
		assertEquals(true, p.foodList[3].equals(FOOD.BEEF));

		assertEquals(true, p.typeList[0].equals(TYPE.EC));
		assertEquals(true, p.typeList[1].equals(TYPE.EDC));
		assertEquals(true, p.typeList[2].equals(TYPE.SBC));
		assertEquals(true, p.typeList[3].equals(TYPE.SFC));
	}

	@Test
	public void bootTest_EquivalenceTesting() {
		assertEquals(true, p.seatList[0].equals(p.A));
		assertEquals(true, p.foodList[0].equals(FOOD.NONE));
		assertEquals(true, p.typeList[0].equals(TYPE.EC));
	}
	
	@Test
	public void bootTest_EdgeValueTesting() {
		assertEquals(true, p.seatList[0].equals(p.A));
		assertEquals(true, p.seatList[1].equals(p.B));
		assertEquals(true, p.seatList[8].equals(p.J));
		assertEquals(true, p.seatList[9].equals(p.K));

		assertEquals(true, p.foodList[0].equals(FOOD.NONE));
		assertEquals(true, p.foodList[1].equals(FOOD.VEGETABLE));
		assertEquals(true, p.foodList[2].equals(FOOD.PORK));
		assertEquals(true, p.foodList[3].equals(FOOD.BEEF));

		assertEquals(true, p.typeList[0].equals(TYPE.EC));
		assertEquals(true, p.typeList[1].equals(TYPE.EDC));
		assertEquals(true, p.typeList[2].equals(TYPE.SBC));
		assertEquals(true, p.typeList[3].equals(TYPE.SFC));
	}

	@Test
	public void bootTest_DecisionTableBasedTesting() {
		assertEquals(true, p.seatList[1].equals(p.B));
		assertEquals(true, p.foodList[0].equals(FOOD.NONE));
		assertEquals(true, p.typeList[2].equals(TYPE.SBC));
	}

	@Test
	public void insertSeatsTest_BoundaryValueTesting() {
		p.insertSeats();
		assertEquals("A1", p.A[1].seatName);
		assertEquals("A2", p.A[2].seatName);
		assertEquals("A8", p.A[8].seatName);
		assertEquals("A69", p.A[69].seatName);
		assertEquals("A70", p.A[70].seatName);

		assertEquals("B45", p.B[45].seatName);
		assertEquals("B46", p.B[46].seatName);
		assertEquals("B47", p.B[47].seatName);
		assertEquals("B69", p.B[69].seatName);
		assertEquals("B70", p.B[70].seatName);

		assertEquals("C1", p.C[1].seatName);
		assertEquals("C2", p.C[2].seatName);
		assertEquals("C8", p.C[8].seatName);
		assertEquals("C69", p.C[69].seatName);
		assertEquals("C70", p.C[70].seatName);

		assertEquals("D27", p.D[27].seatName);
		assertEquals("D28", p.D[28].seatName);
		assertEquals("D29", p.D[29].seatName);
		assertEquals("D69", p.D[69].seatName);
		assertEquals("D70", p.D[70].seatName);

		assertEquals("E27", p.E[27].seatName);
		assertEquals("E28", p.E[28].seatName);
		assertEquals("E29", p.E[29].seatName);
		assertEquals("E69", p.E[69].seatName);
		assertEquals("E70", p.E[70].seatName);

		assertEquals("F27", p.F[27].seatName);
		assertEquals("F28", p.F[28].seatName);
		assertEquals("F29", p.F[29].seatName);
		assertEquals("F69", p.F[69].seatName);
		assertEquals("F70", p.F[70].seatName);

		assertEquals("G27", p.G[27].seatName);
		assertEquals("G28", p.G[28].seatName);
		assertEquals("G29", p.G[29].seatName);
		assertEquals("G69", p.G[69].seatName);
		assertEquals("G70", p.G[70].seatName);

		assertEquals("H1", p.H[1].seatName);
		assertEquals("H2", p.H[2].seatName);
		assertEquals("H8", p.H[8].seatName);
		assertEquals("H69", p.H[69].seatName);
		assertEquals("H70", p.H[70].seatName);

		assertEquals("J45", p.J[45].seatName);
		assertEquals("J46", p.J[46].seatName);
		assertEquals("J60", p.J[60].seatName);
		assertEquals("J69", p.J[69].seatName);
		assertEquals("J70", p.J[70].seatName);

		assertEquals("K1", p.K[1].seatName);
		assertEquals("K2", p.K[2].seatName);
		assertEquals("K8", p.K[8].seatName);
		assertEquals("K69", p.K[69].seatName);
		assertEquals("K70", p.K[70].seatName);
	}

	@Test
	public void insertSeatsTest_EquivalenceTesting() {
		assertEquals("A1", p.A[1].seatName);
		assertEquals("A6", p.A[6].seatName);
		assertEquals("A27", p.A[27].seatName);
		assertEquals("A45", p.A[45].seatName);
	}
	
	@Test
	public void insertSeatsTest_EdgeValueTesting() {
		// SFC
		assertEquals("A1", p.A[1].seatName);
		assertEquals("A3", p.A[3].seatName);

		// SBC
		assertEquals("A6", p.A[6].seatName);
		assertEquals("A13", p.A[13].seatName);

		// EDC
		assertEquals("A27", p.A[27].seatName);
		assertEquals("A41", p.A[41].seatName);

		// EC
		assertEquals("A45", p.A[45].seatName);
		assertEquals("A70", p.A[70].seatName);
	}

	@Test
	public void insertSeatsTest_DecisionTableBasedTesting() {
		// SFC
		assertEquals("A1", p.A[1].seatName);

		// SBC
		assertEquals("A6", p.A[6].seatName);

		// EDC
		assertEquals("A27", p.A[27].seatName);

		// EC
		assertEquals("A45", p.A[45].seatName);
	}

	@Test
	public void removeRowATest_BoundaryValueTesting() {
		p.removeRowA(1);
		assertEquals(false, p.A[1].isAvailable());
		p.removeRowA(2);
		assertEquals(false, p.A[2].isAvailable());
		p.removeRowA(8);
		assertEquals(false, p.A[8].isAvailable());
		p.removeRowA(69);
		assertEquals(false, p.A[69].isAvailable());
		p.removeRowA(70);
		assertEquals(false, p.A[70].isAvailable());
	}

	@Test
	public void removeRowATest_EquivalenceTesting() {
		p.removeRowA(1);
		assertEquals(false, p.A[1].isAvailable());
	}
	
	@Test
	public void removeRowATest_EdgeValueTesting() {
		p.removeRowA(1);
		assertEquals(false, p.A[1].isAvailable());
		p.removeRowA(2);
		assertEquals(false, p.A[2].isAvailable());
		p.removeRowA(69);
		assertEquals(false, p.A[69].isAvailable());
		p.removeRowA(70);
		assertEquals(false, p.A[70].isAvailable());
	}

	@Test
	public void removeRowATest_DecisionTableBasedTesting() {
		p.removeRowA(1);
		assertEquals(false, p.A[1].isAvailable());
	}



}
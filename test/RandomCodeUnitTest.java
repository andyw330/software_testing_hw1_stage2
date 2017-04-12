package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import system.FOOD;
import system.RandomCode;
import system.Seat;
import system.TYPE;

public class RandomCodeUnitTest {

	RandomCode r;
	Seat[] seats;

	@Before
	public void setUp() throws Exception {
		r = new RandomCode(1);
		seats = new Seat[384];
		for (int i = 0; i < 384; ++i) {
			seats[i] = new Seat(TYPE.EC, 1, 'A');
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	// #seats <= 384
	@Test
	public void addSeatTest_BoundaryValueTesting() {
		assertEquals(0, r.numberSeats());

		r.addSeat(seats[0]);
		assertEquals(1, r.numberSeats());

		for (int i = 1; i < 383; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(383, r.numberSeats());

		r.addSeat(seats[383]);
		assertEquals(384, r.numberSeats());
	}

	// Strong Normal Equivalence Class Testing (Weak Normal is a subset)
	@Test
	public void addSeatTest_EquivalenceTesting() {
		assertEquals(0, r.numberSeats());

		for (int i = 0; i < 192; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(192, r.numberSeats());

		for (int i = 192; i < 384; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(384, r.numberSeats());
	}

	@Test
	public void addSeatTest_EdgeValueTesting() {
		assertEquals(0, r.numberSeats());

		r.addSeat(seats[0]);
		assertEquals(1, r.numberSeats());

		for (int i = 1; i < 192; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(192, r.numberSeats());

		for (int i = 192; i < 383; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(383, r.numberSeats());

		r.addSeat(seats[383]);
		assertEquals(384, r.numberSeats());
	}

	@Test
	public void addSeatTest_DecisionTableBasedTesting() {
		for (int i = 0; i < 192; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(192, r.numberSeats());
	}


	@Test
	public void removeSeatTest_BoundaryValueTesting() {
		for (int i = 0; i < 384; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(384, r.numberSeats());

		r.removeSeat(seats[0]);
		assertEquals(383, r.numberSeats());

		for (int i = 1; i < 383; ++i) {
			r.removeSeat(seats[i]);
		}
		assertEquals(1, r.numberSeats());

		r.removeSeat(seats[383]);
		assertEquals(0, r.numberSeats());
	}

	// Strong Normal Equivalence Class Testing (Weak Normal is a subset)
	@Test
	public void removeSeatTest_EquivalenceTesting() {
		for (int i = 0; i < 384; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(384, r.numberSeats());

		for (int i = 0; i < 192; ++i) {
			r.removeSeat(seats[i]);
		}
		assertEquals(192, r.numberSeats());

		for (int i = 192; i < 384; ++i) {
			r.removeSeat(seats[i]);
		}
		assertEquals(0, r.numberSeats());
	}

	@Test
	public void removeSeatTest_EdgeValueTesting() {
		for (int i = 0; i < 384; ++i) {
			r.addSeat(seats[i]);
		}
		assertEquals(384, r.numberSeats());

		r.removeSeat(seats[0]);
		assertEquals(383, r.numberSeats());

		for (int i = 1; i < 192; ++i) {
			r.removeSeat(seats[i]);
		}
		assertEquals(192, r.numberSeats());

		for (int i = 192; i < 383; ++i) {
			r.removeSeat(seats[i]);
		}
		assertEquals(1, r.numberSeats());

		r.removeSeat(seats[383]);
		assertEquals(0, r.numberSeats());
	}

	@Test
	public void removeSeatTest_DecisionTableBasedTesting() {
		for (int i = 0; i < 384; ++i) {
			r.addSeat(seats[i]);
		}
		for (int i = 0; i < 192; ++i) {
			r.removeSeat(seats[i]);
		}
		assertEquals(192, r.numberSeats());
	}


	@Test
	public void unregisterCodeTest_BoundaryValueTesting() {
		r.unregisterCode();
		assertEquals(0, r.numberSeats());
		assertEquals(false, r.usable);
	}

	@Test
	public void unregisterCodeTest_EquivalenceTesting() {
		r.unregisterCode();
		assertEquals(0, r.numberSeats());
		assertEquals(false, r.usable);
	}

	@Test
	public void unregisterCodeTest_EdgeValueTesting() {
		r.unregisterCode();
		assertEquals(0, r.numberSeats());
		assertEquals(false, r.usable);
	}

	@Test
	public void unregisterCodeTest_DecisionTableBasedTesting() {
		r.unregisterCode();
		assertEquals(0, r.numberSeats());
		assertEquals(false, r.usable);
	}

}

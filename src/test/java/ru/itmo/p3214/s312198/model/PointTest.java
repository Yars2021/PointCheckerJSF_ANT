package ru.itmo.p3214.s312198.model;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import ru.itmo.p3214.s312198.model.Point;

public class PointTest {
	private Point point;

	@Before
	public void prepare() {
		point = new Point(1.0, 2.0, 3.0, false, null);	
	}

	@Test
	public void testHit() {
		assertEquals(false, point.getHit());
	}  

	@Test
	public void testEmptyDate() {
	        assertNull(point.getDate());
	}
}
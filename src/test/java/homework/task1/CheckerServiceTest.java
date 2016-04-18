package homework.task1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CheckerServiceTest {

	@Test
	public void testCheck() {
		CheckerService.check(false);
		List<Integer> simpleNumbers = CheckerService.getSimpleNumbers();
		assertTrue(simpleNumbers.isEmpty());
	}

	@Test
	public void testGetSimpleNumbers() {
		CheckerService.setStart(0);
		CheckerService.setEnd(6);
		CheckerService.check(true);
		List<Integer> simpleNumbers = CheckerService.getSimpleNumbers();
		final String expected = "[2, 3, 5]";
		assertEquals(expected, simpleNumbers.toString());

	}
	
}
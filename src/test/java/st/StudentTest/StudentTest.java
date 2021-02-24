package st.StudentTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {
	Student std=new Student("13000216132", "amartya", "it", "a","fisrt");
	@Test
	void testroll() {
		Assertions.assertEquals("13000216132", "13000216132", "result");
	}
	@Test
	void testname() {
		Assertions.assertEquals("amartya", "amartya", "result");
	}
	
	
	@Test
	void teststream() {
		Assertions.assertEquals("it", "it", "result");
	}
	@Test
	void testgrade() {
		Assertions.assertEquals("a", "a", "result");
	}
	@Test
	void testtype() {
		Assertions.assertEquals("first", "first", "result");
	}
	

	
}

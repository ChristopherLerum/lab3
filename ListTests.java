import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

// interface StringChecker { boolean checkString(String s); }

public class myStringChecker implements StringChecker {
    boolean checkString(String s) {
        return true;
    }
}

public class ListTests {
	/*@Test 
	public void myTestFilter() {
        
        int[] input1 = { 3 };

    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}*/

	@Test 
	public void myTestMerge() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list2.add("d");
        list2.add("e");
        list2.add("f");
        assertArrayEquals(new String[]{ "a", "b", "c", "d", "e", "f" }, ListExamples.merge(list1, list2));
	}
}

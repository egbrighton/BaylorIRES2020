package FindFileTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import FindFiles.FindJavaFiles;


/**
 * FindFilesTest tests directories given to the class FindFiles in
 * order to make sure this class behaves properly
 * @author Elizabeth
 *
 */
public class FindFilesTest {
	FindJavaFiles find;
	
	@Test
	public void testInvalid() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/DoesNotExist"));
		assertEquals(find.getFileCount(), 0);
		
	}
	
	@Test
	public void testEmpty() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/EmptyFolder"));
		assertEquals(find.getFileCount(), 0);
		
	}
	
	@Test
	public void testRegex() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/RegexTest"));
		assertEquals(find.getFileCount(), 1);
		
	}
	
	@Test
	public void testDir() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/DirectoryTest"));
		assertEquals(find.getFileCount(), 1);
	}
	
	@Test
	public void testNestedDir() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/NestedDirectoryTest"));
		assertEquals(find.getFileCount(), 2);
	}
	
	
	@Test
	public void testComplexDir() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/ComplexTest"));
		assertEquals(find.getFileCount(), 5);
	}
}

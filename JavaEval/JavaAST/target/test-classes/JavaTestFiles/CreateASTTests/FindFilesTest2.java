package FindFileTest;


import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import FindFiles.FindJavaFiles;

public class FindFilesTest2 {
	FindJavaFiles find;
	
	
	@Test
	public void testRegex() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/RegexTest"));
		Assert.assertEquals(find.getFileCount(), 1);
		
	}
	
	@Test
	public void testDir() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/DirectoryTest"));
		Assert.assertEquals(find.getFileCount(), 1);
	}
	
	@Test
	public void testNestedDir() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/NestedDirectoryTest"));
		Assert.assertEquals(find.getFileCount(), 2);
	}
	
	
	@Test
	public void testComplexDir() {
		find = new FindJavaFiles(new File("src/test/resources/JavaTestFiles/ComplexTest"));
		Assert.assertEquals(find.getFileCount(), 5);
	}
}

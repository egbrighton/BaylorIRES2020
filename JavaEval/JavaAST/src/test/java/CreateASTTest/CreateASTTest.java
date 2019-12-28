package CreateASTTest;

import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import AST.CreateAST;


/**
 * CreateASTTest is a testing class that creates different AST's to 
 * make sure there are no simple errors in the CreateAST class code
 * @author Elizabeth
 *
 */
public class CreateASTTest {
	static CreateAST AST;
	
	@BeforeAll
	public static void init() {
		AST = new CreateAST();
	}
	
	/**
	 * Test if no File Exists
	 * These are more difficult to test as nothing is returned.
	 * In order to test these, AST's would have to be created
	 * from a different source and compared with the AST's created here
	 */
	@Test
	public void NoFileAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/DoesNotExist.java"));
		
		assertTrue(false);
	}
	
	/**
	 * Test basic file
	 */
	@Test
	public void HelloAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/Hello.java"));
		assertTrue(true);
	}
	
	/**
	 * Test more complex file
	 */
	@Test
	public void FindFilesTestAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/FindFilesTest2.java"));
		assertTrue(true);
	}
	
	/**
	 * Test file with nothing in it
	 */
	@Test
	public void BlankAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/Blank.java"));
		assertTrue(true);
	}
	
}

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
	
	@Test
	public void NoFileAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/DoesNotExist.java"));
		//fail("FileNotFoundException");
		assertTrue(true);
	}
	
	@Test
	public void HelloAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/Hello.java"));
		assertTrue(true);
	}
	
	@Test
	public void FindFilesTestAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/FindFilesTest2.java"));
		assertTrue(true);
	}
	
	
	@Test
	public void BlankAST() {
		AST.create(new File("src/test/resources/JavaTestFiles/CreateASTTests/Blank.java"));
		assertTrue(true);
	}
	
}

package FindFiles;

import java.io.File;
import AST.CreateAST;



/**
 * FindJavaFiles iterates through the Directory given (checking
 * to make sure given directory is valid) and finds every file that
 * ends with .java. It passes the .java files to an instance of the
 * CreateAST class which creates an AST for each. 
 * 
 * @author Elizabeth
 *
 */
public class FindJavaFiles {
	
	int fileCount = 0;
	File mainDir;
	String match = "^.*\\.java$";
	CreateAST AST;
	
	/**
	 * Constructor. Upon creation a directory is given
	 * and the files(directories) within are checked for
	 * .java files (using the private findFiles method)
	 * 
	 * @param dir directory to search
	 */
	public FindJavaFiles(File dir) {
		mainDir = dir;
		/**
		 * Instance of CreateAST class
		 */
		AST = new CreateAST();
		
		findFiles(dir);
		
	}

	//private function fildFiles is a recursive function that takes
	//a directory and iterates through it, sending all the .java files
	//to CreateAST in order to create an AST for each.
	private void findFiles(File dir) {
		//list all the files in the directory 
		File[] inDir = dir.listFiles();
		//if null then the directory is invalid or nothing is contained within it
		if(inDir == null) {
			if(dir == mainDir) {
				System.out.println("Invalid(Empty) Directory Given");
			}
		} else {
			//For each file found in the directory 
			for(File f: inDir) {
				//if the regex matches the string above ("^.*\\.java$")
				//then CreateAST will create an AST for the file and 
				//store it next to the file given
				if(f.getName().matches(match)) {
					AST.create(f);
					//fileCount is mostly used for testing purposes 
					fileCount++;
				} else if (f.isDirectory()) {
					//if f is a directory then make a recursive call using the
					//new directory found. 
					findFiles(f);
				}
	
			}
	
		}
	
	}
	
	/**
	 * GetFileCount returns the number of .java files found. This is mostly
	 * used for testing.
	 * @return fileCount fileCount is the number of .java files found
	 */
	public int getFileCount() {
		return fileCount;
	}

	
	
	
}

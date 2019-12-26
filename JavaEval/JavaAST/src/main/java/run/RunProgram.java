package run;

import java.io.File;
import FindFiles.FindJavaFiles;


/**
 * RunProgram contains the Main Method in this project. It takes
 * a command line argument and turns it into a file. The file is 
 * passed to FindJavaFiles which iterates through the directory
 * given. 
 *  
 * @author Elizabeth
 * 
 */
public class RunProgram {

	/**
	 * Main Function. Is used to start the project 
	 * and enter a directory name into the program
	 * 
	 * @param args DirectoryName
	 */
	public static void main(String[] args) {

		/**
		 * Make sure the number of parameters entered is 1
		 */
		if(args.length != 1) {
			System.out.println("Usage: DirectoryName");
			System.exit(0);
		}

		File file = new File(args[0]);
		
		/**
		 * Create an instance of FindJavaFiles
		 */
		FindJavaFiles find = new FindJavaFiles(file);
		
		/*
		 * As a check - make sure the number of .java files found is correct
		 */
		//System.out.println(find.getFileCount() + " .java files found");
	}

}

package AST;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.printer.XmlPrinter;
import com.github.javaparser.printer.YamlPrinter;



/**
 * CreateAST class takes a .java File and creates a new file
 * with the AST for the .java File given. This Class uses the 
 * github JavaParser library in order to easialy create an AST
 * 
 * @author Elizabeth
 *
 */
public class CreateAST {

	private String filename;
	private BufferedReader read;
	private String str = null;
	
	/**
	 * Constructor sets class values to null.
	 */
	public CreateAST() {
		filename = null;
		read = null;
	}
	
	
	/**
	 * create takes a file as input and creates an AST for the file given. 
	 * It then stores the file in a .ast file within the same folder as the file
	 * 
	 * @param f .java file to create AST from
	 */
	public void create(File f) {
		/**
		 * Read in the .java file and convert it into a string
		 */
		try {

			read = new BufferedReader(new FileReader(f));
			str = IOUtils.toString(read);
			read.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
		
	
	/**
	 * parse the string into a CompilationUnit (using the github.javaparser lib)
	 */
	CompilationUnit cu = StaticJavaParser.parse(str);
	//cu.toString() shows the actual code. 
	
	/**
	 * Use the YamlPrinter to convert the CompilationUnit into
	 * a more readable AST
	 */
	YamlPrinter printer = new YamlPrinter(true);
	
	//XML Version from javaParser - if the AST file should be in the XML format
	//XmlPrinter printer = new XmlPrinter(true);
	
	/**
	 * Add the .ast extension to the filename
	 */
	filename = f.getAbsolutePath() + ".ast";
	
	/**
	 * and write the AST to the .ast file
	 */
	BufferedWriter writer;
	try {
		writer = new BufferedWriter(new FileWriter(filename));
		writer.write(printer.output(cu));
		writer.close();
		 
	} catch (IOException e) {
		e.printStackTrace();
	}
   
     
    
	}
}
	

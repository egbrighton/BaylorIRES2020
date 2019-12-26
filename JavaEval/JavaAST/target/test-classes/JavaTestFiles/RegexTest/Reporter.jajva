

/*Elizabeth Brighton
 *Software Engineering 1
 *Assignment 4 Part 2
 *due 9/28/2019
 */
package Software1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Reporter {
	

	 public static void main(String[] args) throws FileNotFoundException {

	      //Check the args length
		  if (args == null || args.length != 2) {
		   System.out.println("syntaxt is <file path> report type");
		   System.exit(0);
		  }
		  //parse the second value into an int
		  int inputVal = Integer.parseInt(args[1]);
		  if(inputVal > 3 || inputVal < 1) {
			  System.out.println("syntaxt is <file path> report type");
			  System.exit(0);
		  }
		  //create a scanner to read in the file
		  Scanner scanner = new Scanner(new File(args[0]));
		 
		  switch(inputVal) {
		  case 1: {
			  //for case 1 put everything into a list
			  List<String> case1 = new ArrayList<String>();
			  
			  int count = 0;
			  
			  //Get rid of the descriptions on the top of the csv file
			  int lengthOfDescription = 0;
			  if(scanner.hasNextLine()) {
				 String s = scanner.nextLine();
				 String []sp = s.split(",");
				 lengthOfDescription = sp.length;
			  }
				 
			  
			  
			  
			  //Scan in the values
			  while (scanner.hasNextLine()) {
				  
				  
				  //Make them lower case
				   String line = scanner.nextLine().toLowerCase();
				   
				   //If the word tech is found anywhere then just continue
				   //don't add it to the list
				   if(line.contains("tech")) {
					   //count++;
					   continue;
				   }
					   
				   //Split the input
				   String []input = line.split(",");
				   
				   
				   //number of lines may be wrong...
				   //There are 11 lines that have a different length
				   //then the description length
				   if(input.length != lengthOfDescription) {
					   //System.out.println("line not properly set up");
					   count++;
					   continue;
					   
				   }
					   
				   //Only put the needed values into a string - notice that
				   //the city is placed first so when it is sorted it will be
				   //sorted by city
				   line = input[4] + "," + input[3] + "," + input[5] + "," + input[6];
				   	   				  
				   //and add it to the list
				   case1.add(line);
			  }
			  
			  //sort the list
			  Collections.sort(case1);
			 
			  //print out the list with the correct order
			  //(The order given in the description - Institution name, city, state abbreviation and URL)
			  for(String s: case1) {
				  String []current = s.split(",");
				  System.out.println(current[1] + ", " + current[0] + ", " +
						  current[2] + ", " + current[3]);
			  }
			  
			  //System.out.println(lengthOfDescription);
			  break;
		  }
		  case 2: {
			  
			  //I am using a map in order to keep track of the number
			  //of institutions in each city
			  Map<String, Integer> case2 = new HashMap<String, Integer>();
			  

			  //Get rid of the descriptions on the top of the csv file
			  //And find the length of the first line
			  int lengthOfDescription = 0;
			  if(scanner.hasNextLine()) {
				 String s = scanner.nextLine();
				 String []sp = s.split(",");
				 lengthOfDescription = sp.length;
			  }
				 
			  
			  
			  
			  //Scan in the values
			  while (scanner.hasNextLine()) {
				  
				  
				  //Make them lower case
				   String line = scanner.nextLine().toLowerCase();
				   
				  		   
				   //Split the input
				   String []input = line.split(",");
				   
				   
				   //number of lines may be wrong...
				   //There are 11 lines that have a different length
				   //then the description length
				   if(input.length != lengthOfDescription) {
					   //System.out.println("line not properly set up");
					   continue;   
				   }
					   
				   //If the city is already in the map then add
				   //1 to it. Otherwise initialize it to a value of 1
				   if(case2.containsKey(input[4])) {
					   case2.put(input[4],(case2.get(input[4]) + 1));
				   }
				   else {
					   case2.put(input[4], 1);
				   }
			  }
			  
			  //sort the map by making it a treeMap which is automatically sorted
			  //by the keys
			  Map<String, Integer> case2Sorted = new TreeMap<String, Integer>(case2);

			  //Print out the results
			  case2Sorted.entrySet().stream().forEach(
					  m -> System.out.println(m.getKey() + ", " + m.getValue()));
			  
			  
			  
			  break;
		  }
		  case 3: {
			  
			  
			  //I am using a map in order to keep track of the number
			  //of institutions in each state
			  Map<String, Integer> case3 = new HashMap<String, Integer>();
			  

			  //Get rid of the descriptions on the top of the csv file
			  //And find the length of the first line
			  int lengthOfDescription = 0;
			  if(scanner.hasNextLine()) {
				 String s = scanner.nextLine();
				 String []sp = s.split(",");
				 lengthOfDescription = sp.length;
			  }
				 
			  
			  
			  
			  //Scan in the values
			  while (scanner.hasNextLine()) {
				  
				  
				  //Make them lower case
				   String line = scanner.nextLine().toLowerCase();
				   
				  		   
				   //Split the input
				   String []input = line.split(",");
				   
				   
				   //number of lines may be wrong...
				   //There are 11 lines that have a different length
				   //then the description length
				   if(input.length != lengthOfDescription) {
					   //System.out.println("line not properly set up");
					   continue;   
				   }
					   
				   //If the state is already in the map then add
				   //1 to it. Otherwise initialize it to a value of 1
				   if(case3.containsKey(input[5])) {
					   case3.put(input[5],(case3.get(input[5]) + 1));
				   }
				   else {
					   case3.put(input[5], 1);
				   }
			  }
			  
			  //This takes the map and sorts it comparing by value in reverse order
			  //it has to collect it as a LinkedHashMap to keep the order intact
			  Map<String, Integer> case3Sorted = case3.entrySet().stream()
					  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
					  collect(Collectors.toMap(Map.Entry::getKey, 
							  Map.Entry::getValue, (m1, m2) -> m2,
						        LinkedHashMap::new));
			  
			  
			  
			  //Print out the results - just saying DC is not a state
			  //Apparently there are 59 states.....
			  case3Sorted.entrySet().stream().forEach(
					  m -> System.out.println(m.getKey().toUpperCase() + ", " + m.getValue()));
			  
			  
			  break;
		  }
			  
		  }
		  

		 
		  scanner.close();
		 }

}

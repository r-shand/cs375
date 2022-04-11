package prj3;
import java.util.*;
import java.io.*;

public class Program3 {
    public static void main(String[] args) throws FileNotFoundException {
	File inputFile = new File(args[0]);
	Scanner scanner = new Scanner(inputFile);
	File outputFile = new File("prj3/" + args[1]);
	try {
	    FileWriter f = new FileWriter(outputFile);
	    PrintWriter p = new PrintWriter(f);
       	    String algorithm = args[2];
	    int problemNum = 1;
       	    while(scanner.hasNextInt()) {
	        int problems = scanner.nextInt();
	        int capacity = scanner.nextInt();
	        ItemList itemList = new ItemList(problems, capacity);
	        for(int i = 0; i < problems; i++) {
	            int wt = scanner.nextInt();
	            int pf = scanner.nextInt();
	            Item item = new Item(wt, pf);
	            itemList.addItem(item);
	        }
	        if(algorithm.equals("0")) {
	            itemList.greedy1();
	        }
	        if(algorithm.equals("1")) {
		    itemList.greedy2();
	        }
	        if(algorithm.equals("2")) {
	  	    itemList.backtracking();
	        }
	        p.print(itemList.outputStr());
	        System.out.println("-------------------------------------------");
	        System.out.println("Problem " + Integer.toString(problemNum) + ", Capacity: " + Integer.toString(capacity));
                System.out.println(itemList.toString());
	        System.out.println(itemList.toStringBestSet());
	        problemNum++;
            }
	    p.close();
	    f.close();
	}
	catch(IOException e) {
	    System.out.println("IO ERROR");
	}
    }
}

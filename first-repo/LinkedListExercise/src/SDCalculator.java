import java.util.Scanner;


public class SDCalculator {
	
	private double calculateMean(MyList list) {
		Node currentNode = list.getHead();
	    double sum = 0;
	    int N = list.getSize();
		
	    while(currentNode != null) {
		    sum += currentNode.getData();
		    currentNode = currentNode.getNextNode();
	    }
		
	    return sum/N;
	}
	
	private double calculateStandardDeviation(MyList list) {
		double mean = calculateMean(list);
		Node currentNode = list.getHead();
		int N = list.getSize();
		double squaredSum = 0;
		
		while(currentNode != null) {
		    squaredSum += (currentNode.getData() - mean) * (currentNode.getData() - mean);
		    currentNode = currentNode.getNextNode();
	    }
		
		return Math.sqrt(squaredSum/(N-1));
	}

	public static void main(String[] args) {
		SDCalculator sdcal = new SDCalculator();
	    MyList list = new MyList();
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Number of elements: ");
	    int n = reader.nextInt();
	    System.out.println("Enter " + n + " elements: ");
	    for (int i = 0; i < n; i++) {
	    	double data = reader.nextDouble();
	    	list.insert(data);
	    }
	    System.out.println("Standard Deviation is: " + sdcal.calculateStandardDeviation(list));
	    reader.close();
	}
}

/**
 * @version 1.0
 * @author snaim
 *
 */
class Node {
    private double data;
    private Node nextNode;

    /**
     * 
     * @param data
     */
    public Node(double data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	/**
	 * 
	 * @return
	 */
	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public void print() {
	    System.out.print(data + " ");
    }
}
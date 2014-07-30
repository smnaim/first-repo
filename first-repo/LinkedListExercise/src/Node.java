
class Node {
    private double data;
    private Node nextNode;

    public Node(double data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

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
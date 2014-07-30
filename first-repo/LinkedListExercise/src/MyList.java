class MyList {
    private Node head;

    public Node getHead() {
		return head;
	}

	public MyList() {
    	head = null;
    }

	// check whether the list is empty
    public boolean isEmpty() {
	    return head == null;
    }

    public int getSize() {
    	Node currentNode = head;
	    int count = 0;
		while(currentNode != null) {
		    count++;
		    currentNode = currentNode.getNextNode();
	    }
		return count;
    }
    
    public void insert(double data) {
	    Node newNode = new Node(data);
	    newNode.setNextNode(head);
	    head = newNode;
    }

    public void delete() {
    	if (!isEmpty()) {
    		head = head.getNextNode();
    	}
    }

}
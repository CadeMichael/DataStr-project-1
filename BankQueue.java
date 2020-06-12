/**
 * This class is a queue using linked lists to store any object that extends Entry
 * every new entry is assigned a position (id) based on the number of people that have already enqued
 * @author Cade Lueker
 */
public class BankQueue<I extends Entry>{
  
  /**
   * this is the Node class used to create the nodes that store every entry in the queue
   */
  public class Node<I extends Entry>{
    // item holds the entry in the queue
    private I item;
    // next is the link to the next node
    private Node<I> next;
    
    /**
     * @constructor instantiates the node with an item
     * @param item is the entry being stored in the node
     */
    public Node(I item) {
      this.item = item;
      this.next = null;
    }
    
    /** 
     * returns the next node
     * @return this.next which is the link to the next node
     */
    public Node<I> getNext() {
      return this.next;
    }
    
    /**
     * set the next node
     * @param newNode represents the node that will succeed the current node
     */
    public void setNext(Node<I> newNode) {
      this.next = newNode;
    }
    
    /**
     * return the entry strored in the current node
     * @return item which represents the entry in the node
     */
    public I getItem() {
      return this.item;
    }
    
  }
  
  /** head holds the first value in the linked list */
  private Node<I> head;
  /** rear holds the 
    * last value in the linked list */
  private Node<I> rear;
  /** id holds the Nth number of the items added to the linked list */
  private int id = 0;
  
  /** 
   * @constructor sets the head to null 
   */
  public BankQueue() {
    this.head = null;
    this.rear = null;
  }
  // make a tail
  /** 
   * adds an item to the queue setting its id to the size of the queue
   * @param item holds the entry being added to the queue
   */
  public void enqueue(I item) {
    this.id++;
    item.setPosition(id);
    Node<I> newEntry = new Node<I> (item);
    if (this.head == null) { // check if the head is null
      this.head = newEntry;
      this.rear = newEntry;
    }
    else { // the head is not null
      this.rear.setNext(newEntry); // make the last node point to the new entry 
      this.rear = newEntry; // set the last node to the new entry
    }
  } 
  
  public I dequeue() {
    if (this.head == null) // check if the head is null
      return null;
    else { // if the head is not null
      // the item being removed is the item at the head
      I dequeued = (this.head.getItem());
      this.head = this.head.getNext();
      return dequeued;
    } 
  }
  
  
  /** 
   * looks for a specific item in the queue and removes it 
   * @param item represents the entry to be removed from the queue
   * @return the string representation of the item should it be in the bankqueue
   */
  public String quitter(I item) {
    // quit holds the string representation of the entry should it exist
    String quit = "does not exist";
    if (this.head == null) // check if the head is null
      return quit;
    else if (this.head.getItem().equals(item)) { // check if the head contains the item
      quit = this.head.getItem().toString();
      this.dequeue();
    }
    else { // should the entry exist it is somewhere in the middle of the queue
      Node<I> nextNode = this.head;
      // iterate through the linked list while the next node is not null
      while (nextNode.getNext() != null) { 
        if (!(nextNode.getNext().getItem().equals(item))) { // check if the next node contains the desired entry
          nextNode = nextNode.getNext(); 
        }
        else { // the next node contains the desired entry
          quit = nextNode.getNext().getItem().toString(); 
          // pass over the next node
          nextNode.setNext(nextNode.getNext().getNext());
        }
      }
    }
    return quit;
  }
  
  /** 
   * override the toString method to make visualizing the queue easier 
   */
  @Override
  public String toString() {
    String s = "\n";
    Node<I> nextNode = this.head;
    // iterate through the linked list while the  nextNode isn't null
    while(nextNode != null) {
      s += nextNode.getItem().toString() +"\n";
      nextNode = nextNode.getNext();
    }
    return s;
  }
}

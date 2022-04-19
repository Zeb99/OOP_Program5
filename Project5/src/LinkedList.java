class Node<T> {
  T data;
  Node<T> next;

  public Node(T data, Node<T> next){
    System.out.println("Node() Constructor Invoked...");  
    this.data = data;
    this.next = next;
  }

  public Node(T newData){
    System.out.println("Node(T data) Constructor Invoked...");
    this.data = newData;
    this.next = null;
  }

  public T getData(){
    return data;
  }

}

public class LinkedList<T>{
    private Node<T> head;
    private int length;

    public LinkedList(){
      System.out.println("LinkedList() Constructor Invoked...");
      this.head = null;
      this.length = 0;
    }


    /**
     * A method called insert that takes one argument of type T. 
     * This method inserts the node with the data of type T in the 
     * back of a linked list.
     */
    public void insert(T newData){
      Node<T> temp = new Node<T>(newData);

      if(head == null){
        head = temp;
        this.length++;
      } else {
        while(head.next != null){
          head = head.next;
        }
        head.next = temp;
        this.length++;
      }
    }
    
    /**
     * A method called insert that takes two arguments. The first argument is a primitive integer called position. 
     * This determines where in the linked list the node will be inserted. The second argument is of type T that 
     * represents the data being inserted into the Linked List. This method inserts the node with the data of type T 
     * in a certain position of the LinkedList. If the position passed is not within range, have the message 
     * “Out of range!” be displayed and have the method terminate.
     */
    public void insert(int position, T newData){

    }

    /**
     * A method called remove that takes one argument. The argument is a 
     * generic type T variable that represents the data. The method removes 
     * a node that contains the data passed. Assume that the linked list 
     * doesn’t have duplicates.
     */
    public void remove(T removeData){

    }

    /**
     * A method called clear that takes no arguments. The method removes all nodes in the linked list.
     */
    public void clear(){
      head = null;
    }

    /**
     * A method called empty that takes no arguments. The method determines if a linked list is empty or not. 
     * The method returns a primitive Boolean value. True if the linked list is empty and false otherwise.
     */
    public boolean empty(){
      boolean isEmpty;
      if(head == null){
        isEmpty = true;
      } else {
        isEmpty = false;
      }
      return isEmpty;
    }


    /**
     * A method called length that takes no arguments. 
     * The method determines the number of nodes in the list and returns the number.
     */
    public int length(){
      return this.length;
    }

    /**
     * A method called toString that takes no arguments. The method will display the contents of the 
     * linked list in the form of one. Here is an example “Sonic ---> Tails ---> Knuckles ---> Eggman” If 
     * the list is empty, then the message “Empty List” is displayed.
     */
    @Override
    public String toString(){
      Node<T> temp = new Node<>(head.data);
      String output = "Empty List";
      if(length != 0){
        while(temp.next != null){
          output += temp.data + "--->";
        }
      }     
      return output;   
    }
}
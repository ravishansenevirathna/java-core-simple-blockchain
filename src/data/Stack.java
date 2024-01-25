package data;

/**
 * Hi my name is Ravishan.
 * Created date : 1/20/2024
 * Created time : 8:50 AM
 * Project : data
 */

//This is First In, Last Out Chain
public class Stack {

//the nail
    private Node top;

    public void push(int data){
        Node node=new Node(data); //data--->10
        node.next=top;
        top=node;
    }

    public void printStack(){
        Node temp=top;

        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

//        while (top!=null){
//            System.out.println(top.data);
//            top=top.next;
//        }

    }

    public void pop(){
        if(top!=null){
            top=top.next;
        }
    }


}

package data;

/**
 * Hi my name is Ravishan.
 * Created date : 1/20/2024
 * Created time : 10:47 AM
 * Project : data
 */

//This is First In, First Out Chain
public class Queue {

    private Node top;

    public void push(int data){
        Node node=new Node(data);

        if(top==null){
            top=node;
        }else {


            Node temp=top;


            while(temp.next!=null){
                temp=temp.next;
            }


            temp.next=node;
            
        }
    }
}

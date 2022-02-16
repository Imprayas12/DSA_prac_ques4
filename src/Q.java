import java.util.Scanner;

public class Q <T>{
    Node front;
    Node rear;
    public boolean isEmpty(){
        return front==null && rear==null;
    }
    public void enqueue(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = rear.next;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else {
            System.out.println(front.data);
            front = front.next;
        }
    }
    public static void main(String[] args) {
        Q<String> q = new Q<>();
        for(var str : args){
            String ans = "";
            if(Integer.parseInt(str)>0)
                ans = ans.concat("P");
            else
                ans = ans.concat("N");
            for(int i = 1;i<str.length();i++){
                if(str.charAt(i)=='0'&& (ans.charAt(i-1)=='P'||ans.charAt(i-1)=='N')) {
                }
                else if(str.charAt(i)=='0')
                    ans = ans.concat("Z");
                else if(str.charAt(i)%2==0)
                    ans = ans.concat("E");
                else
                    ans = ans.concat("O");
            }
            q.enqueue(ans);
        }
        while (!q.isEmpty()){
            q.dequeue();
        }
    }
}

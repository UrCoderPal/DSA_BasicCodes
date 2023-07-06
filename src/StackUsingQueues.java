package pack02;
import java.util.*;

public class StackUsingQueues {
    private Queue<Integer> primaryQueue;
    private Queue<Integer> tempQueue;

    public StackUsingQueues() {
        primaryQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(int x) {

        while (!primaryQueue.isEmpty()) {
            tempQueue.offer(primaryQueue.poll());
        }

        
        primaryQueue.offer(x);

        while (!tempQueue.isEmpty()) {
            primaryQueue.offer(tempQueue.poll());
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else
        System.out.println(primaryQueue.poll());;
    }

    public void top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else
        System.out.println(primaryQueue.peek());
    }

    public boolean isEmpty() {
        return primaryQueue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues obj = new StackUsingQueues();
        int ch,e;
        Scanner sc=new Scanner(System.in);
        do {
        	System.out.println("Menu for Stack\n1. push\n2. pop\n3. top\no. exit");
        	ch=sc.nextInt();
        	switch(ch) {
        	case 1: System.out.println("enter element");
        		e=sc.nextInt();
        		obj.push(e);
        		break;
        	case 2: obj.pop();
        	break;
        	case 3: obj.top();
        	break;
        	}
        }while(ch!=0);

    }
}

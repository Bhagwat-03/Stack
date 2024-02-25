package Stack;
public class Stacks {
    int[] array;
    int topOfStack;
    public Stacks(int size){
        this.array = new int[size];
        this.topOfStack=-1;
    }

    public boolean isEmpty(){
        if(topOfStack==-1){
            System.out.println("The Stack is empty");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(topOfStack==array.length-1){
            System.out.println("The Stack is Full");
            return true;
        }else{
            return false;
        }
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Your Stack is Full");
        }else{
            array[topOfStack+1]=value;
            topOfStack++;
            System.out.println("The value is successfully added ");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }else{
            int topStack = array[topOfStack];
            topOfStack--;
            return topStack;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }else{
            return topOfStack;
        }
    }
    public void delete(){
        array=null;
        System.out.println("The Stack is completely deleted");
    }
}

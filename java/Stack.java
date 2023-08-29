class StackHolder{
    int top;
    int stack[] = new int[10];
    StackHolder(){
        top =-1;

    }
    void push(int item){
        if (top>=9){
            System.out.println("The stack is full");
        }
        else{
            stack[++top]=item;
        }


    }
    void pop(){
        if(top==-1){
            System.out.println("The stack is Empity");
        }
        else{
            
            System.out.println("popped "+ stack[top]);
            top--;
        }



    }
    void showStack(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
        if (top==-1)
        System.out.println("The stack is Empity");
    }

}


public class Stack {
    public static void main(String[] args) {
        StackHolder st1 = new StackHolder();
        for (int x=1;x<=10;x++){
            st1.push(x);
        }
        st1.showStack();
        st1.pop();
        st1.showStack();

    }
}

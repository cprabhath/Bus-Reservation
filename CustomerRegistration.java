import java.util.ArrayList;
import Dto.Customer;

class CustomerRegistration {
    private ArrayList<Customer> stack = new ArrayList<>();
    private static CustomerRegistration instance;
    private int top = -1;

    private CustomerRegistration() { }

    public static CustomerRegistration getInstance() {
        if (instance == null) {
            instance = new CustomerRegistration();
        }
        return instance;
    }

    // ===========Push customer to stack============================
    public void push(Customer customer) {
        stack.add(customer);
        top++;
    }
    // ===========End of push customer to stack=====================

    // ===========Pop customer from stack===========================
    public Customer pop() {
        if (isEmpty()) {
            System.out.println("====================================");
            System.out.println("Stack underflow. No customers to pop");
            System.out.println("====================================");
            return null;
        } else {
            //==================Remove customer from stack================
            Customer customer = stack.remove(top);
            top--;
            return customer;
            //==================End of remove customer from stack=========
        }
    }
    // ===========End of pop customer from stack====================

    // ===========Get customer from stack===========================
    public Customer top(){
        if (isEmpty()) {
            System.out.println("====================================");
            System.out.println("Stack underflow. No customers to pop");
            System.out.println("====================================");
            return null;
        } else {
            //==================Get customer from stack================
            return stack.get(top);
            //==================End of get customer from stack=========
        }
    }
    // ===========End of get customer from stack====================

    // ===========Check if stack is empty===========================
    public boolean isEmpty() {
        return top < 0;
    }
    // ===========End of check if stack is empty====================

    // ===========Display all customers=============================
    public void display() {
        if(isEmpty()) {
            System.out.println("====================================");
            System.out.println("Stack is Empty: No customers to display");
            System.out.println("====================================");
            return;
        }

        System.out.println("=============All Customers=============");
        for (int i = top; i >= 0; i--) {
            System.out.println("====================================");
            System.out.println(stack.get(i));
            System.out.println();
        }
    }
    // ===========End of display all customers======================
}
package oops;


/**
 * We can use the inner class like this and another method example is given as well
 * 
 * */

// 1st Method
public class Window {

    private String windowButton = "Home Button";

    class Button {
        void display() {
            System.out.println("We are pressing the " + windowButton);
        }
    }
    
    public static void main(String[] args) {
        Window win = new Window();
//        Window.Button but = win.new Button();  // Correct way to instantiate the inner class
        win.selectTheDisplay();
    }
    
    
    /*
     * We can create an method and create the object for inner class
     * And then we call the method of inner class.
     * 
     * */
    void selectTheDisplay() {
    	Button but = new Button();
    	but.display();
    }

}




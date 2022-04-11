import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

class Cafe {

    public Integer getStreakGoal() {
        
        int streakGoal = 0;

        for (int i = streakGoal; i <= 10; i++) {
            streakGoal = streakGoal + i;
        }

        return streakGoal;
    }

    public Double getOrderTotal(double[] prices) {

        double orderTotal = 0.0;

        for (int i = 0; i < prices.length; i++) {
            orderTotal = orderTotal + prices[i]; 
        }

        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }

        
    }

    public void addCustomer(ArrayList<String> customers) {

        System.out.println("Please enter your name:");
        String userName = System.console().readLine();

        System.out.println("Hello, " + userName);

        customers.add(userName);
        
        int waitList = customers.size() - 1;



        System.out.println("There are " + waitList + " people in front of you");


    }


}
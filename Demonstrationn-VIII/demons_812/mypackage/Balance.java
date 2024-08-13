/*A simple package utilisation: Utilization of package in any java application*/

package mypackage;

public class Balance {
    public String name;
    public double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.println("Sorry!" + name + " Negative Balance. ");
        }
        System.out.println(name + " : $" + bal);
    }
}
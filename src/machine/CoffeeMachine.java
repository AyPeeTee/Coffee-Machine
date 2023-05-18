package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.MakeCoffee();


    }

    public static void printInfo(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}

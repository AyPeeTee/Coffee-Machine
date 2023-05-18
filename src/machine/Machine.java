package machine;

import java.util.Scanner;

import static machine.CoffeeMachine.printInfo;

public class Machine {
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;

    static Scanner scanner = new Scanner(System.in);
    static String action = "";

    public void MakeCoffee() {
        while (!action.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String typeOfCoffee = scanner.next();
                    switch (typeOfCoffee) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                money += 4;
                                cups--;
                            }
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                money += 7;
                                cups--;
                            }
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                money += 6;
                                cups--;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water = water + scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk = milk + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans = beans + scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    cups = cups + scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    printInfo(water, milk, beans, cups, money);
                    break;
            }
        }
    }
}

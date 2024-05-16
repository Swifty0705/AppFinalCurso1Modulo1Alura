package ui;

import model.Customer;

import java.util.Scanner;

public class Menu {

    public static void showPrincipalMenu(){
        int response;
        String welcome = """
                Bienvenido a BankAlura,
                Como te podemos ayudar el dia de hoy?
                Primero necesitamos que crees una cuenta
                """;
        String options = """
                1)Depositar dinero
                2)Sacar dinero
                3)Ver Saldo
                4)Editar datos personales
                5)Ver datos personales
                6)Salir
                """;
        String typeAccount = """
                Cuenta Corriente
                Cuenta de ahorro
                """;
        Scanner sc = new Scanner(System.in);


        System.out.println(welcome);
        System.out.println("Digite su nombre");
        String name = sc.next();
        System.out.println("Digite el correo electronico");
        String email = sc.next();
        System.out.println("Digite el tipo cuenta que desea:");
        System.out.println(typeAccount);
        String accountType = sc.next();
        System.out.println("Digite el saldo inicial de su cuenta");
        int initialBalance = sc.nextInt();
        Customer newCustomer = new Customer(name, email, accountType, initialBalance);
        System.out.println("Bienvenido " + newCustomer.getUsername());

        do {
            System.out.println("\n Digita la opcion que necesites:");
            System.out.println(options);
            response = sc.nextInt();
            switch (response) {
                case 1:
                    System.out.println("cuanto dinero desea depositar?");
                    newCustomer.depositBalance(sc.nextInt());
                    break;
                case 2:
                    System.out.println("cuanto dinero desea sacar?");
                    newCustomer.withdrawBalance(sc.nextInt());
                    break;
                case 3:
                    System.out.println(newCustomer.getAccountBalance());
                    break;
                case 4:
                    newCustomer.writeCustomerUser();
                    break;
                case 5:
                    newCustomer.readCustomerUser();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }while(response!=6);
    }
}

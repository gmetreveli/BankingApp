public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Georgia");
        bank.addBranch("Didube");
        bank.addCustomer("Didube", "Giorgi", 777.77);
        bank.addCustomer("Didube", "Givi", 666.66);
        bank.addCustomer("Didube", "Gigla", 555.55);

        bank.addBranch("Tsereteli");
        bank.addCustomer("Tsereteli", "Gia", 444.44);

        bank.addCustomerTransaction("Didube", "Giorgi", 7000.00);
        bank.addCustomerTransaction("Didube", "Givi", 6000.00);
        bank.addCustomerTransaction("Didube", "Gigla", 5000.00);
        bank.addCustomerTransaction("Didube", "Gia", 4000.00);

        bank.listCustomers("Didube", true);
        bank.listCustomers("Tsereteli", true);

        bank.addBranch("Rustaveli");
        if (!bank.addCustomer("Rustaveli", "Jimsheri", 333.33)){
            System.out.println("Error Rustaveli branch doesn't exist");
        }

        if (!bank.addCustomerTransaction("Didube", "Juansheri", 222.22)){
            System.out.println("Customer doesn't exist in this branch");
        }


        if (!bank.addCustomer("Didube", "Gigla", 111.11)){
            System.out.println("Customer already exists in this brancht");
        }
    }
}

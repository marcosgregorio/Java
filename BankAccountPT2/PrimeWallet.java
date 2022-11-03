package BankAccountPT2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeWallet {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public void listar() {
        for(int i = 0; i < clients.size(); i++) {
            System.out.println(this.clients.get(i));
        }
    }

    public void adicionar(Client cliente) {
        clients.add(cliente);
    }

    public Boolean size() {
        if(clients.size() > 0) return true;
        return false;
    }
}

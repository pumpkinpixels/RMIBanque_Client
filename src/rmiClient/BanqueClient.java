package rmiClient;

import metier.Compte;
import rmiService.IBanque;
import javax.naming.Context;
import javax.naming.InitialContext;
public class BanqueClient {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            IBanque stub = (IBanque) ctx.lookup("BanqueService");
            System.out.println(stub.creerCompte(new Compte(1, 1000)));
            System.out.println(stub.creerCompte(new Compte(1, 500)));
            System.out.println(stub.getInfoCompte(1));
            System.out.println(stub.getInfoCompte(99));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
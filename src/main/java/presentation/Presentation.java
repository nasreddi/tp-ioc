package presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args){
        /* injection par instanciation statique "new" des dependances */
        DaoImpl2 dao=new DaoImpl2();
        IMetierImpl metier=new IMetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat:"+ metier.calcul());
    }
}

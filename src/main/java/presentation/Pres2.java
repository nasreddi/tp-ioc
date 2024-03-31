package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;



public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao= Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao", IDao.class);
        //metier.setDao(dao) statique
        method.invoke(metier,dao);//dynamique

        System.out.println("Resultat="+ metier.calcul());
    }
}

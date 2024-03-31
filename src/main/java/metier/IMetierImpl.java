package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;//couplage faible , IDao interface
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.sin(tmp*Math.log(10));
        return res;
    }

    /*
    injecter dans la variable dao un objet
    d'une classe qui implemente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

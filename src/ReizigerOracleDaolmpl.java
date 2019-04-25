import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReizigerOracleDaolmpl implements ReizigerDao {

    private ArrayList<Reiziger> lst = new ArrayList<Reiziger>();

    @Override
    public ArrayList<Reiziger> findAll() {
        return lst;
    }

    @Override
    public Reiziger findByGBdatum(Date gbdatum) {
        Reiziger rzg = null;
        for (Reiziger g : lst) {
            if (g.getGbdatum().equals(gbdatum)) {
                rzg = g;
            }
        }
        return rzg;


    }
    @Override
    public Reiziger save(Reiziger rzg) {
        if (!lst.contains(rzg)) {
            lst.add(rzg);
            return rzg;
        }
        return rzg;
    }

    @Override
    public Reiziger update(Reiziger rzg) {
        return rzg;
    }

    @Override
    public boolean delete(Reiziger rzg) {
        if (lst.contains(rzg)) {
            lst.remove(rzg);
            return true;
        }
        else {
            return false;
        }
    }

}

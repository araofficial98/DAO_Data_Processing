import java.util.Date;
import java.util.List;

public interface ReizigerDao {

    public List<Reiziger> findAll();

    public Reiziger findByGBdatum(Date gbdatum);

    public Reiziger save(Reiziger rzg);

    public Reiziger update(Reiziger rzg);

    public boolean delete(Reiziger rzg);

}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

public class Main {

    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xejbc1";
    private static final String DB_USER = "";
    private static final String DB_PASS = "harry";
    private static Connection conn;

    public static void main(String[] args) throws Exception {

        ReizigerOracleDaolmpl impl = new ReizigerOracleDaolmpl();

        String s = "12/03/2000";
        Date gb = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        Reiziger r = new Reiziger("Pieter", gb);
        impl.save(r);

        String s2 = "11/11/2002";
        Date gb2 = new SimpleDateFormat("dd/MM/yyyy").parse(s2);
        Reiziger r2 = new Reiziger("John", gb2);
        impl.save(r2);

        //impl.delete(r);
        System.out.println(impl.findByGBdatum(gb2));
        

    }
    
}

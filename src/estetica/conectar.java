
package estetica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class conectar {
    
   
MysqlDataSource ds;
Connection conectar;
Statement st;
String mensaje = "Conexion Realizada";


public conectar(){
ds = new MysqlDataSource();
ds.setUser("root");
ds.setPassword("");
ds.setDatabaseName("estetica");
ds.setServerName("localhost");
    try {
    conectar = ds.getConnection();
    st = conectar.createStatement();
    } catch (SQLException ex) {
    mensaje = ex.getMessage();
    }
    }

public ResultSet buscar(String qt){
ResultSet resultado = null;
     try {
     resultado = st.executeQuery(qt);
     } catch (SQLException ex) {
     mensaje = ex.getMessage();
     }
return resultado;}

public void agregar(String qt){
        try {
            st.executeUpdate(qt);
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
        }

}

public void eliminar(String qt){
        try {
            st.executeUpdate(qt);
        } catch (SQLException ex) {
          mensaje = ex.getMessage();
        }

}
public void modificar(String qt){
        try {
            st.executeUpdate(qt);
        } catch (SQLException ex) {
          mensaje = ex.getMessage();
        }
}

     public  Date fecha(){
    Calendar hoy =Calendar.getInstance();
    Date h=hoy.getTime();
    return h;
}
 public  String fechas() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        return formateador.format(ahora);
    }
  public  String fechas(Date a) {
        
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        return formateador.format(a);
    }
  
  public static synchronized int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }
             
            
             

}


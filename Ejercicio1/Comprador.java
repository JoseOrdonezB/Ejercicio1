/* Programación orientada a objetos.
 * @author Jose Pablo Ordoñez Barrios
 * @version 1.0 
*/
public class Comprador {
    String nombre, email;
    int boletos, presupuesto;

    public Comprador() {

    }

    // getter
    public String getNombre() {
        return nombre;
    }
    // @return el nombre del comprador.

    public String getEmail() {
        return email;
    }
    // @return el correo electronico del comprador.

    public int getBoletos() {
        return boletos;
    }
    // @return la cantidad de boletos que desea el comprador.
    public int getPresupuesto() {
        return presupuesto;
    }
    // @return el presupuesto del comprador.
    
    // setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBoletos(int boletos) {
        this.boletos = boletos;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

}

/* Programación orientada a objetos.
 * @author Jose Pablo Ordoñez Barrios
 * @version 1.0 
*/
public class Localidad {
    int tboleto, tdinero, nolocalidad, precio, disponible = 0;

    public Localidad() {

    }

    // getter
    public int getTboleto() {
        return tboleto;
    }
    // @return el total de boletos vendidos.

    public int getTdinero() {
        return tdinero;
    }
    // @return el total de dinero recaudado por localidad.

    public int getNolocalidad() {
        return nolocalidad;
        // @return el número de la localidad.
    }

    public int getPrecio() {
        return precio;
    }
    // @return el precio de cada localidad.

    public int getDisponible() {
        return disponible;
    }
    // @return la cantidad de boletos disponibles para cada ubicación

    // setter
    public void setTboleto(int tboleto) {
        this.tboleto = tboleto;
    }

    public void setTdinero(int tdinero) {
        this.tdinero = tdinero;
    }

    public void setNolocalidad(int nolocalidad) {
        this.nolocalidad = nolocalidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDisponible(int disponible){
        this.disponible = disponible;
    }
}
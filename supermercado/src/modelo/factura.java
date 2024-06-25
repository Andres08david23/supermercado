
package modelo;

import java.util.Date;


class factura {
    
    private int id;
    private Date fecha;
    private double total;

    public factura() {
        super();
    }

    public factura(int id, Date fecha, double total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
}

public class ObjTablet {

    private int Serial;
    private double Tamaño;
    private String Marca;
    private double Precio;
    private String NombreEstudiante;
    private int carnet;
    private boolean disponible;
//----------------------------------------------------------
    public ObjTablet() {
    }
    public int getSerial() {
        return Serial;
    }
    public void setSerial(int serial) {
        Serial = serial;
    }
    public double getTamaño() {
        return Tamaño;
    }
    public void setTamaño(double tamaño) {
        Tamaño = tamaño;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public String getNombreEstudiante() {
        return NombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        NombreEstudiante = nombreEstudiante;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public int getCarnet() {
        return carnet;
    }
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

}
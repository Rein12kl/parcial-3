public class ObjPc {

    private int serial;
    private String marca;
    private int Ram;
    private int DiscoDuro;
    private double Precio;
    private String NombreEstudiante;
    private int Carnet;
    private boolean Disponible;
//---------------------------------------------------------------------
    public ObjPc() {
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getRam() {
        return Ram;
    }
    public void setRam(int ram) {
        Ram = ram;
    }
    public int getDiscoDuro() {
        return DiscoDuro;
    }
    public void setDiscoDuro(int discoDuro) {
        DiscoDuro = discoDuro;
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
    public int getCarnet() {
        return Carnet;
    }
    public void setCarnet(int carnet) {
        Carnet = carnet;
    }
    public boolean isDisponible() {
        return Disponible;
    }
    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }
    
}
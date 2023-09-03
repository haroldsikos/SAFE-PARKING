package pe.edu.upc.aaw.safe_parking.entities;

public class Vehiculo {
    private int idVehiculo;
    private String PlacaVehiculo;
    private String CAtegoriaVehiculo;
    private String COlorVehiculo;
    private String MArcaVehiculo;
    private double TamanioVehiculo;
    private String TarjetaPropiedadVehiculo;

    public Vehiculo() {
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        PlacaVehiculo = placaVehiculo;
    }

    public void setCAtegoriaVehiculo(String CAtegoriaVehiculo) {
        this.CAtegoriaVehiculo = CAtegoriaVehiculo;
    }

    public void setCOlorVehiculo(String COlorVehiculo) {
        this.COlorVehiculo = COlorVehiculo;
    }

    public void setMArcaVehiculo(String MArcaVehiculo) {
        this.MArcaVehiculo = MArcaVehiculo;
    }

    public void setTamanioVehiculo(double tamanioVehiculo) {
        TamanioVehiculo = tamanioVehiculo;
    }

    public void setTarjetaPropiedadVehiculo(String tarjetaPropiedadVehiculo) {
        TarjetaPropiedadVehiculo = tarjetaPropiedadVehiculo;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }

    public String getCAtegoriaVehiculo() {
        return CAtegoriaVehiculo;
    }

    public String getCOlorVehiculo() {
        return COlorVehiculo;
    }

    public String getMArcaVehiculo() {
        return MArcaVehiculo;
    }

    public double getTamanioVehiculo() {
        return TamanioVehiculo;
    }

    public String getTarjetaPropiedadVehiculo() {
        return TarjetaPropiedadVehiculo;
    }
}

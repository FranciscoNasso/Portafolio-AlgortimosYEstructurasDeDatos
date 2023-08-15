public class Marcapasos {
    private short presionSanguinea;

    private short frecuenciaCardiaca;

    private short nivelDeAzucarEnSangre;

    private long maximaFuerza;

    private byte tiempoEntreLatidos;

    private double bateria;

    private char[] codigoFabricante;

    public short getPresionSanguinea() {
        return presionSanguinea;
    }

    public void setPresionSanguinea(short presionSanguinea) {
        this.presionSanguinea = presionSanguinea;
    }

    public short getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(short frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public short getNivelDeAzucarEnSangre() {
        return nivelDeAzucarEnSangre;
    }

    public void setNivelDeAzucarEnSangre(short nivelDeAzucarEnSangre) {
        this.nivelDeAzucarEnSangre = nivelDeAzucarEnSangre;
    }

    public long getMaximaFuerza() {
        return maximaFuerza;
    }

    public void setMaximaFuerza(long maximaFuerza) {
        this.maximaFuerza = maximaFuerza;
    }

    public byte getTiempoEntreLatidos() {
        return tiempoEntreLatidos;
    }

    public void setTiempoEntreLatidos(byte tiempoEntreLatidos) {
        this.tiempoEntreLatidos = tiempoEntreLatidos;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public char[] getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(char[] codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public Marcapasos(short presionSanguinea, short frecuenciaCardiaca, short nivelDeAzucarEnSangre, long maximaFuerza, byte tiempoEntreLatidos, double bateria, char[] codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelDeAzucarEnSangre = nivelDeAzucarEnSangre;
        this.maximaFuerza = maximaFuerza;
        this.tiempoEntreLatidos = tiempoEntreLatidos;
        this.bateria = bateria;
        this.codigoFabricante = codigoFabricante;
    }
}

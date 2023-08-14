package org.example;

public class MarcaPasos {

    int presionSanguinea;

    int frecuenciaCardiaca;

    int nivelDeAzucarEnSangre;

    long maxFuerzaExpuesta;

    double minTiempoEntreLatidos;

    public MarcaPasos(int presionSanguinea, int frecuenciaCardiaca, int nivelDeAzucarEnSangre, long maxFuerzaExpuesta, double minTiempoEntreLatidos) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelDeAzucarEnSangre = nivelDeAzucarEnSangre;
        this.maxFuerzaExpuesta = maxFuerzaExpuesta;
        this.minTiempoEntreLatidos = minTiempoEntreLatidos;
    }

    public int getPresionSanguinea() {
        return presionSanguinea;
    }

    public void setPresionSanguinea(int presionSanguinea) {
        this.presionSanguinea = presionSanguinea;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getNivelDeAzucarEnSangre() {
        return nivelDeAzucarEnSangre;
    }

    public void setNivelDeAzucarEnSangre(int nivelDeAzucarEnSangre) {
        this.nivelDeAzucarEnSangre = nivelDeAzucarEnSangre;
    }

    public long getMaxFuerzaExpuesta() {
        return maxFuerzaExpuesta;
    }

    public void setMaxFuerzaExpuesta(long maxFuerzaExpuesta) {
        this.maxFuerzaExpuesta = maxFuerzaExpuesta;
    }

    public double getMinTiempoEntreLatidos() {
        return minTiempoEntreLatidos;
    }

    public void setMinTiempoEntreLatidos(double minTiempoEntreLatidos) {
        this.minTiempoEntreLatidos = minTiempoEntreLatidos;
    }

}

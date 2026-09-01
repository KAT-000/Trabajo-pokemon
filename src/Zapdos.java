public class Zapdos extends Pokemon {

    
    private int temperaturaLlama;

    public Moltres() {
        setNombre("Zapdos");
        setpuntosVida(70);
        setAtaque(110);
        setDefensa(100);
        setAtaque_especial(120);
        setDefensa_especial(90);
        setVelocidad(120);
        setMega_evolucion(false);
        setMovimiento_huevo(false);

        this.rayo = 650; 
    }

    public int getRayo() {
        return rayo;
    }

    public void setRayo(int rayo) {
        if (rayo < 0) {
            this.rayo = 0;
        } else {
            this.rayo = rayo;
        }
    }

    
}
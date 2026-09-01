public class Moltres extends Pokemon {

    
    private int temperaturaLlama;

    public Moltres() {
        setNombre("Moltres");
        setpuntosVida(90);
        setAtaque(100);
        setDefensa(90);
        setAtaque_especial(125);
        setDefensa_especial(85);
        setVelocidad(90);
        setMega_evolucion(false);
        setMovimiento_huevo(false);

        this.temperaturaLlama = 850; 
    }

    public int getTemperaturaLlama() {
        return temperaturaLlama;
    }

    public void setTemperaturaLlama(int temperaturaLlama) {
        if (temperaturaLlama < 0) {
            this.temperaturaLlama = 0;
        } else {
            this.temperaturaLlama = temperaturaLlama;
        }
    }

    
    public void ataqueFuego() {
        System.out.println(getNombre() + " ataca con llamas a " + temperaturaLlama + "°C!");
    }
}
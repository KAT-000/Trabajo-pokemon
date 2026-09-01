public class Articuno extends Pokemon {

    public Articuno() {
        setNombre("Moltres");
        setpuntosVida(90);
        setAtaque(85);
        setDefensa(54);
        setAtaque_especial(100);
        setDefensa_especial(54);
        setVelocidad(80);
        setMega_evolucion(false);
        setMovimiento_huevo(false);

        this.vendaval = 650;
    }


    public int getVendaval(){
        return vendaval;
    }


    public void setVendaval(int vendaval){
       if (vendaval < 0){
        this.vendaval = 0;
       } else {
        this.vendaval = vendaval
       }
    }
}
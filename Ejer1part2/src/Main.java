public class Main {
        public static void main(String[] args) {
           Coche miCoche = new Coche();
            miCoche.AñadirPuerta();
            System.out.println(miCoche.puertas);
        }
    }
    class Coche {
        public int puertas = 0;
        public void AñadirPuerta(){
            this.puertas++;
        }
    }




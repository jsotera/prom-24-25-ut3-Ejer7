public class Main {
    public static void main(String[] args) {
        Robot c3p0 = new Robot(10, 5, 3);
        Robot r2d2 = new Robot(5, 5, 6);
        // NO TENEIS POR QUE HACERLO ASI, NO SE OS HA PEDIDO
        combateExaustivo(c3p0, r2d2);
    }

    public static void combateExaustivo(Robot c3p0, Robot r2d2) {
        c3p0.combatir(r2d2);
        if(c3p0.vida > 0){
            r2d2.combatir(c3p0);
            if(r2d2.vida > 0){
                combateExaustivo(c3p0, r2d2);
            } else {
                System.out.println("R2D2 ha perdido");
            }
        } else {
            System.out.println("C3P0 ha perdido");
        }
    }
}
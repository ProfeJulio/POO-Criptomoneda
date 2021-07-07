package criptomonedas;

public class Criptomonedas {

    public static void main(String[] args) {
        Persona Kevin = new Persona("Kevin", 17, "24.111.222-3", 'M', 100000);
        Persona Petunia = new Persona("Petunia", 18, "23.444.333-5", 'F', 200000);
        float valorArticulo = 40000.0f;
        float montoPago;
        
        System.out.println("Kevin comprá un NintendoDS a Petunia por 40.000 PuduCoin.");
        montoPago = Kevin.abonarDinero(valorArticulo);
        
        System.out.println(Kevin.puduCoin);

    }
    
}

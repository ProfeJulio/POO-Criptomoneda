package criptomonedas;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String rut;
    char sexo; //M:Masculino,F:Femenino
    float puduCoin;
    
    // Constructor
    public Persona(String nom, int eda, String r, char sex, float pC){
        nombre = nom;
        edad = eda;
        rut = r;
        sexo = sex;
        puduCoin = pC;
    }
    
    // Metodo
    public float abonarDinero(float monto){
        puduCoin = puduCoin - monto;
        return monto;  
    }
    
    // otro metodo retirarDinero
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Diana Sanchez DLC
 */
public class Imc {
private double peso;
private double estatura;

public Imc (double peso, double estatura){
this.peso = peso;
this.estatura = estatura;
}
public double getValor(){
    return this.peso / (this.estatura * this.estatura);
} 
public String getEstaturaNutricional() {
    double imc = getValor();
    if (imc < 18.5) {
        return "Peso bajo";
       
    }
    else if (imc < 25.0) {
        return "Peso normal";
    }
    else if (imc < 30.0) {
        return "Sobrepeso";
    }
    else if (imc < 40.0) {
        return "obesidad" ;
    }
    else {
        return "obesidad extrema";
    }
        
}

    public String getEstadoNutricional() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        


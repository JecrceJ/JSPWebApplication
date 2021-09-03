/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author user
 */
public class Perimetro {
    private int num1;
    private int resultadoPerimetro;
    
    public Perimetro(String n1)
    {
        this.setNum1(Integer.parseInt(n1));       
    }
    public void hacerPerimetro()
    {
        int p=(this.getNum1())*3;
        this.setResultadoPerimetro(p);
    }
    
    public int getNum1(){
        return num1;
    }

    private void setNum1(int num1) {
        this.num1=num1; //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getResultadoPerimetro(){
        return resultadoPerimetro;
    }
    
    public void setResultadoPerimetro(int resultadoPerimetro) {
        this.resultadoPerimetro=resultadoPerimetro;
    }
    
}
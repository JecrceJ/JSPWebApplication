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
public class Suma {
    
    private int num1;
    private int num2;
    private int resultado;
    
    public Suma(String n1, String n2)
    {
        this.setNum1(Integer.parseInt(n1));
        this.setNum2(Integer.parseInt(n2));        
    }
    public void hacerSuma()
    {
        int s=this.getNum1()+this.getNum2();
        this.setResultado(s);
    }
    
    public int getNum1(){
        return num1;
    }

    private void setNum1(int num1) {
        this.num1=num1; //To change body of generated methods, choose Tools | Templates.
    }
    public int getNum2(){
        return num2;
    }

    private void setNum2(int num2) {
        this.num2=num2; //To change body of generated methods, choose Tools | Templates.
    }
    public int getResultado(){
        return resultado;
    }
    
    public void setResultado(int resultado) {
        this.resultado=resultado;
    }
    
}

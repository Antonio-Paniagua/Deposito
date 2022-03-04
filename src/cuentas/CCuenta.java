package cuentas;
/**
 * Clase que gestiona las cuentas bancarias y las operaciones realizadas con ellas
 * @author Antonio-Paniagua
 */
public class CCuenta {

    /**
     * @return Obtiene el valor del atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre asigna valor al atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Obtiene el valor del atributo cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta asigna valor al atributo cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Obtiene el valor del atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo asigna valor al atributo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Obtiene el valor del atributo tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés asigna valor al atributo tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Atributo que contiene el nombre del titular de la cuenta
     */
    private String nombre;
    
    /**
     * Atributo que contiene el número de la cuenta
     */
    private String cuenta;
    
    /**
     * Atributo que contiene el saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Atributo que contiene el interés aplicado a la cuenta
     */
    private double tipoInterés;
  
    /**
     * Método constructor 1 de la clase cuenta
     */
    public CCuenta()
    {
    }

     /**
     * Método constructor 2 de la clase cuenta
     * @param nom nombre del titular de la cuenta
     * @param cue número de cuenta
     * @param sal saldo de la cuenta
     * @param tipo interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que ingresa una cantidad en la cuenta y valida si la cantidad 
     * introducida es negativa
     * @param cantidad cantidad que se ingresa
     * @throws Exception  Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que retira una cantidad en la cuenta y valida si la cantidad 
     * introducida es negativa o si no hay suficiente saldo
     * @param cantidad cantidad que se desea retirar
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}

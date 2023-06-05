/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointegrador;

/**
 *
 * @author carlo
 */
public class Postnet {
    public static final double RECARGO_POR_CUOTA= 0.03;
    public static final int MIN_CANT_CUOTA= 1;
    public static final int MAX_CANT_CUOTA= 6;
    
    public Postnet(){  }
    
/**
 * Metodo para efectuar el pago del Postnet
 * @param tarjeta de la clase TarjetaDeCredito
 * @param montoAbonar de la clase Double
 * @param cantCuota de la clase Integer
 * @return ticket de la clase Ticket, si hay algun fallo se devolvera null
 */
    
  
    
    
    public Ticket efectuarPago (TarjetaDeCredito tarjeta, double montoAbonar, int cantCuota){
       
        Ticket ticket= null;
        if (datosValidos(tarjeta, montoAbonar, cantCuota)){
            double montoTotal= montoAbonar+ montoAbonar* recargoCuota(cantCuota);
        }
        return ticket;
    }
    
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cuota){
        boolean tarjetaValida= tarjeta!=null;
        boolean montoValido= monto>0;
        boolean cuotaValida= cuota >= MIN_CANT_CUOTA && cuota <= MAX_CANT_CUOTA;
        return tarjetaValida&&montoValido&&cuotaValida;
    }
    
/**
 * Metodo para calcular el recargo por cuotas
 * @param cantCuota de la clase Integer
 * @return la cantidad de recargo por las cuotas especificadas
 */
    private double recargoCuota(int cantCuota){
        return ((cantCuota-1)*RECARGO_POR_CUOTA) ;
    }
}

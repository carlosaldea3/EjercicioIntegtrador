/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointegrador;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String[] args){
        Postnet potsnet1= new Postnet();
        Persona pers= new Persona("45395870B", "Carlos", "Aldea", "635870011", "carlosaldea@gmail.com");
        
       TarjetaDeCredito tarj= new TarjetaDeCredito("BBVA", "3333333333", 15000, EntidadFinanciera.BIRZA, pers);
       
       System.out.println("Tarjeta:");
       System.out.println(tarj);
       
       System.out.println("Tiket:");
       Ticket ticket= postnet1.efectuarPago(tarj, 10000, 5);
       System.out.println(ticket);
       
       System.out.println("Tarjeta post pago:");
       System.out.println(tarj);
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.pet.shop;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class TestePetShop {
    public static void main(String[] args) {
       Pet pet1 = new Pet("Cristiã", "Idiota");
       Pet pet2 = new Pet("Index", "npm Start");
       
       PetShop ps1 = new PetShop("Antonio");
       
       
        System.out.println(pet1);
        System.out.println(pet2);
        
        ps1.darBanho(pet1, 100.00);
        ps1.darBanho(pet1, 200.00, 20);
        
        ps1.darBanho(pet2, 200.00, 10);
        ps1.darBanho(pet2, 200.00, 30);
        
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(ps1);
    }
}

package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Imbracaminte pantaloni = new Imbracaminte("Pantaloni", 80.00, 10, 0);
        Imbracaminte bluza = new Imbracaminte("Bluza", 55.00, 20, 0);
        Imbracaminte accesoriu = new Imbracaminte("Accesoriu", 40, 30, 0);


        Scanner Text = new Scanner(System.in);

        System.out.println("Bine ai venit la magazinul nostru de imbracaminte!");
        System.out.println("Ce produs doresti sa cumperi?[Pantaloni, Bluza, Accesoriu]");
        String produsimbracaminte = Text.nextLine();

        switch (produsimbracaminte) {
            case "Pantaloni":
                System.out.println("Pantalonii au pretul de : " + pantaloni.getPrice() + " Dar avem discount de :" + pantaloni.getDiscount() + "%, Pretul final fiind de :" + pantaloni.DiscountPrice() + " per pereche");


                System.out.println("Ce cantitate doresti sa cumperi?");
                int cantitatepantaloni = Text.nextInt();
                pantaloni.setQuantity(cantitatepantaloni);
                if (pantaloni.getQuantity() > 1) {
                    System.out.println("Ai cumparat " + pantaloni.getQuantity() + " perechi de pantaloni, pretul final fiind de: " + pantaloni.getFinalPrice());
                } else if (pantaloni.getQuantity() < 1) {
                    System.out.println("Te mai asteptam pe la noi!");
                } else

                    System.out.println("Ai cumparat o pereche de pantaloni, ai platit pretul de: " + pantaloni.getFinalPrice());




                break;
            case "Bluza":
                System.out.println("Bluza are pretul de : " + bluza.getPrice() + " Dar avem discount de :" + bluza.getDiscount() + "%, Pretul final fiind de :" + bluza.DiscountPrice());
                System.out.println("Ce cantitate doresti sa cumperi?");
                int cantitatebluza = Text.nextInt();
                bluza.setQuantity(cantitatebluza);
                if (bluza.getQuantity() > 1) {
                    System.out.println("Ai cumparat " + bluza.getQuantity() + " bluze, pretul final fiind de: " + bluza.getFinalPrice());
                } else if (bluza.getQuantity() < 1) {
                    System.out.println("Te mai asteptam pe la noi!");
                } else

                    System.out.println("Ai cumparat o singura bluza, ai platit pretul de: " + bluza.getFinalPrice());

                break;
            case "Accesoriu":
                System.out.println("Accesoriul ales de tine are pretul de : " + accesoriu.getPrice() + " Dar avem discount de :" + accesoriu.getDiscount() + "%, Pretul final fiind de :" + accesoriu.DiscountPrice());
                int cantitateaccesorii = Text.nextInt();
                accesoriu.setQuantity(cantitateaccesorii);
                if (accesoriu.getQuantity() > 1) {
                    System.out.println("Ai cumparat " + accesoriu.getQuantity() + " accesorii, pretul final fiind de: " + accesoriu.getFinalPrice());
                } else if (accesoriu.getQuantity() < 1) {
                    System.out.println("Te mai asteptam pe la noi!");
                } else

                    System.out.println("Ai un singur accesoriu, ai platit pretul de: " + pantaloni.getFinalPrice());

                break;
            default:
                System.out.println("Nu avem acest tip de produs!");
                System.exit(0);



        }
    }
}
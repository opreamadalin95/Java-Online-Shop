package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {

        Imbracaminte pantaloni = new Imbracaminte("Pantaloni", 80.00, 10, 0);
        Imbracaminte bluza = new Imbracaminte("Bluza", 55.00, 20, 0);
        Imbracaminte accesoriu = new Imbracaminte("Accesoriu", 40, 30, 0);

        Scanner Text = new Scanner(System.in);

        System.out.println("Bine ai venit la magazinul nostru de imbracaminte!");
        System.out.println("Ce produs doresti sa cumperi? [Pantaloni, Bluza, Accesoriu]");
        String produsImbracaminte = Text.nextLine();

        switch (produsImbracaminte) {
            case "Pantaloni":
                System.out.println("Pantalonii au pretul de : " + pantaloni.getPret() + " Dar avem discount de :" + pantaloni.getDiscount() + "%, Pretul final fiind de :" + pantaloni.DiscountPrice() + " per pereche");

                System.out.println("Ce cantitate doresti sa cumperi?");
                int cantitatePantaloni = Text.nextInt();
                pantaloni.setCantitate(cantitatePantaloni);
                if (pantaloni.getCantitate() > 1) {
                    System.out.println("Ai cumparat " + pantaloni.getCantitate() + " perechi de pantaloni, pretul final fiind de: " + pantaloni.getPretFinal());
                } else if (pantaloni.getCantitate() < 1) {
                    System.out.println("Te mai asteptam pe la noi!");
                } else {
                    System.out.println("Ai cumparat o pereche de pantaloni, ai platit pretul de: " + pantaloni.getPretFinal());
                }
                break;
            case "Bluza":
                System.out.println("Bluza are pretul de : " + bluza.getPret() + " Dar avem discount de :" + bluza.getDiscount() + "%, Pretul final fiind de :" + bluza.DiscountPrice());
                System.out.println("Ce cantitate doresti sa cumperi?");
                int cantitateBluza = Text.nextInt();
                bluza.setCantitate(cantitateBluza);
                if (bluza.getCantitate() > 1) {
                    System.out.println("Ai cumparat " + bluza.getCantitate() + " bluze, pretul final fiind de: " + bluza.getPretFinal());
                } else if (bluza.getCantitate() < 1) {
                    System.out.println("Te mai asteptam pe la noi!");
                } else {
                    System.out.println("Ai cumparat o singura bluza, ai platit pretul de: " + bluza.getPretFinal());
                }
                break;
            case "Accesoriu":
                System.out.println("Accesoriul ales de tine are pretul de : " + accesoriu.getPret() + " Dar avem discount de :" + accesoriu.getDiscount() + "%, Pretul final fiind de :" + accesoriu.DiscountPrice());
                System.out.println("Ce cantitate doresti sa cumperi?");
                int cantitateAccesorii = Text.nextInt();
                accesoriu.setCantitate(cantitateAccesorii);
                if (accesoriu.getCantitate() > 1) {
                    System.out.println("Ai cumparat " + accesoriu.getCantitate() + " accesorii, pretul final fiind de: " + accesoriu.getPretFinal());
                } else if (accesoriu.getCantitate() < 1) {
                    System.out.println("Te mai asteptam pe la noi!");
                } else {
                    System.out.println("Ai cumparat un singur accesoriu, ai platit pretul de: " + accesoriu.getPretFinal());
                }
                break;
            default:
                System.out.println("Nu avem acest tip de produs!");
                System.exit(0);
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ading
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        double celcius = 25.0;
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamur = konversi.celciusToReamur(celcius);
        double fahrenheitToReamur = konversi2.fahrenheitToReamur(fahrenheit);

        System.out.println("Hasil Konversi Suhu:");
        System.out.println(celcius + " Celsius       = " + fahrenheit + " Fahrenheit");
        System.out.println(celcius + " Celsius       = " + reamur + " Reamur");
        System.out.println(fahrenheit + " Fahrenheit    = " + fahrenheitToReamur + " Reamur");
    }
}

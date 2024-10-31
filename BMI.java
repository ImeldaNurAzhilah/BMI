/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author ASUS
 */
public class BMI {
    double bmi;
    
    void bmi(double height, double weight){
        //height harus dalam meter
        bmi = weight / (height * height);
        
        System.out.printf("BMI ku adalah: %.2f%n", bmi);

        String category = getBMICategory(bmi);
        System.out.println("Kategori BMI: " + category);
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}

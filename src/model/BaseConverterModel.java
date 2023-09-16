/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huynh
 */
public class BaseConverterModel 
{
     public String convert(String inputValue, int inputBase, int outputBase) {
        try {
            int decimalValue = Integer.parseInt(inputValue, inputBase);
 
            String outputValue = Integer.toString(decimalValue, outputBase);
            
            return outputValue.toUpperCase(); 
        } catch (NumberFormatException e) {
            return "Invalid input";
        }
    }
    
}

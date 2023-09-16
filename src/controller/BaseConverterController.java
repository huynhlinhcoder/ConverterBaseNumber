/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.BaseConverterModel;

/**
 *
 * @author huynh
 */
public class BaseConverterController {
    private BaseConverterModel model;

    public BaseConverterController() {
        this.model = new BaseConverterModel();
    }

    public String convert(int inputBase, int outputBase, String inputValue) {
        return model.convert(inputValue, inputBase, outputBase);
    }
}

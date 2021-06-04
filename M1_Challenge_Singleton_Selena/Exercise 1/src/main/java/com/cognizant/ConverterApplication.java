package com.cognizant;

public class ConverterApplication {
    public static void main(String[] args) {

        ConverterIf converter = new ConverterIf();
        System.out.println(converter.convertMonth(20));
        System.out.println(converter.convertDay(16));

        ConverterSwitch converterSwitch = new ConverterSwitch();
        System.out.println(converterSwitch.convertMonth(15));
        System.out.println(converterSwitch.convertDay(1));
    }

}


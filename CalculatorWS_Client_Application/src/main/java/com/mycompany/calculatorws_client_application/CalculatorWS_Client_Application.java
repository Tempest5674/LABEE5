/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorws_client_application;

/**
 *
 * @author oaren
 */
public class CalculatorWS_Client_Application {
    public static void main(String[] args) {
        
        try { // Call Web Service Operation
            org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
            org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
            // TODO initialize WS operation arguments here
            java.lang.String i = "40/5";
            // TODO process result here
            int result = port.operation(i);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}

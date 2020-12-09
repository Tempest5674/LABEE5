/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author oaren
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {

    /**
     * Web service operation
     * @param i
     * @return
     */
    @WebMethod(operationName = "operation")
    public int operation(@WebParam(name = "i") String i) {
        int index = -1;
        int result = -1;
        char operation = ' ';
        if(i.indexOf('+')!=-1){
            operation = '+';
            index = i.indexOf('+');
        }
        if(i.indexOf('-')!=-1){
            operation = '-';
            index = i.indexOf('-');
        }
        if(i.indexOf('/')!=-1){
            operation = '/';
            index = i.indexOf('/');
        }
        if(i.indexOf('*')!=-1){
            operation = '*';
            index = i.indexOf('*');
        }
        switch(operation){
            case '+':{
                result = Integer.parseInt(i.substring(0,index))+Integer.parseInt(i.substring(index+1));
            }break;
            case '-':{
                result = Integer.parseInt(i.substring(0,index))-Integer.parseInt(i.substring(index+1));
            }break;
            case '/':{
                result = Integer.parseInt(i.substring(0,index))/Integer.parseInt(i.substring(index+1));
            }break;
            case '*':{
                result = Integer.parseInt(i.substring(0,index))*Integer.parseInt(i.substring(index+1));
            }break;
        }
        return result;
    }
}


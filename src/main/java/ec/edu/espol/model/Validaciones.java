/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import javafx.scene.control.TextField;

/**
 *
 * @author USER
 */
public class Validaciones {
    
    public static String validNameUser(TextField sc) throws RegistroException{
        String valUser = sc.getText().trim();
        if( (valUser.matches("[a-zA-Z0-9]*"))||(valUser.length()<5 || valUser.equals(""))){
            valUser = sc.getText();
        }else{
            throw new RegistroException("USUARIO NO PUEDE CONTENER ESPACIOS, CARACTERES ESPECIALES O ESTAR VACIO (mas de 5 caracteres)");
        }
        return valUser.toLowerCase();
    }
    
    
    
    public static String validPassword(TextField sc) throws RegistroException{
        String vlidPass = sc.getText().trim();
        if(!(vlidPass.length()<4 || vlidPass.contains(",")) ){
            //System.out.println("Contraseña no debe tener [ , ] y 4 caracteres mínimo\n(Espacios al inicio o al final seran suprimidos)\nIngrese contraseña valida:");
            vlidPass = sc.getText().trim();
        }else{
            throw new RegistroException("Contraseña no debe tener [ , ] y 4 caracteres mínimo\n(Espacios al inicio o al final seran suprimidos)\nIngrese contraseña valida:");
        }
        //System.out.println("Su nueva contraseña es:"+vlidPass);
        return vlidPass;
    }
    
    public static String validarNames(TextField sc) throws RegistroException{
        String validName = sc.getText().trim();

        if(validName.matches("^[a-zA-Z]+((['. ][a-zA-Z ])?[a-zA-Z]*)*$")||validName.equals("")){
            validName = sc.getText().trim();
        }else{
            throw new RegistroException("Ingrese Nombre Valido");
        }
        return validName;
    }
    
    
    public static String validarRuta(TextField sc) throws RegistroException{
        String validRuta = sc.getText().trim();
        if(!(validRuta.contains(",") || validRuta.equals("") ||validRuta.matches("[ ]*"))){
            validRuta = sc.getText().trim();
        }else{
            throw new RegistroException("Direccion no debe contener ',' ni estar vacio");
        }
        return validRuta;
    }
    
    public static String validarEmail(TextField sc) throws RegistroException{
        String email = sc.getText().trim();
        if(email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            return email;
        }else{
            throw new RegistroException("Ingrese E-mail valido");
        }
    }
    
    
    
}

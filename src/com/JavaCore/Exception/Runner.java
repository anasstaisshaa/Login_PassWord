package com.JavaCore.Exception;

public class Runner {

    public static boolean control(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        boolean onlyLatinAlphabet = login.matches("^[a-zA-Z]+$");
        boolean LoginConfirm = false;
        boolean PasswordConfirm = false;
        boolean passwordCheck = password.matches("^[a-zA-Z0-9_]+$");
        if(login.length() >= 20 && onlyLatinAlphabet){
            LoginConfirm = true;
        } else{
            throw new WrongLoginException();
        }
        if(password.length() >= 20 && passwordCheck && password.equals(confirmPassword)){
            PasswordConfirm = true;
        } else{
            throw new WrongPasswordException();
        }
        try{
            control("uheufhuefu", "huvhduvhduvhduvd","hvduvhduvhduvhd");
        } catch (WrongLoginException | WrongPasswordException exception){
            exception.printStackTrace();
        }
        return (LoginConfirm && PasswordConfirm);
    }
}

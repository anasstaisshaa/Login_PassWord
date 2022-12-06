package com.JavaCore.Exception;

public class Runner {

    public static boolean control(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        boolean onlyLatinAlphabet = login.matches("^[a-zA-Z0-9_]+$");
        boolean LoginConfirm = false;
        boolean PasswordConfirm = false;
        boolean passwordCheck = password.matches("^[a-zA-Z0-9_]+$");
        if(login.length() >= 20 && onlyLatinAlphabet){
            LoginConfirm = true;
        } else{
            throw new WrongLoginException("fidfdivjdiv");
        }
        if(password.length() >= 20 && passwordCheck && password.equals(confirmPassword)){
            PasswordConfirm = true;
        } else{
            throw new WrongPasswordException("jidjvidvjdivjd");
        }
        return (LoginConfirm && PasswordConfirm);
    }

    public static void main(String[] args) {
        try{
            control("uheufhuefu", "huvhduvhduvhduvd","hvduvhduvhduvhd");
        } catch (WrongLoginException exception){
            exception.printStackTrace();
        } catch (WrongPasswordException exception){
            exception.printStackTrace();
        }
    }
}

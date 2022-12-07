package com.JavaCore.Exception;

public class Runner {

    public static boolean control(String login, String password, String confirmPassword){
        boolean onlyLatinAlphabet = login.matches("^[a-zA-Z0-9_]+$");
        boolean LoginConfirm = false;
        boolean PasswordConfirm = false;
        boolean passwordCheck = password.matches("^[a-zA-Z0-9_]+$");
        try{
            if(login.length() >= 20 && onlyLatinAlphabet){
                LoginConfirm = true;
            } else{
                throw new WrongLoginException("Wrong Login");
            }
            if(password.length() >= 20 && passwordCheck && password.equals(confirmPassword)){
                PasswordConfirm = true;
            } else{
                throw new WrongPasswordException("Wrong Password");
            }
        } catch (WrongLoginException exception){
            System.out.println("Exception: " + exception.getMessage());
        } catch (WrongPasswordException exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return (LoginConfirm && PasswordConfirm);
    }

    public static void main(String[] args) {
        System.out.println(control("uhvudfhduhdfuhdfjddjdhfvdfvdf", "aaa","aaa"));
    }
}

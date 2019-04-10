package com.company;

/**
 * Created by 65411 on 2019/4/9.
 */



    public class DB implements DBInterface {
        @Override
        public boolean connect(String address, String userName, String password) {
            boolean login;
            if(address=="Kristianstad"&&userName=="xiao"&&password=="1234"){
                login = true;
                System.out.println("login successful");
            } else {
                login = false;
                System.out.println("login failed");
            }
            System.out.println("");
            return login;
        }

        @Override
        public boolean disconnect() {
            //Unsupported operation exception, check if you have used an unimplemented method in Java
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isConnected() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getName(int id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }





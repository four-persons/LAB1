package com.company;

/**
 * Created by 65411 on 2019/4/9.
 */



    public class Mock implements DBInterface {
        private int ID;
        private String name;

        public Mock(int ID, String name){
            this.ID=ID;
            this.name=name;
        }

        @Override
        public boolean connect(String address, String userName, String password) {
            System.out.println("Address:"+address+"\nuserName:"+userName+"\nPassword:"+password);
            return true;
        }

        @Override
        public boolean disconnect() {
            System.out.println("It is not connected");
            return true;
        }

        @Override
        public boolean isConnected() {
            System.out.println("It is connected");
            return true;
        }

        @Override
        public String getName(int id) {
            String newName = "Wrong id";
            if(id == this.ID){
                System.out.println("ID:"+this.ID+" name: "+this.getName());
                newName = name;
            }else{
                System.out.println(newName);
            }

            return newName;
        }
        public int getId() {

            return ID;
        }

        public String getName() {

            return name;
        }

    }


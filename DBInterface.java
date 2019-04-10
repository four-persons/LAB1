package com.company;

/**
 * Created by 65411 on 2019/4/9.
 */



    public interface DBInterface {
        boolean connect(String address, String userName, String password);

        boolean disconnect();

        boolean isConnected();

        String getName(int id);
    }


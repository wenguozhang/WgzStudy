package com.wgz.rmiserver;

import java.rmi.RemoteException;
import com.wgz.rmiserver.bean.Account;
import com.wgz.rmiserver.stub.UserManagerInterface;


public class UserManagerImp implements UserManagerInterface {
    public UserManagerImp() throws RemoteException {

    }
    private static final long serialVersionUID = -3111492742628447261L;

    public String getUserName() throws RemoteException{
        return "TT";
    }
    public Account getAdminAccount() throws RemoteException{
        Account account=new Account();
        account.setUsername("TT");
        account.setPassword("123456");
        return account;
    }
}
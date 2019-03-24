package com.wgz.rmiserver.stub;

import java.rmi.Remote;
import java.rmi.RemoteException;
import com.wgz.rmiserver.bean.Account;

public interface UserManagerInterface extends Remote{
    public String getUserName() throws RemoteException;
    public Account getAdminAccount() throws RemoteException;
}
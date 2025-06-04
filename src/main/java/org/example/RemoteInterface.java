package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    public String sayHello(String name) throws RemoteException;
}

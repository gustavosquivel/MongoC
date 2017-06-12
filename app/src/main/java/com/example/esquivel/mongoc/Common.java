package com.example.esquivel.mongoc;

/**
 * Created by Esquivel on 9/06/2017.
 */

class Common {
    private  static  String DB_NAME="pruebadb";
    private  static  String COLLECTION_NAME="user";
    public static String API_KEY="SEAreSVx3y5x2OJCbX5H360VEekKTH4g";

    public static String getAddressSingle(User user)
    {
        String baseUrl  =String.format("https://api.mlab.com/api/1/databases/%s/collections/%s",DB_NAME,COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("/"+user.get_id().getOid()+"?apiKey="+API_KEY);
        return stringBuilder.toString();


    }

    public static String getAddressAPI ()
    {
        String baseUrl  =String.format("https://api.mlab.com/api/1/databases/%s/collections/%s",DB_NAME,COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("?apiKey="+API_KEY);
        return stringBuilder.toString();

    }


}



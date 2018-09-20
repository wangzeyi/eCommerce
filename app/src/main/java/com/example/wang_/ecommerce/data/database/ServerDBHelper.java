package com.example.wang_.ecommerce.data.database;


import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.android.volley.toolbox.StringRequest;
import com.example.wang_.ecommerce.data.IDataManager;
import com.example.wang_.ecommerce.utils.AppController;


import java.util.HashMap;
import java.util.Map;

public class ServerDBHelper implements IDBHelper{

    String url;


    public ServerDBHelper(String url) {
        this.url = url;
    }


    @Override
    public void Register(String name, String mobile, IDataManager.onResponseListener listener) {

        StringRequest postquest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Log.d("MyTag", response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("MyTag", "Error");
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> mymap = new HashMap<>();
                mymap.put("fname","andy");
                mymap.put("lname","wang");
                mymap.put("address","china");
                mymap.put("password","123");
                mymap.put("email","andy@123.com");
                mymap.put("mobile","1715088795");

                return mymap;
            }
        };

        AppController.getInstance().addToRequestQueue(postquest);
        //AppController.getInstance().getRequestQueue();

        //listener.postRegister(name, mobile.concat(url));
    }
}

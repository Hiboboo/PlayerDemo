package com.android.volley;

import android.test.AndroidTestCase;
import android.util.Log;

import com.android.volley.Request.Method;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class RequestJunit extends AndroidTestCase
{
    public void testParseNetworkResponse()
    {
        String url = "http://218.28.2.96/mbappfiles.action?appbsm=zzstxx.mobile.android.dc.teacher&appversion=165&apptype=android&imec=000000000000000";
        StringRequest mRequest = new StringRequest(Method.GET, url, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                Log.v("ParseNetworkResponse", response);
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Log.e("ParseNetworkResponse", "Request error!");
            }
        });
        RequestQueue mQueue = Volley.newRequestQueue(getContext());
        mQueue.add(mRequest);
    }
}

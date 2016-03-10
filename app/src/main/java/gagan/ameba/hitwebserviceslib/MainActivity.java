package gagan.ameba.hitwebserviceslib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.HashMap;

import gagan.ameba.hitwebservicelibraryg.CallBackWeb;
import gagan.ameba.hitwebservicelibraryg.SuperWebServiceG;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void hitPost(View view)
    {
        //        ================POST webservice

//        you can change hashMap to json if needed from  @WebServiceHelper.java class.
//        Or change its encoded if required..

        HashMap<String, String> data = new HashMap<>();
        data.put("parameter", "value");
        data.put("parameter", "value");
        data.put("parameter", "value");
        data.put("parameter", "value");
        new SuperWebServiceG("Enter url of your WS", data, new CallBackWeb()
        {
            @Override
            public void webOnFinish(String output)
            {
//                    here you will get response
            }
        }).execute();
//        ================POST webservice


    }

    public void hitGet(View view)
    {
        //        ================GET webservice

        new SuperWebServiceG("Enter url of your WS", new HashMap<String, String>(), new CallBackWeb()
        {
            @Override
            public void webOnFinish(String output)
            {
//                    here you will get response
            }
        }).execute();
//        ================GET webservice


    }
}

# HitWebServicesLibG
This library demonstarate how to hit a webservice(MVC) and how to get call back from an async task and using single Async task in whole project.

Library contains:
1.a Helper class which have methods to hit a POST or GET websevice .

2.a Interface for call back.

3.a SuperAsync class which will use helper class to hit WS and return response to calling activity using call back interface,


You can change encoding of format of POST data in helper class if required.Currently we are using HashMaps but you can also use Jason for same just change in Helper class.

Enjoy..!

Just use this library and use this code to fetch data from server.

  //        ================POST webservice

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




//        ================GET webservice
             //pass empty HashMap here..
             
        new SuperWebServiceG("Enter url of your WS", new HashMap<String, String>(), new CallBackWeb()
        {
            @Override
            public void webOnFinish(String output)
            {
                    //                    here you will get response
            }
        }).execute();

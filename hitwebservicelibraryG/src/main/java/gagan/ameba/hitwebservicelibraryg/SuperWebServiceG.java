package gagan.ameba.hitwebservicelibraryg;

import android.os.AsyncTask;

import java.util.HashMap;

/**
 * Created by gagandeep on 28/9/15.
 */
public class SuperWebServiceG extends AsyncTask<Void, String, String>
{

    private String URL_;
    private HashMap<String, String> hashMapData;
    private CallBackWeb callBack;


    public static SuperWebServiceG asyncClass;


    public SuperWebServiceG(String URL_, HashMap<String, String> hashMapData, CallBackWeb callBack)
    {
        this.URL_ = URL_;
        this.hashMapData = hashMapData;
        this.callBack = callBack;


        asyncClass = this;
    }


    public static void cancelPrevious()
    {
        if (asyncClass != null)
        {
            asyncClass.cancel(true);
        }
    }


    @Override
    protected String doInBackground(Void... params)
    {


        if (hashMapData.isEmpty())
        {
            return new WebServiceHelper().performGetCall(URL_);
        }
        else
        {
            return new WebServiceHelper().performPostCall(URL_, hashMapData);
        }
    }

    @Override
    protected void onPostExecute(String s)
    {

        callBack.webOnFinish(s);

        super.onPostExecute(s);
    }
}

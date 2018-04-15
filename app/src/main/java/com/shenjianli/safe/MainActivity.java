package com.shenjianli.safe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        testBase64();

    }

    private void testBase64() {
        String url = "https://www.baidu.com/s?wd=Base64&rsv_spt=1&rsv_iqid=0xa9188d560005131f&issp=1&f=3&rsv_bp=0&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=1&rsv_sug1=1&rsv_sug7=001&rsv_sug2=1&" +
                "rsp=0&rsv_sug9=es_2_1&rsv_sug4=2153&rsv_sug=9";

        byte[] encoded = Base64.encode(url.getBytes(),Base64.URL_SAFE);
        byte[] decoded = Base64.decode(encoded,Base64.URL_SAFE);

        Log.i("1","url:" + url);
        Log.i("1","encoded:" + new String(encoded));
        Log.i("1","decoded:" + new String(decoded));

    }


}

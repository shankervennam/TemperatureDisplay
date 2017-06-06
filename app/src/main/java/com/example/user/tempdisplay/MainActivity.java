package com.example.user.tempdisplay;

import android.content.pm.ApplicationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.user.tempdisplay.TempDb.Model.TempDbCurrently;
import com.example.user.tempdisplay.TempDb.Retrofit.ApiClientTemp;
import com.example.user.tempdisplay.TempDb.Retrofit.ApiInterfaceTemp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    public static final String TAG = "Mainactivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.temp_new);

        ApiInterfaceTemp apiInterfaceTemp = ApiClientTemp.getClient().create(ApiInterfaceTemp.class);
        Call<TempDbCurrently> call = apiInterfaceTemp.getTopRatedMovies();

        call.enqueue(new Callback<TempDbCurrently>()
        {
            @Override
            public void onResponse(Call<TempDbCurrently> call, Response<TempDbCurrently> response)
            {
                String temp = response.body().getSummary();
                //String finalresult = new Double(temp).toString();
                textView.setText(temp);
            }

            @Override
            public void onFailure(Call<TempDbCurrently> call, Throwable t)
            {
                Log.e(TAG, t.toString());
            }
        });

    }
}

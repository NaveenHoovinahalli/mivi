package com.example.android.naveenproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.naveenproject.model.Model;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;

public class HomeActivity extends AppCompatActivity {


    TextView mName,mPlan,mBalance,mProductPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mName=findViewById(R.id.tve1);
        mPlan=findViewById(R.id.tve2);

        mBalance=findViewById(R.id.tve3);
        mProductPrice=findViewById(R.id.tve4);

//        can go for threads if its taking time
        handleJsonData();
    }

    private void handleJsonData() {

        String jsonString = loadJSONFromAsset();

        Gson gson = new Gson();
        Model model = gson.fromJson(jsonString, Model.class);

//        can show more information as required
        mName.setText(model.getMdata().getAttribute().getTitle()+" "+model.getMdata().getAttribute().getFirst_name()+" "+model.getMdata().getAttribute().getLast_name());
        mPlan.setText(model.getIncludeds().get(2).getAttribute().getName());
        mBalance.setText(String.valueOf(model.getIncludeds().get(1).getAttribute().getIncluded_data_balance()));
        mProductPrice.setText(String.valueOf(model.getIncludeds().get(2).getAttribute().getPrice()));


        Toast.makeText(this,"Can show more information",Toast.LENGTH_SHORT).show();


    }


    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("collection.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}

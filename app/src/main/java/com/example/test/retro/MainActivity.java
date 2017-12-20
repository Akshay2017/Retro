package com.example.test.retro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
private TextView id,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=findViewById(R.id.uid);
        name=findViewById(R.id.uname);

        APIInterface apiInterface=APIClient.getClient().create(APIInterface.class);

        Call<UserModel> call=apiInterface.getUserData();


        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                UserModel userModel=response.body();
                id.setText(""+userModel.getId());
                name.setText(userModel.getLogin().toString());

            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package umn.ac.id.project.maggot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import umn.ac.id.project.maggot.adapter.ApprovalRejectionAdapter;
import umn.ac.id.project.maggot.adapter.PeternakSearchDropDownAdapter;
import umn.ac.id.project.maggot.model.PeternakModel;
import umn.ac.id.project.maggot.retrofit.ApiService;
import umn.ac.id.project.maggot.adapter.DropDownAdapter;

public class BuyMaggotActivity2 extends AppCompatActivity {
    ArrayAdapter<PeternakModel.Peternak> DropDownAdapter;
    List<PeternakModel.Peternak> results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_maggot2);
        ApiService.endpoint().getPeternak().enqueue(new Callback<PeternakModel>() {
            @Override
            public void onResponse(Call<PeternakModel> call, Response<PeternakModel> response) {
                if(response.isSuccessful()) {
                    results = response.body().getPeternak();
                    DropDownAdapter = new PeternakSearchDropDownAdapter(BuyMaggotActivity2.this, (ArrayList<PeternakModel.Peternak>) results);
                    umn.ac.id.project.maggot.InstantAutoComplete textView = (umn.ac.id.project.maggot.InstantAutoComplete) findViewById(R.id.namawarga);
                    textView.setAdapter(DropDownAdapter);
                    textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                        @Override
                        public void onItemClick(AdapterView<?> parent, View arg1, int position, long arg3) {
                            Object item = parent.getItemAtPosition(position);
                            if (item instanceof PeternakModel.Peternak){
                                PeternakModel.Peternak peternak =(PeternakModel.Peternak) item;
                                textView.setText(peternak.getFull_name());
                            }
;                        }
                    });

                    textView.setOnFocusChangeListener(new View.OnFocusChangeListener() {

                        @Override
                        public void onFocusChange(View v, boolean hasFocus) {
                            if (hasFocus) {
                                textView.showDropDown();
                            }else {
                                textView.dismissDropDown();
                            }


                            }

                    });

                    textView.setOnTouchListener(new View.OnTouchListener() {

                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            textView.showDropDown();
                            return false;
                        }
                    });

//



                }
            }

            @Override
            public void onFailure(Call<PeternakModel> call, Throwable t) {
                Log.d("Failure : ", t.toString());
            }
        });
    }

}
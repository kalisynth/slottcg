package org.kalisynth.slottcg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class options extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        ButterKnife.bind(this);
    }

    @OnCheckedChanged(R.id.musicrb)
    public void musictoggle(){

    }

    @OnCheckedChanged(R.id.soundrb)
    public void soundtoggle(){

    }

    @OnClick(R.id.removeadsbtn)
    public void removeads(){

    }

    @OnClick(R.id.restorebtn)
    public void restorepurchase(){

    }

    @OnClick(R.id.aboutbtn)
    public void about(){

    }
}

package org.kalisynth.slottcg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainMenu extends AppCompatActivity {
    @BindView(R.id.playbtn) Button playbtn;
    @BindView(R.id.optionsbtn) Button optionsbtn;
    @BindView(R.id.howtoplaybtn) Button howtobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.playbtn)
    public void playClick(){
        startActivity(new Intent(this, game.class));
        finish();
    }

    @OnClick(R.id.howtoplaybtn)
    public void howtoClick(){
        startActivity(new Intent(this, howto.class));
        finish();
    }

    @OnClick(R.id.optionsbtn)
    public void optionsClick(){
        startActivity(new Intent(this, options.class));
        finish();
    }

    @OnClick(R.id.collectionbtn)
    public void collectionsclick(){
        startActivity(new Intent(this, collections.class));
        finish();
    }
}

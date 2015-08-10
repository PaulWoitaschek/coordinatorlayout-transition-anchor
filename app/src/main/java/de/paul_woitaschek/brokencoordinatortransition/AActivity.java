package de.paul_woitaschek.brokencoordinatortransition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        transitionView = findViewById(R.id.transitionView);
    }

    private View transitionView;

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.with_anchor:
                intent = BActivity.newInstance(this, true);
                break;
            case R.id.no_anchor:
                intent = BActivity.newInstance(this, false);
                break;
        }
        if (intent != null) {
            Bundle opts = ActivityOptionsCompat.makeSceneTransitionAnimation(this, transitionView, getString(R.string.transition_name)).toBundle();
            ActivityCompat.startActivity(this, intent, opts);
        }
    }
}

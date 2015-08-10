package de.paul_woitaschek.brokencoordinatortransition;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Paul Woitaschek (woitaschek@posteo.de, paul-woitaschek.de) on 10.08.15.
 * Activity B that is the target of the transition
 */
public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        boolean withAnchor = getIntent().getBooleanExtra(NI_WITH_ANCHOR, false);
        View transitionView = findViewById(R.id.transitionView);
        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) transitionView.getLayoutParams();
        if (withAnchor) {
            params.setAnchorId(R.id.anchor);
        }
    }

    private static final String NI_WITH_ANCHOR = "niWithAnchor";

    public static Intent newInstance(Context c, boolean withAnchor) {
        Intent intent = new Intent(c, BActivity.class);
        intent.putExtra(NI_WITH_ANCHOR, withAnchor);
        return intent;
    }
}

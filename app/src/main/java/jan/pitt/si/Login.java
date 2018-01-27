package jan.pitt.si;

/**
 * Created by haleyplott on 1/26/18.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
    }

    protected void enter(View view) {
        Intent intent = new Intent(this, QuestionaireActivity.class);
        startActivity(intent);
    }

}

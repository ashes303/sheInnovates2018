package jan.pitt.si;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

public class StarsActivity extends AppCompatActivity {

    String[] traits = new String[]{
            "Clean",
            "Quiet",
            "an Early Riser",
            "involved in Sports",
            "Studious"

    };
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars);

        TextView tv = findViewById(R.id.trait);
        tv.setText(traits[i++]);

        ImageButton nextPreference = findViewById(R.id.nextButton);
        nextPreference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RatingBar stars = findViewById(R.id.ratingBar);
                stars.setRating(0);

                TextView tv = findViewById(R.id.trait);
                if (i < traits.length) {
                    tv.setText(traits[i++]);
                } else {
                    startActivity(new Intent(getApplicationContext(), ProfileViewerActivity.class));
                }
            }
        });
    }
}

package jan.pitt.si;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements {


    private ArrayList<User> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> list = new ArrayList<>();

        makeUserList(list);

        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    protected void makeUserList(ArrayList<User> list) {
        this.list = list;
        Scanner scanner = new Scanner(getResources().openRawResource(R.raw.other_users));

        while (scanner.hasNextLine()) {
            User u = new User(scanner.nextLine(), scanner.nextLine());
            u.setName(scanner.nextLine());
            u.setGender(Gender.valueOf(scanner.nextLine()));
            u.setSeeking(Seeking.valueOf(scanner.nextLine()));
            u.setRise(scanner.nextInt());
            scanner.nextLine();
            u.setBed(scanner.nextInt());
            scanner.nextLine();
            u.setOnCampus(Boolean.parseBoolean(scanner.nextLine()));
            u.setMessy(scanner.nextInt());
            scanner.nextLine();
            /*
             TODO: set the rest of attributes
             Also? maybe move all this to the activity that actually uses the list of
             other users
             If not this list has to be passed through intents


             */
            scanner.nextLine();
        }
    }
}

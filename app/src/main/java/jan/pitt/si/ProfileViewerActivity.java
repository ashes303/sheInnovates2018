package jan.pitt.si;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfileViewerActivity extends AppCompatActivity {

    ArrayList<User> list;
    User potential;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_viewer);
        makeUserList();
        if (list.size() >= 1) displayUser(list.remove(1));


    }

    protected void makeUserList() {
        list = new ArrayList<>();
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

            String s = scanner.nextLine();
            while(s.charAt(0) == '$') {
                u.setInterest(Attributes.attribute(s));
                s = scanner.nextLine();
            }
        }
    }

    protected void displayUser(User u) {
        TextView nameView = findViewById(R.id.name_tv);
        nameView.setText(u.name);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, u.interests);
        ListView lv = findViewById(R.id.user_attr_list);
        lv.setAdapter(adapter);
        potential = u;
    }

    protected void buttonPress(View view) {
        switch (view.getId()) {
            case R.id.profile_no_button:

                break;
            case R.id.profile_yes_button:

                break;
        }

        if (list.size() >= 1)
            displayUser(list.remove(1));


    }
}

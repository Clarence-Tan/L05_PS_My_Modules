package sg.edu.rp.c346.id22034700.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.textView);
        back = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String module = intentReceived.getStringExtra("Module");

        if (module.equals("C346")) {
            tvAnswer.setText("Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: E63A");
        } else if (module.equals("C206")) {
            tvAnswer.setText("Module Code: C206\nModule Name: Software Development Process\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        } else if (module.equals("C203")) {
            tvAnswer.setText("Module Code: C203\nModule Name: Web Application Development in PHP\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        } else if (module.equals("C218")) {
            tvAnswer.setText("Module Code: C218\nModule Name: UI/UX Design for Apps\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        } else if (module.equals("C235")) {
            tvAnswer.setText("Module Code: C235\nModule Name: IT Security and Management\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64N");
        } else {
            tvAnswer.setText("Module Code: C349\nModule Name: iPad Programming\nAcademic Year: 2023\nSemester: 2\nModule Credit: 4\nVenue: W65D");
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ModuleDetailActivity.this, MainActivity.class));
            }
        });

    }
}
package info.brianramirez.vocab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView defText;
    TextView wordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordText = (TextView)findViewById(R.id.wordTextView);
        defText = (TextView)findViewById(R.id.defTextView);

        Button studyBtn = (Button)findViewById(R.id.studyBtn);

        final String[] words = {
                "Programmer",
                "Brain Dump",
                "Defrag",
                "Down Time",
                "Huge Pipes",
                "Spammin\'",
        };
        final String[] definitions = {
                "An organism capable of converting caffeine into code.",
                "To empty one's brain of any and all information relating to a particular subject.",
                "To optimize your hard drive, usually with a program that \"cleans it up\"",
                "This expression refers to lost production time due to a broken machine and its operator.",
                "Slang for a high-bandwidth Internet connection.",
                "Slang for speaking aimlessly on a mishmash of topics, or to stuff someone's brain."
        };

        wordText.setText(words[0]);
        defText.setText(definitions[0]);


        studyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int random = rand.nextInt(6);
                wordText.setText(words[random]);
                defText.setText(definitions[random]);
            }
        });

    }
}

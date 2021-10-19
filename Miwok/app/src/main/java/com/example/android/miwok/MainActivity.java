package com.example.android.miwok;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent openNumbersListIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(openNumbersListIntent);
            }
        });
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent openFamilyListIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(openFamilyListIntent);
            }
        });
        TextView colors  = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent openColorsListIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(openColorsListIntent);
            }
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent openPhrasesListIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(openPhrasesListIntent);
            }
        });
    }


}

package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.top;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView displayQuestion;
    private Button firstAnswer;
    private Button secondAnswer;
    int storyIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        displayQuestion = (TextView) findViewById(R.id.storyTextView);
        firstAnswer = (Button) findViewById(R.id.buttonTop);
        secondAnswer = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        firstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(storyIndex == 1) {
                    displayQuestion.setText(R.string.T3_Story);
                    firstAnswer.setText(R.string.T3_Ans1);
                    secondAnswer.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                }
                else if(storyIndex == 3){
                    displayQuestion.setText(R.string.T6_End);
                    firstAnswer.setVisibility(view.GONE);
                    secondAnswer.setVisibility(view.GONE);
                }
                else if(storyIndex == 2){
                     displayQuestion.setText(R.string.T3_Story);
                    firstAnswer.setText(R.string.T3_Ans1);
                    secondAnswer.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        secondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(storyIndex == 1) {
                    displayQuestion.setText(R.string.T2_Story);
                    firstAnswer.setText(R.string.T2_Ans1);
                    secondAnswer.setText(R.string.T2_Ans2);
                    storyIndex=2;
                }
                else if(storyIndex == 2){
                    displayQuestion.setText(R.string.T4_End);
                    firstAnswer.setVisibility(view.GONE);
                    secondAnswer.setVisibility(view.GONE);
                }
                else if(storyIndex == 3){
                    displayQuestion.setText(R.string.T5_End);
                    firstAnswer.setVisibility(view.GONE);
                    secondAnswer.setVisibility(view.GONE);
                }

            }
        });

    }
}

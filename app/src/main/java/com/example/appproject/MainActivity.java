package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;
    private EditText etWeapon;
    private EditText etNoun;
    private EditText etOccupation;
    private EditText etName;
    private EditText etLocation;
    private EditText etAdjective;
    private EditText etOnomatopoeia;
    private EditText etBodyPart;
    private EditText etVerb1;
    private EditText etVerb2;


    private Button btnGenerate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tv_title);
        etWeapon = findViewById(R.id.et_weapon);
        etNoun = findViewById(R.id.et_noun);
        etOccupation = findViewById(R.id.et_occupation);
        etName = findViewById(R.id.et_name);
        etLocation = findViewById(R.id.et_location);
        etAdjective = findViewById(R.id.et_adjective);
        etOnomatopoeia = findViewById(R.id.et_onomatopoeia);
        etBodyPart = findViewById(R.id.et_bodypart);
        etVerb1 = findViewById(R.id.et_verb1);
        etVerb2 = findViewById(R.id.et_verb2);


        btnGenerate = findViewById(R.id.btn_generate);

        // Story
        // The first line is an example, please delete and start your own story
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grade < 9){

                    String story = "";

                    story += "\nIt's the middle of the night, and YOU are about to murder " + etName.getText() + "...";
                    story += "\nYou plotted to get revenge because " + etName.getText() + " stole your " + etNoun.getText() + ".";
                    story += "\nYou met " + etName.getText() + " at " etLocation.getText()
                    story += "\n" + etName.getText() + "'s house is right next to the " + etLocation.getText() + " so it will easy to sneak into the house."
                    story += "\nAs you approach the house, you notice that a window is open, so you " + etAdjective.getText() + " make your way inside.";
                    story += "\nSince " + etName.getText() + " is a " + etOccupation.getText() + ", it is no surprise that a random " + etWeapon.getText() + " would be lying around.";
                    story += "\nSometimes, he enjoys " + ingVerb + " to and from the " + place + ". ";
                    story += "\n" + etName. ";
                    story += "\nBut, his favorite activity is to play " + sport +
                            " during his free time at the " + place + ". ";
                    story += "\nSince he is very " + adjective1 + ", he continues to feel "
                            + emotion1 + " when he plays. ";
                    story += "\n" + person + " also has a pet " + color + " " + animal + " named " + animalName +
                            ". He enjoys " + ingVerb2 + " with " + animalName + " when not playing " + sport + ".";
                    story += "\nAs " + person + " always says \"Be like me, be " + adjective1 + "!\"";

                }/*else{

                    story +=("\nEveryone has a thing that leaves them feeling " + emotion1 + ". ");
                    story +=("Even " + person + " in grade " + grade + " agrees. ");
                    story +=(person + " is a " + adjective1 + " person who loves "
                            + nouns2 + ", but he hates " + nouns1 + ". ");
                    story +=("At the " + place + ", he is renowned for being secretly good at " + sport +
                            ". But everyone knows that " + celebrity + " is still much better than him. ");
                    story +=("Sometimes, he enjoys " + ingVerb + " to and from the " + place + ". ");
                    story +=("Once, he even wrote a best-selling novel called \""
                            + book + ",\" which can be found in the biggest library in " + city + ". ");
                    story +=("But, his favorite activity is to play " + sport +
                            " during his free time at the " + place + ". ");
                    story +=("Since he is very " + adjective1 + ", he continues to feel "
                            + emotion1 + " when he plays. ");
                    story +=ln(person + " also has a pet " + color + " " + animal + " named " + animalName +
                            ". He enjoys " + ingVerb2 + " with " + animalName + " when not playing " + sport + ".");
                    story +=("As " + person + " always says \"Be like me, be " + adjective1 + "!\"");
                }*/
            }
        });
    }
}
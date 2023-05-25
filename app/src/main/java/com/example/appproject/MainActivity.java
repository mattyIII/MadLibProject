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
    private EditText etAnimal;
    private EditText etName;
    private EditText etLocation;
    private EditText etAdjective;
    private EditText etOnomatopoeia;
    private EditText etBodyPart;
    private EditText etObject;
    private EditText etVerb2;


    private Button btnGenerate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tv_title);
        etWeapon = findViewById(R.id.et_weapon);
        etNoun = findViewById(R.id.et_noun);
        etAnimal = findViewById(R.id.et_animal);
        etName = findViewById(R.id.et_name);
        etLocation = findViewById(R.id.et_location);
        etAdjective = findViewById(R.id.et_adjective);
        etOnomatopoeia = findViewById(R.id.et_onomatopoeia);
        etBodyPart = findViewById(R.id.et_bodypart);
        etObject = findViewById(R.id.et_object);
        etVerb2 = findViewById(R.id.et_verb2);


        btnGenerate = findViewById(R.id.btn_generate);

        // Story
        // The first line is an example, please delete and start your own story
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grade < 9){

                    String story = "";

                    story += "\nIt's the middle of the night, and Jom is up to his usual shenanigans in catching Terry...";
                    story += "\nUp and down and all around, Jom chased Terry through the " + etLocation.getText() + ".";
                    story += "\nThen out of the corner of his eye, Jom saw THE Ms. " + etName.getText() + " on her porch.";
                    story += "\nMadly in love, Jom forgets about Terry and immediately" + etVerb2 + "s to flirt with her.";
                    story += "\nAs a romantic, Jom brought out his " + etObject.getText() + " from his pocket and begun to play into the night.";
                    story += "\nTerry, seeing this, has a devious plan to annoy Jom...";
                    story += "\nJom is too mesmerized by "+ etName.getText() + " to realize Terry had brought a " + etAnimal.getText() + "!";
                    story += "\nAND " + etOnomatopoeia.getText() + "! The " + etAnimal.getText() + " chomped on Jom's tail!!";
                    story += "\nJom jumped " + etAdjective.getText()+ "ly but kept his composure to impress " + etName.getText() + " and continued to play.";
                    story += "\nAnnoyed, Terry tried again...";
                    story += "\nUsing the same " + etAnimal.getText() + ", Terry hooked Jom's " + etNoun.getText() + " to the animal...";
                    story += "\nThe " + etAnimal.getText() + " zoomed away and RIP! Jom's " + etNoun.getText() + " was ripped away, exposing his " + etBodyPart.getText() + "!";
                    story += ""

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
package com.example.finalproject.Level2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalproject.Level1.Animation_done;
import com.example.finalproject.Level1.MatchGame;
import com.example.finalproject.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Animal_Quiz extends AppCompatActivity {

    private String[][] questionsAndAnswers = {
            {"Q1. I SOUND LIKE MOO", "Q2. I GIVE MILK"}, // COW
            {"Q1. I SOUND LIKE BAH-BAH", "Q2. I GIVE WOOL"}, // SHEEP
            {"Q1. I BARK","Q2. I GUARD YOUR HOME"}, // DOG
            {"Q1. I ROAR", "Q2. I AM THE KING OF JUNGLE"}, // LION
            {"Q1. I CHATTER", "Q2. I JUMP FROM TREE TO TREE"} // MONKEY
    };

    List<String> animalList = Arrays.asList("COW", "SHEEP", "DOG", "LION", "MONKEY");


    private String whoami = "WHO AM I ?";

    private TextView question;
    private ImageView imageAnimal;
    private Button checkAnswer,start_continue;


    private Handler handler = new Handler();

    private int currentQuestionIndex = 0;
    private int optionCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_quiz);

        // Initialize your views
        question = findViewById(R.id.question);
        imageAnimal = findViewById(R.id.imageAnimal);
        checkAnswer = findViewById(R.id.checkAnswer);
        start_continue = findViewById(R.id.start_continue);
        start_continue.setText("START GAME");
        checkAnswer.setVisibility(View.INVISIBLE);

        MediaPlayer correct = MediaPlayer.create(this,R.raw.correct_answer);
        start_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start_continue.setVisibility(View.INVISIBLE);
                correct.start();
                showNextQuestion();
            }
        });








    }


    private void showNextQuestion() {

        int[] qsFiles = {R.raw.qs1, R.raw.qs2,R.raw.qs3,R.raw.qs4,R.raw.qs5};

        checkAnswer.setVisibility(View.INVISIBLE);
        imageAnimal.setImageResource(R.drawable.qs_mark);
        if (currentQuestionIndex < questionsAndAnswers.length) {
            String[] currentQuestions = questionsAndAnswers[currentQuestionIndex];

            // Display the first question for 4 seconds
            question.setText(currentQuestions[0]);
            if (optionCounter >= 0 && optionCounter < qsFiles.length) {
                MediaPlayer mediaPlayer = MediaPlayer.create(this, qsFiles[optionCounter]);
                mediaPlayer.start();
                optionCounter++;
            }
            handler.postDelayed(() -> {
                // Display the second question for 4 seconds
                question.setText(currentQuestions[1]);
                handler.postDelayed(() -> {
                    // Display "Who am I?"
                    question.setText(whoami);
                    checkAnswer.setVisibility(View.VISIBLE);
                    checkAnswer.setText("Check Answer");
                    checkAnswer.setOnClickListener(view -> handleAnswerClick(currentQuestionIndex));

                }, 5000);
            }, 5000);

            currentQuestionIndex++;
        } else {
            // Move to another page or perform further actions after all questions are shown
            // For example, start another activity or perform some concluding action

            goBack();


        }
    }

    private void handleAnswerClick(int index) {

        int[] images = {R.drawable.cow_image, R.drawable.sheep_image, R.drawable.dog_image,
                R.drawable.lion_image, R.drawable.monkey_image};

        if (index >= 0 && index < images.length) {
            imageAnimal.setImageResource(images[index-1]);
        } else {
            imageAnimal.setImageResource(R.drawable.monkey_image);
        }

        question.setText("I AM A "+animalList.get(index-1));


        int[] soundFiles = {R.raw.cow_sound, R.raw.sheep_sound, R.raw.dog_sound, R.raw.lion_sound, R.raw.monkey_sound};

        if (index > 0 && index <= soundFiles.length) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, soundFiles[index - 1]);
            mediaPlayer.start();
        }


        checkAnswer.setVisibility(View.INVISIBLE);
        start_continue.setText("CONTINUE");
        start_continue.setVisibility(View.VISIBLE);

        start_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start_continue.setVisibility(View.INVISIBLE);
                showNextQuestion();
            }
        });

        // Move to the next question after waiting for 5 seconds
       // handler.postDelayed(this::showNextQuestion, 5000);
    }

    private void goBack(){
        Intent intent = new Intent(Animal_Quiz.this, Animation_done.class);
        startActivity(intent);
        onBackPressed();
    }
}
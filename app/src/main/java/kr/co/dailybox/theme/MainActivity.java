package kr.co.dailybox.theme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollbutton);
        final ImageView image_leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView image_rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int [] diceArray = new int[5];
        diceArray [0] = R.drawable.dice1;
        diceArray [1] = R.drawable.dice2;
        diceArray [2] = R.drawable.dice3;
        diceArray [3] = R.drawable.dice4;
        diceArray [4] = R.drawable.dice5;
        diceArray [5] = R.drawable.dice6;

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dice", "hi~");

                Random random = new Random();
                int ranNum = random.nextInt(5);
                image_leftDice.setImageResource(diceArray[ranNum]);

                Random random2 = new Random();
                ranNum = random.nextInt(5);
                image_rightDice.setImageResource(diceArray[ranNum]);

            }
        });

    }
}

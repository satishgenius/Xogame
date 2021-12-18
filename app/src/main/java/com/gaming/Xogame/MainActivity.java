package com.gaming.Xogame;
//key 0
// password = xogame

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView button1,button2 ,button3,button4,button5,button6,button7,button8,button9;
    String startgame ="X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5 ,xcount= 0,ocount= 0 ,i=0;
    TextView scorex,scoreo;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.imgbutton1);
        button2 = findViewById(R.id.imgbutton2);
        button3 = findViewById(R.id.imgbutton3);
        button4 = findViewById(R.id.imgbutton4);
        button5 = findViewById(R.id.imgbutton5);
        button6 = findViewById(R.id.imgbutton6);
        button7 = findViewById(R.id.imgbutton7);
        button8 = findViewById(R.id.imgbutton8);
        button9 = findViewById(R.id.imgbutton9);


        scorex = findViewById(R.id.scorex);
        scoreo = findViewById(R.id.scorey);

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
                xcount = 0;
                ocount=0;
                scorex.setText("Score X :-"+String.valueOf(xcount));
                scoreo.setText("Score Y :-"+String.valueOf(ocount));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button1.setImageResource(R.drawable.cross);
                    b1 = 1;
                    i++;
                }
                else {
                    button1.setImageResource(R.drawable.circle);
                    b1=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button2.setImageResource(R.drawable.cross);
                    b2 = 1;
                    i++;
                }
                else {
                    button2.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button3.setImageResource(R.drawable.cross);
                    b3 = 1;
                    i++;
                }
                else {
                    button3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button4.setImageResource(R.drawable.cross);
                    b4 = 1;
                    i++;
                }
                else {
                    button4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button5.setImageResource(R.drawable.cross);
                    b5 = 1;
                    i++;
                }
                else {
                    button5.setImageResource(R.drawable.circle);
                    b5=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button6.setImageResource(R.drawable.cross);
                    b6 = 1;
                    i++;
                }
                else {
                    button6.setImageResource(R.drawable.circle);
                    b6=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button7.setImageResource(R.drawable.cross);
                    b7 = 1;
                    i++;
                }
                else {
                    button7.setImageResource(R.drawable.circle);
                    b7=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button8.setImageResource(R.drawable.cross);
                    b8 = 1;
                    i++;
                }
                else {
                    button8.setImageResource(R.drawable.circle);
                    b8=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    button9.setImageResource(R.drawable.cross);
                    b9 = 1;
                    i++;
                }
                else {
                    button9.setImageResource(R.drawable.circle);
                    b9=0;
                    i++;
                }
                chooseplayer();
                winnigGanme();
            }
        });
    }


    private void winnigGanme()
    {
    if((b1==1)&&(b2==1)&&(b3==1)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        xcount++;
        scorex.setText("Score X :"+String.valueOf(xcount));
    }


         else if((b4==1)&&(b5==1)&&(b6==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetvalues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score X : "+String.valueOf(xcount));
        }

    else if((b7==1)&&(b8==1)&&(b9==1)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        xcount++;
        scorex.setText("Score X : "+String.valueOf(xcount));
    }

    else if((b1==1)&&(b4==1)&&(b7==1)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        xcount++;
        scorex.setText("Score X : "+String.valueOf(xcount));
    }

    else if((b2==1)&&(b5==1)&&(b8==1)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        xcount++;
        scorex.setText("Score X : "+String.valueOf(xcount));
    }

    else if((b3==1)&&(b6==1)&&(b9==1)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        xcount++;
        scorex.setText("Score X : "+String.valueOf(xcount));
    }

    else if((b1==1)&&(b5==1)&&(b9==1)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        xcount++;
        scorex.setText("Score X : "+String.valueOf(xcount));
    }

    else if((b3==1)&&(b5==1)&&(b7==1)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player X WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        xcount++;
        scorex.setText("Score X : "+String.valueOf(xcount));
    }

    else if((b1==0)&&(b2==0)&&(b3==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }
    else if((b4==0)&&(b5==0)&&(b6==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }

    else if((b7==0)&&(b8==0)&&(b9==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }

    else if((b1==0)&&(b4==0)&&(b7==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }

    else if((b2==0)&&(b5==0)&&(b8==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }

    else if((b3==0)&&(b6==0)&&(b9==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }

    else if((b1==0)&&(b5==0)&&(b9==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }

    else if((b3==0)&&(b5==0)&&(b7==0)){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("player O WON").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        ocount++;
        scoreo.setText("Score Y : "+String.valueOf(ocount));
    }
    else {
        if(i==9){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Match draw").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetvalues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
        }
    }







    }

    private  void chooseplayer()
    {
        if(startgame.equals("X"))
        {
            startgame="O";
        }
        else {
            startgame="X";
        }
    }

    private void resetvalues() {

        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        i=0;
    }
}
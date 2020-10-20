package comscisdu.pichisnee.animalforfun;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    //Explicit
    ImageView questionImageView;
    ImageButton volImageButton;
    Button btn1, btn2, btn3, btn4;
    int questionCount = 10; //จำนวนคำถาม
    String answer;//ตัวแปรคำตอบ
    ArrayList<Integer> qID = new ArrayList<Integer>();//สุ่มโจทย์
    MediaPlayer mediaPlayer;
    Integer score=0;
    String nameString;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //ผูกตัวแปร java กับ อีลิเมนต์บน XML
        questionImageView = findViewById(R.id.imvQuestion);
        volImageButton = findViewById(R.id.imbVol);
        btn1 = findViewById(R.id.bt1);
        btn2 = findViewById(R.id.bt2);
        btn3 = findViewById(R.id.bt3);
        btn4 = findViewById(R.id.bt4);

        for (int i = 1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));
    }// end onCreate Method

    private void setQuestion(Integer qID) { //Method สร้างคำถาม
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ยุง");
            choice.add("สุนัข");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer = "สุนัข";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สุนัข");
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("สิงโต");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("แมว");
            choice.add("สุนัข");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("แกะ");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("ยุง");
            choice.add("สุนัข");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("แมว");
            choice.add("หมู");
            choice.add("สุนัข");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("สุนัข");
            choice.add("สิงโต");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }//end setQuestion Method
    public void playSound(View view) { //method แสดงเสียง
        mediaPlayer.start();
    }//end playSound Method

    public void choiceAns(View view) { //method ตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++; //ถ้าถูก
        }
        if (qID.isEmpty()) { //ตอบหมดแล้วโชว์คะแนน
            dialogboxScore();
            //Toast.makeText(getApplicationContext(), "คุณได้ " + score + " คะแนน", Toast.LENGTH_SHORT).show();
        } else { //ตอบไม่หมด ไปข้อต่อไป
            setQuestion(qID.remove(0));
        }
    }//end choiceAns Method

    private void dialogboxScore() { //method แสดงคะแนนน
        //รับค้า nameString จากหน้า MainActivity
        nameString = getIntent().getStringExtra("Name");
        //dialogbox สรุปคะแนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณ "+nameString+" ได้ " + score + " คะแนน")
                .setCancelable(false)
                .setPositiveButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                })
                .setNegativeButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}// end Class
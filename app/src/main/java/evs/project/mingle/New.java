package evs.project.mingle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by Kapil Khatri on 18-Sep-14.
 */
public class New extends Activity {



    Button button1;
    EditText  editText;
    RatingBar rate,rate2;
    TextView tview1,tview2,tview3;

    // String email[]={EmailAdd};

    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail);

        editText= (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button1);
        rate=(RatingBar) findViewById(R.id.ratingBar1);
        tview1=(TextView)findViewById(R.id.tview1);
        tview2=(TextView)findViewById(R.id.tview2);
        tview2=(TextView)findViewById(R.id.tview2);
        rate2=(RatingBar) findViewById(R.id.ratingBar2);





        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                String rating=String.valueOf(rate.getRating());
                String rating2=String.valueOf(rate2.getRating());
                message = editText.getText().toString();


                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"kapil13046@iiitd.ac.in"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FeedBack");
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_TEXT, message+ " \n Application Rating :"+rating +" \n Service Rating :"+rating2);
                startActivity(emailIntent);


            }
        });





    }



    protected void onPause() {
        super.onPause();

        finish();
    }


}






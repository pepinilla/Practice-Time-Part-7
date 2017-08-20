package com.example.carolina.practicetime;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by carolina on 20/07/17.
 */

public class DisplayMessage {

    TextView textView;
    EditText editText;

    public void displayMessage(String message, Context context, TextView textView){
        if (!message.isEmpty() && context != null && textView != null){
            textView.setText(message);
        }

    }

    public String getMessage(String message, Context context, EditText editText){
        if (!message.isEmpty() && context != null && editText != null){
            editText.getText().toString();
        }
        return message;
    }

}

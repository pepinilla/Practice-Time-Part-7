package com.example.carolina.practicetime;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;

import com.example.carolina.practicetime.PrimerActividad.Firstlist.DataBase;
import com.example.carolina.practicetime.PrimerActividad.Firstlist.DataBaseHelper;
import com.example.carolina.practicetime.PrimerActividad.SecondList.FindDB;

import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.list_view)
    ListView listView;
    @BindView(R.id.buttonNext)
    Button buttonNext;
    @BindView(R.id.autoComplete)
    AutoCompleteTextView autoCompleteTextView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    public static final String INSTANCE = "Welcome to our second activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        List<DataBaseHelper> list;
        list = DataBase.getINSTANCE().getList();

        ArrayAdapter<DataBaseHelper> adapter = new ArrayAdapter<DataBaseHelper>(
                this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        setSupportActionBar(toolbar);
        toolbar.setTitle("First Activity");

        List<String> list2;
        list2 = FindDB.getINSTANCE().getKeyList();
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list2);
        autoCompleteTextView.setAdapter(adapter2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.next:
                onViewClicked();
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onViewClicked() {
       // DisplayMessage message = new DisplayMessage();

        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("message", INSTANCE); //message.getMessage(editText.getText().toString(), this, editText));
        startActivity(intent);
    }

    @OnClick(R.id.buttonNext)
    public void onFindClick(){
        hideKeyboard();
//        String name = autoCompleteTextView.getText().toString();
//        if (!name.isEmpty()){
//
//
//        }

    }

    public void hideKeyboard(){
        InputMethodManager inputMethodManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }
}

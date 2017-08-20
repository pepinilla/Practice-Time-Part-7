package com.example.carolina.practicetime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.carolina.practicetime.PrimerActividad.SecondList.FindDB;
import com.example.carolina.practicetime.PrimerActividad.SecondList.FindDBHelper;
import com.example.carolina.practicetime.SegundaActividad.CustomAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.list_view2)
    ListView listView2;
    @BindView(R.id.buttonNext2)
    Button buttonNext2;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    List<FindDBHelper> list = FindDB.getINSTANCE().getValuesList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        String s;
        if (bundle != null) {
            s = bundle.getString("message");
            textView.setText(s);
        }
        setSupportActionBar(toolbar);
        toolbar.setTitle("First Activity");

        CustomAdapter adapter = new CustomAdapter(this, list);
        listView2.setAdapter(adapter);
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
    @OnClick(R.id.buttonNext2)
    public void onViewClicked() {

    }

}



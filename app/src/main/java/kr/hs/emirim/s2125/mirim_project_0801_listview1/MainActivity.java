package kr.hs.emirim.s2125.mirim_project_0801_listview1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] items = {"왜 오수재인가?", "닥터로이어", "이상한변호사 우영우",
                    "굿닥터", "종이의 집", "환혼", "외계인", "탑건","헌트","가쉽걸", "스팬서"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listv = findViewById(R.id.listv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, items);
        listv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder dlg= new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("선택한 시리즈 및 영화");
                dlg.setMessage(items[i]+" 선택하셨습니다. :)");
                dlg.show();
            }
        });
    }
}
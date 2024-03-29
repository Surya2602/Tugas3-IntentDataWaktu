package com.example.lenovo.intentdatajam;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText inputan1;
    private Button btnH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inputan1 = findViewById(R.id.input_jarak);
        btnH = findViewById(R.id.btn_hitung);

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int menit = 60;
                final String inp1 = inputan1.getText().toString().trim();
                Integer in1 = toInt(inp1);

                Integer hasil = Integer.parseInt(inp1)*menit;
                Intent intent = new Intent();
                intent.setData(Uri.parse(String.valueOf(hasil)));
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    private Integer toInt(String str) {
        try {
            return Integer.parseInt(str);
        }catch (Exception e){
            return null;
        }
    }
}

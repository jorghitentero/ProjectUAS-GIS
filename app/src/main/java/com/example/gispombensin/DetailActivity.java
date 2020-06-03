package com.example.gispombensin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
        TextView datanama,dataalamat,datajambuka;
        Button btnvisit;
        ImageView datagambar;
        public static String id,nama,alamat,jambuka,gambar;
        public static Double latitude,longitude;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        datanama=findViewById(R.id.tv_nama);
        dataalamat=findViewById(R.id.tv_alamat);
        datajambuka=findViewById(R.id.tv_jam);
        btnvisit=findViewById(R.id.btn_kunjungi);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datajambuka.setText(jambuka);
        Picasso.get().load(gambar).into(datagambar);

        btnvisit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent visit = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +alamat));
        startActivity(visit);
    }
}

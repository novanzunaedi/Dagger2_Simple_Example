package id.co.noz.simple.dagger2.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import id.co.noz.simple.dagger2.MyApp;
import id.co.noz.simple.dagger2.R;
import id.co.noz.simple.dagger2.model.ObjectManager;
import id.co.noz.simple.dagger2.entities.Siswa;

public class MainActivity extends AppCompatActivity {

    @Inject
    ObjectManager objectManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp.app().basicComponent().inject(this);

        Siswa siswa = new Siswa();

        siswa.setId("1");
        siswa.setNama("Simone Inzaghi");
        siswa.setAlamat("Jakarta");
        siswa.setNoTelpon("08737374782");

        // Save to SharedPreference
        objectManager.save(siswa, "siswa");

        // Get From SharedPreference
        objectManager.get("siswa", Siswa.class);


        List<Siswa> dSiswa = Collections.singletonList(objectManager.get("siswa", Siswa.class));
        System.out.println("DATA NAMA " + dSiswa.get(0).getNama());
        System.out.println("DATA ALAMAT " + objectManager.get("siswa", Siswa.class).getAlamat());
        System.out.println("DATA NOTELP " + objectManager.get("siswa", Siswa.class).getNoTelpon());

    }
}



























package younes.mypremierApinAndroidStudiod;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class reserver_voiture extends AppCompatActivity {
    TextView reservation,voiture_reserver,textAfficher,voiture_res;
    EditText saisir_info,saisir_email,saisir_pays,edt_num,edt_emploi,saisir_commentaire;
    Button btn_date_sortie,btn_date_retour,btn_enregistrer,btn_quitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserver_voiture);
        reservation=findViewById(R.id.reservation);
        voiture_reserver=findViewById(R.id.voiture_reserver);
        textAfficher=findViewById(R.id.textAfficher);
        saisir_info=findViewById(R.id.saisir_info);
        saisir_email=findViewById(R.id.saisir_email);
        saisir_pays=findViewById(R.id.saisir_pays);
        edt_num=findViewById(R.id.edt_num);
        edt_emploi=findViewById(R.id.edt_emploi);
        voiture_res=findViewById(R.id.voiture_res);
        saisir_commentaire=findViewById(R.id.saisir_commentaire);
        btn_date_sortie=findViewById(R.id.btn_date_sortie);
        btn_date_retour=findViewById(R.id.btn_date_retour);
        btn_enregistrer=findViewById(R.id.btn_enregistrer);
        btn_quitter=findViewById(R.id.btn_quitter);
        textAfficher.setVisibility(View.GONE);
        voiture_reserver = findViewById(R.id.voiture_reserver);
        Intent intent = getIntent();
        String marque = intent.getStringExtra("marque");
        if (marque != null) {
            voiture_res.setText(  marque);
        } else {
            voiture_res.setText("Marque non spécifiée");
        }

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(reserver_voiture.this,
                        MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        btn_enregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAfficher.setVisibility(View.VISIBLE);
            }
        });
        TextWatcher watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int debut, int n, int long2) {}
            @Override
            public void onTextChanged(CharSequence s, int debut, int long1, int m) {
                String text1 = saisir_info.getText().toString().trim();
                String text2 = saisir_email.getText().toString().trim();
                String text3 = saisir_pays.getText().toString().trim();
                String text4 = edt_num.getText().toString().trim();
                String text5 = edt_emploi.getText().toString().trim();

                btn_enregistrer.setEnabled(!text1.isEmpty() && !text2.isEmpty() &&
                        !text3.isEmpty() && !text4.isEmpty() && !text5.isEmpty());
            }
            @Override
            public void afterTextChanged(Editable s) {}
        };
        saisir_info.addTextChangedListener(watcher);
        saisir_email.addTextChangedListener(watcher);
        saisir_pays.addTextChangedListener(watcher);
        edt_num.addTextChangedListener(watcher);
        edt_emploi.addTextChangedListener(watcher);
        btn_date_sortie.setOnClickListener(v -> showDatePicker(btn_date_sortie));
        btn_date_retour.setOnClickListener(v -> showDatePicker(btn_date_retour));
        }
    public void showDatePicker(Button button) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                (view, year1, month1, dayOfMonth) -> {
                    String selectedDate = dayOfMonth + "/" + (month1 + 1) + "/" + year1;
                    button.setText(selectedDate);},
                year, month, day);
        datePickerDialog.show();}}





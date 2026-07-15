package younes.mypremierApinAndroidStudiod;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class TypeVoiture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_voiture);

        // Trouver les boutons par leur ID
        ImageButton btnMercedes = findViewById(R.id.btnMercedes);
        ImageButton btnRenaut = findViewById(R.id.btnRenaut);
        ImageButton btnPeugeot = findViewById(R.id.btnPeugeot);
        ImageButton btnOpel = findViewById(R.id.btnopel);
        ImageButton btnVolkswagen = findViewById(R.id.btnvolkswagen);
        ImageButton btnDacia = findViewById(R.id.Dacialogo);

        // Ajouter des listeners sur les boutons
        btnMercedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListeVoitures("Mercedes");
            }
        });

        btnRenaut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListeVoitures("Renault");
            }
        });

        btnPeugeot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListeVoitures("Peugeot");
            }
        });

        btnOpel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListeVoitures("Opel");
            }
        });

        btnVolkswagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListeVoitures("Volkswagen");
            }
        });

        btnDacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListeVoitures("Dacia");
            }
        });
    }

    // Méthode pour ouvrir la liste des voitures selon la marque
    private void openListeVoitures(String marque) {
        Intent intent = new Intent(TypeVoiture.this, Listevoitures.class);
        intent.putExtra("marque", marque);
        startActivity(intent);
    }
}

package younes.mypremierApinAndroidStudiod;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Detailvoiture extends AppCompatActivity {
    ImageView imagev;
    Button btn_reserver,btn_routeur;
    TextView marqv, modv, prixv, optionsv;
    int[][] images = {
            {R.drawable.mercedes, R.drawable.ic_mercedes, R.drawable.mercedesclassea},
            {R.drawable.renaultclio, R.drawable.renaultmegane, R.drawable.renaultcaptur},
            {R.drawable.peugeot208, R.drawable.peugeot, R.drawable.peugeot2008},
            {R.drawable.opelastra, R.drawable.opelcorsa, R.drawable.opelgrandland},
            {R.drawable.volkswagengolf, R.drawable.volkswagenpolo, R.drawable.
                    volkswagentiguan},
            {R.drawable.daciasandero, R.drawable.dacialodgy, R.drawable.daciaduster}
    };

    String[][] models = {
            {"Mercedes A-Class", "Mercedes E-Class", "Mercedes S-Class"},
            {"Renault Clio", "Renault Megane", "Renault Captur"},
            {"Peugeot 208", "Peugeot 3008", "Peugeot 5008"},
            {"Opel Astra", "Opel Corsa", "Opel Grandland"},
            {"Volkswagen Golf", "Volkswagen Polo", "Volkswagen Tiguan"},
            {"Dacia Sandero", "Dacia Logan", "Dacia Duster"}
    };

    String[][] prices = {
            {"1200 Dhs", "1500 Dhs", "2000 Dhs"},
            {"1000 Dhs", "1200 Dhs", "1400 Dhs"},
            {"800 Dhs", "1000 Dhs", "1200 Dhs"},
            {"700 Dhs", "900 Dhs", "1100 Dhs"},
            {"1100 Dhs", "1300 Dhs", "1500 Dhs"},
            {"600 Dhs", "800 Dhs", "1000 Dhs"}
    };

    String[][] options = {
            {"AirBag, Clim, Régulateur de vitesse", "AirBag, Clim, GPS", "AirBag, Clim, " +
                    "Toit ouvrant"},
            {"AirBag, Clim, Abs", "AirBag, Clim, GPS", "AirBag, Clim, Sièges chauffants"},
            {"AirBag, Clim, Régulateur de vitesse", "AirBag, Clim, Caméra de recul", "AirBag, " +
                    "Clim, Toit ouvrant"},
            {"AirBag, Clim, Abs", "AirBag, Clim, GPS", "AirBag, Clim, Régulateur de vitesse"},
            {"AirBag, Clim, Régulateur de vitesse", "AirBag, Clim, Abs", "AirBag, Clim, " +
                    "Toit ouvrant"},
            {"AirBag, Clim, Abs", "AirBag, Clim, GPS", "AirBag, Clim, Caméra de recul"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_des_voiture);

        imagev = findViewById(R.id.image);
        marqv = findViewById(R.id.marque);
        modv = findViewById(R.id.modele);
        prixv = findViewById(R.id.prix);
        optionsv = findViewById(R.id.options);
        btn_reserver = findViewById(R.id.btn_reserver);
        btn_routeur=findViewById(R.id.btn_routeur);
        // Récupérer les données envoyées par l'intent
        Intent intent = getIntent();
        String marque = intent.getStringExtra("marque");
        int position = intent.getIntExtra("position", 0);

        // Associer les marques à leurs indices
        String[] marques = {"Mercedes", "Renault", "Peugeot", "Opel", "Volkswagen", "Dacia"};
        int marqueIndex = -1;

        for (int i = 0; i < marques.length; i++) {
            if (marques[i].equals(marque)) {
                marqueIndex = i;
                break;
            }
        }if (marqueIndex != -1) {
            imagev.setImageResource(images[marqueIndex][position]);
            marqv.setText(marque);
            modv.setText(models[marqueIndex][position]);
            prixv.setText(prices[marqueIndex][position]);
            optionsv.setText(options[marqueIndex][position]);
        }
        btn_reserver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detailvoiture.this, reserver_voiture.
                        class);
                intent.putExtra("marque", marqv.getText().toString());
                startActivity(intent);
            }
        });
        btn_routeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detailvoiture.this, Listevoitures.class);
                startActivity(intent);
                finish();}});}}

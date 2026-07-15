package younes.mypremierApinAndroidStudiod;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
public class Listevoitures extends AppCompatActivity {
    ListView listev;
    String[] mercedes = {"Mercedes A-Class", "Mercedes E-Class", "Mercedes S-Class"};
    String[] renault = {"Renault Clio", "Renault Megane", "Renault Captur"};
    String[] peugeot = {"Peugeot 208", "Peugeot 3008", "Peugeot 5008"};
    String[] opel = {"Opel Astra", "Opel Corsa", "Opel Grandland"};
    String[] volkswagen = {"Volkswagen Golf", "Volkswagen Polo", "Volkswagen Tiguan"};
    String[] dacia = {"Dacia Sandero", "Dacia Logan", "Dacia Duster"};
    String[] marque;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_voiture);
        Intent intent = getIntent();
        String selectedMarque = intent.getStringExtra("marque");
        if ("Mercedes".equals(selectedMarque)) {
            marque = mercedes;
        } else if ("Renault".equals(selectedMarque)) {
            marque = renault;
        } else if ("Peugeot".equals(selectedMarque)) {
            marque = peugeot;
        } else if ("Opel".equals(selectedMarque)) {
            marque = opel;
        } else if ("Volkswagen".equals(selectedMarque)) {
            marque = volkswagen;
        } else if ("Dacia".equals(selectedMarque)) {
            marque = dacia;
        }
        listev = findViewById(R.id.liste);
        ListAdapter listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, marque);
        listev.setAdapter(listAdapter);
        listev.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent detailIntent = new Intent(Listevoitures.this,
                        Detailvoiture.class);
                detailIntent.putExtra("marque", selectedMarque);
                detailIntent.putExtra("position", position);
                startActivity(detailIntent);
            }
        });
    }
}

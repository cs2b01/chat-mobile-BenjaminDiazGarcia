package cs2901.utec.chat_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts2);

        TextView TituloDeContactos = (TextView) findViewById(R.id.TituloDeContactos);
        String username = getIntent().getStringExtra("username");
        String title = "Contactos de " + username;
        TituloDeContactos.setText(title);

        ArrayList<String> lista_de_contactos = getIntent().getStringArrayListExtra("contactos");
        View contactsLayout = findViewById(R.id.loginLayout);

        for (int i = 0; i < lista_de_contactos.size(); i++){
            final TextView contactos = new TextView(this);
            contactos.setText(lista_de_contactos.get(i));
            contactos.setTextSize(30);
            contactos.setGravity(Gravity.CENTER);
            contactos.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            ((LinearLayout) contactsLayout).addView(contactos);
        }
    }
}

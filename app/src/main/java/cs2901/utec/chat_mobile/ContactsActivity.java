package cs2901.utec.chat_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts2);

        TextView TituloDeContactos = (TextView) findViewById(R.id.TituloDeContactos);
        String username = getIntent().getStringExtra("username");
        String title = "Contactos de " + username;
        TituloDeContactos.setText(title);

    }
}

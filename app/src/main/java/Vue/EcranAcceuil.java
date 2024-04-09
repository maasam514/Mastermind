package Vue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mastermind.R;

public class EcranAcceuil extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ecran_acceuil);


        Button btnJouer = findViewById(R.id.btnJouer);
        btnJouer.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        Intent versJeu = new Intent(this,EcranJeu.class);
        startActivity(versJeu);
    }
}
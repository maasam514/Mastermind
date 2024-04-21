package Vue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        btnJouer.setOnClickListener(this);

        Button btnParam = findViewById(R.id.btnParam);
        btnParam.setOnClickListener(this);

        Button btnHist = findViewById(R.id.btnHist);
        btnHist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int btnJouerId = R.id.btnJouer;
        final int btnParamId = R.id.btnParam;
        final int btnHistId = R.id.btnHist;

        int viewId = v.getId();

        if (viewId == btnJouerId && isEmailEntered()) {
            startActivity(new Intent(EcranAcceuil.this, EcranJeu.class));
        } else if (viewId == btnParamId) {
            startActivity(new Intent(EcranAcceuil.this, EcranConfig.class));
        } else if (viewId == btnHistId) {
            startActivity(new Intent(EcranAcceuil.this, EcranHist.class));
        }
    }

    private boolean isEmailEntered() {
        EditText emailEditText = findViewById(R.id.emailBox);
        String email = emailEditText.getText().toString().trim();
        return !email.isEmpty();
    }

}
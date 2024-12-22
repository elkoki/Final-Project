package com.elkoki.activitiestry;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.elkoki.activitiestry.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.Browser)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
    public void sumar (View view) {
        EditText et1 = findViewById(R.id.editnu1);
        EditText et2 = findViewById(R.id.editnu2);
        TextView et3 = findViewById(R.id.txtvw1);

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());
        int suma = num1 + num2;
        et3.setText(String.valueOf(suma));

    }
    public void restar (View view) {
        EditText et1 = findViewById(R.id.editnu1);
        EditText et2 = findViewById(R.id.editnu2);
        TextView et3 = findViewById(R.id.txtvw1);

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());
        int resta = num1 - num2;
        et3.setText(String.valueOf(resta));

    }

    public void multiplicar (View view) {
        EditText et1 = findViewById(R.id.editnu1);
        EditText et2 = findViewById(R.id.editnu2);
        TextView et3 = findViewById(R.id.txtvw1);

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());
        int multiplica = num1 * num2;
        et3.setText(String.valueOf(multiplica));

    }

    public void dividir (View view) {
        EditText et1 = findViewById(R.id.editnu1);
        EditText et2 = findViewById(R.id.editnu2);
        TextView et3 = findViewById(R.id.txtvw1);

        if (et2.getText().toString().equals("0")) {
            Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
        } else {
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int divide = num1 / num2;
            et3.setText(String.valueOf(divide));
        }
    }

}
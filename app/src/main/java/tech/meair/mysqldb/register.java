package tech.meair.mysqldb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    private EditText etname, etusername, etuserpass;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etname = (EditText) findViewById(R.id.name);
        etusername = (EditText) findViewById(R.id.user_name);
        etuserpass = (EditText) findViewById(R.id.user_pass);
        register = (Button) findViewById(R.id.register_button);

    }

    public void back_to_login(View view) {
        String name = etname.getText().toString().trim();
        String user_name = etusername.getText().toString().trim();
        String user_pass = etuserpass.getText().toString().trim();
        String method = "register";
        backgroundtask bt = new backgroundtask(this);
        bt.execute(method,name,user_name,user_pass);
        finish();
    }
}

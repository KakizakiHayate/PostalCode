package jp.ac.jec.cm0110.postalcode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private EditText edtYubin;
    private Button btnSearch;
    private Button btnIntent;
    private TextView txtKen;
    String url = "https://zipcloud.ibsnet.co.jp/api/search?zipcode=";
    RequestQueue queue;
    private TextView txtSi;
    private TextView txtArea;
    private TextView txtKanaKen;
    private TextView txtKanaSi;
    private TextView txtKanaArea;
    private String ken;
//    private pastalCodeDatabase pd;
    private Activity activity;
//    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
//    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtYubin = findViewById(R.id.edtYubin);
        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new ClickEvent());
        txtKen = findViewById(R.id.txtResult);
        queue = Volley.newRequestQueue(this);
        txtSi = findViewById(R.id.txtSi);
        txtArea = findViewById(R.id.txtArea2);
        txtKanaKen = findViewById(R.id.txtKanaKen);
        txtKanaSi = findViewById(R.id.txtKanaSi);
        txtKanaArea = findViewById(R.id.txtKanaArea);
        btnIntent = findViewById(R.id.btnIntent);
//        btnIntent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplication(),logActivity.class);
//                startActivity(intent);
//            }
//        });
//         pd = AppDatabaseSingleton.getInstance(getApplicationContext());


    }

//    public void onCickEvent(View view) {
//
//            Intent intent = new Intent(this, mapActivity.class);
//            EditText editText = (EditText) findViewById(R.id.edtText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//
//
//    }

    public class ClickEvent implements View.OnClickListener {

        String sbSentence = "";

        @Override
        public void onClick(View view) {

            String edtStr = edtYubin.getText().toString();
            String urlString = url + edtStr;

            edtYubin.setText("");

            StringRequest stringRequest = new StringRequest(Request.Method.GET, urlString,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                            sbSentence = response.substring(0,response.length());
                            Log.i("android1044","sbSentence:" + sbSentence);

                            try {
                                JSONObject jsonobj = new JSONObject(sbSentence.toString());
                                JSONArray jsonArray = jsonobj.getJSONArray("results");
                                JSONObject jsonJusyo = jsonArray.getJSONObject(0);
                                 ken = jsonJusyo.getString("address1");
                                String si = jsonJusyo.getString("address2");
                                String area = jsonJusyo.getString("address3");
                                String kanaKen = jsonJusyo.getString("kana1");
                                String kanaSi = jsonJusyo.getString("kana2");
                                String kanaArea = jsonJusyo.getString("kana3");
                                txtKen.setText("都道府県：" + ken);
                                txtSi.setText("市：" + si);
                                txtArea.setText("地域：" + area);
                                txtKanaKen.setText(kanaKen);
                                txtKanaSi.setText(kanaSi);
                                txtKanaArea.setText(kanaArea);

                                Log.i("android101010010", "textGet" + edtStr + ken + si + area);
//                                logActivity la = new logActivity();
//                                la.logActivity(edtStr ,ken,si,area);

//                                new logActivity.DataStoreAsyncTask(pd ,MainActivity.this ,edtStr ,ken ,si ,area).execute();


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                }

            });
            //ここでリクエストしている
                queue.add(stringRequest);
                Log.i("android104","queue::::::" + stringRequest);

//                ArrayList<String> logList = new ArrayList<>();
//                logList.add(txtKen.getText().toString());
//                logList.add(txtSi.getText().toString());
//                logList.add(txtArea.getText().toString());
//
//                Intent intent = new Intent(getApplication(),logActivity.class);
//                intent.putStringArrayListExtra("jp.ac.jec.cm0110.postalcode",logList);
//                startActivity(intent);

        }


        }

    
    }

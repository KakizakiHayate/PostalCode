//package jp.ac.jec.cm0110.postalcode;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.TextView;
//
//import org.w3c.dom.Text;
//
//import java.lang.ref.WeakReference;
//import java.text.BreakIterator;
//import java.util.Arrays;
//import java.util.List;
//
//public class logActivity extends AppCompatActivity{
//    private String pastalCode;
//    private String prefecture = "b";
//    private String city;
//    private String area;
//    private TextView txtPrefecture;
//
////
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_log);
//
//
//        txtPrefecture = findViewById(R.id.txtPrefecture);
//        TextView txtCity = findViewById(R.id.txtCity);
//        TextView txtArea = findViewById(R.id.txtArea2);
////        DataStoreAsyncTask da = new DataStoreAsyncTask();
////        String prefStr = da.prefecture;
////        txtPrefecture.setText(prefStr);
//
//
//
//        pastalCodeDatabase pd = AppDatabaseSingleton.getInstance(getApplicationContext());
//
//
//
//        Intent intent = getIntent();
////        String[] logStr = intent.getStringArrayExtra("jp.ac.jec.cm0110.postalcode");
//        String[] logStr = new String[4];
//        logStr[0] = pastalCode;
//        logStr[1] = prefecture + "県";
//        logStr[2] = city + "市";
//        logStr[3] = area;
//        Log.i(  "android101010010", "log::::" + Arrays.toString(logStr));
//        txtPrefecture.setText(logStr[0]);
//        txtCity.setText(logStr[1]);
//        txtArea.setText(logStr[2]);
//    }
//
//    public void logActivity(String pastalCode,String prefecture,String city, String area) {
//        Log.i("android101010010", "textGet" + pastalCode + prefecture + city + area);
//        this.prefecture = prefecture;
//        city = city;
//        area = area;
//        pastalCode = pastalCode;
//    }
//
//    public logActivity() {
//
//    }
//
//    public static class DataStoreAsyncTask extends AsyncTask<Void, Void, Integer> {
//        private WeakReference<Activity> weakActivity;
//        private pastalCodeDatabase pc;
//        private StringBuilder sb;
//        private String pastalCode;
//        private String prefecture;
//        private String city;
//        private String area;
//
//
//        public DataStoreAsyncTask(pastalCodeDatabase pc, Activity activity,String pastalCode ,String prefecture,String city, String area) {
//            this.pc = pc;
//
//            weakActivity = new WeakReference<>(activity);
//            this.pastalCode = pastalCode;
//            this.prefecture = prefecture;
//            this.city = city;
//            this.area = area;
//            Log.i("android101010010", "textGet::::" + pastalCode + prefecture + city + area);
//
//        }
//
////        public DataStoreAsyncTask() {
////
////        }
//
//        @Override
//        protected Integer doInBackground(Void... voids) {
//            PastalCodeDao pastalCodeDao = pc.pastalCodeDao();
////            Log.i("android101010010", "pastalEntity::::" + pastalCode + prefecture + city + area);
//            pastalCodeDao.insert(new pastalCodeEntity(pastalCode ,prefecture ,city ,area ));
//            sb = new StringBuilder();
//            List<pastalCodeEntity> list = pastalCodeDao.getAll();
//            for (pastalCodeEntity pc: list) {
//                sb.append(pc.getPastalCode()).append(pc.getTerritory()).append(pc.getCity()).append(pc.getArea()).append("\n");
//            }
////            logActivity la = new logActivity();
////            la.txtPrefecture = (TextView)this.prefecture;
////            txtPrefecture.setText(sb.toString());
//
//            return 0;
//        }
//
//        @Override
//        protected void onProgressUpdate(Void... values) {
//
//        }
//
//        @Override
//        protected void onPostExecute(Integer integer) {
//            Activity activity = weakActivity.get();
//            if (activity == null) {
//                return;
//            }
//
//        }
//    }
//
//
//}
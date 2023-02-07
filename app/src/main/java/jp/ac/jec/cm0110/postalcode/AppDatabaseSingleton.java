//package jp.ac.jec.cm0110.postalcode;
//
//import android.content.Context;
//
//import androidx.room.Room;
//
///**
// * シングルトンクラス
// * 公式ドキュメント：シングル プロセスで実行するアプリの場合は、AppDatabase オブジェクトをインスタンス化する際にシングルトン設計パターンに従ってください。
// * 各 RoomDatabase インスタンスは非常に高コストであり、単一のプロセス内で複数のインスタンスにアクセスする必要はほとんどありません。
// */
//public class AppDatabaseSingleton {
//    private static pastalCodeDatabase instance = null;
//
//    public static pastalCodeDatabase getInstance(Context context) {
//        if (instance != null) {
//            return instance;
//        }
//        instance = Room.databaseBuilder(context,
//                pastalCodeDatabase.class, "databese-name").build();
//        return instance;
//    }
//
//
//}

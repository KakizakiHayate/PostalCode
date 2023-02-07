//package jp.ac.jec.cm0110.postalcode;
//
//import androidx.room.Dao;
//import androidx.room.Delete;
//import androidx.room.Insert;
//import androidx.room.Query;
//
//import java.util.List;
//
////Daoクラス
//@Dao
//public interface PastalCodeDao {
//
//    //insert=挿入、Delete=削除、update=更新、Query＝SQLを記述する
//    @Query("SELECT * FROM pastalCodeEntity")
//    List<pastalCodeEntity> getAll();
//
//    @Query("SELECT * FROM pastalCodeEntity WHERE uid IN (:ids)")
//    List<pastalCodeEntity> loadAllByIds(int[] ids);
//
//    @Insert
//    void insertAll(pastalCodeEntity... pastalCodeEntities);
//
//    @Insert
//    void insert(pastalCodeEntity pastalCodeEntity);
//
//
//    @Delete
//    void delete(pastalCodeEntity pastalCodeEntity);
//
//
//
//}

//package jp.ac.jec.cm0110.postalcode;
//
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//import androidx.room.PrimaryKey;
//
//
////データベースの表を示すクラス
//@Entity
//public class pastalCodeEntity {
//        @PrimaryKey(autoGenerate = true)
//        private int uid;
//
//    public int getUid() {
//        return uid;
//    }
//
//    public void setUid(int uid) {
//        this.uid = uid;
//    }
//
//    @ColumnInfo
//        private String pastalCode;
//
//        @ColumnInfo
//        private String territory;
//
//       @ColumnInfo
//        private String city;
//
//        @ColumnInfo
//        private String area;
//
//
//    public pastalCodeEntity( String pastalCode, String territory, String city, String area) {
//        this.pastalCode = pastalCode;
//        this.territory = territory;
//        this.city = city;
//        this.area = area;
//    }
//
//
//    /**
//     * ここからgetter
//     * @return
//     */
//    public String getPastalCode() {
//        return pastalCode;
//    }
//
//    public String getTerritory() {
//        return territory;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getArea() {
//        return area;
//    }
//
//    /**
//     * ここからsetter
//     * @param pastalCode
//     */
//    public void setPastalCode(String pastalCode) {
//        this.pastalCode = pastalCode;
//    }
//
//    public void setTerritory(String territory) {
//        this.territory = territory;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setArea(String area) {
//        this.area = area;
//    }
//}

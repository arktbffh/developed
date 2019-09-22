package id.creatorb.resep;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_Resep extends SQLiteOpenHelper {
	final static String DB_NAME = "objek";

	public DB_Resep(Context context) {
		super(context, DB_NAME, null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "CREATE TABLE IF NOT EXISTS objek(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, ilmiah TEXT, deskripsi TEXT, urlvid TEXT, img BLOB penyakit1 TEXT,penyakit2 TEXT,penyakit3 TEXT,)";
		db.execSQL(sql);

		ContentValues values = new ContentValues();
		values.put("_id", "1");
		values.put("nama", "Anggur");
		values.put("ilmiah", "Vitis Viniera");
		values.put("deskripsi", "anggur pertama kali dikenal di benua Eropa. Sebutan lain anggur dibeberapa Negara diantaranya Grape(Inggris),  Anggur(Melayu), Nho(Vietnam), Angun(Thailand), dan Ubas(Filipina).memiliki kandungan antioksidan tinggi. senyawa antioksidan terbesar dalam anggur adalah senyawa fenol. dalam tiap 100gram buah anggur merah terkandung 14,98 gram senyawa fenol. sementara itu pada anggur hijau mengandung 12,16gram senyawa fenol. senyawa fenol yang terdapat pada anggur berperan aktif dalam proses kerja tubuh, penangkal radikal bebas, dan pencegah terbentuknya sel kanker");
		values.put("urlvid", "Vitis Viniera");
		values.put("img", R.drawable.anggur);
		values.put("penyakit1", "kanker");
		values.put("penyakit2", "jantung");
		values.put("penyakit3", "diabetes");
		db.insert("resep", "_id", values);
		values.put("_id", "2");
		values.put("nama", "Anggur");
		values.put("ilmiah", "Vitis Viniera");
		values.put("deskripsi", "anggur pertama kali dikenal di benua Eropa. Sebutan lain anggur dibeberapa Negara diantaranya Grape(Inggris),  Anggur(Melayu), Nho(Vietnam), Angun(Thailand), dan Ubas(Filipina).memiliki kandungan antioksidan tinggi. senyawa antioksidan terbesar dalam anggur adalah senyawa fenol. dalam tiap 100gram buah anggur merah terkandung 14,98 gram senyawa fenol. sementara itu pada anggur hijau mengandung 12,16gram senyawa fenol. senyawa fenol yang terdapat pada anggur berperan aktif dalam proses kerja tubuh, penangkal radikal bebas, dan pencegah terbentuknya sel kanker");
		values.put("urlvid", "Vitis Viniera");
		values.put("img", R.drawable.apel);
		values.put("penyakit1", "diabetes");
		values.put("penyakit2", "kolesterol");
		values.put("penyakit3", "darah tinggi");
		db.insert("resep", "_id", values);

		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS resep");
		onCreate(db);

	}

}
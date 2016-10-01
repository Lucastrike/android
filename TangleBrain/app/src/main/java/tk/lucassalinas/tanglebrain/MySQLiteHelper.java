package tk.lucassalinas.tanglebrain;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by lucas on 02/05/2016.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "ScoreDB";

    // Score table name
    private static final String TABLE_SCORE = "score";

    // Score Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_SCORE = "score";

    private static final String[] COLUMNS = {KEY_ID,KEY_SCORE};

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL statement to create score table
        String CREATE_SCORE_TABLE = "CREATE TABLE score ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "score TEXT)";

        // create score table
        db.execSQL(CREATE_SCORE_TABLE);


        //Insert data tables
        db.execSQL("INSERT INTO score(score) VALUES ('0')");
        db.execSQL("INSERT INTO score(score) VALUES ('0')");
        db.execSQL("INSERT INTO score(score) VALUES ('0')");
        db.execSQL("INSERT INTO score(score) VALUES ('0')");
        db.execSQL("INSERT INTO score(score) VALUES ('0')");
        db.execSQL("INSERT INTO score(score) VALUES ('0')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older books table if existed
        //db.execSQL("DROP TABLE IF EXISTS score");

        // create fresh books table
        //this.onCreate(db);
    }



    /*public void addScore(Score score){
        //for logging
        Log.d("addScore", score.toString());

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put(KEY_SCORE, score.getScore()); // get score

        // 3. insert
        db.insert(TABLE_SCORE, // table
                null, //nullColumnHack
                values); // key/value -> keys = column names/ values = column values

        // 4. close
        db.close();
    }*/

    public Score getScore(int id){

        // 1. get reference to readable DB
        SQLiteDatabase db = this.getReadableDatabase();

        // 2. build query
        Cursor cursor = db.rawQuery("SELECT id, score FROM score WHERE id=" + id, null);

        // 3. if we got results get the first one
        if (cursor != null)
            cursor.moveToFirst();

        // 4. build book object
        Score score = new Score();
        score.setId(Integer.parseInt(cursor.getString(0)));
        score.setStringScore(cursor.getString(1));

        //log
        Log.d("getScore("+id+")", score.toString());

        // 5. return score
        return score;
    }

    public int updateScore(Score score) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put("score", score.getScore()); // get title

        // 3. updating row
        int i = db.update(TABLE_SCORE, //table
                values, // column/value
                KEY_ID+" = ?", // selections
                new String[] { String.valueOf(score.getId()) }); //selection args

        // 4. close
        db.close();

        return i;
    }
}

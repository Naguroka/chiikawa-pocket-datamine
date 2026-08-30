package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class RoomMasterTable {
    private static final java.lang.String COLUMN_ID = "id";
    private static final java.lang.String COLUMN_IDENTITY_HASH = "identity_hash";
    public static final java.lang.String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    public static final java.lang.String DEFAULT_ID = "42";
    public static final java.lang.String NAME = "room_master_table";
    public static final java.lang.String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";
    public static final java.lang.String TABLE_NAME = "room_master_table";

    public static java.lang.String createInsertQuery(java.lang.String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }

    private RoomMasterTable() {
    }
}

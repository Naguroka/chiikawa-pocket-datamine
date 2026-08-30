package androidx.room.util;

/* JADX INFO: loaded from: classes3.dex */
public class ViewInfo {
    public final java.lang.String name;
    public final java.lang.String sql;

    public ViewInfo(java.lang.String str, java.lang.String str2) {
        this.name = str;
        this.sql = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.room.util.ViewInfo viewInfo = (androidx.room.util.ViewInfo) obj;
        java.lang.String str = this.name;
        if (str == null ? viewInfo.name == null : str.equals(viewInfo.name)) {
            java.lang.String str2 = this.sql;
            if (str2 != null) {
                if (str2.equals(viewInfo.sql)) {
                    return true;
                }
            } else if (viewInfo.sql == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.sql;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }

    public static androidx.room.util.ViewInfo read(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        android.database.Cursor cursorQuery = supportSQLiteDatabase.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + "'");
        try {
            if (cursorQuery.moveToFirst()) {
                return new androidx.room.util.ViewInfo(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return new androidx.room.util.ViewInfo(str, null);
        } finally {
            cursorQuery.close();
        }
    }
}

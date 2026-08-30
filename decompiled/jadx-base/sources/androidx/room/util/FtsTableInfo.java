package androidx.room.util;

/* JADX INFO: loaded from: classes3.dex */
public class FtsTableInfo {
    private static final java.lang.String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final java.util.Set<java.lang.String> columns;
    public final java.lang.String name;
    public final java.util.Set<java.lang.String> options;

    public FtsTableInfo(java.lang.String str, java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) {
        this.name = str;
        this.columns = set;
        this.options = set2;
    }

    public FtsTableInfo(java.lang.String str, java.util.Set<java.lang.String> set, java.lang.String str2) {
        this.name = str;
        this.columns = set;
        this.options = parseOptions(str2);
    }

    public static androidx.room.util.FtsTableInfo read(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        return new androidx.room.util.FtsTableInfo(str, readColumns(supportSQLiteDatabase, str), readOptions(supportSQLiteDatabase, str));
    }

    private static java.util.Set<java.lang.String> readColumns(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        android.database.Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            if (cursorQuery.getColumnCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("name");
                while (cursorQuery.moveToNext()) {
                    hashSet.add(cursorQuery.getString(columnIndex));
                }
            }
            return hashSet;
        } finally {
            cursorQuery.close();
        }
    }

    private static java.util.Set<java.lang.String> readOptions(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        android.database.Cursor cursorQuery = supportSQLiteDatabase.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
        try {
            return parseOptions(cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("sql")) : "");
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[SYNTHETIC] */
    static java.util.Set<java.lang.String> parseOptions(java.lang.String str) {
        if (str.isEmpty()) {
            return new java.util.HashSet();
        }
        java.lang.String strSubstring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        int i = -1;
        for (int i2 = 0; i2 < strSubstring.length(); i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (cCharAt == '\"' || cCharAt == '\'') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(java.lang.Character.valueOf(cCharAt));
                } else if (((java.lang.Character) arrayDeque.peek()).charValue() == cCharAt) {
                    arrayDeque.pop();
                }
            } else if (cCharAt != ',') {
                if (cCharAt != '[') {
                    if (cCharAt != ']') {
                        if (cCharAt == '`') {
                            if (arrayDeque.isEmpty()) {
                                arrayDeque.push(java.lang.Character.valueOf(cCharAt));
                            } else if (((java.lang.Character) arrayDeque.peek()).charValue() == cCharAt) {
                                arrayDeque.pop();
                            }
                        }
                    } else if (!arrayDeque.isEmpty() && ((java.lang.Character) arrayDeque.peek()).charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayDeque.push(java.lang.Character.valueOf(cCharAt));
                }
            } else if (arrayDeque.isEmpty()) {
                arrayList.add(strSubstring.substring(i + 1, i2).trim());
                i = i2;
            }
        }
        arrayList.add(strSubstring.substring(i + 1).trim());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : arrayList) {
            for (java.lang.String str3 : FTS_OPTIONS) {
                if (str2.startsWith(str3)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.room.util.FtsTableInfo ftsTableInfo = (androidx.room.util.FtsTableInfo) obj;
        java.lang.String str = this.name;
        if (str == null ? ftsTableInfo.name != null : !str.equals(ftsTableInfo.name)) {
            return false;
        }
        java.util.Set<java.lang.String> set = this.columns;
        if (set == null ? ftsTableInfo.columns != null : !set.equals(ftsTableInfo.columns)) {
            return false;
        }
        java.util.Set<java.lang.String> set2 = this.options;
        java.util.Set<java.lang.String> set3 = ftsTableInfo.options;
        if (set2 != null) {
            return set2.equals(set3);
        }
        return set3 == null;
    }

    public int hashCode() {
        java.lang.String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.util.Set<java.lang.String> set = this.columns;
        int iHashCode2 = (iHashCode + (set != null ? set.hashCode() : 0)) * 31;
        java.util.Set<java.lang.String> set2 = this.options;
        return iHashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + '}';
    }
}

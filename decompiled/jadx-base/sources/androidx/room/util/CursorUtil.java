package androidx.room.util;

/* JADX INFO: loaded from: classes3.dex */
public class CursorUtil {
    public static android.database.Cursor copyAndClose(android.database.Cursor cursor) {
        try {
            android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                java.lang.Object[] objArr = new java.lang.Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = java.lang.Long.valueOf(cursor.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = java.lang.Double.valueOf(cursor.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor.getBlob(i);
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            cursor.close();
            return matrixCursor;
        } catch (java.lang.Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public static int getColumnIndex(android.database.Cursor cursor, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? columnIndex : cursor.getColumnIndex("`" + str + "`");
    }

    public static int getColumnIndexOrThrow(android.database.Cursor cursor, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? columnIndex : cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    private CursorUtil() {
    }
}

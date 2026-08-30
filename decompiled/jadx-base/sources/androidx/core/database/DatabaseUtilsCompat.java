package androidx.core.database;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class DatabaseUtilsCompat {
    private DatabaseUtilsCompat() {
    }

    @java.lang.Deprecated
    public static java.lang.String concatenateWhere(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        return android.text.TextUtils.isEmpty(str2) ? str : "(" + str + ") AND (" + str2 + ")";
    }

    @java.lang.Deprecated
    public static java.lang.String[] appendSelectionArgs(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length + strArr2.length];
        java.lang.System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        java.lang.System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}

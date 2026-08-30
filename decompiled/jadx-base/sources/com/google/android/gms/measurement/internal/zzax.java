package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzax {
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v2 */
    static void zza(com.google.android.gms.measurement.internal.zzhe zzheVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        if (zzheVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        ?? r14 = 0;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new java.lang.String[]{"name"}, "name=?", new java.lang.String[]{str}, null, null, null);
                try {
                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (!zMoveToFirst) {
                        sQLiteDatabase.execSQL(str2);
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzheVar.zzk().zzc("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r14 = str2;
                if (r14 != 0) {
                    r14.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r14 != 0) {
                r14.close();
            }
            throw th;
        }
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            try {
                java.util.Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                for (java.lang.String str4 : str3.split(",")) {
                    if (!hashSet.remove(str4)) {
                        throw new android.database.sqlite.SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!hashSet.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                zzheVar.zzk().zzc("Table has extra columns. table, columns", str, android.text.TextUtils.join(", ", hashSet));
            } catch (java.lang.Throwable th3) {
                cursorRawQuery.close();
                throw th3;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            zzheVar.zze().zzb("Failed to verify columns on table that was just created", str);
            throw e3;
        }
    }

    static void zzb(com.google.android.gms.measurement.internal.zzhe zzheVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (zzheVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.zzbx.zza();
        java.lang.String path = sQLiteDatabase.getPath();
        int i = com.google.android.gms.internal.measurement.zzcc.zzb;
        java.io.File file = new java.io.File(path);
        if (!file.setReadable(false, false)) {
            zzheVar.zzk().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzheVar.zzk().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzheVar.zzk().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzheVar.zzk().zza("Failed to turn on database write permission for owner");
    }
}

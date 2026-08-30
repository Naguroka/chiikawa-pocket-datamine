package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzebk extends com.google.android.gms.internal.ads.zzfpy {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;

    public zzebk(android.content.Context context, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzik)).intValue(), com.google.android.gms.internal.ads.zzfqa.zza);
        this.zza = context;
        this.zzb = zzgcsVar;
    }

    static /* synthetic */ java.lang.Void zzb(com.google.android.gms.ads.internal.util.client.zzu zzuVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws java.lang.Exception {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    static /* synthetic */ void zzf(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("event_state", (java.lang.Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new java.lang.String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    static final void zzi(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new java.lang.String[]{str, java.lang.Integer.toString(0)});
    }

    private static void zzj(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        java.lang.String str;
        sQLiteDatabase.beginTransaction();
        try {
            android.database.Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new java.lang.String[]{com.ironsource.aa.a.d, "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            java.lang.String[] strArr = new java.lang.String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex(com.ironsource.aa.a.d);
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = cursorQuery.getLong(columnIndex);
                    java.lang.String string = cursorQuery.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        android.net.Uri uri = android.net.Uri.parse(string);
                        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j;
                        java.lang.String encodedQuery = uri.getEncodedQuery();
                        android.net.Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", java.lang.Long.toString(jCurrentTimeMillis));
                        str = java.lang.String.valueOf(builderClearQuery.build()) + com.ironsource.y8.i.c + encodedQuery;
                    }
                    strArr[i] = str;
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new java.lang.String[]{java.lang.Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                zzuVar.zza(strArr[i2]);
            }
        } catch (java.lang.Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final /* synthetic */ java.lang.Void zza(com.google.android.gms.internal.ads.zzebm zzebmVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws java.lang.Exception {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.ironsource.aa.a.d, java.lang.Long.valueOf(zzebmVar.zza));
        contentValues.put("gws_query_id", zzebmVar.zzb);
        contentValues.put("url", zzebmVar.zzc);
        contentValues.put("event_state", java.lang.Integer.valueOf(zzebmVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzbr zzbrVarZzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zza);
        if (zzbrVarZzA != null) {
            try {
                zzbrVarZzA.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final java.lang.String str) {
        zze(new com.google.android.gms.internal.ads.zzffr(this) { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzebk.zzi((android.database.sqlite.SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final com.google.android.gms.internal.ads.zzebm zzebmVar) {
        zze(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) throws java.lang.Exception {
                this.zza.zza(zzebmVar, (android.database.sqlite.SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void zze(com.google.android.gms.internal.ads.zzffr zzffrVar) {
        com.google.android.gms.internal.ads.zzgch.zzr(this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzebg
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new com.google.android.gms.internal.ads.zzebj(this, zzffrVar), this.zzb);
    }

    final void zzg(final android.database.sqlite.SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final java.lang.String str) {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzebh
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzebk.zzf(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzh(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final java.lang.String str) {
        zze(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzebf
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) {
                this.zza.zzg((android.database.sqlite.SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }
}

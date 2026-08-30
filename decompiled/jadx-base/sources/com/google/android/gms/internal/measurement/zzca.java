package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzca extends android.database.sqlite.SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, true == str.equals("") ? null : str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        int i2 = com.google.android.gms.internal.measurement.zzcc.zzb;
        com.google.android.gms.internal.measurement.zzbx.zza();
    }
}

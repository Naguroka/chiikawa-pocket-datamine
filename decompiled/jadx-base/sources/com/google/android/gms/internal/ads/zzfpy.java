package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfpy extends android.database.sqlite.SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpy(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i, com.google.android.gms.internal.ads.zzfqa zzfqaVar) {
        super(context, true == str.equals("") ? null : str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i);
        com.google.android.gms.internal.ads.zzfpu.zza();
    }
}

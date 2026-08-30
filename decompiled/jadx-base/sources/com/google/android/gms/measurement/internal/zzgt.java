package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgt extends com.google.android.gms.internal.measurement.zzca {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgt(com.google.android.gms.measurement.internal.zzgv zzgvVar, android.content.Context context, java.lang.String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        this.zza = zzgvVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() throws android.database.sqlite.SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
            throw e;
        } catch (android.database.sqlite.SQLiteException unused) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zzu;
            zzioVar.zzaW().zze().zza("Opening the local database failed, dropping and recreating it");
            zzioVar.zzf();
            if (!zzioVar.zzaT().getDatabasePath("google_app_measurement_local.db").delete()) {
                zzioVar.zzaW().zze().zzb("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (android.database.sqlite.SQLiteException e2) {
                this.zza.zzu.zzaW().zze().zzb("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.zzax.zzb(this.zza.zzu.zzaW(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws java.lang.Throwable {
        com.google.android.gms.measurement.internal.zzax.zza(this.zza.zzu.zzaW(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", com.google.android.gms.measurement.internal.zzgv.zza);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzau {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzaw zza;
    private final java.lang.String zzb;
    private long zzc;

    public zzau(com.google.android.gms.measurement.internal.zzaw zzawVar, java.lang.String str) {
        this.zza = zzawVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = -1L;
    }

    public final java.util.List zza() {
        java.util.List arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.zza.zzj().query("raw_events", new java.lang.String[]{"rowid", "name", com.ironsource.aa.a.d, "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new java.lang.String[]{this.zzb, java.lang.String.valueOf(this.zzc)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.zzc) {
                            this.zzc = j;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), blob);
                            java.lang.String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhlVar.zzi(string);
                            zzhlVar.zzm(cursorQuery.getLong(2));
                            arrayList.add(new com.google.android.gms.measurement.internal.zzat(j, j2, z, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba()));
                        } catch (java.io.IOException e) {
                            this.zza.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(this.zzb), e);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = java.util.Collections.emptyList();
                }
            } catch (android.database.sqlite.SQLiteException e2) {
                this.zza.zzu.zzaW().zze().zzc("Data loss. Error querying raw events batch. appId", com.google.android.gms.measurement.internal.zzhe.zzn(this.zzb), e2);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public zzau(com.google.android.gms.measurement.internal.zzaw zzawVar, java.lang.String str, long j) {
        this.zza = zzawVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = zzawVar.zzaz("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new java.lang.String[]{str, java.lang.String.valueOf(j)}, -1L);
    }
}

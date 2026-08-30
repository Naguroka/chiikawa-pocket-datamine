package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhq {
    final java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final long zze;

    /* synthetic */ zzhq(com.google.android.gms.measurement.internal.zzht zzhtVar, java.lang.String str, long j, com.google.android.gms.measurement.internal.zzhs zzhsVar) {
        this.zzb = zzhtVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("health_monitor");
        com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j;
    }

    private final long zzc() {
        return this.zzb.zzb().getLong(this.zza, 0L);
    }

    private final void zzd() {
        com.google.android.gms.measurement.internal.zzht zzhtVar = this.zzb;
        zzhtVar.zzg();
        long jCurrentTimeMillis = zzhtVar.zzu.zzaU().currentTimeMillis();
        android.content.SharedPreferences.Editor editorEdit = zzhtVar.zzb().edit();
        editorEdit.remove(this.zzc);
        editorEdit.remove(this.zzd);
        editorEdit.putLong(this.zza, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public final android.util.Pair zza() {
        long jAbs;
        com.google.android.gms.measurement.internal.zzht zzhtVar = this.zzb;
        zzhtVar.zzg();
        zzhtVar.zzg();
        long jZzc = zzc();
        if (jZzc == 0) {
            zzd();
            jAbs = 0;
        } else {
            jAbs = java.lang.Math.abs(jZzc - zzhtVar.zzu.zzaU().currentTimeMillis());
        }
        long j = this.zze;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > j + j) {
            zzd();
            return null;
        }
        java.lang.String string = zzhtVar.zzb().getString(this.zzd, null);
        long j2 = zzhtVar.zzb().getLong(this.zzc, 0L);
        zzd();
        return (string == null || j2 <= 0) ? com.google.android.gms.measurement.internal.zzht.zza : new android.util.Pair(string, java.lang.Long.valueOf(j2));
    }

    public final void zzb(java.lang.String str, long j) {
        com.google.android.gms.measurement.internal.zzht zzhtVar = this.zzb;
        zzhtVar.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        android.content.SharedPreferences sharedPreferencesZzb = zzhtVar.zzb();
        java.lang.String str2 = this.zzc;
        long j2 = sharedPreferencesZzb.getLong(str2, 0L);
        if (j2 <= 0) {
            android.content.SharedPreferences.Editor editorEdit = zzhtVar.zzb().edit();
            editorEdit.putString(this.zzd, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = zzhtVar.zzu.zzw().zzJ().nextLong() & Long.MAX_VALUE;
        long j3 = j2 + 1;
        long j4 = Long.MAX_VALUE / j3;
        android.content.SharedPreferences.Editor editorEdit2 = zzhtVar.zzb().edit();
        if (jNextLong < j4) {
            editorEdit2.putString(this.zzd, str);
        }
        editorEdit2.putLong(str2, j3);
        editorEdit2.apply();
    }
}

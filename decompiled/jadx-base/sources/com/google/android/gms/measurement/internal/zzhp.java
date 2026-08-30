package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhp {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhp(com.google.android.gms.measurement.internal.zzht zzhtVar, java.lang.String str, long j) {
        this.zza = zzhtVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            com.google.android.gms.measurement.internal.zzht zzhtVar = this.zza;
            this.zze = zzhtVar.zzb().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j) {
        android.content.SharedPreferences.Editor editorEdit = this.zza.zzb().edit();
        editorEdit.putLong(this.zzb, j);
        editorEdit.apply();
        this.zze = j;
    }
}

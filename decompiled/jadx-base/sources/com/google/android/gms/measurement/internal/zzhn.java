package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhn {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzhn(com.google.android.gms.measurement.internal.zzht zzhtVar, java.lang.String str, boolean z) {
        this.zza = zzhtVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z;
    }

    public final void zza(boolean z) {
        android.content.SharedPreferences.Editor editorEdit = this.zza.zzb().edit();
        editorEdit.putBoolean(this.zzb, z);
        editorEdit.apply();
        this.zze = z;
    }

    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            com.google.android.gms.measurement.internal.zzht zzhtVar = this.zza;
            this.zze = zzhtVar.zzb().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}

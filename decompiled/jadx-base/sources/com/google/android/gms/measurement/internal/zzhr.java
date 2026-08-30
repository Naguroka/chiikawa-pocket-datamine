package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhr {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private boolean zzc;
    private java.lang.String zzd;

    public zzhr(com.google.android.gms.measurement.internal.zzht zzhtVar, java.lang.String str, java.lang.String str2) {
        this.zza = zzhtVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
    }

    public final java.lang.String zza() {
        if (!this.zzc) {
            this.zzc = true;
            com.google.android.gms.measurement.internal.zzht zzhtVar = this.zza;
            this.zzd = zzhtVar.zzb().getString(this.zzb, null);
        }
        return this.zzd;
    }

    public final void zzb(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = this.zza.zzb().edit();
        editorEdit.putString(this.zzb, str);
        editorEdit.apply();
        this.zzd = str;
    }
}

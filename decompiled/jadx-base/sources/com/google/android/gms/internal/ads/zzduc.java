package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzduc implements com.google.android.gms.internal.ads.zzdct {
    private final android.os.Bundle zza = new android.os.Bundle();

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zza(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzb(java.lang.String str, java.lang.String str2) {
        this.zza.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzc(java.lang.String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzd(java.lang.String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzf() {
    }

    public final synchronized android.os.Bundle zzg() {
        return new android.os.Bundle(this.zza);
    }
}

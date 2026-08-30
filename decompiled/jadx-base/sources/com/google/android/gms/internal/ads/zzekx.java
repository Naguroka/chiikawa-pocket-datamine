package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzekx implements com.google.android.gms.internal.ads.zzelc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeky zza;

    zzekx(com.google.android.gms.internal.ads.zzeky zzekyVar) {
        this.zza = zzekyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcqz zzcqzVar = (com.google.android.gms.internal.ads.zzcqz) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcqzVar.zzm();
            zzcqzVar.zzk();
        }
    }
}

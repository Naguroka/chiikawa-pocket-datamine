package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeku implements com.google.android.gms.internal.ads.zzelc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzekv zza;

    zzeku(com.google.android.gms.internal.ads.zzekv zzekvVar) {
        this.zza = zzekvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzdeq zzdeqVar = (com.google.android.gms.internal.ads.zzdeq) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdeqVar;
            this.zza.zzj.zzk();
        }
    }
}

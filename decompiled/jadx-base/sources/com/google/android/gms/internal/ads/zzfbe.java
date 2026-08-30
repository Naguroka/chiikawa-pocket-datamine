package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfbe implements com.google.android.gms.internal.ads.zzelc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbf zza;

    zzfbe(com.google.android.gms.internal.ads.zzfbf zzfbfVar) {
        this.zza = zzfbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzdoa zzdoaVar = (com.google.android.gms.internal.ads.zzdoa) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdoaVar;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdF)).booleanValue()) {
                zzdoaVar.zzd().zza = this.zza.zzd;
            }
            this.zza.zzi.zzk();
        }
    }
}

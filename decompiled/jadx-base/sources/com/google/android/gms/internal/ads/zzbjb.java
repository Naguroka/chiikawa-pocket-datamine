package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjb implements com.google.android.gms.internal.ads.zzbjp {
    zzbjb() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        try {
            com.google.android.gms.internal.ads.zzfre.zzj(zzcexVar.getContext()).zzk();
            com.google.android.gms.internal.ads.zzfrf.zzi(zzcexVar.getContext()).zzj();
            com.google.android.gms.internal.ads.zzfrg.zza(zzcexVar.getContext()).zzb(null);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}

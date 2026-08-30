package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjc implements com.google.android.gms.internal.ads.zzbjp {
    zzbjc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        try {
            java.lang.String str = (java.lang.String) map.get("enabled");
            if (!com.google.android.gms.internal.ads.zzftt.zzc(com.json.mediationsdk.metadata.a.g, str) && !com.google.android.gms.internal.ads.zzftt.zzc("false", str)) {
                return;
            }
            com.google.android.gms.internal.ads.zzfrb.zza(zzcexVar.getContext()).zzb(java.lang.Boolean.parseBoolean(str));
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}

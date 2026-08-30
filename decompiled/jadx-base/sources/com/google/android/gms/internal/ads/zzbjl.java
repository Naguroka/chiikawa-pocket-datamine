package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjl implements com.google.android.gms.internal.ads.zzbjp {
    zzbjl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if ("pause".equals(str)) {
            zzcexVar.zzde();
        } else if ("resume".equals(str)) {
            zzcexVar.zzdf();
        }
    }
}

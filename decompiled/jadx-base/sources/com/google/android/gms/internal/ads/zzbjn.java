package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjn implements com.google.android.gms.internal.ads.zzbjp {
    zzbjn() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        if (map.keySet().contains(androidx.media3.extractor.text.ttml.TtmlNode.START)) {
            zzcexVar.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzcexVar.zzax(false);
        }
    }
}

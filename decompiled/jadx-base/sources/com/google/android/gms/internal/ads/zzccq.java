package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzccq implements com.google.android.gms.internal.ads.zzbjp {
    private final java.util.function.Consumer zza;

    public zzccq(java.util.function.Consumer consumer) {
        this.zza = consumer;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            java.lang.String str2 = (java.lang.String) map.get("src");
            if (str2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("src missing from video GMSG.");
            } else {
                this.zza.accept(str2);
            }
        }
    }
}

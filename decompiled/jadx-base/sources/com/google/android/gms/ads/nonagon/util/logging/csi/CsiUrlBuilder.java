package com.google.android.gms.ads.nonagon.util.logging.csi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class CsiUrlBuilder {
    private final java.lang.String zza = (java.lang.String) com.google.android.gms.internal.ads.zzbef.zza.zze();

    public java.lang.String generateUrl(java.util.Map<java.lang.String, java.lang.String> map) {
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(this.zza).buildUpon();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}

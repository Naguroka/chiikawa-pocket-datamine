package com.google.android.gms.ads.identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza extends java.lang.Thread {
    final /* synthetic */ java.util.Map zza;

    zza(com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient, java.util.Map map) {
        this.zza = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.util.Map map = this.zza;
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (java.lang.String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (java.lang.String) map.get(str));
        }
        com.google.android.gms.ads.identifier.zzc.zza(builderBuildUpon.build().toString());
    }
}

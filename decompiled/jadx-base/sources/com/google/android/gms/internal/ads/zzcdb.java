package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcdb implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcde zzd;

    zzcdb(com.google.android.gms.internal.ads.zzcde zzcdeVar, java.lang.String str, java.lang.String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("totalBytes", java.lang.Integer.toString(this.zzc));
        com.google.android.gms.internal.ads.zzcde.zze(this.zzd, "onPrecacheEvent", map);
    }
}

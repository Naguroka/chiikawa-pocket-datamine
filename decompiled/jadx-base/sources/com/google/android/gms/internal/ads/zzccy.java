package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzccy implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcde zze;

    zzccy(com.google.android.gms.internal.ads.zzcde zzcdeVar, java.lang.String str, java.lang.String str2, int i, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bytesLoaded", java.lang.Integer.toString(this.zzc));
        map.put("totalBytes", java.lang.Integer.toString(this.zzd));
        map.put("cacheReady", "0");
        com.google.android.gms.internal.ads.zzcde.zze(this.zze, "onPrecacheEvent", map);
    }
}

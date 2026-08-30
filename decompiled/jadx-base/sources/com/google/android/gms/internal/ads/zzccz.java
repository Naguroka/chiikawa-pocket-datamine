package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzccz implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcde zzk;

    zzccz(com.google.android.gms.internal.ads.zzcde zzcdeVar, java.lang.String str, java.lang.String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z;
        this.zzi = i;
        this.zzj = i2;
        this.zzk = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bufferedDuration", java.lang.Long.toString(this.zzc));
        map.put("totalDuration", java.lang.Long.toString(this.zzd));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue()) {
            map.put("qoeLoadedBytes", java.lang.Long.toString(this.zze));
            map.put("qoeCachedBytes", java.lang.Long.toString(this.zzf));
            map.put("totalBytes", java.lang.Long.toString(this.zzg));
            map.put("reportTime", java.lang.Long.toString(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        }
        map.put("cacheReady", true != this.zzh ? "0" : "1");
        map.put("playerCount", java.lang.Integer.toString(this.zzi));
        map.put("playerPreparedCount", java.lang.Integer.toString(this.zzj));
        com.google.android.gms.internal.ads.zzcde.zze(this.zzk, "onPrecacheEvent", map);
    }
}

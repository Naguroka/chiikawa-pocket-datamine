package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcda implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcde zzj;

    zzcda(com.google.android.gms.internal.ads.zzcde zzcdeVar, java.lang.String str, java.lang.String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
        this.zzj = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bytesLoaded", java.lang.Integer.toString(this.zzc));
        map.put("totalBytes", java.lang.Integer.toString(this.zzd));
        map.put("bufferedDuration", java.lang.Long.toString(this.zze));
        map.put("totalDuration", java.lang.Long.toString(this.zzf));
        map.put("cacheReady", true != this.zzg ? "0" : "1");
        map.put("playerCount", java.lang.Integer.toString(this.zzh));
        map.put("playerPreparedCount", java.lang.Integer.toString(this.zzi));
        com.google.android.gms.internal.ads.zzcde.zze(this.zzj, "onPrecacheEvent", map);
    }
}

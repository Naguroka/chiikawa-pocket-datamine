package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzd extends java.lang.Thread {
    final /* synthetic */ java.lang.String zza;

    zzd(com.google.android.gms.ads.internal.util.client.zzf zzfVar, java.lang.String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new com.google.android.gms.ads.internal.util.client.zzu(null).zza(this.zza);
    }
}

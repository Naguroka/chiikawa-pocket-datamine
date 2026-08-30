package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcaq implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcaw zzc;

    zzcaq(com.google.android.gms.internal.ads.zzcaw zzcawVar, java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcaw zzcawVar = this.zzc;
        if (zzcawVar.zzq != null) {
            zzcawVar.zzq.zzb(this.zza, this.zzb);
        }
    }
}

package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbi implements com.google.android.gms.internal.ads.zzapq {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbk zzb;

    zzbi(com.google.android.gms.ads.internal.util.zzbo zzboVar, java.lang.String str, com.google.android.gms.ads.internal.util.zzbk zzbkVar) {
        this.zza = str;
        this.zzb = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapq
    public final void zza(com.google.android.gms.internal.ads.zzapv zzapvVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load URL: " + this.zza + "\n" + zzapvVar.toString());
        this.zzb.zza((java.lang.Object) null);
    }
}

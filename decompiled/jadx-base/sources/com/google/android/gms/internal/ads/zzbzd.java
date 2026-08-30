package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbzd {
    public final com.google.common.util.concurrent.ListenableFuture zza(android.content.Context context, int i) {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context)) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new com.google.android.gms.internal.ads.zzbzc(this, context, zzcabVar));
        }
        return zzcabVar;
    }
}

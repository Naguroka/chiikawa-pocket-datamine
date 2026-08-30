package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbtv {
    private static com.google.android.gms.internal.ads.zzbyu zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzei zzd;
    private final java.lang.String zze;

    public zzbtv(android.content.Context context, com.google.android.gms.ads.AdFormat adFormat, com.google.android.gms.ads.internal.client.zzei zzeiVar, java.lang.String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzeiVar;
        this.zze = str;
    }

    public static com.google.android.gms.internal.ads.zzbyu zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzbyu zzbyuVar;
        synchronized (com.google.android.gms.internal.ads.zzbtv.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzbc.zza().zzt(context, new com.google.android.gms.internal.ads.zzbpa());
            }
            zzbyuVar = zza;
        }
        return zzbyuVar;
    }

    public final void zzb(com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVarZza;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.zzbyu zzbyuVarZza = zza(this.zzb);
        if (zzbyuVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        android.content.Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzei zzeiVar = this.zzd;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperWrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        if (zzeiVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzg(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzeiVar.zzq(jCurrentTimeMillis);
            zzmVarZza = com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzb, this.zzd);
        }
        try {
            zzbyuVarZza.zzf(iObjectWrapperWrap, new com.google.android.gms.internal.ads.zzbyy(this.zze, this.zzc.name(), null, zzmVarZza, 0, null), new com.google.android.gms.internal.ads.zzbtu(this, queryInfoGenerationCallback));
        } catch (android.os.RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}

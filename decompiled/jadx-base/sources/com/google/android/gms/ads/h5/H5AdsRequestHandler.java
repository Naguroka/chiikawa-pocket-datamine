package com.google.android.gms.ads.h5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class H5AdsRequestHandler {
    private final com.google.android.gms.internal.ads.zzbkv zza;

    public H5AdsRequestHandler(android.content.Context context, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new com.google.android.gms.internal.ads.zzbkv(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(java.lang.String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(java.lang.String str) {
        return com.google.android.gms.internal.ads.zzbkv.zzc(str);
    }
}

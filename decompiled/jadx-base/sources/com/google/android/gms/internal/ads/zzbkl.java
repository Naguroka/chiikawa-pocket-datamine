package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkl extends com.google.android.gms.internal.ads.zzbkn {
    private final com.google.android.gms.ads.h5.OnH5AdsEventListener zza;

    public zzbkl(com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzb(java.lang.String str) {
        this.zza.onH5AdsEvent(str);
    }
}

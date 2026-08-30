package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsu extends com.google.android.gms.internal.ads.zzbhp {
    private final com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener zza;

    public zzbsu(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzf(java.lang.String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}

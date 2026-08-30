package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzde extends com.google.android.gms.ads.internal.client.zzdc {
    private final com.google.android.gms.ads.MuteThisAdListener zza;

    public zzde(com.google.android.gms.ads.MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        this.zza.onAdMuted();
    }
}

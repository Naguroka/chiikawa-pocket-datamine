package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbqg extends com.google.android.gms.internal.ads.zzbpm {
    private final com.google.android.gms.ads.mediation.MediationInterscrollerAd zza;

    public zzbqg(com.google.android.gms.ads.mediation.MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final com.google.android.gms.dynamic.IObjectWrapper zze() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}

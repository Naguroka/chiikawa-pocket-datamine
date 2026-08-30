package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerp implements com.google.android.gms.internal.ads.zzetq {
    public final android.os.Bundle zza;

    public zzerp(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzfcx.zza(bundle, com.ironsource.y8.h.G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(com.ironsource.y8.h.G, bundleZza);
    }
}

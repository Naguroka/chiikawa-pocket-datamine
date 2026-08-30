package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeob implements com.google.android.gms.internal.ads.zzetq {
    private final double zza;
    private final boolean zzb;

    public zzeob(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzfcx.zza(bundle, com.ironsource.y8.h.G);
        bundle.putBundle(com.ironsource.y8.h.G, bundleZza);
        android.os.Bundle bundleZza2 = com.google.android.gms.internal.ads.zzfcx.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}

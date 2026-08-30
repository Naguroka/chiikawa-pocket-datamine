package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeue implements com.google.android.gms.internal.ads.zzetq {
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzeue(java.lang.String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, com.json.ce.F0, this.zza, !android.text.TextUtils.isEmpty(this.zza));
        int i = this.zzb;
        com.google.android.gms.internal.ads.zzfcx.zze(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzfcx.zza(bundle, com.ironsource.y8.h.G);
        bundle.putBundle(com.ironsource.y8.h.G, bundleZza);
        android.os.Bundle bundleZza2 = com.google.android.gms.internal.ads.zzfcx.zza(bundleZza, "network");
        bundleZza.putBundle("network", bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }
}

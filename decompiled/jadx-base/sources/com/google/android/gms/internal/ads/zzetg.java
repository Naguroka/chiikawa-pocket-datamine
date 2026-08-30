package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetg implements com.google.android.gms.internal.ads.zzetq {
    public final boolean zza;
    public final boolean zzb;
    public final java.lang.String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final java.lang.String zzh;

    zzetg(boolean z, boolean z2, java.lang.String str, boolean z3, int i, int i2, int i3, java.lang.String str2) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        zzcuvVar.zzb.putString("js", this.zzc);
        zzcuvVar.zzb.putInt("target_api", this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdP));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfO)).booleanValue() && !android.text.TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzfcx.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzc.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        android.os.Bundle bundleZza2 = com.google.android.gms.internal.ads.zzfcx.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "697668803");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}

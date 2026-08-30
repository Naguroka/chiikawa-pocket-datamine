package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzeua implements com.google.android.gms.internal.ads.zzetq {
    public final boolean zza;
    public final boolean zzb;
    public final java.lang.String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final java.lang.String zzg;
    public final java.util.ArrayList zzh;

    @javax.annotation.Nullable
    public final java.lang.String zzi;

    @javax.annotation.Nullable
    public final java.lang.String zzj;
    public final java.lang.String zzk;
    public final boolean zzl;
    public final java.lang.String zzm;
    public final long zzn;
    public final boolean zzo;

    @javax.annotation.Nullable
    public final java.lang.String zzp;
    public final int zzq;

    public zzeua(boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, boolean z5, java.lang.String str2, java.util.ArrayList arrayList, @javax.annotation.Nullable java.lang.String str3, @javax.annotation.Nullable java.lang.String str4, java.lang.String str5, boolean z6, java.lang.String str6, long j, boolean z7, @javax.annotation.Nullable java.lang.String str7, int i) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z6;
        this.zzm = str6;
        this.zzn = j;
        this.zzo = z7;
        this.zzp = str7;
        this.zzq = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zzb;
        bundle.putBoolean("simulator", this.zzd);
        bundle.putInt("build_api_level", this.zzq);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("submodel", this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzq);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkT)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzfcx.zza(bundle, com.ironsource.y8.h.G);
        bundle.putBundle(com.ironsource.y8.h.G, bundleZza);
        bundleZza.putString("build", this.zzk);
        bundleZza.putLong("remaining_data_partition_space", this.zzn);
        android.os.Bundle bundleZza2 = com.google.android.gms.internal.ads.zzfcx.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!android.text.TextUtils.isEmpty(this.zzj)) {
            android.os.Bundle bundleZza3 = com.google.android.gms.internal.ads.zzfcx.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", this.zzj);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlj)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (!android.text.TextUtils.isEmpty(this.zzp)) {
            bundle.putString("v_unity", this.zzp);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzld)).booleanValue()) {
            com.google.android.gms.internal.ads.zzfcx.zzg(bundle, "gotmt_l", true, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue());
            com.google.android.gms.internal.ads.zzfcx.zzg(bundle, "gotmt_i", true, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkZ)).booleanValue());
        }
    }
}

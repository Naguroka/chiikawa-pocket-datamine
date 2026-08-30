package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemg implements com.google.android.gms.internal.ads.zzetq {
    public final com.google.android.gms.ads.internal.client.zzs zza;
    public final java.lang.String zzb;
    public final boolean zzc;
    public final java.lang.String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final java.lang.String zzh;
    public final boolean zzi;

    public zzemg(com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, boolean z, java.lang.String str2, float f, int i, int i2, java.lang.String str3, boolean z2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzsVar, "the adSize must not be null");
        this.zza = zzsVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    private final void zzc(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "smart_h", "auto", this.zza.zzb == -2);
        com.google.android.gms.internal.ads.zzfcx.zzg(bundle, "ene", true, this.zza.zzj);
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "rafmt", "102", this.zza.zzm);
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "rafmt", "103", this.zza.zzn);
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "rafmt", "105", this.zza.zzo);
        com.google.android.gms.internal.ads.zzfcx.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        com.google.android.gms.internal.ads.zzfcx.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "format", this.zzb);
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "fluid", "height", this.zzc);
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "sz", this.zzd, !android.text.TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "sc", this.zzh, !android.text.TextUtils.isEmpty(this.zzh));
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = this.zza.zzg;
        if (zzsVarArr == null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzs zzsVar : zzsVarArr) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putBoolean("is_fluid_height", zzsVar.zzi);
                bundle3.putInt("height", zzsVar.zzb);
                bundle3.putInt("width", zzsVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
        zzc(((com.google.android.gms.internal.ads.zzcuv) obj).zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zzb(java.lang.Object obj) {
        zzc(((com.google.android.gms.internal.ads.zzcuv) obj).zza);
    }
}

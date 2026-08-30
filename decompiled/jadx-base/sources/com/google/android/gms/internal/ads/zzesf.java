package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzesf implements com.google.android.gms.internal.ads.zzetq {
    private final java.lang.String zza;
    private final java.lang.Integer zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;

    public zzesf(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zzb;
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "pn", this.zza);
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_DEADLINE, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "pn", this.zza);
        java.lang.Integer num = this.zzb;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "vnm", this.zzc);
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_DEADLINE, this.zzd);
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "ins_pn", this.zze);
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "ini_pn", this.zzf);
    }
}

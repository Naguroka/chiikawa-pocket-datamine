package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzenm implements com.google.android.gms.internal.ads.zzetq {
    private final android.content.Context zza;
    private final android.os.Bundle zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzctc zzg;

    public zzenm(android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, java.lang.String str3, com.google.android.gms.internal.ads.zzctc zzctcVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzctcVar;
    }

    private final void zzc(android.os.Bundle bundle) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfA)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.zzq();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzq(this.zza));
            } catch (android.os.RemoteException | java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        zzcuvVar.zzb.putBundle("quality_signals", this.zzb);
        zzc(zzcuvVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzN()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !this.zze.zzN());
        zzc(bundle);
        if (this.zzf != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putLong("dload", this.zzg.zzb(this.zzf));
            bundle2.putInt("pcc", this.zzg.zza(this.zzf));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjD)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zza() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzv.zzp().zza());
    }
}

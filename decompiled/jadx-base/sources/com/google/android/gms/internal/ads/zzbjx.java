package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjx implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ java.util.Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbkb zzd;

    zzbjx(com.google.android.gms.internal.ads.zzbkb zzbkbVar, java.util.Map map, com.google.android.gms.ads.internal.client.zza zzaVar, java.lang.String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = zzbkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjU)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzh(str, this.zzb, this.zza, this.zzc);
    }
}

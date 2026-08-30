package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzfcr implements com.google.android.gms.internal.ads.zzbjp {
    public final /* synthetic */ com.google.android.gms.internal.ads.zzdds zza;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcmk zzb;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfja zzc;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzebk zzd;

    public /* synthetic */ zzfcr(com.google.android.gms.internal.ads.zzdds zzddsVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzebk zzebkVar) {
        this.zza = zzddsVar;
        this.zzb = zzcmkVar;
        this.zzc = zzfjaVar;
        this.zzd = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        com.google.android.gms.internal.ads.zzbjo.zzc(map, this.zza);
        java.lang.String str = (java.lang.String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from click GMSG.");
            return;
        }
        com.google.android.gms.internal.ads.zzebk zzebkVar = this.zzd;
        com.google.android.gms.internal.ads.zzfja zzfjaVar = this.zzc;
        com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzbjo.zza(zzcexVar, str), new com.google.android.gms.internal.ads.zzfct(zzcexVar, this.zzb, zzfjaVar, zzebkVar), com.google.android.gms.internal.ads.zzbzw.zza);
    }
}

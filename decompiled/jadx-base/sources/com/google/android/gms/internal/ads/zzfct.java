package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfct implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcex zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcmk zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfja zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzebk zzd;

    zzfct(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzebk zzebkVar) {
        this.zza = zzcexVar;
        this.zzb = zzcmkVar;
        this.zzc = zzfjaVar;
        this.zzd = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.internal.ads.zzfbo zzfboVarZzD = this.zza.zzD();
        if (zzfboVarZzD != null && !zzfboVarZzD.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfboVarZzD.zzax;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjT)).booleanValue() && this.zzb != null && com.google.android.gms.internal.ads.zzcmk.zzj(str)) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzbc.zze(), zzvVar);
                return;
            } else {
                this.zzc.zzd(str, zzvVar, null);
                return;
            }
        }
        com.google.android.gms.internal.ads.zzfbr zzfbrVarZzR = this.zza.zzR();
        if (zzfbrVarZzR == null) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new java.lang.IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        boolean zZzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza.getContext());
        boolean z = false;
        boolean z2 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgd)).booleanValue() && zzfboVarZzD != null && zzfboVarZzD.zzS;
        if (zzfboVarZzD != null && zzfboVarZzD.zzad != null) {
            z = true;
        }
        this.zzd.zzd(new com.google.android.gms.internal.ads.zzebm(jCurrentTimeMillis, zzfbrVarZzR.zzb, str, (zZzA || z2 || z) ? 2 : 1));
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfgt implements com.google.android.gms.internal.ads.zzdcx, com.google.android.gms.internal.ads.zzcwj, com.google.android.gms.internal.ads.zzddb {
    private final com.google.android.gms.internal.ads.zzfhh zza;
    private final com.google.android.gms.internal.ads.zzfgw zzb;

    zzfgt(android.content.Context context, com.google.android.gms.internal.ads.zzfhh zzfhhVar) {
        this.zza = zzfhhVar;
        this.zzb = com.google.android.gms.internal.ads.zzfgv.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzb() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzd.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfhh zzfhhVar = this.zza;
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
            zzfgwVar.zzg(true);
            zzfhhVar.zza(zzfgwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzd.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfhh zzfhhVar = this.zza;
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzb;
            zzfgwVar.zzc(zzeVar.zza().toString());
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
        }
    }
}

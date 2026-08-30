package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzezh implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzezh(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzezf zzb() {
        com.google.android.gms.internal.ads.zzezf zzeyuVar;
        android.content.Context context = (android.content.Context) this.zza.zzb();
        com.google.android.gms.internal.ads.zzfds zzfdsVar = (com.google.android.gms.internal.ads.zzfds) this.zzb.zzb();
        com.google.android.gms.internal.ads.zzfek zzfekVar = (com.google.android.gms.internal.ads.zzfek) this.zzc.zzb();
        com.google.android.gms.internal.ads.zzbzg zzbzgVarZzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgg)).booleanValue() ? com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg() : com.google.android.gms.ads.internal.zzv.zzp().zzi().zzh();
        boolean z = false;
        if (zzbzgVarZzg != null && zzbzgVarZzg.zzh()) {
            z = true;
        }
        if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgw)).intValue() > 0) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgf)).booleanValue() || z) {
                com.google.android.gms.internal.ads.zzfej zzfejVarZza = zzfekVar.zza(com.google.android.gms.internal.ads.zzfea.AppOpen, context, zzfdsVar, new com.google.android.gms.internal.ads.zzeyj(new com.google.android.gms.internal.ads.zzeyg()));
                zzeyuVar = new com.google.android.gms.internal.ads.zzeyl(new com.google.android.gms.internal.ads.zzeyv(new com.google.android.gms.internal.ads.zzeyu()), new com.google.android.gms.internal.ads.zzeyr(zzfejVarZza.zza, com.google.android.gms.internal.ads.zzbzw.zza), zzfejVarZza.zzb, zzfejVarZza.zza.zza().zzf, com.google.android.gms.internal.ads.zzbzw.zza);
            } else {
                zzeyuVar = new com.google.android.gms.internal.ads.zzeyu();
            }
        } else {
            zzeyuVar = new com.google.android.gms.internal.ads.zzeyu();
        }
        return zzeyuVar;
    }
}

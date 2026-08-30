package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdgj implements com.google.android.gms.internal.ads.zzcrc {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;
    private final com.google.android.gms.internal.ads.zzdiq zze;

    zzdgj(java.util.Map map, java.util.Map map2, java.util.Map map3, com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzdiq zzdiqVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhfjVar;
        this.zze = zzdiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrc
    public final com.google.android.gms.internal.ads.zzecw zza(int i, java.lang.String str) {
        com.google.android.gms.internal.ads.zzecw zzecwVarZza;
        com.google.android.gms.internal.ads.zzecw zzecwVar = (com.google.android.gms.internal.ads.zzecw) this.zza.get(str);
        if (zzecwVar != null) {
            return zzecwVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            com.google.android.gms.internal.ads.zzefk zzefkVar = (com.google.android.gms.internal.ads.zzefk) this.zzc.get(str);
            if (zzefkVar != null) {
                return new com.google.android.gms.internal.ads.zzecx(zzefkVar, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzcre
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return new com.google.android.gms.internal.ads.zzcrh((java.util.List) obj);
                    }
                });
            }
            zzecwVarZza = (com.google.android.gms.internal.ads.zzecw) this.zzb.get(str);
            if (zzecwVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzecwVarZza = ((com.google.android.gms.internal.ads.zzcrc) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzecx(zzecwVarZza, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzcrf
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.zzcrh((com.google.android.gms.internal.ads.zzcqz) obj);
            }
        });
    }
}

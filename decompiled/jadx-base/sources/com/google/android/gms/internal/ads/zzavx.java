package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzavx implements com.google.android.gms.internal.ads.zzfph {
    private final com.google.android.gms.internal.ads.zzfnk zza;
    private final com.google.android.gms.internal.ads.zzfob zzb;
    private final com.google.android.gms.internal.ads.zzawk zzc;
    private final com.google.android.gms.internal.ads.zzavw zzd;
    private final com.google.android.gms.internal.ads.zzavg zze;
    private final com.google.android.gms.internal.ads.zzawm zzf;
    private final com.google.android.gms.internal.ads.zzawe zzg;
    private final com.google.android.gms.internal.ads.zzavv zzh;

    zzavx(com.google.android.gms.internal.ads.zzfnk zzfnkVar, com.google.android.gms.internal.ads.zzfob zzfobVar, com.google.android.gms.internal.ads.zzawk zzawkVar, com.google.android.gms.internal.ads.zzavw zzavwVar, com.google.android.gms.internal.ads.zzavg zzavgVar, com.google.android.gms.internal.ads.zzawm zzawmVar, com.google.android.gms.internal.ads.zzawe zzaweVar, com.google.android.gms.internal.ads.zzavv zzavvVar) {
        this.zza = zzfnkVar;
        this.zzb = zzfobVar;
        this.zzc = zzawkVar;
        this.zzd = zzavwVar;
        this.zze = zzavgVar;
        this.zzf = zzawmVar;
        this.zzg = zzaweVar;
        this.zzh = zzavvVar;
    }

    private final java.util.Map zze() {
        java.util.HashMap map = new java.util.HashMap();
        com.google.android.gms.internal.ads.zzfnk zzfnkVar = this.zza;
        com.google.android.gms.internal.ads.zzasy zzasyVarZzb = this.zzb.zzb();
        map.put("v", zzfnkVar.zzd());
        map.put("gms", java.lang.Boolean.valueOf(this.zza.zzg()));
        map.put("int", zzasyVarZzb.zzh());
        map.put("attts", java.lang.Long.valueOf(zzasyVarZzb.zzf().zza()));
        map.put("att", zzasyVarZzb.zzf().zzd());
        map.put("attkid", zzasyVarZzb.zzf().zzf());
        map.put("up", java.lang.Boolean.valueOf(this.zzd.zza()));
        map.put("t", new java.lang.Throwable());
        com.google.android.gms.internal.ads.zzawe zzaweVar = this.zzg;
        if (zzaweVar != null) {
            map.put("tcq", java.lang.Long.valueOf(zzaweVar.zzc()));
            map.put("tpq", java.lang.Long.valueOf(this.zzg.zzg()));
            map.put("tcv", java.lang.Long.valueOf(this.zzg.zzd()));
            map.put("tpv", java.lang.Long.valueOf(this.zzg.zzh()));
            map.put("tchv", java.lang.Long.valueOf(this.zzg.zzb()));
            map.put("tphv", java.lang.Long.valueOf(this.zzg.zzf()));
            map.put("tcc", java.lang.Long.valueOf(this.zzg.zza()));
            map.put("tpc", java.lang.Long.valueOf(this.zzg.zze()));
            com.google.android.gms.internal.ads.zzavg zzavgVar = this.zze;
            if (zzavgVar != null) {
                map.put("nt", java.lang.Long.valueOf(zzavgVar.zza()));
            }
            com.google.android.gms.internal.ads.zzawm zzawmVar = this.zzf;
            if (zzawmVar != null) {
                map.put("vs", java.lang.Long.valueOf(zzawmVar.zzc()));
                map.put("vf", java.lang.Long.valueOf(this.zzf.zzb()));
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final java.util.Map zza() {
        com.google.android.gms.internal.ads.zzawk zzawkVar = this.zzc;
        java.util.Map mapZze = zze();
        mapZze.put("lts", java.lang.Long.valueOf(zzawkVar.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final java.util.Map zzb() {
        java.util.Map mapZze = zze();
        com.google.android.gms.internal.ads.zzasy zzasyVarZza = this.zzb.zza();
        mapZze.put("gai", java.lang.Boolean.valueOf(this.zza.zzh()));
        mapZze.put("did", zzasyVarZza.zzg());
        mapZze.put("dst", java.lang.Integer.valueOf(zzasyVarZza.zzal() - 1));
        mapZze.put("doo", java.lang.Boolean.valueOf(zzasyVarZza.zzai()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final java.util.Map zzc() {
        com.google.android.gms.internal.ads.zzavv zzavvVar = this.zzh;
        java.util.Map mapZze = zze();
        if (zzavvVar != null) {
            mapZze.put("vst", zzavvVar.zza());
        }
        return mapZze;
    }

    final void zzd(android.view.View view) {
        this.zzc.zzd(view);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzla {
    private final com.google.android.gms.internal.ads.zzog zza;
    private final com.google.android.gms.internal.ads.zzkz zze;
    private final com.google.android.gms.internal.ads.zzlt zzh;
    private final com.google.android.gms.internal.ads.zzdh zzi;
    private boolean zzj;
    private com.google.android.gms.internal.ads.zzgy zzk;
    private com.google.android.gms.internal.ads.zzwb zzl = new com.google.android.gms.internal.ads.zzwb(0);
    private final java.util.IdentityHashMap zzc = new java.util.IdentityHashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.HashMap zzf = new java.util.HashMap();
    private final java.util.Set zzg = new java.util.HashSet();

    public zzla(com.google.android.gms.internal.ads.zzkz zzkzVar, com.google.android.gms.internal.ads.zzlt zzltVar, com.google.android.gms.internal.ads.zzdh zzdhVar, com.google.android.gms.internal.ads.zzog zzogVar) {
        this.zza = zzogVar;
        this.zze = zzkzVar;
        this.zzh = zzltVar;
        this.zzi = zzdhVar;
    }

    private final void zzr(int i, int i2) {
        while (i < this.zzb.size()) {
            ((com.google.android.gms.internal.ads.zzky) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzs(com.google.android.gms.internal.ads.zzky zzkyVar) {
        com.google.android.gms.internal.ads.zzkx zzkxVar = (com.google.android.gms.internal.ads.zzkx) this.zzf.get(zzkyVar);
        if (zzkxVar != null) {
            zzkxVar.zza.zzi(zzkxVar.zzb);
        }
    }

    private final void zzt() {
        java.util.Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzky zzkyVar = (com.google.android.gms.internal.ads.zzky) it.next();
            if (zzkyVar.zzc.isEmpty()) {
                zzs(zzkyVar);
                it.remove();
            }
        }
    }

    private final void zzu(com.google.android.gms.internal.ads.zzky zzkyVar) {
        if (zzkyVar.zze && zzkyVar.zzc.isEmpty()) {
            com.google.android.gms.internal.ads.zzkx zzkxVar = (com.google.android.gms.internal.ads.zzkx) this.zzf.remove(zzkyVar);
            zzkxVar.getClass();
            zzkxVar.zza.zzp(zzkxVar.zzb);
            zzkxVar.zza.zzs(zzkxVar.zzc);
            zzkxVar.zza.zzr(zzkxVar.zzc);
            this.zzg.remove(zzkyVar);
        }
    }

    private final void zzv(com.google.android.gms.internal.ads.zzky zzkyVar) {
        com.google.android.gms.internal.ads.zzub zzubVar = zzkyVar.zza;
        com.google.android.gms.internal.ads.zzuh zzuhVar = new com.google.android.gms.internal.ads.zzuh() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // com.google.android.gms.internal.ads.zzuh
            public final void zza(com.google.android.gms.internal.ads.zzui zzuiVar, com.google.android.gms.internal.ads.zzbq zzbqVar) {
                this.zza.zzf(zzuiVar, zzbqVar);
            }
        };
        com.google.android.gms.internal.ads.zzkw zzkwVar = new com.google.android.gms.internal.ads.zzkw(this, zzkyVar);
        this.zzf.put(zzkyVar, new com.google.android.gms.internal.ads.zzkx(zzubVar, zzuhVar, zzkwVar));
        zzubVar.zzh(new android.os.Handler(com.google.android.gms.internal.ads.zzei.zzz(), null), zzkwVar);
        zzubVar.zzg(new android.os.Handler(com.google.android.gms.internal.ads.zzei.zzz(), null), zzkwVar);
        zzubVar.zzm(zzuhVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            com.google.android.gms.internal.ads.zzky zzkyVar = (com.google.android.gms.internal.ads.zzky) this.zzb.remove(i2);
            this.zzd.remove(zzkyVar.zzb);
            zzr(i2, -zzkyVar.zza.zzC().zzc());
            zzkyVar.zze = true;
            if (this.zzj) {
                zzu(zzkyVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final com.google.android.gms.internal.ads.zzbq zzb() {
        if (this.zzb.isEmpty()) {
            return com.google.android.gms.internal.ads.zzbq.zza;
        }
        int iZzc = 0;
        for (int i = 0; i < this.zzb.size(); i++) {
            com.google.android.gms.internal.ads.zzky zzkyVar = (com.google.android.gms.internal.ads.zzky) this.zzb.get(i);
            zzkyVar.zzd = iZzc;
            iZzc += zzkyVar.zza.zzC().zzc();
        }
        return new com.google.android.gms.internal.ads.zzlh(this.zzb, this.zzl);
    }

    public final com.google.android.gms.internal.ads.zzbq zzc(int i, int i2, java.util.List list) {
        com.google.android.gms.internal.ads.zzcw.zzd(i >= 0 && i <= i2 && i2 <= zza());
        com.google.android.gms.internal.ads.zzcw.zzd(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((com.google.android.gms.internal.ads.zzky) this.zzb.get(i3)).zza.zzt((com.google.android.gms.internal.ads.zzar) list.get(i3 - i));
        }
        return zzb();
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzui zzuiVar, com.google.android.gms.internal.ads.zzbq zzbqVar) {
        this.zze.zzh();
    }

    public final void zzg(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzj);
        this.zzk = zzgyVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            com.google.android.gms.internal.ads.zzky zzkyVar = (com.google.android.gms.internal.ads.zzky) this.zzb.get(i);
            zzv(zzkyVar);
            this.zzg.add(zzkyVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (com.google.android.gms.internal.ads.zzkx zzkxVar : this.zzf.values()) {
            try {
                zzkxVar.zza.zzp(zzkxVar.zzb);
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzdo.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzkxVar.zza.zzs(zzkxVar.zzc);
            zzkxVar.zza.zzr(zzkxVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(com.google.android.gms.internal.ads.zzue zzueVar) {
        com.google.android.gms.internal.ads.zzky zzkyVar = (com.google.android.gms.internal.ads.zzky) this.zzc.remove(zzueVar);
        zzkyVar.getClass();
        zzkyVar.zza.zzG(zzueVar);
        zzkyVar.zzc.remove(((com.google.android.gms.internal.ads.zzty) zzueVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzkyVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.ads.zzbq zzk(int i, java.util.List list, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwbVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                com.google.android.gms.internal.ads.zzky zzkyVar = (com.google.android.gms.internal.ads.zzky) list.get(i2 - i);
                if (i2 > 0) {
                    com.google.android.gms.internal.ads.zzky zzkyVar2 = (com.google.android.gms.internal.ads.zzky) this.zzb.get(i2 - 1);
                    zzkyVar.zzc(zzkyVar2.zzd + zzkyVar2.zza.zzC().zzc());
                } else {
                    zzkyVar.zzc(0);
                }
                zzr(i2, zzkyVar.zza.zzC().zzc());
                this.zzb.add(i2, zzkyVar);
                this.zzd.put(zzkyVar.zzb, zzkyVar);
                if (this.zzj) {
                    zzv(zzkyVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkyVar);
                    } else {
                        zzs(zzkyVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final com.google.android.gms.internal.ads.zzbq zzl(int i, int i2, int i3, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        com.google.android.gms.internal.ads.zzcw.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final com.google.android.gms.internal.ads.zzbq zzm(int i, int i2, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zzl = zzwbVar;
        zzw(i, i2);
        return zzb();
    }

    public final com.google.android.gms.internal.ads.zzbq zzn(java.util.List list, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwbVar);
    }

    public final com.google.android.gms.internal.ads.zzbq zzo(com.google.android.gms.internal.ads.zzwb zzwbVar) {
        int iZza = zza();
        if (zzwbVar.zzc() != iZza) {
            zzwbVar = zzwbVar.zzf().zzg(0, iZza);
        }
        this.zzl = zzwbVar;
        return zzb();
    }

    public final com.google.android.gms.internal.ads.zzue zzp(com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzyk zzykVar, long j) {
        int i = com.google.android.gms.internal.ads.zzlh.zzb;
        java.lang.Object obj = ((android.util.Pair) zzugVar.zza).first;
        com.google.android.gms.internal.ads.zzug zzugVarZza = zzugVar.zza(((android.util.Pair) zzugVar.zza).second);
        com.google.android.gms.internal.ads.zzky zzkyVar = (com.google.android.gms.internal.ads.zzky) this.zzd.get(obj);
        zzkyVar.getClass();
        this.zzg.add(zzkyVar);
        com.google.android.gms.internal.ads.zzkx zzkxVar = (com.google.android.gms.internal.ads.zzkx) this.zzf.get(zzkyVar);
        if (zzkxVar != null) {
            zzkxVar.zza.zzk(zzkxVar.zzb);
        }
        zzkyVar.zzc.add(zzugVarZza);
        com.google.android.gms.internal.ads.zzty zztyVarZzI = zzkyVar.zza.zzI(zzugVarZza, zzykVar, j);
        this.zzc.put(zztyVarZzI, zzkyVar);
        zzt();
        return zztyVarZzI;
    }

    public final com.google.android.gms.internal.ads.zzwb zzq() {
        return this.zzl;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfdx implements com.google.android.gms.internal.ads.zzfdw {
    private final java.util.concurrent.ConcurrentHashMap zza;
    private final com.google.android.gms.internal.ads.zzfed zzb;
    private final com.google.android.gms.internal.ads.zzfdz zzc = new com.google.android.gms.internal.ads.zzfdz();

    public zzfdx(com.google.android.gms.internal.ads.zzfed zzfedVar) {
        this.zza = new java.util.concurrent.ConcurrentHashMap(zzfedVar.zzd);
        this.zzb = zzfedVar;
    }

    private final void zzf() {
        android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfed> creator = com.google.android.gms.internal.ads.zzfed.CREATOR;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgh)).booleanValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (java.util.Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((com.google.android.gms.internal.ads.zzfeg) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((com.google.android.gms.internal.ads.zzfdv) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzb = ((com.google.android.gms.internal.ads.zzfdv) entry.getValue()).zzb(); iZzb < this.zzb.zzd; iZzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((com.google.android.gms.internal.ads.zzfdv) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzo.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final com.google.android.gms.internal.ads.zzfed zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final synchronized com.google.android.gms.internal.ads.zzfef zzb(com.google.android.gms.internal.ads.zzfeg zzfegVar) {
        com.google.android.gms.internal.ads.zzfef zzfefVarZze;
        com.google.android.gms.internal.ads.zzfdv zzfdvVar = (com.google.android.gms.internal.ads.zzfdv) this.zza.get(zzfegVar);
        if (zzfdvVar != null) {
            zzfefVarZze = zzfdvVar.zze();
            if (zzfefVarZze == null) {
                this.zzc.zze();
            }
            com.google.android.gms.internal.ads.zzfet zzfetVarZzf = zzfdvVar.zzf();
            if (zzfefVarZze != null) {
                com.google.android.gms.internal.ads.zzbbq.zzb.zzc zzcVarZzd = com.google.android.gms.internal.ads.zzbbq.zzb.zzd();
                com.google.android.gms.internal.ads.zzbbq.zzb.zza.C0180zza c0180zzaZza = com.google.android.gms.internal.ads.zzbbq.zzb.zza.zza();
                c0180zzaZza.zzf(com.google.android.gms.internal.ads.zzbbq.zzb.zzd.IN_MEMORY);
                com.google.android.gms.internal.ads.zzbbq.zzb.zze.zza zzaVarZzb = com.google.android.gms.internal.ads.zzbbq.zzb.zze.zzb();
                zzaVarZzb.zzd(zzfetVarZzf.zza);
                zzaVarZzb.zze(zzfetVarZzf.zzb);
                c0180zzaZza.zzg(zzaVarZzb);
                zzcVarZzd.zzd(c0180zzaZza);
                zzfefVarZze.zza.zzb().zzc().zzi(zzcVarZzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfefVarZze = null;
        }
        return zzfefVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzfeg zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.ads.internal.client.zzy zzyVar) {
        return new com.google.android.gms.internal.ads.zzfeh(zzmVar, str, new com.google.android.gms.internal.ads.zzbvn(this.zzb.zza).zza().zzj, this.zzb.zzf, zzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final synchronized boolean zzd(com.google.android.gms.internal.ads.zzfeg zzfegVar, com.google.android.gms.internal.ads.zzfef zzfefVar) {
        boolean zZzh;
        com.google.android.gms.internal.ads.zzfdv zzfdvVar = (com.google.android.gms.internal.ads.zzfdv) this.zza.get(zzfegVar);
        zzfefVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        if (zzfdvVar == null) {
            com.google.android.gms.internal.ads.zzfed zzfedVar = this.zzb;
            com.google.android.gms.internal.ads.zzfdv zzfdvVar2 = new com.google.android.gms.internal.ads.zzfdv(zzfedVar.zzd, zzfedVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i = this.zzb.zzg;
                int i2 = i - 1;
                com.google.android.gms.internal.ads.zzfeg zzfegVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long jZzc = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (java.util.Map.Entry entry : this.zza.entrySet()) {
                        if (((com.google.android.gms.internal.ads.zzfdv) entry.getValue()).zzc() < jZzc) {
                            jZzc = ((com.google.android.gms.internal.ads.zzfdv) entry.getValue()).zzc();
                            zzfegVar2 = (com.google.android.gms.internal.ads.zzfeg) entry.getKey();
                        }
                    }
                    if (zzfegVar2 != null) {
                        this.zza.remove(zzfegVar2);
                    }
                } else if (i2 == 1) {
                    for (java.util.Map.Entry entry2 : this.zza.entrySet()) {
                        if (((com.google.android.gms.internal.ads.zzfdv) entry2.getValue()).zzd() < jZzc) {
                            jZzc = ((com.google.android.gms.internal.ads.zzfdv) entry2.getValue()).zzd();
                            zzfegVar2 = (com.google.android.gms.internal.ads.zzfeg) entry2.getKey();
                        }
                    }
                    if (zzfegVar2 != null) {
                        this.zza.remove(zzfegVar2);
                    }
                } else if (i2 == 2) {
                    int iZza = Integer.MAX_VALUE;
                    for (java.util.Map.Entry entry3 : this.zza.entrySet()) {
                        if (((com.google.android.gms.internal.ads.zzfdv) entry3.getValue()).zza() < iZza) {
                            iZza = ((com.google.android.gms.internal.ads.zzfdv) entry3.getValue()).zza();
                            zzfegVar2 = (com.google.android.gms.internal.ads.zzfeg) entry3.getKey();
                        }
                    }
                    if (zzfegVar2 != null) {
                        this.zza.remove(zzfegVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfegVar, zzfdvVar2);
            this.zzc.zzd();
            zzfdvVar = zzfdvVar2;
        }
        zZzh = zzfdvVar.zzh(zzfefVar);
        this.zzc.zzc();
        com.google.android.gms.internal.ads.zzfdy zzfdyVarZza = this.zzc.zza();
        com.google.android.gms.internal.ads.zzfet zzfetVarZzf = zzfdvVar.zzf();
        if (zzfefVar != null) {
            com.google.android.gms.internal.ads.zzbbq.zzb.zzc zzcVarZzd = com.google.android.gms.internal.ads.zzbbq.zzb.zzd();
            com.google.android.gms.internal.ads.zzbbq.zzb.zza.C0180zza c0180zzaZza = com.google.android.gms.internal.ads.zzbbq.zzb.zza.zza();
            c0180zzaZza.zzf(com.google.android.gms.internal.ads.zzbbq.zzb.zzd.IN_MEMORY);
            com.google.android.gms.internal.ads.zzbbq.zzb.zzg.zza zzaVarZzb = com.google.android.gms.internal.ads.zzbbq.zzb.zzg.zzb();
            zzaVarZzb.zze(zzfdyVarZza.zza);
            zzaVarZzb.zzf(zzfdyVarZza.zzb);
            zzaVarZzb.zzg(zzfetVarZzf.zzb);
            c0180zzaZza.zzi(zzaVarZzb);
            zzcVarZzd.zzd(c0180zzaZza);
            zzfefVar.zza.zzb().zzc().zzj(zzcVarZzd.zzbr());
        }
        zzf();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final synchronized boolean zze(com.google.android.gms.internal.ads.zzfeg zzfegVar) {
        com.google.android.gms.internal.ads.zzfdv zzfdvVar = (com.google.android.gms.internal.ads.zzfdv) this.zza.get(zzfegVar);
        if (zzfdvVar == null) {
            return true;
        }
        return zzfdvVar.zzb() < this.zzb.zzd;
    }
}

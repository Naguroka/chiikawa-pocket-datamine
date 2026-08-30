package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzego implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbr zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbo zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfiv zze;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfca zzf;
    final /* synthetic */ com.google.android.gms.internal.ads.zzegq zzg;

    zzego(com.google.android.gms.internal.ads.zzegq zzegqVar, long j, com.google.android.gms.internal.ads.zzfbr zzfbrVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, java.lang.String str, com.google.android.gms.internal.ads.zzfiv zzfivVar, com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        this.zza = j;
        this.zzb = zzfbrVar;
        this.zzc = zzfboVar;
        this.zzd = str;
        this.zze = zzfivVar;
        this.zzf = zzfcaVar;
        this.zzg = zzegqVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[PHI: r7
  0x0061: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int), (r7v3 int) binds: [B:16:0x002f, B:21:0x004a, B:23:0x004e, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:31:0x0066, B:33:0x006e, B:35:0x007a, B:36:0x007d, B:37:0x0086, B:39:0x0098, B:40:0x00b1, B:42:0x00b9, B:44:0x00bb, B:52:0x00f9, B:53:0x0104, B:47:0x00de, B:49:0x00e2, B:51:0x00ec), top: B:58:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007a A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:31:0x0066, B:33:0x006e, B:35:0x007a, B:36:0x007d, B:37:0x0086, B:39:0x0098, B:40:0x00b1, B:42:0x00b9, B:44:0x00bb, B:52:0x00f9, B:53:0x0104, B:47:0x00de, B:49:0x00e2, B:51:0x00ec), top: B:58:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0098 A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:31:0x0066, B:33:0x006e, B:35:0x007a, B:36:0x007d, B:37:0x0086, B:39:0x0098, B:40:0x00b1, B:42:0x00b9, B:44:0x00bb, B:52:0x00f9, B:53:0x0104, B:47:0x00de, B:49:0x00e2, B:51:0x00ec), top: B:58:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[Catch: all -> 0x0106, DONT_GENERATE, TryCatch #0 {, blocks: (B:31:0x0066, B:33:0x006e, B:35:0x007a, B:36:0x007d, B:37:0x0086, B:39:0x0098, B:40:0x00b1, B:42:0x00b9, B:44:0x00bb, B:52:0x00f9, B:53:0x0104, B:47:0x00de, B:49:0x00e2, B:51:0x00ec), top: B:58:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:31:0x0066, B:33:0x006e, B:35:0x007a, B:36:0x007d, B:37:0x0086, B:39:0x0098, B:40:0x00b1, B:42:0x00b9, B:44:0x00bb, B:52:0x00f9, B:53:0x0104, B:47:0x00de, B:49:0x00e2, B:51:0x00ec), top: B:58:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        java.lang.Integer numValueOf;
        int i;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        com.google.android.gms.internal.ads.zzegq zzegqVar;
        com.google.android.gms.internal.ads.zzegq zzegqVar2;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        if (th instanceof java.util.concurrent.TimeoutException) {
            i = 2;
        } else if (th instanceof com.google.android.gms.internal.ads.zzefy) {
            i = 3;
        } else {
            if (!(th instanceof java.util.concurrent.CancellationException)) {
                if (th instanceof com.google.android.gms.internal.ads.zzfcq) {
                    i = 5;
                } else {
                    int i3 = 6;
                    if (th instanceof com.google.android.gms.internal.ads.zzdvy) {
                        i3 = com.google.android.gms.internal.ads.zzfdk.zza(th).zza == 3 ? 1 : 6;
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbK)).booleanValue() && (th instanceof com.google.android.gms.internal.ads.zzeda) && (zzeVarZzb = ((com.google.android.gms.internal.ads.zzeda) th).zzb()) != null) {
                            numValueOf = java.lang.Integer.valueOf(zzeVarZzb.zza);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                    i = i3;
                }
                synchronized (this.zzg) {
                    zzegqVar = this.zzg;
                    if (zzegqVar.zze) {
                        zzegqVar.zzb.zza(this.zzb, this.zzc, i, th instanceof com.google.android.gms.internal.ads.zzeda ? (com.google.android.gms.internal.ads.zzeda) th : null, jElapsedRealtime);
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzij)).booleanValue()) {
                        com.google.android.gms.internal.ads.zzfja zzfjaVar = this.zzg.zzc;
                        com.google.android.gms.internal.ads.zzfiv zzfivVar = this.zze;
                        com.google.android.gms.internal.ads.zzfca zzfcaVar = this.zzf;
                        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzc;
                        zzfjaVar.zze(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzn), this.zzc.zzax);
                    }
                    zzegqVar2 = this.zzg;
                    if (zzegqVar2.zzg) {
                        return;
                    }
                    java.util.LinkedHashMap linkedHashMap = zzegqVar2.zzd;
                    com.google.android.gms.internal.ads.zzfbo zzfboVar2 = this.zzc;
                    linkedHashMap.put(zzfboVar2, new com.google.android.gms.internal.ads.zzegp(this.zzd, zzfboVar2.zzaf, i, jElapsedRealtime, numValueOf));
                    zzeVarZza = com.google.android.gms.internal.ads.zzfdk.zza(th);
                    i2 = zzeVarZza.zza;
                    if ((i2 != 3 || i2 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN)) {
                    }
                    this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, zzeVarZza);
                }
            }
            i = 4;
        }
        numValueOf = null;
        synchronized (this.zzg) {
            zzegqVar = this.zzg;
            if (zzegqVar.zze) {
                zzegqVar.zzb.zza(this.zzb, this.zzc, i, th instanceof com.google.android.gms.internal.ads.zzeda ? (com.google.android.gms.internal.ads.zzeda) th : null, jElapsedRealtime);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzij)).booleanValue()) {
                com.google.android.gms.internal.ads.zzfja zzfjaVar2 = this.zzg.zzc;
                com.google.android.gms.internal.ads.zzfiv zzfivVar2 = this.zze;
                com.google.android.gms.internal.ads.zzfca zzfcaVar2 = this.zzf;
                com.google.android.gms.internal.ads.zzfbo zzfboVar3 = this.zzc;
                zzfjaVar2.zze(zzfivVar2.zzc(zzfcaVar2, zzfboVar3, zzfboVar3.zzn), this.zzc.zzax);
            }
            zzegqVar2 = this.zzg;
            if (zzegqVar2.zzg) {
                return;
            }
            java.util.LinkedHashMap linkedHashMap2 = zzegqVar2.zzd;
            com.google.android.gms.internal.ads.zzfbo zzfboVar4 = this.zzc;
            linkedHashMap2.put(zzfboVar4, new com.google.android.gms.internal.ads.zzegp(this.zzd, zzfboVar4.zzaf, i, jElapsedRealtime, numValueOf));
            zzeVarZza = com.google.android.gms.internal.ads.zzfdk.zza(th);
            i2 = zzeVarZza.zza;
            zzeVarZza = i2 != 3 ? com.google.android.gms.internal.ads.zzfdk.zza(new com.google.android.gms.internal.ads.zzeda(13, zzeVarZza.zzd)) : com.google.android.gms.internal.ads.zzfdk.zza(new com.google.android.gms.internal.ads.zzeda(13, zzeVarZza.zzd));
            this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(java.lang.Object obj) {
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            com.google.android.gms.internal.ads.zzegq zzegqVar = this.zzg;
            if (zzegqVar.zze) {
                zzegqVar.zzb.zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
            }
            com.google.android.gms.internal.ads.zzegq zzegqVar2 = this.zzg;
            if (zzegqVar2.zzg) {
                return;
            }
            if (zzegqVar2.zzq(this.zzc)) {
                ((com.google.android.gms.internal.ads.zzegp) this.zzg.zzd.get(this.zzc)).zzd = jElapsedRealtime;
            } else {
                java.util.LinkedHashMap linkedHashMap = this.zzg.zzd;
                com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzc;
                linkedHashMap.put(zzfboVar, new com.google.android.gms.internal.ads.zzegp(this.zzd, zzfboVar.zzaf, 0, jElapsedRealtime, null));
            }
            this.zzg.zzf.zzg(this.zzc, jElapsedRealtime, null);
        }
    }
}

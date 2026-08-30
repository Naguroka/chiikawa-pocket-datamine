package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzegx implements com.google.android.gms.internal.ads.zzgbo {
    private final com.google.android.gms.internal.ads.zzfgn zza;
    private final com.google.android.gms.internal.ads.zzcvv zzb;
    private final com.google.android.gms.internal.ads.zzfiv zzc;
    private final com.google.android.gms.internal.ads.zzfja zzd;
    private final java.util.concurrent.Executor zze;
    private final java.util.concurrent.ScheduledExecutorService zzf;
    private final com.google.android.gms.internal.ads.zzcrc zzg;
    private final com.google.android.gms.internal.ads.zzegq zzh;
    private final com.google.android.gms.internal.ads.zzedb zzi;
    private final android.content.Context zzj;
    private final com.google.android.gms.internal.ads.zzfhh zzk;
    private final com.google.android.gms.internal.ads.zzega zzl;
    private final com.google.android.gms.internal.ads.zzdrq zzm;

    zzegx(android.content.Context context, com.google.android.gms.internal.ads.zzfgn zzfgnVar, com.google.android.gms.internal.ads.zzegq zzegqVar, com.google.android.gms.internal.ads.zzcvv zzcvvVar, com.google.android.gms.internal.ads.zzfiv zzfivVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzcrc zzcrcVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzedb zzedbVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzega zzegaVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        this.zzj = context;
        this.zza = zzfgnVar;
        this.zzh = zzegqVar;
        this.zzb = zzcvvVar;
        this.zzc = zzfivVar;
        this.zzd = zzfjaVar;
        this.zzg = zzcrcVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedbVar;
        this.zzk = zzfhhVar;
        this.zzl = zzegaVar;
        this.zzm = zzdrqVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    static java.lang.String zzc(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        java.lang.String str = "No fill.";
        java.lang.String str2 = true != ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfw)).booleanValue() ? "No ad config." : "No fill.";
        int i = zzfcaVar.zzb.zzb.zzf;
        if (i == 0) {
            str = str2;
        } else if (i >= 200 && i < 300) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfv)).booleanValue()) {
                str = str2;
            }
        } else if (i < 300 || i >= 400) {
            str = "Received error HTTP response code: " + i;
        } else {
            str = "No location header to follow redirect or too many redirects.";
        }
        com.google.android.gms.internal.ads.zzfbq zzfbqVar = zzfcaVar.zzb.zzb.zzj;
        return zzfbqVar != null ? zzfbqVar.zza() : str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        java.util.Iterator it;
        com.google.android.gms.internal.ads.zzecw zzecwVarZza;
        int i;
        com.google.android.gms.internal.ads.zzbvk zzbvkVar;
        android.os.Bundle bundle;
        final com.google.android.gms.internal.ads.zzfca zzfcaVar = (com.google.android.gms.internal.ads.zzfca) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && (zzbvkVar = zzfcaVar.zzb.zzd) != null && (bundle = zzbvkVar.zzm) != null) {
            this.zzm.zza().putAll(bundle);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcl)).booleanValue()) {
            this.zzm.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        java.lang.String strZzc = zzc(zzfcaVar);
        this.zzi.zzi(zzfcaVar.zzb.zzb);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzih)).booleanValue() && (i = zzfcaVar.zzb.zzb.zzf) != 0 && (i < 200 || i >= 300)) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(3, strZzc));
        }
        com.google.android.gms.internal.ads.zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdH)).booleanValue()) {
            for (com.google.android.gms.internal.ads.zzfbo zzfboVar : zzfcaVar.zzb.zza) {
                this.zzi.zzd(zzfboVar);
                it = zzfboVar.zza.iterator();
                while (true) {
                    if (it.hasNext()) {
                        this.zzi.zzf(zzfboVar, 0L, com.google.android.gms.internal.ads.zzfdk.zzd(1, null, null));
                        break;
                        break;
                    }
                    zzecwVarZza = this.zzg.zza(zzfboVar.zzb, (java.lang.String) it.next());
                    if (zzecwVarZza == null) {
                    }
                }
            }
        } else {
            java.lang.String str = zzfbrVar.zzq;
            if (android.text.TextUtils.isEmpty(str)) {
                while (r0.hasNext()) {
                    this.zzi.zzd(zzfboVar);
                    it = zzfboVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            this.zzi.zzf(zzfboVar, 0L, com.google.android.gms.internal.ads.zzfdk.zzd(1, null, null));
                            break;
                        }
                        zzecwVarZza = this.zzg.zza(zzfboVar.zzb, (java.lang.String) it.next());
                        if (zzecwVarZza == null && zzecwVarZza.zzb(zzfcaVar, zzfboVar)) {
                            break;
                        }
                    }
                }
            } else {
                this.zzi.zzh(str, zzfcaVar.zzb.zza);
            }
        }
        this.zzb.zzo(new com.google.android.gms.internal.ads.zzcmo(zzfcaVar, this.zzd, this.zzc), this.zze);
        if (zzfcaVar.zzb.zzb.zzr > 1) {
            return this.zzl.zzb(zzfcaVar);
        }
        com.google.android.gms.internal.ads.zzfft zzfftVarZza = com.google.android.gms.internal.ads.zzffx.zzc(com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(3, zzc(zzfcaVar))), com.google.android.gms.internal.ads.zzfgh.RENDER_CONFIG_INIT, this.zza).zza();
        this.zzh.zzl();
        int i2 = 0;
        for (final com.google.android.gms.internal.ads.zzfbo zzfboVar2 : zzfcaVar.zzb.zza) {
            for (java.lang.String str2 : zzfboVar2.zza) {
                final com.google.android.gms.internal.ads.zzecw zzecwVarZza2 = this.zzg.zza(zzfboVar2.zzb, str2);
                if (zzecwVarZza2 != null && zzecwVarZza2.zzb(zzfcaVar, zzfboVar2)) {
                    zzfftVarZza = this.zza.zzb(com.google.android.gms.internal.ads.zzfgh.RENDER_CONFIG_WATERFALL, zzfftVarZza).zzh("render-config-" + i2 + "-" + str2).zzc(java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzegv
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                            return this.zza.zzb(zzfboVar2, zzfcaVar, zzecwVarZza2, (java.lang.Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i2++;
        }
        final com.google.android.gms.internal.ads.zzegq zzegqVar = this.zzh;
        java.util.Objects.requireNonNull(zzegqVar);
        zzfftVarZza.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // java.lang.Runnable
            public final void run() {
                zzegqVar.zzj();
            }
        }, this.zze);
        return zzfftVarZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzecw zzecwVar, java.lang.Throwable th) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(this.zzj, 12);
        zzfgwVarZza.zzd(zzfboVar.zzE);
        zzfgwVarZza.zzi();
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzo = com.google.android.gms.internal.ads.zzgch.zzo(zzecwVar.zza(zzfcaVar, zzfboVar), zzfboVar.zzR, java.util.concurrent.TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfcaVar, zzfboVar, listenableFutureZzo, this.zzc);
        com.google.android.gms.internal.ads.zzfhg.zza(listenableFutureZzo, this.zzk, zzfgwVarZza);
        return listenableFutureZzo;
    }
}

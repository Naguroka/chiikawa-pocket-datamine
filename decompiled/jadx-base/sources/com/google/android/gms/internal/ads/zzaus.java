package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaus implements com.google.android.gms.internal.ads.zzauv {
    private static com.google.android.gms.internal.ads.zzaus zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfox zzd;
    private final com.google.android.gms.internal.ads.zzfpe zze;
    private final com.google.android.gms.internal.ads.zzfpg zzf;
    private final com.google.android.gms.internal.ads.zzavx zzg;
    private final com.google.android.gms.internal.ads.zzfni zzh;
    private final java.util.concurrent.Executor zzi;
    private final com.google.android.gms.internal.ads.zzfpd zzj;
    private final com.google.android.gms.internal.ads.zzawm zzl;
    private final com.google.android.gms.internal.ads.zzawe zzm;
    private final com.google.android.gms.internal.ads.zzavv zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final java.lang.Object zzo = new java.lang.Object();
    private final java.util.concurrent.CountDownLatch zzk = new java.util.concurrent.CountDownLatch(1);

    zzaus(android.content.Context context, com.google.android.gms.internal.ads.zzfni zzfniVar, com.google.android.gms.internal.ads.zzfox zzfoxVar, com.google.android.gms.internal.ads.zzfpe zzfpeVar, com.google.android.gms.internal.ads.zzfpg zzfpgVar, com.google.android.gms.internal.ads.zzavx zzavxVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfnd zzfndVar, int i, com.google.android.gms.internal.ads.zzawm zzawmVar, com.google.android.gms.internal.ads.zzawe zzaweVar, com.google.android.gms.internal.ads.zzavv zzavvVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfniVar;
        this.zzd = zzfoxVar;
        this.zze = zzfpeVar;
        this.zzf = zzfpgVar;
        this.zzg = zzavxVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzawmVar;
        this.zzm = zzaweVar;
        this.zzn = zzavvVar;
        this.zzq = false;
        this.zzj = new com.google.android.gms.internal.ads.zzauq(this, zzfndVar);
    }

    public static synchronized com.google.android.gms.internal.ads.zzaus zza(android.content.Context context, com.google.android.gms.internal.ads.zzarg zzargVar, boolean z) {
        com.google.android.gms.internal.ads.zzfnj zzfnjVarZzc;
        zzfnjVarZzc = com.google.android.gms.internal.ads.zzfnk.zzc();
        zzfnjVarZzc.zza(zzargVar.zzf());
        zzfnjVarZzc.zzg(zzargVar.zzi());
        return zzs(context, java.util.concurrent.Executors.newCachedThreadPool(), zzfnjVarZzc.zzh(), z);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ce A[Catch: all -> 0x011c, zzgyg -> 0x011e, TryCatch #1 {zzgyg -> 0x011e, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:38:0x00db, B:40:0x00e1, B:42:0x00e9, B:43:0x00eb, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:44:0x00f5, B:45:0x0102, B:46:0x010f), top: B:58:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5 A[Catch: all -> 0x011c, zzgyg -> 0x011e, TryCatch #1 {zzgyg -> 0x011e, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:38:0x00db, B:40:0x00e1, B:42:0x00e9, B:43:0x00eb, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:44:0x00f5, B:45:0x0102, B:46:0x010f), top: B:58:0x0021, outer: #2 }] */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzaus zzausVar) {
        java.lang.String str;
        java.lang.String strZzj;
        int length;
        boolean zZza;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfow zzfowVarZzu = zzausVar.zzu(1);
        if (zzfowVarZzu != null) {
            java.lang.String strZzk = zzfowVarZzu.zza().zzk();
            strZzj = zzfowVarZzu.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                com.google.android.gms.internal.ads.zzfpb zzfpbVarZza = com.google.android.gms.internal.ads.zzfns.zza(zzausVar.zzc, 1, zzausVar.zzr, str, strZzj, "1", zzausVar.zzh);
                byte[] bArr = zzfpbVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzausVar.zzh.zzd(com.json.mediationsdk.utils.IronSourceConstants.errorCode_adClosed, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        com.google.android.gms.internal.ads.zzaxw zzaxwVarZzb = com.google.android.gms.internal.ads.zzaxw.zzb(com.google.android.gms.internal.ads.zzgwj.zzv(bArr, 0, length), com.google.android.gms.internal.ads.zzgxb.zza());
                        if (zzaxwVarZzb.zzc().zzk().isEmpty() || zzaxwVarZzb.zzc().zzj().isEmpty() || zzaxwVarZzb.zzd().zzA().length == 0) {
                            zzausVar.zzh.zzd(com.json.mediationsdk.utils.IronSourceConstants.errorCode_destroy, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            com.google.android.gms.internal.ads.zzfow zzfowVarZzu2 = zzausVar.zzu(1);
                            if (zzfowVarZzu2 != null) {
                                com.google.android.gms.internal.ads.zzaxz zzaxzVarZza = zzfowVarZzu2.zza();
                                if (zzaxwVarZzb.zzc().zzk().equals(zzaxzVarZza.zzk()) && zzaxwVarZzb.zzc().zzj().equals(zzaxzVarZza.zzj())) {
                                    zzausVar.zzh.zzd(com.json.mediationsdk.utils.IronSourceConstants.errorCode_destroy, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            }
                            com.google.android.gms.internal.ads.zzfpd zzfpdVar = zzausVar.zzj;
                            int i = zzfpbVarZza.zzc;
                            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcu)).booleanValue()) {
                                zZza = zzausVar.zzd.zza(zzaxwVarZzb, zzfpdVar);
                            } else if (i == 3) {
                                zZza = zzausVar.zze.zza(zzaxwVarZzb);
                            } else if (i == 4) {
                                zZza = zzausVar.zze.zzb(zzaxwVarZzb, zzfpdVar);
                            } else {
                                zzausVar.zzh.zzd(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_SHOW, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                com.google.android.gms.internal.ads.zzfow zzfowVarZzu3 = zzausVar.zzu(1);
                                if (zzfowVarZzu3 != null) {
                                    if (zzausVar.zzf.zzc(zzfowVarZzu3)) {
                                        zzausVar.zzq = true;
                                    }
                                    zzausVar.zza = java.lang.System.currentTimeMillis() / 1000;
                                }
                            } else {
                                zzausVar.zzh.zzd(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_SHOW, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (java.lang.NullPointerException unused) {
                        zzausVar.zzh.zzd(com.json.mediationsdk.logger.IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (com.google.android.gms.internal.ads.zzgyg e) {
                zzausVar.zzh.zzc(4002, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            zzausVar.zzk.countDown();
        }
    }

    private static synchronized com.google.android.gms.internal.ads.zzaus zzs(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfnk zzfnkVar, boolean z) {
        if (zzb == null) {
            com.google.android.gms.internal.ads.zzfni zzfniVarZza = com.google.android.gms.internal.ads.zzfni.zza(context, executor, z);
            com.google.android.gms.internal.ads.zzavg zzavgVarZzc = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdw)).booleanValue() ? com.google.android.gms.internal.ads.zzavg.zzc(context) : null;
            com.google.android.gms.internal.ads.zzawm zzawmVarZzd = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdx)).booleanValue() ? com.google.android.gms.internal.ads.zzawm.zzd(context, executor) : null;
            com.google.android.gms.internal.ads.zzawe zzaweVar = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcM)).booleanValue() ? new com.google.android.gms.internal.ads.zzawe() : null;
            com.google.android.gms.internal.ads.zzavv zzavvVar = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcT)).booleanValue() ? new com.google.android.gms.internal.ads.zzavv() : null;
            com.google.android.gms.internal.ads.zzfob zzfobVarZze = com.google.android.gms.internal.ads.zzfob.zze(context, executor, zzfniVarZza, zzfnkVar);
            com.google.android.gms.internal.ads.zzavw zzavwVar = new com.google.android.gms.internal.ads.zzavw(context);
            com.google.android.gms.internal.ads.zzavx zzavxVar = new com.google.android.gms.internal.ads.zzavx(zzfnkVar, zzfobVarZze, new com.google.android.gms.internal.ads.zzawk(context, zzavwVar), zzavwVar, zzavgVarZzc, zzawmVarZzd, zzaweVar, zzavvVar);
            int iZzb = com.google.android.gms.internal.ads.zzfok.zzb(context, zzfniVarZza);
            com.google.android.gms.internal.ads.zzfnd zzfndVar = new com.google.android.gms.internal.ads.zzfnd();
            com.google.android.gms.internal.ads.zzaus zzausVar = new com.google.android.gms.internal.ads.zzaus(context, zzfniVarZza, new com.google.android.gms.internal.ads.zzfox(context, iZzb), new com.google.android.gms.internal.ads.zzfpe(context, iZzb, new com.google.android.gms.internal.ads.zzaup(zzfniVarZza), ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcw)).booleanValue()), new com.google.android.gms.internal.ads.zzfpg(context, zzavxVar, zzfniVarZza, zzfndVar), zzavxVar, executor, zzfndVar, iZzb, zzawmVarZzd, zzaweVar, zzavvVar);
            zzb = zzausVar;
            zzausVar.zzm();
            zzb.zzp();
        }
        return zzb;
    }

    private final void zzt() {
        com.google.android.gms.internal.ads.zzawm zzawmVar = this.zzl;
        if (zzawmVar != null) {
            zzawmVar.zzh();
        }
    }

    private final com.google.android.gms.internal.ads.zzfow zzu(int i) {
        if (com.google.android.gms.internal.ads.zzfok.zza(this.zzr)) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcu)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzd(android.content.Context context, java.lang.String str, android.view.View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zze(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        zzt();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        com.google.android.gms.internal.ads.zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strZza = zzfnlVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzf(android.content.Context context) {
        zzt();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        com.google.android.gms.internal.ads.zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strZzc = zzfnlVarZza.zzc(context, null);
        this.zzh.zzf(5001, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzg(android.content.Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzh(android.content.Context context, android.view.View view, android.app.Activity activity) {
        zzt();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        com.google.android.gms.internal.ads.zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strZzb = zzfnlVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzk(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza != null) {
            try {
                zzfnlVarZza.zzd(null, motionEvent);
            } catch (com.google.android.gms.internal.ads.zzfpf e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int i, int i2, int i3) {
        android.util.DisplayMetrics displayMetrics;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlP)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(0L, 0L, 0, displayMetrics.density * f, displayMetrics.density * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        android.view.MotionEvent motionEventObtain2 = android.view.MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        android.view.MotionEvent motionEventObtain3 = android.view.MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    final synchronized void zzm() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfow zzfowVarZzu = zzu(1);
        if (zzfowVarZzu == null) {
            this.zzh.zzd(4013, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfowVarZzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzn(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.zzavv zzavvVar = this.zzn;
        if (zzavvVar != null) {
            zzavvVar.zzb(java.util.Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzo(android.view.View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((java.lang.System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                com.google.android.gms.internal.ads.zzfow zzfowVarZzb = this.zzf.zzb();
                if ((zzfowVarZzb == null || zzfowVarZzb.zzd(3600L)) && com.google.android.gms.internal.ads.zzfok.zza(this.zzr)) {
                    this.zzi.execute(new com.google.android.gms.internal.ads.zzaur(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}

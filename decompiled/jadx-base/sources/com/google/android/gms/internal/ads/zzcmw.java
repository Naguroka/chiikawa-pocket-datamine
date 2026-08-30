package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcmw implements com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcwn, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcwj, com.google.android.gms.internal.ads.zzddj {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzfca zze;
    private final com.google.android.gms.internal.ads.zzfbo zzf;
    private final com.google.android.gms.internal.ads.zzfiv zzg;
    private final com.google.android.gms.internal.ads.zzfcv zzh;
    private final com.google.android.gms.internal.ads.zzava zzi;
    private final com.google.android.gms.internal.ads.zzbds zzj;
    private final java.lang.ref.WeakReference zzk;
    private final java.lang.ref.WeakReference zzl;
    private final com.google.android.gms.internal.ads.zzcut zzm;
    private boolean zzn;
    private final java.util.concurrent.atomic.AtomicBoolean zzo = new java.util.concurrent.atomic.AtomicBoolean();

    zzcmw(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfiv zzfivVar, com.google.android.gms.internal.ads.zzfcv zzfcvVar, android.view.View view, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzbds zzbdsVar, com.google.android.gms.internal.ads.zzbdu zzbduVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzcut zzcutVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfcaVar;
        this.zzf = zzfboVar;
        this.zzg = zzfivVar;
        this.zzh = zzfcvVar;
        this.zzi = zzavaVar;
        this.zzk = new java.lang.ref.WeakReference(view);
        this.zzl = new java.lang.ref.WeakReference(zzcexVar);
        this.zzj = zzbdsVar;
        this.zzm = zzcutVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List zzu() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzll)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zza)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                java.lang.Integer numZzt = com.google.android.gms.ads.internal.util.zzs.zzt(this.zza);
                if (numZzt != null) {
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(java.lang.Math.min(numZzt.intValue(), 20));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(android.net.Uri.parse((java.lang.String) it.next()).buildUpon().appendQueryParameter("dspct", java.lang.Integer.toString(numValueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        java.lang.String strZzh;
        int i;
        java.util.List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdE)).booleanValue()) {
            strZzh = this.zzi.zzc().zzh(this.zza, (android.view.View) this.zzk.get(), null);
        } else {
            strZzh = null;
        }
        if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaB)).booleanValue() && this.zze.zzb.zzb.zzh) || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbek.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, strZzh, null, zzu()));
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbek.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        com.google.android.gms.internal.ads.zzgch.zzr((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgby.zzu(com.google.android.gms.internal.ads.zzgch.zzh(null)), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbe)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd), new com.google.android.gms.internal.ads.zzcmv(this, strZzh), this.zzb);
    }

    private final void zzw(final int i, final int i2) {
        android.view.View view;
        if (i <= 0 || !((view = (android.view.View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcms
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(i, i2);
                }
            }, i2, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaB)).booleanValue() && this.zze.zzb.zzb.zzh) && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbek.zzd.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzgch.zzr((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze(com.google.android.gms.internal.ads.zzgby.zzu(this.zzj.zza()), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzcmq
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final java.lang.Object apply(java.lang.Object obj) {
                    return "failure_click_attok";
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg), new com.google.android.gms.internal.ads.zzcmu(this), this.zzb);
            return;
        }
        com.google.android.gms.internal.ads.zzfcv zzfcvVar = this.zzh;
        com.google.android.gms.internal.ads.zzfiv zzfivVar = this.zzg;
        com.google.android.gms.internal.ads.zzfca zzfcaVar = this.zze;
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzf;
        zzfcvVar.zzc(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzc), true == com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(com.google.android.gms.internal.ads.zzbvw zzbvwVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfcv zzfcvVar = this.zzh;
        com.google.android.gms.internal.ads.zzfiv zzfivVar = this.zzg;
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zze(zzfboVar, zzfboVar.zzh, zzbvwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        com.google.android.gms.internal.ads.zzfcv zzfcvVar = this.zzh;
        com.google.android.gms.internal.ads.zzfiv zzfivVar = this.zzg;
        com.google.android.gms.internal.ads.zzfca zzfcaVar = this.zze;
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        com.google.android.gms.internal.ads.zzfcv zzfcvVar = this.zzh;
        com.google.android.gms.internal.ads.zzfiv zzfivVar = this.zzg;
        com.google.android.gms.internal.ads.zzfca zzfcaVar = this.zze;
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzg));
    }

    final /* synthetic */ void zzn() {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv();
            }
        });
    }

    final /* synthetic */ void zzo(final int i, final int i2) {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(i, i2);
            }
        });
    }

    final /* synthetic */ void zzp(int i, int i2) {
        zzw(i - 1, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbD)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, com.google.android.gms.internal.ads.zzfiv.zzf(2, zzeVar.zza, this.zzf.zzo)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (this.zzo.compareAndSet(false, true)) {
            int iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdN)).intValue();
            if (iIntValue > 0) {
                zzw(iIntValue, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdO)).intValue());
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdM)).booleanValue()) {
                this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzn();
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzs() {
        com.google.android.gms.internal.ads.zzcut zzcutVar;
        if (this.zzn) {
            java.util.ArrayList arrayList = new java.util.ArrayList(zzu());
            arrayList.addAll(this.zzf.zzf);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            com.google.android.gms.internal.ads.zzfcv zzfcvVar = this.zzh;
            com.google.android.gms.internal.ads.zzfiv zzfivVar = this.zzg;
            com.google.android.gms.internal.ads.zzfca zzfcaVar = this.zze;
            com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzf;
            zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzm));
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdJ)).booleanValue() && (zzcutVar = this.zzm) != null) {
                java.util.List listZzh = com.google.android.gms.internal.ads.zzfiv.zzh(com.google.android.gms.internal.ads.zzfiv.zzg(zzcutVar.zzb().zzm, zzcutVar.zza().zzg()), this.zzm.zza().zza());
                com.google.android.gms.internal.ads.zzfcv zzfcvVar2 = this.zzh;
                com.google.android.gms.internal.ads.zzfiv zzfivVar2 = this.zzg;
                com.google.android.gms.internal.ads.zzcut zzcutVar2 = this.zzm;
                zzfcvVar2.zza(zzfivVar2.zzc(zzcutVar2.zzc(), zzcutVar2.zzb(), listZzh));
            }
            com.google.android.gms.internal.ads.zzfcv zzfcvVar3 = this.zzh;
            com.google.android.gms.internal.ads.zzfiv zzfivVar3 = this.zzg;
            com.google.android.gms.internal.ads.zzfca zzfcaVar2 = this.zze;
            com.google.android.gms.internal.ads.zzfbo zzfboVar2 = this.zzf;
            zzfcvVar3.zza(zzfivVar3.zzc(zzfcaVar2, zzfboVar2, zzfboVar2.zzf));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzddj
    public final void zzt() {
        com.google.android.gms.internal.ads.zzfcv zzfcvVar = this.zzh;
        com.google.android.gms.internal.ads.zzfiv zzfivVar = this.zzg;
        com.google.android.gms.internal.ads.zzfca zzfcaVar = this.zze;
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzau));
    }
}

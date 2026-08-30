package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzel {
    final com.google.android.gms.ads.internal.client.zzbd zza;
    private final com.google.android.gms.internal.ads.zzbpa zzb;
    private final com.google.android.gms.ads.internal.client.zzr zzc;
    private final java.util.concurrent.atomic.AtomicBoolean zzd;
    private final com.google.android.gms.ads.VideoController zze;
    private com.google.android.gms.ads.internal.client.zza zzf;
    private com.google.android.gms.ads.AdListener zzg;
    private com.google.android.gms.ads.AdSize[] zzh;
    private com.google.android.gms.ads.admanager.AppEventListener zzi;
    private com.google.android.gms.ads.internal.client.zzby zzj;
    private com.google.android.gms.ads.VideoOptions zzk;
    private java.lang.String zzl;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.view.ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private com.google.android.gms.ads.OnPaidEventListener zzp;

    public zzel(android.view.ViewGroup viewGroup) {
        this(viewGroup, null, false, com.google.android.gms.ads.internal.client.zzr.zza, null, 0);
    }

    private static com.google.android.gms.ads.internal.client.zzs zzD(android.content.Context context, com.google.android.gms.ads.AdSize[] adSizeArr, int i) {
        for (com.google.android.gms.ads.AdSize adSize : adSizeArr) {
            if (adSize.equals(com.google.android.gms.ads.AdSize.INVALID)) {
                return new com.google.android.gms.ads.internal.client.zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        com.google.android.gms.ads.internal.client.zzs zzsVar = new com.google.android.gms.ads.internal.client.zzs(context, adSizeArr);
        zzsVar.zzj = zzE(i);
        return zzsVar;
    }

    private static boolean zzE(int i) {
        return i == 1;
    }

    public final boolean zzA() {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzY();
            }
            return false;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzZ();
            }
            return false;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final com.google.android.gms.ads.AdSize[] zzC() {
        return this.zzh;
    }

    public final com.google.android.gms.ads.AdListener zza() {
        return this.zzg;
    }

    public final com.google.android.gms.ads.AdSize zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVarZzg;
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null && (zzsVarZzg = zzbyVar.zzg()) != null) {
                return com.google.android.gms.ads.zzc.zzc(zzsVarZzg.zze, zzsVarZzg.zzb, zzsVarZzg.zza);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        com.google.android.gms.ads.AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final com.google.android.gms.ads.OnPaidEventListener zzc() {
        return this.zzp;
    }

    public final com.google.android.gms.ads.ResponseInfo zzd() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzk = null;
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzdyVarZzk = zzbyVar.zzk();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.ResponseInfo.zza(zzdyVarZzk);
    }

    public final com.google.android.gms.ads.VideoController zzf() {
        return this.zze;
    }

    public final com.google.android.gms.ads.VideoOptions zzg() {
        return this.zzk;
    }

    public final com.google.android.gms.ads.admanager.AppEventListener zzh() {
        return this.zzi;
    }

    public final com.google.android.gms.ads.internal.client.zzeb zzi() {
        com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
        if (zzbyVar != null) {
            try {
                return zzbyVar.zzl();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final java.lang.String zzj() {
        com.google.android.gms.ads.internal.client.zzby zzbyVar;
        if (this.zzl == null && (zzbyVar = this.zzj) != null) {
            try {
                this.zzl = zzbyVar.zzr();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzx();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    final /* synthetic */ void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzm.addView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[Catch: RemoteException -> 0x00df, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00df, blocks: (B:25:0x00a2, B:27:0x00a8, B:29:0x00b6, B:31:0x00c8, B:32:0x00d3), top: B:48:0x00a2, outer: #1 }] */
    public final void zzm(com.google.android.gms.ads.internal.client.zzei zzeiVar) {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new java.lang.IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                android.content.Context context = this.zzm.getContext();
                com.google.android.gms.ads.internal.client.zzs zzsVarZzD = zzD(context, this.zzh, this.zzn);
                com.google.android.gms.ads.internal.client.zzby zzbyVar = "search_v2".equals(zzsVarZzD.zza) ? (com.google.android.gms.ads.internal.client.zzby) new com.google.android.gms.ads.internal.client.zzao(com.google.android.gms.ads.internal.client.zzbc.zza(), context, zzsVarZzD, this.zzl).zzd(context, false) : (com.google.android.gms.ads.internal.client.zzby) new com.google.android.gms.ads.internal.client.zzam(com.google.android.gms.ads.internal.client.zzbc.zza(), context, zzsVarZzD, this.zzl, this.zzb).zzd(context, false);
                this.zzj = zzbyVar;
                zzbyVar.zzD(new com.google.android.gms.ads.internal.client.zzg(this.zza));
                com.google.android.gms.ads.internal.client.zza zzaVar = this.zzf;
                if (zzaVar != null) {
                    this.zzj.zzC(new com.google.android.gms.ads.internal.client.zzb(zzaVar));
                }
                com.google.android.gms.ads.admanager.AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzG(new com.google.android.gms.internal.ads.zzayy(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzU(new com.google.android.gms.ads.internal.client.zzga(this.zzk));
                }
                this.zzj.zzP(new com.google.android.gms.ads.internal.client.zzfs(this.zzp));
                this.zzj.zzN(this.zzo);
                com.google.android.gms.ads.internal.client.zzby zzbyVar2 = this.zzj;
                if (zzbyVar2 != null) {
                    try {
                        final com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzn = zzbyVar2.zzn();
                        if (iObjectWrapperZzn != null) {
                            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzf.zze()).booleanValue()) {
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzl(iObjectWrapperZzn);
                                        }
                                    });
                                } else {
                                    this.zzm.addView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzn));
                                }
                            } else {
                                this.zzm.addView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzn));
                            }
                        }
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            if (zzeiVar != null) {
                zzeiVar.zzq(jCurrentTimeMillis);
            }
            com.google.android.gms.ads.internal.client.zzby zzbyVar3 = this.zzj;
            zzbyVar3.getClass();
            zzbyVar3.zzab(this.zzc.zza(this.zzm.getContext(), zzeiVar));
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn() {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzz();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzA();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzB();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zza zzaVar) {
        try {
            this.zzf = zzaVar;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzC(zzaVar != null ? new com.google.android.gms.ads.internal.client.zzb(zzaVar) : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(com.google.android.gms.ads.AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(com.google.android.gms.ads.AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new java.lang.IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(com.google.android.gms.ads.AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzF(zzD(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(java.lang.String str) {
        if (this.zzl != null) {
            throw new java.lang.IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzv(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new com.google.android.gms.internal.ads.zzayy(appEventListener) : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.zzo = z;
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzN(z);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzP(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzn = zzbyVar.zzn();
            if (iObjectWrapperZzn == null || ((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzn)).getParent() != null) {
                return false;
            }
            this.zzm.addView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzn));
            this.zzj = zzbyVar;
            return true;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzel(android.view.ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, com.google.android.gms.ads.internal.client.zzr.zza, null, i);
    }

    public final void zzy(com.google.android.gms.ads.VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzU(videoOptions == null ? null : new com.google.android.gms.ads.internal.client.zzga(videoOptions));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzel(android.view.ViewGroup viewGroup, android.util.AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, com.google.android.gms.ads.internal.client.zzr.zza, null, 0);
    }

    public zzel(android.view.ViewGroup viewGroup, android.util.AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, com.google.android.gms.ads.internal.client.zzr.zza, null, i);
    }

    zzel(android.view.ViewGroup viewGroup, android.util.AttributeSet attributeSet, boolean z, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzby zzbyVar, int i) {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        this.zzb = new com.google.android.gms.internal.ads.zzbpa();
        this.zze = new com.google.android.gms.ads.VideoController();
        this.zza = new com.google.android.gms.ads.internal.client.zzek(this);
        this.zzm = viewGroup;
        this.zzc = zzrVar;
        this.zzj = null;
        this.zzd = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzn = i;
        if (attributeSet != null) {
            android.content.Context context = viewGroup.getContext();
            try {
                com.google.android.gms.ads.internal.client.zzaa zzaaVar = new com.google.android.gms.ads.internal.client.zzaa(context, attributeSet);
                this.zzh = zzaaVar.zzb(z);
                this.zzl = zzaaVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVarZzb = com.google.android.gms.ads.internal.client.zzbc.zzb();
                    com.google.android.gms.ads.AdSize adSize = this.zzh[0];
                    int i2 = this.zzn;
                    if (adSize.equals(com.google.android.gms.ads.AdSize.INVALID)) {
                        zzsVar = new com.google.android.gms.ads.internal.client.zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        com.google.android.gms.ads.internal.client.zzs zzsVar2 = new com.google.android.gms.ads.internal.client.zzs(context, adSize);
                        zzsVar2.zzj = zzE(i2);
                        zzsVar = zzsVar2;
                    }
                    zzfVarZzb.zzm(viewGroup, zzsVar, "Ads by Google");
                }
            } catch (java.lang.IllegalArgumentException e) {
                com.google.android.gms.ads.internal.client.zzbc.zzb().zzl(viewGroup, new com.google.android.gms.ads.internal.client.zzs(context, com.google.android.gms.ads.AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}

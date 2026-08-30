package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdia extends com.google.android.gms.internal.ads.zzcqz {
    public static final /* synthetic */ int zzc = 0;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.ads.zzdif zze;
    private final com.google.android.gms.internal.ads.zzdin zzf;
    private final com.google.android.gms.internal.ads.zzdjf zzg;
    private final com.google.android.gms.internal.ads.zzdik zzh;
    private final com.google.android.gms.internal.ads.zzdiq zzi;
    private final com.google.android.gms.internal.ads.zzhel zzj;
    private final com.google.android.gms.internal.ads.zzhel zzk;
    private final com.google.android.gms.internal.ads.zzhel zzl;
    private final com.google.android.gms.internal.ads.zzhel zzm;
    private final com.google.android.gms.internal.ads.zzhel zzn;
    private com.google.android.gms.internal.ads.zzdkd zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final com.google.android.gms.internal.ads.zzbye zzs;
    private final com.google.android.gms.internal.ads.zzava zzt;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzu;
    private final android.content.Context zzv;
    private final com.google.android.gms.internal.ads.zzdic zzw;
    private final com.google.android.gms.internal.ads.zzekq zzx;
    private final java.util.Map zzy;
    private final java.util.List zzz;

    static {
        com.google.android.gms.internal.ads.zzfxn.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdia(com.google.android.gms.internal.ads.zzcqy zzcqyVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdif zzdifVar, com.google.android.gms.internal.ads.zzdin zzdinVar, com.google.android.gms.internal.ads.zzdjf zzdjfVar, com.google.android.gms.internal.ads.zzdik zzdikVar, com.google.android.gms.internal.ads.zzdiq zzdiqVar, com.google.android.gms.internal.ads.zzhel zzhelVar, com.google.android.gms.internal.ads.zzhel zzhelVar2, com.google.android.gms.internal.ads.zzhel zzhelVar3, com.google.android.gms.internal.ads.zzhel zzhelVar4, com.google.android.gms.internal.ads.zzhel zzhelVar5, com.google.android.gms.internal.ads.zzbye zzbyeVar, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.Context context, com.google.android.gms.internal.ads.zzdic zzdicVar, com.google.android.gms.internal.ads.zzekq zzekqVar, com.google.android.gms.internal.ads.zzaym zzaymVar) {
        super(zzcqyVar);
        this.zzd = executor;
        this.zze = zzdifVar;
        this.zzf = zzdinVar;
        this.zzg = zzdjfVar;
        this.zzh = zzdikVar;
        this.zzi = zzdiqVar;
        this.zzj = zzhelVar;
        this.zzk = zzhelVar2;
        this.zzl = zzhelVar3;
        this.zzm = zzhelVar4;
        this.zzn = zzhelVar5;
        this.zzs = zzbyeVar;
        this.zzt = zzavaVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdicVar;
        this.zzx = zzekqVar;
        this.zzy = new java.util.HashMap();
        this.zzz = new java.util.ArrayList();
    }

    public static boolean zzY(android.view.View view) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkw)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new android.graphics.Rect(), new android.graphics.Point());
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        long jZzx = com.google.android.gms.ads.internal.util.zzs.zzx(view);
        if (view.isShown() && view.getGlobalVisibleRect(new android.graphics.Rect(), new android.graphics.Point())) {
            if (jZzx >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkx)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized android.widget.ImageView.ScaleType zzaa() {
        com.google.android.gms.internal.ads.zzdkd zzdkdVar = this.zzo;
        if (zzdkdVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzj = zzdkdVar.zzj();
        if (iObjectWrapperZzj != null) {
            return (android.widget.ImageView.ScaleType) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzj);
        }
        return com.google.android.gms.internal.ads.zzdjf.zza;
    }

    private final void zzab(java.lang.String str, boolean z) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfl)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzw = this.zze.zzw();
        if (listenableFutureZzw == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzw, new com.google.android.gms.internal.ads.zzdhy(this, "Google", true), this.zzd);
    }

    private final synchronized void zzac(android.view.View view, java.util.Map map, java.util.Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzr(view, map, map2, zzaa());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(android.view.View view, com.google.android.gms.internal.ads.zzecr zzecrVar) {
        com.google.android.gms.internal.ads.zzcex zzcexVarZzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzecrVar == null || zzcexVarZzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzecrVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        java.util.Iterator<java.lang.String> itKeys;
        android.view.View view;
        com.google.android.gms.internal.ads.zzauv zzauvVarZzc;
        if (!this.zzp) {
            this.zzo = zzdkdVar;
            this.zzg.zze(zzdkdVar);
            this.zzf.zzz(zzdkdVar.zzf(), zzdkdVar.zzm(), zzdkdVar.zzn(), zzdkdVar, zzdkdVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcK)).booleanValue() && (zzauvVarZzc = this.zzt.zzc()) != null) {
                zzauvVarZzc.zzo(zzdkdVar.zzf());
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbS)).booleanValue()) {
                com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzb;
                if (zzfboVar.zzak && (itKeys = zzfboVar.zzaj.keys()) != null) {
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        com.google.android.gms.internal.ads.zzdkd zzdkdVar2 = this.zzo;
                        java.lang.ref.WeakReference weakReference = zzdkdVar2 == null ? null : (java.lang.ref.WeakReference) zzdkdVar2.zzl().get(next);
                        this.zzy.put(next, false);
                        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
                            com.google.android.gms.internal.ads.zzayl zzaylVar = new com.google.android.gms.internal.ads.zzayl(this.zzv, view);
                            this.zzz.add(zzaylVar);
                            zzaylVar.zzc(new com.google.android.gms.internal.ads.zzdhx(this, next));
                        }
                    }
                }
            }
            if (zzdkdVar.zzi() != null) {
                zzdkdVar.zzi().zzc(this.zzs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzA(com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        this.zzf.zzA(zzdkdVar.zzf(), zzdkdVar.zzl());
        if (zzdkdVar.zzh() != null) {
            zzdkdVar.zzh().setClickable(false);
            zzdkdVar.zzh().removeAllViews();
        }
        if (zzdkdVar.zzi() != null) {
            zzdkdVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[Catch: all -> 0x008e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:17:0x0046, B:20:0x005a, B:21:0x0062, B:23:0x0068, B:25:0x007c, B:27:0x0082, B:32:0x0089), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[Catch: all -> 0x008e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:17:0x0046, B:20:0x005a, B:21:0x0062, B:23:0x0068, B:25:0x007c, B:27:0x0082, B:32:0x0089), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:17:0x0046, B:20:0x005a, B:21:0x0062, B:23:0x0068, B:25:0x007c, B:27:0x0082, B:32:0x0089), top: B:38:0x0001 }] */
    public final synchronized void zzB(android.view.View view, java.util.Map map, java.util.Map map2, boolean z) {
        java.util.Iterator it;
        android.view.View view2;
        if (!this.zzq) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbS)).booleanValue() && this.zzb.zzak) {
                java.util.Iterator it2 = this.zzy.keySet().iterator();
                while (it2.hasNext()) {
                    if (!((java.lang.Boolean) this.zzy.get((java.lang.String) it2.next())).booleanValue()) {
                    }
                }
                if (!z) {
                    zzac(view, map, map2);
                    return;
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdX)).booleanValue()) {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                        if (view2 == null) {
                        }
                    }
                }
            } else {
                if (!z) {
                    zzac(view, map, map2);
                    return;
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdX)).booleanValue() && map != null) {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                        if (view2 == null && zzY(view2)) {
                            zzac(view, map, map2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        this.zzf.zzk(zzdhVar);
    }

    public final synchronized void zzD(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z) {
        com.google.android.gms.internal.ads.zzcex zzcexVarZzs;
        this.zzg.zzc(this.zzo);
        this.zzf.zzl(view, view2, map, map2, z, zzaa());
        if (this.zzr) {
            com.google.android.gms.internal.ads.zzdif zzdifVar = this.zze;
            if (zzdifVar.zzs() != null && (zzcexVarZzs = zzdifVar.zzs()) != null) {
                zzcexVarZzs.zzd("onSdkAdUserInteractionClick", new androidx.collection.ArrayMap());
            }
        }
    }

    public final synchronized void zzE(final android.view.View view, final int i) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzls)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdkd zzdkdVar = this.zzo;
            if (zzdkdVar == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdkdVar instanceof com.google.android.gms.internal.ads.zzdiz;
                this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdhu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzx(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(java.lang.String str) {
        this.zzf.zzm(str);
    }

    public final synchronized void zzG(android.os.Bundle bundle) {
        this.zzf.zzn(bundle);
    }

    public final synchronized void zzH() {
        com.google.android.gms.internal.ads.zzdkd zzdkdVar = this.zzo;
        if (zzdkdVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdkdVar instanceof com.google.android.gms.internal.ads.zzdiz;
            this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdhw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(z);
                }
            });
        }
    }

    public final void zzI(android.os.Bundle bundle) {
        final com.google.android.gms.internal.ads.zzcex zzcexVarZzs = this.zze.zzs();
        if (zzcexVarZzs == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Video webview is null");
            return;
        }
        try {
            final org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdht
                @Override // java.lang.Runnable
                public final void run() {
                    int i = com.google.android.gms.internal.ads.zzdia.zzc;
                    zzcexVarZzs.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error reading event signals", e);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzs();
    }

    public final void zzK(android.view.View view) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfl)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdif zzdifVar = this.zze;
            if (zzdifVar.zzc() != 3) {
                com.google.android.gms.internal.ads.zzcab zzcabVarZzp = zzdifVar.zzp();
                if (zzcabVarZzp == null) {
                    return;
                }
                com.google.android.gms.internal.ads.zzgch.zzr(zzcabVarZzp, new com.google.android.gms.internal.ads.zzdhz(this, view), this.zzd);
                return;
            }
        }
        zzad(view, this.zze.zzu());
    }

    public final synchronized void zzL(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
        this.zzf.zzt(view, motionEvent, view2);
    }

    public final synchronized void zzM(android.os.Bundle bundle) {
        this.zzf.zzu(bundle);
    }

    public final synchronized void zzN(android.view.View view) {
        this.zzf.zzv(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzw();
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzf.zzx(zzddVar);
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzx.zza(zzdrVar);
    }

    public final synchronized void zzR(com.google.android.gms.internal.ads.zzbhq zzbhqVar) {
        this.zzf.zzy(zzbhqVar);
    }

    public final synchronized void zzS(final com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbQ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdhp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzz(zzdkdVar);
                }
            });
        } else {
            zzz(zzdkdVar);
        }
    }

    public final synchronized void zzT(final com.google.android.gms.internal.ads.zzdkd zzdkdVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbQ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdhq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzA(zzdkdVar);
                }
            });
        } else {
            zzA(zzdkdVar);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzB();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzC();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(android.os.Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzD = this.zzf.zzD(bundle);
        this.zzq = zZzD;
        return zZzD;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdhv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzw();
            }
        });
        super.zzb();
    }

    public final com.google.android.gms.internal.ads.zzdic zzc() {
        return this.zzw;
    }

    public final com.google.android.gms.internal.ads.zzecr zzf(java.lang.String str, boolean z) {
        java.lang.String str2;
        com.google.android.gms.internal.ads.zzeco zzecoVar;
        com.google.android.gms.internal.ads.zzecn zzecnVar;
        java.lang.String str3;
        if (this.zzh.zzd() && !android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.ads.zzdif zzdifVar = this.zze;
            com.google.android.gms.internal.ads.zzcex zzcexVarZzr = zzdifVar.zzr();
            com.google.android.gms.internal.ads.zzcex zzcexVarZzs = zzdifVar.zzs();
            if (zzcexVarZzr == null && zzcexVarZzs == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z2 = false;
            boolean z3 = zzcexVarZzr != null;
            boolean z4 = zzcexVarZzs != null;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfj)).booleanValue()) {
                this.zzh.zza();
                int iZzc = this.zzh.zza().zzc();
                int i = iZzc - 1;
                if (i != 0) {
                    if (i != 1) {
                        if (iZzc != 1) {
                            str3 = iZzc != 2 ? "UNKNOWN" : "DISPLAY";
                        } else {
                            str3 = "VIDEO";
                        }
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                        return null;
                    }
                    if (zzcexVarZzr == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    z4 = false;
                    z2 = true;
                } else {
                    if (zzcexVarZzs == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    z4 = true;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzcexVarZzr = zzcexVarZzs;
            }
            if (zzcexVarZzr != null) {
                if (!com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zzv)) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzu;
                java.lang.String str4 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                if (z4) {
                    zzecnVar = com.google.android.gms.internal.ads.zzecn.VIDEO;
                    zzecoVar = com.google.android.gms.internal.ads.zzeco.DEFINED_BY_JAVASCRIPT;
                } else {
                    com.google.android.gms.internal.ads.zzdif zzdifVar2 = this.zze;
                    com.google.android.gms.internal.ads.zzecn zzecnVar2 = com.google.android.gms.internal.ads.zzecn.NATIVE_DISPLAY;
                    zzecoVar = zzdifVar2.zzc() == 3 ? com.google.android.gms.internal.ads.zzeco.UNSPECIFIED : com.google.android.gms.internal.ads.zzeco.ONE_PIXEL;
                    zzecnVar = zzecnVar2;
                }
                com.google.android.gms.internal.ads.zzecr zzecrVarZzb = com.google.android.gms.ads.internal.zzv.zzB().zzb(str4, zzcexVarZzr.zzG(), "", "javascript", str2, str, zzecoVar, zzecnVar, this.zzb.zzal);
                if (zzecrVarZzb == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                this.zze.zzW(zzecrVarZzb);
                zzcexVarZzr.zzat(zzecrVarZzb);
                if (z4) {
                    com.google.android.gms.internal.ads.zzfkp zzfkpVarZza = zzecrVarZzb.zza();
                    if (zzcexVarZzs != null) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzfkpVarZza, zzcexVarZzs.zzF());
                    }
                    this.zzr = true;
                }
                if (z) {
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zzecrVarZzb.zza());
                    zzcexVarZzr.zzd("onSdkLoaded", new androidx.collection.ArrayMap());
                }
                return zzecrVarZzb;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Webview is null in InternalNativeAd");
        }
        return null;
    }

    public final java.lang.String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized org.json.JSONObject zzi(android.view.View view, java.util.Map map, java.util.Map map2) {
        return this.zzf.zze(view, map, map2, zzaa());
    }

    public final synchronized org.json.JSONObject zzj(android.view.View view, java.util.Map map, java.util.Map map2) {
        return this.zzf.zzf(view, map, map2, zzaa());
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    public final void zzk() {
        this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdhr
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzdia.zzl(this.zza);
            }
        });
        if (this.zze.zzc() != 7) {
            java.util.concurrent.Executor executor = this.zzd;
            final com.google.android.gms.internal.ads.zzdin zzdinVar = this.zzf;
            java.util.Objects.requireNonNull(zzdinVar);
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdhs
                @Override // java.lang.Runnable
                public final void run() {
                    zzdinVar.zzq();
                }
            });
        }
        super.zzk();
    }

    public final void zzu(android.view.View view) {
        com.google.android.gms.internal.ads.zzecr zzecrVarZzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzecrVarZzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzg(zzecrVarZzu.zza(), view);
    }

    public final synchronized void zzv() {
        this.zzf.zzi();
    }

    final /* synthetic */ void zzw() {
        this.zzf.zzj();
        this.zze.zzI();
    }

    final /* synthetic */ void zzx(android.view.View view, boolean z, int i) {
        com.google.android.gms.internal.ads.zzdkd zzdkdVar = this.zzo;
        if (zzdkdVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            this.zzf.zzp(view, zzdkdVar.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzaa(), i);
        }
    }

    final /* synthetic */ void zzy(boolean z) {
        com.google.android.gms.internal.ads.zzdkd zzdkdVar = this.zzo;
        if (zzdkdVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.zzf.zzp(null, zzdkdVar.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzaa(), 0);
        }
    }

    public static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzdia zzdiaVar) {
        try {
            com.google.android.gms.internal.ads.zzdif zzdifVar = zzdiaVar.zze;
            int iZzc = zzdifVar.zzc();
            if (iZzc == 1) {
                com.google.android.gms.internal.ads.zzbgx zzbgxVarZzb = zzdiaVar.zzi.zzb();
                if (zzbgxVarZzb != null) {
                    zzdiaVar.zzab("Google", true);
                    zzbgxVarZzb.zze((com.google.android.gms.internal.ads.zzbgn) zzdiaVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                com.google.android.gms.internal.ads.zzbgu zzbguVarZza = zzdiaVar.zzi.zza();
                if (zzbguVarZza != null) {
                    zzdiaVar.zzab("Google", true);
                    zzbguVarZza.zze((com.google.android.gms.internal.ads.zzbgl) zzdiaVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                com.google.android.gms.internal.ads.zzbhd zzbhdVarZzd = zzdiaVar.zzi.zzd(zzdifVar.zzA());
                if (zzbhdVarZzd != null) {
                    if (zzdiaVar.zze.zzs() != null) {
                        zzdiaVar.zzf("Google", true);
                    }
                    zzbhdVarZzd.zze((com.google.android.gms.internal.ads.zzbgq) zzdiaVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                com.google.android.gms.internal.ads.zzbhk zzbhkVarZzf = zzdiaVar.zzi.zzf();
                if (zzbhkVarZzf != null) {
                    zzdiaVar.zzab("Google", true);
                    zzbhkVarZzf.zze((com.google.android.gms.internal.ads.zzbht) zzdiaVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrong native template id!");
                return;
            }
            com.google.android.gms.internal.ads.zzbmi zzbmiVarZzg = zzdiaVar.zzi.zzg();
            if (zzbmiVarZzg != null) {
                zzbmiVarZzg.zzg((com.google.android.gms.internal.ads.zzbmc) zzdiaVar.zzm.zzb());
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}

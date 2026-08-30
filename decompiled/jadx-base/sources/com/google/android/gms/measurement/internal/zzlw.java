package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlw extends com.google.android.gms.measurement.internal.zzg {
    protected com.google.android.gms.measurement.internal.zzlv zza;
    final com.google.android.gms.measurement.internal.zzx zzb;
    protected boolean zzc;
    private com.google.android.gms.measurement.internal.zzkb zzd;
    private final java.util.Set zze;
    private boolean zzf;
    private final java.util.concurrent.atomic.AtomicReference zzg;
    private final java.lang.Object zzh;
    private boolean zzi;
    private int zzj;
    private com.google.android.gms.measurement.internal.zzaz zzk;
    private com.google.android.gms.measurement.internal.zzaz zzl;
    private java.util.PriorityQueue zzm;
    private boolean zzn;
    private com.google.android.gms.measurement.internal.zzjx zzo;
    private final java.util.concurrent.atomic.AtomicLong zzp;
    private long zzq;
    private com.google.android.gms.measurement.internal.zzaz zzr;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private com.google.android.gms.measurement.internal.zzaz zzt;
    private final com.google.android.gms.measurement.internal.zzqe zzv;

    protected zzlw(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zze = new java.util.concurrent.CopyOnWriteArraySet();
        this.zzh = new java.lang.Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new com.google.android.gms.measurement.internal.zzlk(this);
        this.zzg = new java.util.concurrent.atomic.AtomicReference();
        this.zzo = com.google.android.gms.measurement.internal.zzjx.zza;
        this.zzq = -1L;
        this.zzp = new java.util.concurrent.atomic.AtomicLong(0L);
        this.zzb = new com.google.android.gms.measurement.internal.zzx(zzioVar);
    }

    public static /* synthetic */ void zzA(com.google.android.gms.measurement.internal.zzlw zzlwVar, android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
        if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbj)) {
            if (java.util.Objects.equals(str, com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                zzioVar.zzaW().zzj().zza("IABTCF_TCString change picked up in listener.");
                ((com.google.android.gms.measurement.internal.zzaz) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlwVar.zzt)).zzd(500L);
                return;
            }
            return;
        }
        if (java.util.Objects.equals(str, com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY) || java.util.Objects.equals(str, "IABTCF_gdprApplies") || java.util.Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzioVar.zzaW().zzj().zza("IABTCF_TCString change picked up in listener.");
            ((com.google.android.gms.measurement.internal.zzaz) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlwVar.zzt)).zzd(500L);
        }
    }

    static /* synthetic */ void zzD(com.google.android.gms.measurement.internal.zzlw zzlwVar, com.google.android.gms.measurement.internal.zzjx zzjxVar, long j, boolean z, boolean z2) {
        zzlwVar.zzg();
        zzlwVar.zza();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
        com.google.android.gms.measurement.internal.zzjx zzjxVarZzh = zzioVar.zzm().zzh();
        if (j <= zzlwVar.zzq && com.google.android.gms.measurement.internal.zzjx.zzs(zzjxVarZzh.zzb(), zzjxVar.zzb())) {
            zzioVar.zzaW().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjxVar);
            return;
        }
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzhtVarZzm.zzu;
        zzhtVarZzm.zzg();
        int iZzb = zzjxVar.zzb();
        if (!zzhtVarZzm.zzq(iZzb)) {
            zzioVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", java.lang.Integer.valueOf(zzjxVar.zzb()));
            return;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar3 = zzlwVar.zzu;
        android.content.SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
        editorEdit.putString("consent_settings", zzjxVar.zzq());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzioVar.zzaW().zzj().zzb("Setting storage consent(FE)", zzjxVar);
        zzlwVar.zzq = j;
        if (zzioVar3.zzu().zzac()) {
            zzioVar3.zzu().zzX(z);
        } else {
            zzioVar3.zzu().zzR(z);
        }
        if (z2) {
            zzioVar3.zzu().zzE(new java.util.concurrent.atomic.AtomicReference());
        }
    }

    static /* bridge */ /* synthetic */ void zzF(com.google.android.gms.measurement.internal.zzlw zzlwVar, int i) {
        if (zzlwVar.zzk == null) {
            zzlwVar.zzk = new com.google.android.gms.measurement.internal.zzku(zzlwVar, zzlwVar.zzu);
        }
        zzlwVar.zzk.zzd(((long) i) * 1000);
    }

    static /* bridge */ /* synthetic */ int zzaq(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        zzlwVar.zzn = false;
        int i = 2;
        if (message != null) {
            if ((th instanceof java.lang.IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                i = 1;
                if (message.contains("Background")) {
                    zzlwVar.zzn = true;
                    return 1;
                }
            } else if ((th instanceof java.lang.SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                return 3;
            }
        }
        return i;
    }

    private final com.google.android.gms.measurement.internal.zzme zzar(final com.google.android.gms.measurement.internal.zzpa zzpaVar) {
        try {
            java.net.URL url = new java.net.URI(zzpaVar.zzc).toURL();
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            java.lang.String strZzn = this.zzu.zzh().zzn();
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            com.google.android.gms.measurement.internal.zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
            java.lang.Long lValueOf = java.lang.Long.valueOf(zzpaVar.zza);
            zzhcVarZzj.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzpaVar.zzc, java.lang.Integer.valueOf(zzpaVar.zzb.length));
            if (!android.text.TextUtils.isEmpty(zzpaVar.zzg)) {
                zzioVar.zzaW().zzj().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzpaVar.zzg);
            }
            java.util.HashMap map = new java.util.HashMap();
            android.os.Bundle bundle = zzpaVar.zzd;
            for (java.lang.String str : bundle.keySet()) {
                java.lang.String string = bundle.getString(str);
                if (!android.text.TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            com.google.android.gms.measurement.internal.zzmb zzmbVarZzr = zzioVar.zzr();
            byte[] bArr = zzpaVar.zzb;
            com.google.android.gms.measurement.internal.zzly zzlyVar = new com.google.android.gms.measurement.internal.zzly() { // from class: com.google.android.gms.measurement.internal.zzkn
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r11
  0x002e: PHI (r11v7 int) = (r11v1 int), (r11v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzly
                public final void zza(java.lang.String str2, int i, java.lang.Throwable th, byte[] bArr2, java.util.Map map2) {
                    com.google.android.gms.measurement.internal.zzme zzmeVar;
                    com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zza;
                    zzlwVar.zzg();
                    com.google.android.gms.measurement.internal.zzpa zzpaVar2 = zzpaVar;
                    if (i == 200 || i == 204) {
                        if (th == null) {
                            zzlwVar.zzu.zzaW().zzj().zzb("[sgtm] Upload succeeded for row_id", java.lang.Long.valueOf(zzpaVar2.zza));
                            zzmeVar = com.google.android.gms.measurement.internal.zzme.SUCCESS;
                        } else {
                            zzlwVar.zzu.zzaW().zzk().zzd("[sgtm] Upload failed for row_id. response, exception", java.lang.Long.valueOf(zzpaVar2.zza), java.lang.Integer.valueOf(i), th);
                            if (java.util.Arrays.asList(((java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzt.zza(null)).split(",")).contains(java.lang.String.valueOf(i))) {
                                zzmeVar = com.google.android.gms.measurement.internal.zzme.BACKOFF;
                            } else {
                                zzmeVar = com.google.android.gms.measurement.internal.zzme.FAILURE;
                            }
                        }
                    } else if (i == 304) {
                        i = 304;
                        if (th == null) {
                            zzlwVar.zzu.zzaW().zzj().zzb("[sgtm] Upload succeeded for row_id", java.lang.Long.valueOf(zzpaVar2.zza));
                            zzmeVar = com.google.android.gms.measurement.internal.zzme.SUCCESS;
                        } else {
                            zzlwVar.zzu.zzaW().zzk().zzd("[sgtm] Upload failed for row_id. response, exception", java.lang.Long.valueOf(zzpaVar2.zza), java.lang.Integer.valueOf(i), th);
                            if (java.util.Arrays.asList(((java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzt.zza(null)).split(",")).contains(java.lang.String.valueOf(i))) {
                                zzmeVar = com.google.android.gms.measurement.internal.zzme.BACKOFF;
                            } else {
                                zzmeVar = com.google.android.gms.measurement.internal.zzme.FAILURE;
                            }
                        }
                    } else {
                        zzlwVar.zzu.zzaW().zzk().zzd("[sgtm] Upload failed for row_id. response, exception", java.lang.Long.valueOf(zzpaVar2.zza), java.lang.Integer.valueOf(i), th);
                        if (java.util.Arrays.asList(((java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzt.zza(null)).split(",")).contains(java.lang.String.valueOf(i))) {
                            zzmeVar = com.google.android.gms.measurement.internal.zzme.BACKOFF;
                        } else {
                            zzmeVar = com.google.android.gms.measurement.internal.zzme.FAILURE;
                        }
                    }
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                    com.google.android.gms.measurement.internal.zzny zznyVarZzu = zzlwVar.zzu.zzu();
                    long j = zzpaVar2.zza;
                    zznyVarZzu.zzZ(new com.google.android.gms.measurement.internal.zzag(j, zzmeVar.zza(), zzpaVar2.zzf));
                    zzlwVar.zzu.zzaW().zzj().zzc("[sgtm] Updated status for row_id", java.lang.Long.valueOf(j), zzmeVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzmeVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzmbVarZzr.zzv();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlyVar);
            zzmbVarZzr.zzu.zzaX().zzp(new com.google.android.gms.measurement.internal.zzma(zzmbVarZzr, strZzn, url, bArr, map, zzlyVar));
            try {
                com.google.android.gms.measurement.internal.zzio zzioVar2 = zzioVar.zzw().zzu;
                long jCurrentTimeMillis = zzioVar2.zzaU().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - zzioVar2.zzaU().currentTimeMillis()) {
                        atomicReference.wait(jCurrentTimeMillis2);
                    }
                }
            } catch (java.lang.InterruptedException unused) {
                this.zzu.zzaW().zzk().zza("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? com.google.android.gms.measurement.internal.zzme.UNKNOWN : (com.google.android.gms.measurement.internal.zzme) atomicReference.get();
        } catch (java.net.MalformedURLException | java.net.URISyntaxException e) {
            this.zzu.zzaW().zze().zzd("[sgtm] Bad upload url for row_id", zzpaVar.zzc, java.lang.Long.valueOf(zzpaVar.zza), e);
            return com.google.android.gms.measurement.internal.zzme.FAILURE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzas(java.lang.Boolean bool, boolean z) {
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zzb("Setting app measurement enabled (FE)", bool);
        zzioVar.zzm().zzm(bool);
        if (z) {
            com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
            com.google.android.gms.measurement.internal.zzio zzioVar2 = zzhtVarZzm.zzu;
            zzhtVarZzm.zzg();
            android.content.SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzK() || !(bool == null || bool.booleanValue())) {
            zzat();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat() {
        zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        java.lang.String strZza = zzioVar.zzm().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zzan("app", "_npa", null, zzioVar.zzaU().currentTimeMillis());
            } else {
                zzan("app", "_npa", java.lang.Long.valueOf(true != com.json.mediationsdk.metadata.a.g.equals(strZza) ? 0L : 1L), zzioVar.zzaU().currentTimeMillis());
            }
        }
        if (!this.zzu.zzJ() || !this.zzc) {
            zzioVar.zzaW().zzd().zza("Updating Scion state (FE)");
            this.zzu.zzu().zzV();
        } else {
            zzioVar.zzaW().zzd().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzH();
            this.zzu.zzv().zza.zza();
            zzioVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zzkw(this));
        }
    }

    public static /* synthetic */ void zzz(com.google.android.gms.measurement.internal.zzlw zzlwVar, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        int i;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
            bundle2 = new android.os.Bundle(zzioVar.zzm().zzt.zza());
            java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String next = it.next();
                java.lang.Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof java.lang.String) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Double)) {
                    if (zzioVar.zzw().zzal(obj)) {
                        zzioVar.zzw().zzR(zzlwVar.zzv, null, 27, null, null, 0);
                    }
                    zzioVar.zzaW().zzl().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (com.google.android.gms.measurement.internal.zzqf.zzap(next)) {
                    zzioVar.zzaW().zzl().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzioVar.zzw().zzaf("param", next, zzioVar.zzf().zzc(null, false), obj)) {
                    zzioVar.zzw().zzS(bundle2, next, obj);
                }
            }
            zzioVar.zzw();
            int iZze = zzioVar.zzf().zze();
            if (bundle2.size() > iZze) {
                for (java.lang.String str : new java.util.TreeSet(bundle2.keySet())) {
                    i++;
                    if (i > iZze) {
                        bundle2.remove(str);
                    }
                }
                zzioVar.zzw().zzR(zzlwVar.zzv, null, 26, null, null, 0);
                zzioVar.zzaW().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzlwVar.zzu;
        zzioVar2.zzm().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzioVar2.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbd)) {
            zzlwVar.zzu.zzu().zzT(bundle2);
        }
    }

    public final void zzH() {
        zzg();
        zza();
        if (this.zzu.zzM()) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            com.google.android.gms.measurement.internal.zzam zzamVarZzf = zzioVar.zzf();
            zzamVarZzf.zzu.zzaV();
            java.lang.Boolean boolZzn = zzamVarZzf.zzn("google_analytics_deferred_deep_link_enabled");
            if (boolZzn != null && boolZzn.booleanValue()) {
                zzioVar.zzaW().zzd().zza("Deferred Deep Link feature enabled.");
                zzioVar.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzko
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzM();
                    }
                });
            }
            this.zzu.zzu().zzA();
            this.zzc = false;
            com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
            zzhtVarZzm.zzg();
            java.lang.String string = zzhtVarZzm.zzb().getString("previous_os_version", null);
            zzhtVarZzm.zzu.zzg().zzv();
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            if (!android.text.TextUtils.isEmpty(str) && !str.equals(string)) {
                android.content.SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (android.text.TextUtils.isEmpty(string)) {
                return;
            }
            zzioVar.zzg().zzv();
            if (string.equals(android.os.Build.VERSION.RELEASE)) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_po", string);
            zzR("auto", "_ou", bundle);
        }
    }

    final void zzI() {
        zzg();
        com.google.android.gms.measurement.internal.zzaz zzazVar = this.zzl;
        if (zzazVar != null) {
            zzazVar.zzb();
        }
    }

    public final void zzJ(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        long jCurrentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzioVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zzlg(this, bundle2));
    }

    public final void zzK() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (!(zzioVar.zzaT().getApplicationContext() instanceof android.app.Application) || this.zza == null) {
            return;
        }
        ((android.app.Application) zzioVar.zzaT().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    final void zzL() {
        com.google.android.gms.internal.measurement.zzqr.zzb();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaW)) {
            if (zzioVar.zzaX().zzu()) {
                zzioVar.zzaW().zze().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzioVar.zzaV();
            if (com.google.android.gms.measurement.internal.zzaf.zza()) {
                zzioVar.zzaW().zze().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zza();
            zzioVar.zzaW().zzj().zza("Getting trigger URIs (FE)");
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            zzioVar.zzaX().zze(atomicReference, 10000L, "get trigger URIs", new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzki
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zza;
                    zzlwVar.zzu.zzu().zzH(atomicReference, zzlwVar.zzu.zzm().zzi.zza());
                }
            });
            final java.util.List list = (java.util.List) atomicReference.get();
            if (list == null) {
                zzioVar.zzaW().zze().zza("Timed out waiting for get trigger URIs");
            } else {
                zzioVar.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zza;
                        zzlwVar.zzg();
                        if (android.os.Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        java.util.List<com.google.android.gms.measurement.internal.zzov> list2 = list;
                        android.util.SparseArray sparseArrayZze = zzlwVar.zzu.zzm().zze();
                        for (com.google.android.gms.measurement.internal.zzov zzovVar : list2) {
                            int i = zzovVar.zzc;
                            if (!sparseArrayZze.contains(i) || ((java.lang.Long) sparseArrayZze.get(i)).longValue() < zzovVar.zzb) {
                                zzlwVar.zzy().add(zzovVar);
                            }
                        }
                        zzlwVar.zzU();
                    }
                });
            }
        }
    }

    public final void zzM() {
        zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzm().zzo.zzb()) {
            zzioVar.zzaW().zzd().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzioVar.zzm().zzp.zza();
        zzioVar.zzm().zzp.zzb(1 + jZza);
        zzioVar.zzf();
        if (jZza >= 5) {
            zzioVar.zzaW().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzioVar.zzm().zzo.zza(true);
        } else {
            if (this.zzr == null) {
                this.zzr = new com.google.android.gms.measurement.internal.zzld(this, this.zzu);
            }
            this.zzr.zzd(0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzN() {
        com.google.android.gms.measurement.internal.zzoq zzoqVar;
        com.google.android.gms.measurement.internal.zzoq zzoqVar2;
        com.google.android.gms.internal.measurement.zzkm zzkmVar;
        zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zza("Handle tcf update.");
        android.content.SharedPreferences sharedPreferencesZza = zzioVar.zzm().zza();
        java.util.HashMap map = new java.util.HashMap();
        com.google.android.gms.measurement.internal.zzgg zzggVar = com.google.android.gms.measurement.internal.zzgi.zzbj;
        if (((java.lang.Boolean) zzggVar.zza(null)).booleanValue()) {
            int i = com.google.android.gms.measurement.internal.zzot.zzb;
            com.google.android.gms.internal.measurement.zzkl zzklVar = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            com.google.android.gms.measurement.internal.zzos zzosVar = com.google.android.gms.measurement.internal.zzos.CONSENT;
            com.google.android.gms.internal.measurement.zzkl zzklVar2 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            com.google.android.gms.measurement.internal.zzos zzosVar2 = com.google.android.gms.measurement.internal.zzos.FLEXIBLE_LEGITIMATE_INTEREST;
            com.google.common.collect.ImmutableMap immutableMapOfEntries = com.google.common.collect.ImmutableMap.ofEntries(com.google.android.gms.measurement.internal.zzor.zza(zzklVar, zzosVar), com.google.android.gms.measurement.internal.zzor.zza(zzklVar2, zzosVar2), com.google.android.gms.measurement.internal.zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzosVar), com.google.android.gms.measurement.internal.zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzosVar), com.google.android.gms.measurement.internal.zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzosVar2), com.google.android.gms.measurement.internal.zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzosVar2), com.google.android.gms.measurement.internal.zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzosVar2));
            com.google.common.collect.ImmutableSet immutableSetOf = com.google.common.collect.ImmutableSet.of("CH");
            char[] cArr = new char[5];
            int iZza = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_CmpSdkID");
            int iZza2 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_PolicyVersion");
            int iZza3 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_gdprApplies");
            int iZza4 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_PurposeOneTreatment");
            int iZza5 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_EnableAdvertiserConsentMode");
            java.lang.String strZzb = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_PublisherCC");
            com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
            com.google.common.collect.UnmodifiableIterator it = immutableMapOfEntries.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzkl zzklVar3 = (com.google.android.gms.internal.measurement.zzkl) it.next();
                java.lang.String strZzb2 = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_PublisherRestrictions" + zzklVar3.zza());
                if (android.text.TextUtils.isEmpty(strZzb2) || strZzb2.length() < 755) {
                    zzkmVar = com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = java.lang.Character.digit(strZzb2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.zzkm.values().length || iDigit == 0) {
                        zzkmVar = com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != 1) {
                        zzkmVar = iDigit != 2 ? com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        zzkmVar = com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                builder.put(zzklVar3, zzkmVar);
            }
            com.google.common.collect.ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
            java.lang.String strZzb3 = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_PurposeConsents");
            java.lang.String strZzb4 = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_VendorConsents");
            boolean z = !android.text.TextUtils.isEmpty(strZzb4) && strZzb4.length() >= 755 && strZzb4.charAt(754) == '1';
            java.lang.String strZzb5 = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_PurposeLegitimateInterests");
            java.lang.String strZzb6 = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !android.text.TextUtils.isEmpty(strZzb6) && strZzb6.length() >= 755 && strZzb6.charAt(754) == '1';
            cArr[0] = '2';
            zzoqVar = new com.google.android.gms.measurement.internal.zzoq(com.google.android.gms.measurement.internal.zzot.zzc(immutableMapOfEntries, immutableMapBuildOrThrow, immutableSetOf, cArr, iZza, iZza5, iZza3, iZza2, iZza4, strZzb, strZzb3, strZzb5, z, z2));
        } else {
            java.lang.String strZzb7 = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_VendorConsents");
            if (!"".equals(strZzb7) && strZzb7.length() > 754) {
                map.put("GoogleConsent", java.lang.String.valueOf(strZzb7.charAt(754)));
            }
            int iZza6 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_gdprApplies");
            if (iZza6 != -1) {
                map.put("gdprApplies", java.lang.String.valueOf(iZza6));
            }
            int iZza7 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_EnableAdvertiserConsentMode");
            if (iZza7 != -1) {
                map.put("EnableAdvertiserConsentMode", java.lang.String.valueOf(iZza7));
            }
            int iZza8 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_PolicyVersion");
            if (iZza8 != -1) {
                map.put("PolicyVersion", java.lang.String.valueOf(iZza8));
            }
            java.lang.String strZzb8 = com.google.android.gms.measurement.internal.zzot.zzb(sharedPreferencesZza, "IABTCF_PurposeConsents");
            if (!"".equals(strZzb8)) {
                map.put("PurposeConsents", strZzb8);
            }
            int iZza9 = com.google.android.gms.measurement.internal.zzot.zza(sharedPreferencesZza, "IABTCF_CmpSdkID");
            if (iZza9 != -1) {
                map.put("CmpSdkID", java.lang.String.valueOf(iZza9));
            }
            zzoqVar = new com.google.android.gms.measurement.internal.zzoq(map);
        }
        zzioVar.zzaW().zzj().zzb("Tcf preferences read", zzoqVar);
        if (!zzioVar.zzf().zzx(null, zzggVar)) {
            if (zzioVar.zzm().zzr(zzoqVar)) {
                android.os.Bundle bundleZza = zzoqVar.zza();
                zzioVar.zzaW().zzj().zzb("Consent generated from Tcf", bundleZza);
                if (bundleZza != android.os.Bundle.EMPTY) {
                    zzaf(bundleZza, -30, zzioVar.zzaU().currentTimeMillis());
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("_tcfd", zzoqVar.zzd());
                zzR("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
        zzhtVarZzm.zzg();
        java.lang.String string = zzhtVarZzm.zzb().getString("stored_tcf_param", "");
        java.util.HashMap map2 = new java.util.HashMap();
        if (android.text.TextUtils.isEmpty(string)) {
            zzoqVar2 = new com.google.android.gms.measurement.internal.zzoq(map2);
        } else {
            for (java.lang.String str : string.split(";")) {
                java.lang.String[] strArrSplit = str.split(com.ironsource.y8.i.b);
                if (strArrSplit.length >= 2 && com.google.android.gms.measurement.internal.zzot.zza.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzoqVar2 = new com.google.android.gms.measurement.internal.zzoq(map2);
        }
        if (zzioVar.zzm().zzr(zzoqVar)) {
            android.os.Bundle bundleZza2 = zzoqVar.zza();
            zzioVar.zzaW().zzj().zzb("Consent generated from Tcf", bundleZza2);
            if (bundleZza2 != android.os.Bundle.EMPTY) {
                zzaf(bundleZza2, -30, zzioVar.zzaU().currentTimeMillis());
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("_tcfm", zzoqVar.zzc(zzoqVar2));
            bundle2.putString("_tcfd2", zzoqVar.zzb());
            bundle2.putString("_tcfd", zzoqVar.zzd());
            zzR("auto", "_tcf", bundle2);
        }
    }

    public final void zzO(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzP(str, str2, bundle, true, true, this.zzu.zzaU().currentTimeMillis());
    }

    public final void zzP(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) {
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : bundle;
        if (java.util.Objects.equals(str2, com.google.firebase.analytics.FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzu.zzt().zzy(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.zzd != null && !com.google.android.gms.measurement.internal.zzqf.zzap(str2)) {
            z3 = false;
        }
        zzZ(str == null ? "app" : str, str2, j, bundle2, z2, z3, z, null);
    }

    public final void zzQ(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3) {
        com.google.android.gms.measurement.internal.zzio.zzP();
        zzZ("auto", str2, this.zzu.zzaU().currentTimeMillis(), bundle, false, true, true, str3);
    }

    final void zzR(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzg();
        zzS(str, str2, this.zzu.zzaU().currentTimeMillis(), bundle);
    }

    final void zzS(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle) {
        zzg();
        zzT(str, str2, j, bundle, true, this.zzd == null || com.google.android.gms.measurement.internal.zzqf.zzap(str2), true, null);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    protected final void zzT(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        boolean z4;
        long j2;
        android.os.Bundle[] bundleArr;
        int i;
        java.lang.String str4 = str;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (!zzioVar.zzJ()) {
            this.zzu.zzaW().zzd().zza("Event not sent since app measurement is disabled");
            return;
        }
        java.util.List listZzp = this.zzu.zzh().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaW().zzd().zzc("Dropping non-safelisted event. event name, origin", str2, str4);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzioVar.zzN() ? java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaT().getClassLoader()) : java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, android.content.Context.class).invoke(null, this.zzu.zzaT());
                } catch (java.lang.Exception e) {
                    this.zzu.zzaW().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                this.zzu.zzaW().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
            zzioVar2.zzaV();
            zzan("auto", "_lgclid", bundle.getString("gclid"), zzioVar2.zzaU().currentTimeMillis());
        }
        com.google.android.gms.measurement.internal.zzio zzioVar3 = this.zzu;
        zzioVar3.zzaV();
        if (z && com.google.android.gms.measurement.internal.zzqf.zzau(str2)) {
            zzioVar3.zzw().zzO(bundle, zzioVar3.zzm().zzt.zza());
        }
        if (!z3) {
            zzioVar3.zzaV();
            if (!"_iap".equals(str2)) {
                com.google.android.gms.measurement.internal.zzio zzioVar4 = this.zzu;
                com.google.android.gms.measurement.internal.zzqf zzqfVarZzw = zzioVar4.zzw();
                if (!zzqfVarZzw.zzah(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str2)) {
                    i = 2;
                } else if (zzqfVarZzw.zzae(androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.google.android.gms.measurement.internal.zzjy.zza, com.google.android.gms.measurement.internal.zzjy.zzb, str2)) {
                    zzqfVarZzw.zzu.zzf();
                    if (zzqfVarZzw.zzad(androidx.core.app.NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                        i = 0;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 13;
                }
                if (i != 0) {
                    zzioVar3.zzaW().zzf().zzb("Invalid public event name. Event will not be logged (FE)", zzioVar3.zzj().zzd(str2));
                    com.google.android.gms.measurement.internal.zzqf zzqfVarZzw2 = zzioVar4.zzw();
                    zzioVar4.zzf();
                    zzioVar4.zzw().zzR(this.zzv, null, i, "_ev", zzqfVarZzw2.zzG(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzioVar3.zzaV();
        com.google.android.gms.measurement.internal.zzio zzioVar5 = this.zzu;
        com.google.android.gms.measurement.internal.zzmh zzmhVarZzj = zzioVar5.zzt().zzj(false);
        if (zzmhVarZzj != null && !bundle.containsKey("_sc")) {
            zzmhVarZzj.zzd = true;
        }
        com.google.android.gms.measurement.internal.zzqf.zzN(zzmhVarZzj, bundle, z && !z3);
        boolean zEquals = "am".equals(str4);
        boolean zZzap = com.google.android.gms.measurement.internal.zzqf.zzap(str2);
        if (!z || this.zzd == null || zZzap) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                zzioVar3.zzaW().zzd().zzc("Passing event to registered event handler (FE)", zzioVar3.zzj().zzd(str2), zzioVar3.zzj().zzb(bundle));
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar6 = this.zzu;
        if (zzioVar6.zzM()) {
            int iZzf = zzioVar3.zzw().zzf(str2);
            if (iZzf != 0) {
                zzioVar3.zzaW().zzf().zzb("Invalid event name. Event will not be logged (FE)", zzioVar3.zzj().zzd(str2));
                com.google.android.gms.measurement.internal.zzqf zzqfVarZzw3 = zzioVar3.zzw();
                zzioVar3.zzf();
                zzioVar6.zzw().zzR(this.zzv, str3, iZzf, "_ev", zzqfVarZzw3.zzG(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            java.lang.String str5 = "_o";
            android.os.Bundle bundleZzA = zzioVar3.zzw().zzA(str3, str2, bundle, com.google.android.gms.common.util.CollectionUtils.listOf((java.lang.Object[]) new java.lang.String[]{"_o", "_sn", "_sc", "_si"}), z3);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bundleZzA);
            zzioVar3.zzaV();
            if (zzioVar5.zzt().zzj(false) != null && "_ae".equals(str2)) {
                com.google.android.gms.measurement.internal.zzon zzonVar = zzioVar5.zzv().zzb;
                long jElapsedRealtime = zzonVar.zzc.zzu.zzaU().elapsedRealtime();
                long j3 = jElapsedRealtime - zzonVar.zzb;
                zzonVar.zzb = jElapsedRealtime;
                if (j3 > 0) {
                    zzioVar3.zzw().zzL(bundleZzA, j3);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                com.google.android.gms.measurement.internal.zzqf zzqfVarZzw4 = zzioVar3.zzw();
                java.lang.String string = bundleZzA.getString("_ffr");
                if (com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                com.google.android.gms.measurement.internal.zzio zzioVar7 = zzqfVarZzw4.zzu;
                if (java.util.Objects.equals(string, zzioVar7.zzm().zzq.zza())) {
                    zzioVar7.zzaW().zzd().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzioVar7.zzm().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                java.lang.String strZza = zzioVar3.zzw().zzu.zzm().zzq.zza();
                if (!android.text.TextUtils.isEmpty(strZza)) {
                    bundleZzA.putString("_ffr", strZza);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundleZzA);
            boolean zZzp = zzioVar3.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzba) ? zzioVar5.zzv().zzp() : zzioVar3.zzm().zzn.zzb();
            if (zzioVar3.zzm().zzk.zza() > 0 && zzioVar3.zzm().zzp(j) && zZzp) {
                zzioVar3.zzaW().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                j2 = 0;
                zzan("auto", "_sid", null, zzioVar3.zzaU().currentTimeMillis());
                zzan("auto", "_sno", null, zzioVar3.zzaU().currentTimeMillis());
                zzan("auto", "_se", null, zzioVar3.zzaU().currentTimeMillis());
                zzioVar3.zzm().zzl.zzb(0L);
            } else {
                j2 = 0;
            }
            if (bundleZzA.getLong(com.google.firebase.analytics.FirebaseAnalytics.Param.EXTEND_SESSION, j2) == 1) {
                zzioVar3.zzaW().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzioVar6.zzv().zza.zzb(j, true);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(bundleZzA.keySet());
            java.util.Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                java.lang.String str6 = (java.lang.String) arrayList2.get(i2);
                if (str6 != null) {
                    zzioVar3.zzw();
                    java.lang.Object obj = bundleZzA.get(str6);
                    if (obj instanceof android.os.Bundle) {
                        bundleArr = new android.os.Bundle[]{(android.os.Bundle) obj};
                    } else if (obj instanceof android.os.Parcelable[]) {
                        android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                        bundleArr = (android.os.Bundle[]) java.util.Arrays.copyOf(parcelableArr, parcelableArr.length, android.os.Bundle[].class);
                    } else if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                        bundleArr = (android.os.Bundle[]) arrayList3.toArray(new android.os.Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzA.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                java.util.ArrayList arrayList4 = arrayList;
                android.os.Bundle bundleZzz = (android.os.Bundle) arrayList4.get(i3);
                java.lang.String str7 = i3 != 0 ? "_ep" : str2;
                java.lang.String str8 = str5;
                bundleZzz.putString(str8, str4);
                if (z2) {
                    bundleZzz = zzioVar3.zzw().zzz(bundleZzz, null);
                }
                android.os.Bundle bundle2 = bundleZzz;
                zzioVar5.zzu().zzM(new com.google.android.gms.measurement.internal.zzbh(str7, new com.google.android.gms.measurement.internal.zzbf(bundle2), str, j), str3);
                if (!z4) {
                    java.util.Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.measurement.internal.zzkc) it.next()).onEvent(str, str2, new android.os.Bundle(bundle2), j);
                    }
                }
                i3++;
                str4 = str;
                arrayList = arrayList4;
                str5 = str8;
            }
            zzioVar3.zzaV();
            if (zzioVar5.zzt().zzj(false) == null || !"_ae".equals(str2)) {
                return;
            }
            zzioVar5.zzv().zzb.zzd(true, true, zzioVar3.zzaU().elapsedRealtime());
        }
    }

    final void zzU() {
        com.google.android.gms.measurement.internal.zzov zzovVar;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty() || this.zzi || (zzovVar = (com.google.android.gms.measurement.internal.zzov) zzy().poll()) == null) {
            return;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures measurementManagerFuturesZzB = zzioVar.zzw().zzB();
        if (measurementManagerFuturesZzB != null) {
            this.zzi = true;
            com.google.android.gms.measurement.internal.zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
            java.lang.String str = zzovVar.zza;
            zzhcVarZzj.zzb("Registering trigger URI", str);
            com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> listenableFutureRegisterTriggerAsync = measurementManagerFuturesZzB.registerTriggerAsync(android.net.Uri.parse(str));
            if (listenableFutureRegisterTriggerAsync != null) {
                com.google.common.util.concurrent.Futures.addCallback(listenableFutureRegisterTriggerAsync, new com.google.android.gms.measurement.internal.zzkt(this, zzovVar), new com.google.android.gms.measurement.internal.zzks(this));
            } else {
                this.zzi = false;
                zzy().add(zzovVar);
            }
        }
    }

    public final void zzV(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        zza();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkcVar);
        if (this.zze.add(zzkcVar)) {
            return;
        }
        this.zzu.zzaW().zzk().zza("OnEventListener already registered");
    }

    public final void zzW() {
        zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new com.google.android.gms.measurement.internal.zzky(this, this.zzu);
            this.zzs = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzkp
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                    com.google.android.gms.measurement.internal.zzlw.zzA(this.zza, sharedPreferences, str);
                }
            };
        }
        zzioVar.zzm().zza().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    public final void zzX(long j) {
        this.zzg.set(null);
        this.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzle(this, j));
    }

    final void zzY(java.lang.Runnable runnable) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaR)) {
            zza();
            if (zzioVar.zzaX().zzu()) {
                zzioVar.zzaW().zze().zza("Cannot retrieve and upload batches from analytics worker thread");
                return;
            }
            if (zzioVar.zzaX().zzt()) {
                zzioVar.zzaW().zze().zza("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            zzioVar.zzaV();
            if (com.google.android.gms.measurement.internal.zzaf.zza()) {
                zzioVar.zzaW().zze().zza("Cannot retrieve and upload batches from main thread");
                return;
            }
            zzioVar.zzaW().zzj().zza("[sgtm] Started client-side batch upload work.");
            boolean z = false;
            int size = 0;
            int i = 0;
            while (!z) {
                zzioVar.zzaW().zzj().zza("[sgtm] Getting upload batches from service (FE)");
                final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                zzioVar.zzaX().zze(atomicReference, 10000L, "[sgtm] Getting upload batches", new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzkl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzu.zzu().zzI(atomicReference, com.google.android.gms.measurement.internal.zzpc.zza(com.google.android.gms.measurement.internal.zzmf.SGTM_CLIENT));
                    }
                });
                com.google.android.gms.measurement.internal.zzpe zzpeVar = (com.google.android.gms.measurement.internal.zzpe) atomicReference.get();
                if (zzpeVar == null) {
                    break;
                }
                java.util.List list = zzpeVar.zza;
                if (!list.isEmpty()) {
                    zzioVar.zzaW().zzj().zzb("[sgtm] Retrieved upload batches. count", java.lang.Integer.valueOf(list.size()));
                    size += list.size();
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        com.google.android.gms.measurement.internal.zzme zzmeVarZzar = zzar((com.google.android.gms.measurement.internal.zzpa) it.next());
                        if (zzmeVarZzar == com.google.android.gms.measurement.internal.zzme.SUCCESS) {
                            i++;
                        } else if (zzmeVarZzar == com.google.android.gms.measurement.internal.zzme.BACKOFF) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            zzioVar.zzaW().zzj().zzc("[sgtm] Completed client-side batch upload work. total, success", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i));
            runnable.run();
        }
    }

    protected final void zzZ(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        int i = com.google.android.gms.measurement.internal.zzqf.zza;
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        for (java.lang.String str4 : bundle2.keySet()) {
            java.lang.Object obj = bundle2.get(str4);
            if (obj instanceof android.os.Bundle) {
                bundle2.putBundle(str4, new android.os.Bundle((android.os.Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof android.os.Parcelable[]) {
                    android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        android.os.Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof android.os.Bundle) {
                            parcelableArr[i2] = new android.os.Bundle((android.os.Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof java.util.List) {
                    java.util.List list = (java.util.List) obj;
                    while (i2 < list.size()) {
                        java.lang.Object obj2 = list.get(i2);
                        if (obj2 instanceof android.os.Bundle) {
                            list.set(i2, new android.os.Bundle((android.os.Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzkz(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    final void zzaa(java.lang.String str, java.lang.String str2, long j, java.lang.Object obj) {
        this.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzla(this, str, str2, obj, j));
    }

    final void zzab(long j) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new com.google.android.gms.measurement.internal.zzkr(this, this.zzu);
        }
        this.zzl.zzd(j);
    }

    final void zzac(java.lang.String str) {
        this.zzg.set(str);
    }

    public final void zzad(android.os.Bundle bundle) {
        zzae(bundle, this.zzu.zzaU().currentTimeMillis());
    }

    public final void zzae(android.os.Bundle bundle, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        if (!android.text.TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzu.zzaW().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle2);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, "app_id", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, "origin", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, "name", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, "value", java.lang.Object.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.class, 0L);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.class, 0L);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjt.zza(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle2.getString("name"));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle2.getString("origin"));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        java.lang.String string = bundle2.getString("name");
        java.lang.Object obj = bundle2.get("value");
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzw().zzj(string) != 0) {
            zzioVar.zzaW().zze().zzb("Invalid conditional user property name", zzioVar.zzj().zzf(string));
            return;
        }
        if (zzioVar.zzw().zzd(string, obj) != 0) {
            zzioVar.zzaW().zze().zzc("Invalid conditional user property value", zzioVar.zzj().zzf(string), obj);
            return;
        }
        java.lang.Object objZzE = zzioVar.zzw().zzE(string, obj);
        if (objZzE == null) {
            zzioVar.zzaW().zze().zzc("Unable to normalize conditional user property value", zzioVar.zzj().zzf(string), obj);
            return;
        }
        com.google.android.gms.measurement.internal.zzjt.zzb(bundle2, objZzE);
        long j2 = bundle2.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!android.text.TextUtils.isEmpty(bundle2.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzioVar.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                zzioVar.zzaW().zze().zzc("Invalid conditional user property timeout", zzioVar.zzj().zzf(string), java.lang.Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzioVar.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            zzioVar.zzaW().zze().zzc("Invalid conditional user property time to live", zzioVar.zzj().zzf(string), java.lang.Long.valueOf(j3));
        } else {
            zzioVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zzlf(this, bundle2));
        }
    }

    final void zzaf(android.os.Bundle bundle, int i, long j) {
        java.lang.Object obj;
        java.lang.String string;
        zza();
        com.google.android.gms.measurement.internal.zzjx zzjxVar = com.google.android.gms.measurement.internal.zzjx.zza;
        com.google.android.gms.measurement.internal.zzjw[] zzjwVarArr = com.google.android.gms.measurement.internal.zzjv.STORAGE.zzd;
        int length = zzjwVarArr.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            java.lang.String str = zzjwVarArr[i2].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = java.lang.Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = java.lang.Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzaW().zzl().zzb("Ignoring invalid consent setting", obj);
            zzioVar.zzaW().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZzu = this.zzu.zzaX().zzu();
        com.google.android.gms.measurement.internal.zzjx zzjxVarZzi = com.google.android.gms.measurement.internal.zzjx.zzi(bundle, i);
        if (zzjxVarZzi.zzt()) {
            zzak(zzjxVarZzi, zZzu);
        }
        com.google.android.gms.measurement.internal.zzba zzbaVarZzc = com.google.android.gms.measurement.internal.zzba.zzc(bundle, i);
        if (zzbaVarZzc.zzk()) {
            zzag(zzbaVarZzc, zZzu);
        }
        java.lang.Boolean boolZzg = com.google.android.gms.measurement.internal.zzba.zzg(bundle);
        if (boolZzg != null) {
            java.lang.String str2 = i == -30 ? "tcf" : "app";
            if (zZzu) {
                zzan(str2, com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzg.toString(), j);
            } else {
                zzam(str2, com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzg.toString(), false, j);
            }
        }
    }

    public final void zzah(com.google.android.gms.measurement.internal.zzkb zzkbVar) {
        com.google.android.gms.measurement.internal.zzkb zzkbVar2;
        zzg();
        zza();
        if (zzkbVar != null && zzkbVar != (zzkbVar2 = this.zzd)) {
            com.google.android.gms.common.internal.Preconditions.checkState(zzkbVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzkbVar;
    }

    public final void zzai(java.lang.Boolean bool) {
        zza();
        this.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzlp(this, bool));
    }

    final void zzaj(com.google.android.gms.measurement.internal.zzjx zzjxVar) {
        zzg();
        boolean z = (zzjxVar.zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE) && zzjxVar.zzr(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE)) || this.zzu.zzu().zzab();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (z != zzioVar.zzK()) {
            zzioVar.zzG(z);
            com.google.android.gms.measurement.internal.zzht zzhtVarZzm = this.zzu.zzm();
            com.google.android.gms.measurement.internal.zzio zzioVar2 = zzhtVarZzm.zzu;
            zzhtVarZzm.zzg();
            java.lang.Boolean boolValueOf = zzhtVarZzm.zzb().contains("measurement_enabled_from_api") ? java.lang.Boolean.valueOf(zzhtVarZzm.zzb().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                zzas(java.lang.Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzak(com.google.android.gms.measurement.internal.zzjx zzjxVar, boolean z) {
        boolean z2;
        com.google.android.gms.measurement.internal.zzjx zzjxVar2;
        boolean zZzu;
        boolean z3;
        zza();
        int iZzb = zzjxVar.zzb();
        if (iZzb != -10 && zzjxVar.zze() == com.google.android.gms.measurement.internal.zzju.UNINITIALIZED && zzjxVar.zzf() == com.google.android.gms.measurement.internal.zzju.UNINITIALIZED) {
            this.zzu.zzaW().zzl().zza("Ignoring empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            z2 = false;
            if (com.google.android.gms.measurement.internal.zzjx.zzs(iZzb, this.zzo.zzb())) {
                zZzu = zzjxVar.zzu(this.zzo);
                com.google.android.gms.measurement.internal.zzjw zzjwVar = com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE;
                if (zzjxVar.zzr(zzjwVar) && !this.zzo.zzr(zzjwVar)) {
                    z2 = true;
                }
                com.google.android.gms.measurement.internal.zzjx zzjxVarZzm = zzjxVar.zzm(this.zzo);
                this.zzo = zzjxVarZzm;
                zzjxVar2 = zzjxVarZzm;
                z3 = z2;
                z2 = true;
            } else {
                zzjxVar2 = zzjxVar;
                zZzu = false;
                z3 = false;
            }
        }
        if (!z2) {
            this.zzu.zzaW().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzjxVar2);
            return;
        }
        long andIncrement = this.zzp.getAndIncrement();
        if (zZzu) {
            this.zzg.set(null);
            com.google.android.gms.measurement.internal.zzlr zzlrVar = new com.google.android.gms.measurement.internal.zzlr(this, zzjxVar2, andIncrement, z3);
            if (!z) {
                this.zzu.zzaX().zzr(zzlrVar);
                return;
            } else {
                zzg();
                zzlrVar.run();
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzls zzlsVar = new com.google.android.gms.measurement.internal.zzls(this, zzjxVar2, andIncrement, z3);
        if (z) {
            zzg();
            zzlsVar.run();
        } else if (iZzb == 30 || iZzb == -10) {
            this.zzu.zzaX().zzr(zzlsVar);
        } else {
            this.zzu.zzaX().zzq(zzlsVar);
        }
    }

    public final void zzal(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        zzam(str, str2, obj, z, this.zzu.zzaU().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    final void zzan(java.lang.String str, java.lang.String str2, java.lang.Object obj, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof java.lang.String) {
                java.lang.String str3 = (java.lang.String) obj;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    long j2 = true != "false".equals(str3.toLowerCase(java.util.Locale.ENGLISH)) ? 0L : 1L;
                    com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j2);
                    zzioVar.zzm().zzh.zzb(lValueOf.longValue() == 1 ? com.json.mediationsdk.metadata.a.g : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzm().zzh.zzb("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzm().zzh.zzb("unset");
                str2 = "_npa";
            }
            this.zzu.zzaW().zzj().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        java.lang.String str4 = str2;
        java.lang.Object obj2 = obj;
        com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
        if (!zzioVar2.zzJ()) {
            this.zzu.zzaW().zzj().zza("User property not set since app measurement is disabled");
        } else if (zzioVar2.zzM()) {
            this.zzu.zzu().zzY(new com.google.android.gms.measurement.internal.zzqb(str4, j, obj2, str));
        }
    }

    public final void zzao(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        zza();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkcVar);
        if (this.zze.remove(zzkcVar)) {
            return;
        }
        this.zzu.zzaW().zzk().zza("OnEventListener had not been registered");
    }

    final boolean zzap() {
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return false;
    }

    public final int zzi(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzu.zzf();
        return 25;
    }

    public final java.lang.Boolean zzl() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Boolean) this.zzu.zzaX().zze(atomicReference, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "boolean test flag value", new com.google.android.gms.measurement.internal.zzlb(this, atomicReference));
    }

    public final java.lang.Double zzm() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Double) this.zzu.zzaX().zze(atomicReference, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "double test flag value", new com.google.android.gms.measurement.internal.zzlo(this, atomicReference));
    }

    public final java.lang.Integer zzp() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Integer) this.zzu.zzaX().zze(atomicReference, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "int test flag value", new com.google.android.gms.measurement.internal.zzln(this, atomicReference));
    }

    public final java.lang.Long zzq() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Long) this.zzu.zzaX().zze(atomicReference, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "long test flag value", new com.google.android.gms.measurement.internal.zzlm(this, atomicReference));
    }

    public final java.lang.String zzr() {
        return (java.lang.String) this.zzg.get();
    }

    public final java.lang.String zzs() {
        com.google.android.gms.measurement.internal.zzmh zzmhVarZzi = this.zzu.zzt().zzi();
        if (zzmhVarZzi != null) {
            return zzmhVarZzi.zzb;
        }
        return null;
    }

    public final java.lang.String zzt() {
        com.google.android.gms.measurement.internal.zzmh zzmhVarZzi = this.zzu.zzt().zzi();
        if (zzmhVarZzi != null) {
            return zzmhVarZzi.zza;
        }
        return null;
    }

    public final java.lang.String zzu() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.String) this.zzu.zzaX().zze(atomicReference, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "String test flag value", new com.google.android.gms.measurement.internal.zzll(this, atomicReference));
    }

    public final java.util.ArrayList zzv(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzaX().zzu()) {
            zzioVar.zzaW().zze().zza("Cannot get conditional user properties from analytics worker thread");
            return new java.util.ArrayList(0);
        }
        zzioVar.zzaV();
        if (com.google.android.gms.measurement.internal.zzaf.zza()) {
            zzioVar.zzaW().zze().zza("Cannot get conditional user properties from main thread");
            return new java.util.ArrayList(0);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get conditional user properties", new com.google.android.gms.measurement.internal.zzlh(this, atomicReference, null, str, str2));
        java.util.List list = (java.util.List) atomicReference.get();
        if (list != null) {
            return com.google.android.gms.measurement.internal.zzqf.zzK(list);
        }
        zzioVar.zzaW().zze().zzb("Timed out waiting for get conditional user properties", null);
        return new java.util.ArrayList();
    }

    public final java.util.List zzw(boolean z) {
        zza();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzj().zza("Getting user properties (FE)");
        if (zzioVar.zzaX().zzu()) {
            zzioVar.zzaW().zze().zza("Cannot get all user properties from analytics worker thread");
            return java.util.Collections.emptyList();
        }
        zzioVar.zzaV();
        if (com.google.android.gms.measurement.internal.zzaf.zza()) {
            zzioVar.zzaW().zze().zza("Cannot get all user properties from main thread");
            return java.util.Collections.emptyList();
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get user properties", new com.google.android.gms.measurement.internal.zzlc(this, atomicReference, z));
        java.util.List list = (java.util.List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzioVar.zzaW().zze().zzb("Timed out waiting for get user properties, includeInternal", java.lang.Boolean.valueOf(z));
        return java.util.Collections.emptyList();
    }

    public final java.util.Map zzx(java.lang.String str, java.lang.String str2, boolean z) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzaX().zzu()) {
            zzioVar.zzaW().zze().zza("Cannot get user properties from analytics worker thread");
            return java.util.Collections.emptyMap();
        }
        zzioVar.zzaV();
        if (com.google.android.gms.measurement.internal.zzaf.zza()) {
            zzioVar.zzaW().zze().zza("Cannot get user properties from main thread");
            return java.util.Collections.emptyMap();
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get user properties", new com.google.android.gms.measurement.internal.zzli(this, atomicReference, null, str, str2, z));
        java.util.List<com.google.android.gms.measurement.internal.zzqb> list = (java.util.List) atomicReference.get();
        if (list == null) {
            zzioVar.zzaW().zze().zzb("Timed out waiting for handle get user properties, includeInternal", java.lang.Boolean.valueOf(z));
            return java.util.Collections.emptyMap();
        }
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(list.size());
        for (com.google.android.gms.measurement.internal.zzqb zzqbVar : list) {
            java.lang.Object objZza = zzqbVar.zza();
            if (objZza != null) {
                arrayMap.put(zzqbVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    final java.util.PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new java.util.PriorityQueue(java.util.Comparator.comparing(new java.util.function.Function() { // from class: com.google.android.gms.measurement.internal.zzkf
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((com.google.android.gms.measurement.internal.zzov) obj).zzb);
                }
            }, new java.util.Comparator() { // from class: com.google.android.gms.measurement.internal.zzkh
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Long.compare(((java.lang.Long) obj).longValue(), ((java.lang.Long) obj2).longValue());
                }
            }));
        }
        return this.zzm;
    }

    final void zzag(com.google.android.gms.measurement.internal.zzba zzbaVar, boolean z) {
        com.google.android.gms.measurement.internal.zzlq zzlqVar = new com.google.android.gms.measurement.internal.zzlq(this, zzbaVar);
        if (!z) {
            this.zzu.zzaX().zzq(zzlqVar);
        } else {
            zzg();
            zzlqVar.run();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final void zzam(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z, long j) {
        int i;
        int iZzj;
        java.lang.String str3;
        com.google.android.gms.measurement.internal.zzio zzioVar;
        int iZzd;
        java.lang.Object objZzE;
        if (!z) {
            com.google.android.gms.measurement.internal.zzqf zzqfVarZzw = this.zzu.zzw();
            if (!zzqfVarZzw.zzah("user property", str2)) {
                i = 6;
            } else if (zzqfVarZzw.zzae("user property", com.google.android.gms.measurement.internal.zzka.zza, null, str2)) {
                zzqfVarZzw.zzu.zzf();
                if (zzqfVarZzw.zzad("user property", 24, str2)) {
                    i = 0;
                } else {
                    i = 6;
                }
            } else {
                iZzj = 15;
            }
            if (i != 0) {
                com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
                com.google.android.gms.measurement.internal.zzqf zzqfVarZzw2 = zzioVar2.zzw();
                zzioVar2.zzf();
                this.zzu.zzw().zzR(this.zzv, null, i, "_ev", zzqfVarZzw2.zzG(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzaa(str3, str2, j, null);
                return;
            }
            zzioVar = this.zzu;
            iZzd = zzioVar.zzw().zzd(str2, obj);
            if (iZzd != 0) {
                objZzE = zzioVar.zzw().zzE(str2, obj);
                if (objZzE != null) {
                    zzaa(str3, str2, j, objZzE);
                    return;
                }
                return;
            }
            com.google.android.gms.measurement.internal.zzqf zzqfVarZzw3 = zzioVar.zzw();
            zzioVar.zzf();
            this.zzu.zzw().zzR(this.zzv, null, iZzd, "_ev", zzqfVarZzw3.zzG(str2, 24, true), (!(obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) ? obj.toString().length() : 0);
        }
        iZzj = this.zzu.zzw().zzj(str2);
        i = iZzj;
        if (i != 0) {
            com.google.android.gms.measurement.internal.zzio zzioVar3 = this.zzu;
            com.google.android.gms.measurement.internal.zzqf zzqfVarZzw4 = zzioVar3.zzw();
            zzioVar3.zzf();
            if (str2 != null) {
            }
            this.zzu.zzw().zzR(this.zzv, null, i, "_ev", zzqfVarZzw4.zzG(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzaa(str3, str2, j, null);
            return;
        }
        zzioVar = this.zzu;
        iZzd = zzioVar.zzw().zzd(str2, obj);
        if (iZzd != 0) {
            objZzE = zzioVar.zzw().zzE(str2, obj);
            if (objZzE != null) {
                zzaa(str3, str2, j, objZzE);
                return;
            }
            return;
        }
        com.google.android.gms.measurement.internal.zzqf zzqfVarZzw5 = zzioVar.zzw();
        zzioVar.zzf();
        if (obj instanceof java.lang.String) {
        }
        this.zzu.zzw().zzR(this.zzv, null, iZzd, "_ev", zzqfVarZzw5.zzG(str2, 24, true), (!(obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) ? obj.toString().length() : 0);
    }
}

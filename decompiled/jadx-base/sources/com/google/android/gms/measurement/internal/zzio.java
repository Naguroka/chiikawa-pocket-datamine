package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzio implements com.google.android.gms.measurement.internal.zzjs {
    private static volatile com.google.android.gms.measurement.internal.zzio zzb;
    private java.lang.Boolean zzB;
    private long zzC;
    private volatile java.lang.Boolean zzD;
    private volatile boolean zzE;
    private int zzF;
    private int zzG;
    final long zza;
    private final android.content.Context zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final boolean zzg;
    private final com.google.android.gms.measurement.internal.zzaf zzh;
    private final com.google.android.gms.measurement.internal.zzam zzi;
    private final com.google.android.gms.measurement.internal.zzht zzj;
    private final com.google.android.gms.measurement.internal.zzhe zzk;
    private final com.google.android.gms.measurement.internal.zzil zzl;
    private final com.google.android.gms.measurement.internal.zzop zzm;
    private final com.google.android.gms.measurement.internal.zzqf zzn;
    private final com.google.android.gms.measurement.internal.zzgx zzo;
    private final com.google.android.gms.common.util.Clock zzp;
    private final com.google.android.gms.measurement.internal.zzmo zzq;
    private final com.google.android.gms.measurement.internal.zzlw zzr;
    private final com.google.android.gms.measurement.internal.zzd zzs;
    private final com.google.android.gms.measurement.internal.zzmb zzt;
    private final java.lang.String zzu;
    private com.google.android.gms.measurement.internal.zzgv zzv;
    private com.google.android.gms.measurement.internal.zzny zzw;
    private com.google.android.gms.measurement.internal.zzbb zzx;
    private com.google.android.gms.measurement.internal.zzgs zzy;
    private com.google.android.gms.measurement.internal.zzmd zzz;
    private boolean zzA = false;
    private final java.util.concurrent.atomic.AtomicInteger zzH = new java.util.concurrent.atomic.AtomicInteger(0);

    zzio(com.google.android.gms.measurement.internal.zzke zzkeVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkeVar);
        android.content.Context context = zzkeVar.zza;
        com.google.android.gms.measurement.internal.zzaf zzafVar = new com.google.android.gms.measurement.internal.zzaf(context);
        this.zzh = zzafVar;
        com.google.android.gms.measurement.internal.zzgf.zza = zzafVar;
        this.zzc = context;
        this.zzd = zzkeVar.zzb;
        this.zze = zzkeVar.zzc;
        this.zzf = zzkeVar.zzd;
        this.zzg = zzkeVar.zzh;
        this.zzD = zzkeVar.zze;
        this.zzu = zzkeVar.zzj;
        this.zzE = true;
        com.google.android.gms.internal.measurement.zzki.zzd(context);
        com.google.android.gms.common.util.Clock defaultClock = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzp = defaultClock;
        java.lang.Long l = zzkeVar.zzi;
        this.zza = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.zzi = new com.google.android.gms.measurement.internal.zzam(this);
        com.google.android.gms.measurement.internal.zzht zzhtVar = new com.google.android.gms.measurement.internal.zzht(this);
        zzhtVar.zzw();
        this.zzj = zzhtVar;
        com.google.android.gms.measurement.internal.zzhe zzheVar = new com.google.android.gms.measurement.internal.zzhe(this);
        zzheVar.zzw();
        this.zzk = zzheVar;
        com.google.android.gms.measurement.internal.zzqf zzqfVar = new com.google.android.gms.measurement.internal.zzqf(this);
        zzqfVar.zzw();
        this.zzn = zzqfVar;
        this.zzo = new com.google.android.gms.measurement.internal.zzgx(new com.google.android.gms.measurement.internal.zzkd(zzkeVar, this));
        this.zzs = new com.google.android.gms.measurement.internal.zzd(this);
        com.google.android.gms.measurement.internal.zzmo zzmoVar = new com.google.android.gms.measurement.internal.zzmo(this);
        zzmoVar.zzb();
        this.zzq = zzmoVar;
        com.google.android.gms.measurement.internal.zzlw zzlwVar = new com.google.android.gms.measurement.internal.zzlw(this);
        zzlwVar.zzb();
        this.zzr = zzlwVar;
        com.google.android.gms.measurement.internal.zzop zzopVar = new com.google.android.gms.measurement.internal.zzop(this);
        zzopVar.zzb();
        this.zzm = zzopVar;
        com.google.android.gms.measurement.internal.zzmb zzmbVar = new com.google.android.gms.measurement.internal.zzmb(this);
        zzmbVar.zzw();
        this.zzt = zzmbVar;
        com.google.android.gms.measurement.internal.zzil zzilVar = new com.google.android.gms.measurement.internal.zzil(this);
        zzilVar.zzw();
        this.zzl = zzilVar;
        com.google.android.gms.internal.measurement.zzdh zzdhVar = zzkeVar.zzg;
        boolean z = zzdhVar == null || zzdhVar.zzb == 0;
        if (context.getApplicationContext() instanceof android.app.Application) {
            zzS(zzlwVar);
            if (zzlwVar.zzu.zzc.getApplicationContext() instanceof android.app.Application) {
                android.app.Application application = (android.app.Application) zzlwVar.zzu.zzc.getApplicationContext();
                if (zzlwVar.zza == null) {
                    zzlwVar.zza = new com.google.android.gms.measurement.internal.zzlv(zzlwVar);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzlwVar.zza);
                    application.registerActivityLifecycleCallbacks(zzlwVar.zza);
                    com.google.android.gms.measurement.internal.zzhe zzheVar2 = zzlwVar.zzu.zzk;
                    zzT(zzheVar2);
                    zzheVar2.zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzT(zzheVar);
            zzheVar.zzk().zza("Application context is not an Application");
        }
        zzilVar.zzq(new com.google.android.gms.measurement.internal.zzin(this, zzkeVar));
    }

    public static /* synthetic */ void zzB(com.google.android.gms.measurement.internal.zzio zzioVar, java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        int i2;
        if (i != 200 && i != 204) {
            i2 = 304;
            if (i != 304) {
                i2 = i;
            }
            com.google.android.gms.measurement.internal.zzhe zzheVar = zzioVar.zzk;
            zzT(zzheVar);
            zzheVar.zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", java.lang.Integer.valueOf(i2), th);
        }
        i2 = i;
        if (th == null) {
            com.google.android.gms.measurement.internal.zzht zzhtVar = zzioVar.zzj;
            zzR(zzhtVar);
            zzhtVar.zzo.zza(true);
            if (bArr == null || bArr.length == 0) {
                com.google.android.gms.measurement.internal.zzhe zzheVar2 = zzioVar.zzk;
                zzT(zzheVar2);
                zzheVar2.zzd().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
                java.lang.String strOptString = jSONObject.optString(com.adjust.sdk.Constants.DEEPLINK, "");
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    com.google.android.gms.measurement.internal.zzhe zzheVar3 = zzioVar.zzk;
                    zzT(zzheVar3);
                    zzheVar3.zzd().zza("Deferred Deep Link is empty.");
                    return;
                }
                java.lang.String strOptString2 = jSONObject.optString("gclid", "");
                java.lang.String strOptString3 = jSONObject.optString("gbraid", "");
                java.lang.String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble(com.ironsource.aa.a.d, 0.0d);
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.measurement.internal.zzqf zzqfVar = zzioVar.zzn;
                zzR(zzqfVar);
                com.google.android.gms.measurement.internal.zzio zzioVar2 = zzqfVar.zzu;
                if (!android.text.TextUtils.isEmpty(strOptString)) {
                    android.content.Context context = zzioVar2.zzc;
                    java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!android.text.TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!android.text.TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        zzioVar.zzr.zzR("auto", com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                        zzR(zzqfVar);
                        if (android.text.TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString(com.adjust.sdk.Constants.DEEPLINK, strOptString);
                            editorEdit.putLong(com.ironsource.aa.a.d, java.lang.Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                android.content.Intent intent = new android.content.Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                android.content.Context context2 = zzqfVar.zzu.zzc;
                                if (android.os.Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, android.app.BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (java.lang.RuntimeException e) {
                            com.google.android.gms.measurement.internal.zzhe zzheVar4 = zzqfVar.zzu.zzk;
                            zzT(zzheVar4);
                            zzheVar4.zze().zzb("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                }
                com.google.android.gms.measurement.internal.zzhe zzheVar5 = zzioVar.zzk;
                zzT(zzheVar5);
                zzheVar5.zzk().zzd("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (org.json.JSONException e2) {
                com.google.android.gms.measurement.internal.zzhe zzheVar6 = zzioVar.zzk;
                zzT(zzheVar6);
                zzheVar6.zze().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzhe zzheVar7 = zzioVar.zzk;
        zzT(zzheVar7);
        zzheVar7.zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", java.lang.Integer.valueOf(i2), th);
    }

    static /* synthetic */ void zzC(com.google.android.gms.measurement.internal.zzio zzioVar, com.google.android.gms.measurement.internal.zzke zzkeVar) {
        com.google.android.gms.measurement.internal.zzil zzilVar = zzioVar.zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        com.google.android.gms.measurement.internal.zzam zzamVar = zzioVar.zzi;
        zzamVar.zzq();
        com.google.android.gms.measurement.internal.zzbb zzbbVar = new com.google.android.gms.measurement.internal.zzbb(zzioVar);
        zzbbVar.zzw();
        zzioVar.zzx = zzbbVar;
        com.google.android.gms.internal.measurement.zzdh zzdhVar = zzkeVar.zzg;
        com.google.android.gms.measurement.internal.zzgs zzgsVar = new com.google.android.gms.measurement.internal.zzgs(zzioVar, zzkeVar.zzf, zzdhVar == null ? 0L : zzdhVar.zza);
        zzgsVar.zzb();
        zzioVar.zzy = zzgsVar;
        com.google.android.gms.measurement.internal.zzgv zzgvVar = new com.google.android.gms.measurement.internal.zzgv(zzioVar);
        zzgvVar.zzb();
        zzioVar.zzv = zzgvVar;
        com.google.android.gms.measurement.internal.zzny zznyVar = new com.google.android.gms.measurement.internal.zzny(zzioVar);
        zznyVar.zzb();
        zzioVar.zzw = zznyVar;
        com.google.android.gms.measurement.internal.zzqf zzqfVar = zzioVar.zzn;
        zzqfVar.zzx();
        zzioVar.zzj.zzx();
        zzioVar.zzy.zzc();
        com.google.android.gms.measurement.internal.zzmd zzmdVar = new com.google.android.gms.measurement.internal.zzmd(zzioVar);
        zzmdVar.zzb();
        zzioVar.zzz = zzmdVar;
        zzmdVar.zzc();
        com.google.android.gms.measurement.internal.zzhe zzheVar = zzioVar.zzk;
        zzT(zzheVar);
        com.google.android.gms.measurement.internal.zzhc zzhcVarZzi = zzheVar.zzi();
        zzamVar.zzj();
        zzhcVarZzi.zzb("App measurement initialized, version", 119002L);
        zzT(zzheVar);
        zzheVar.zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        java.lang.String strZzm = zzgsVar.zzm();
        if (android.text.TextUtils.isEmpty(zzioVar.zzd)) {
            zzR(zzqfVar);
            if (zzqfVar.zzak(strZzm, zzamVar.zzs())) {
                zzT(zzheVar);
                zzheVar.zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzT(zzheVar);
                zzheVar.zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(java.lang.String.valueOf(strZzm)));
            }
        }
        zzT(zzheVar);
        zzheVar.zzd().zza("Debug-level message logging enabled");
        int i = zzioVar.zzF;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = zzioVar.zzH;
        if (i != atomicInteger.get()) {
            zzT(zzheVar);
            zzheVar.zze().zzc("Not all components initialized", java.lang.Integer.valueOf(zzioVar.zzF), java.lang.Integer.valueOf(atomicInteger.get()));
        }
        zzioVar.zzA = true;
    }

    static final void zzP() {
        throw new java.lang.IllegalStateException("Unexpected call on client side");
    }

    private static final void zzQ(com.google.android.gms.measurement.internal.zzf zzfVar) {
        if (zzfVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
    }

    private static final void zzR(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        if (zzjqVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
    }

    private static final void zzS(com.google.android.gms.measurement.internal.zzg zzgVar) {
        if (zzgVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (!zzgVar.zze()) {
            throw new java.lang.IllegalStateException("Component not initialized: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzgVar.getClass()))));
        }
    }

    private static final void zzT(com.google.android.gms.measurement.internal.zzjr zzjrVar) {
        if (zzjrVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (!zzjrVar.zzy()) {
            throw new java.lang.IllegalStateException("Component not initialized: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzjrVar.getClass()))));
        }
    }

    public static com.google.android.gms.measurement.internal.zzio zzp(android.content.Context context, com.google.android.gms.internal.measurement.zzdh zzdhVar, java.lang.Long l) {
        android.os.Bundle bundle;
        if (zzdhVar != null && (zzdhVar.zze == null || zzdhVar.zzf == null)) {
            zzdhVar = new com.google.android.gms.internal.measurement.zzdh(zzdhVar.zza, zzdhVar.zzb, zzdhVar.zzc, zzdhVar.zzd, null, null, zzdhVar.zzg, null);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (com.google.android.gms.measurement.internal.zzio.class) {
                if (zzb == null) {
                    zzb = new com.google.android.gms.measurement.internal.zzio(new com.google.android.gms.measurement.internal.zzke(context, zzdhVar, l));
                }
            }
        } else if (zzdhVar != null && (bundle = zzdhVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb);
            zzb.zzD = java.lang.Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb);
        return zzb;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.String zzA() {
        return this.zzu;
    }

    final void zzD() {
        this.zzH.incrementAndGet();
    }

    final void zzE() {
        this.zzF++;
    }

    final void zzF(boolean z) {
        this.zzD = java.lang.Boolean.valueOf(z);
    }

    public final void zzG(boolean z) {
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        this.zzE = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c  */
    protected final void zzH(com.google.android.gms.internal.measurement.zzdh zzdhVar) {
        com.google.android.gms.measurement.internal.zzjx zzjxVarZzj;
        android.os.Bundle bundle;
        java.lang.Boolean boolZzg;
        android.os.Bundle bundle2;
        boolean zZzaw;
        android.os.Bundle bundle3;
        android.content.IntentFilter intentFilter;
        com.google.android.gms.measurement.internal.zzio zzioVar;
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        com.google.android.gms.measurement.internal.zzgg zzggVar = com.google.android.gms.measurement.internal.zzgi.zzaR;
        com.google.android.gms.measurement.internal.zzam zzamVar = this.zzi;
        boolean z = zzamVar.zzx(null, zzggVar) && zzs().zzi() == com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE;
        com.google.android.gms.internal.measurement.zzqr.zzb();
        if (zzamVar.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaW)) {
            com.google.android.gms.measurement.internal.zzqf zzqfVar = this.zzn;
            zzR(zzqfVar);
            if (zzqfVar.zzan()) {
                com.google.android.gms.measurement.internal.zzqf zzqfVar2 = this.zzn;
                zzR(zzqfVar2);
                zzqfVar2.zzg();
                intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                zzioVar = zzqfVar2.zzu;
                if (zzioVar.zzi.zzx(null, zzggVar)) {
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                }
                androidx.core.content.ContextCompat.registerReceiver(zzioVar.zzc, new com.google.android.gms.measurement.internal.zzw(zzqfVar2.zzu), intentFilter, 2);
                com.google.android.gms.measurement.internal.zzhe zzheVar = zzioVar.zzk;
                zzT(zzheVar);
                zzheVar.zzd().zza("Registered app receiver");
                if (z) {
                    zzs().zzj(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzB.zza(null)).longValue());
                }
            } else if (z) {
                z = true;
                com.google.android.gms.measurement.internal.zzqf zzqfVar3 = this.zzn;
                zzR(zzqfVar3);
                zzqfVar3.zzg();
                intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                zzioVar = zzqfVar3.zzu;
                if (zzioVar.zzi.zzx(null, zzggVar)) {
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                }
                androidx.core.content.ContextCompat.registerReceiver(zzioVar.zzc, new com.google.android.gms.measurement.internal.zzw(zzqfVar3.zzu), intentFilter, 2);
                com.google.android.gms.measurement.internal.zzhe zzheVar2 = zzioVar.zzk;
                zzT(zzheVar2);
                zzheVar2.zzd().zza("Registered app receiver");
                if (z) {
                    zzs().zzj(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzB.zza(null)).longValue());
                }
            }
        } else if (z) {
            z = true;
            com.google.android.gms.measurement.internal.zzqf zzqfVar4 = this.zzn;
            zzR(zzqfVar4);
            zzqfVar4.zzg();
            intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            zzioVar = zzqfVar4.zzu;
            if (zzioVar.zzi.zzx(null, zzggVar)) {
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            }
            androidx.core.content.ContextCompat.registerReceiver(zzioVar.zzc, new com.google.android.gms.measurement.internal.zzw(zzqfVar4.zzu), intentFilter, 2);
            com.google.android.gms.measurement.internal.zzhe zzheVar3 = zzioVar.zzk;
            zzT(zzheVar3);
            zzheVar3.zzd().zza("Registered app receiver");
            if (z) {
                zzs().zzj(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzB.zza(null)).longValue());
            }
        }
        com.google.android.gms.measurement.internal.zzht zzhtVar = this.zzj;
        zzR(zzhtVar);
        com.google.android.gms.measurement.internal.zzjx zzjxVarZzh = zzhtVar.zzh();
        int iZzb = zzjxVarZzh.zzb();
        com.google.android.gms.measurement.internal.zzju zzjuVarZzm = zzamVar.zzm("google_analytics_default_allow_ad_storage", false);
        com.google.android.gms.measurement.internal.zzju zzjuVarZzm2 = zzamVar.zzm("google_analytics_default_allow_analytics_storage", false);
        com.google.android.gms.measurement.internal.zzju zzjuVar = com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
        if (zzjuVarZzm != zzjuVar || zzjuVarZzm2 != com.google.android.gms.measurement.internal.zzju.UNINITIALIZED) {
            zzR(zzhtVar);
            if (zzhtVar.zzq(-10)) {
                zzjxVarZzj = com.google.android.gms.measurement.internal.zzjx.zzj(zzjuVarZzm, zzjuVarZzm2, -10);
            } else {
                if (android.text.TextUtils.isEmpty(zzh().zzo()) && (iZzb == 0 || iZzb == 30 || iZzb == 10 || iZzb == 30 || iZzb == 30 || iZzb == 40)) {
                    com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzr;
                    zzS(zzlwVar);
                    zzlwVar.zzak(new com.google.android.gms.measurement.internal.zzjx(null, null, -10), false);
                } else if (zzamVar.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp) && android.text.TextUtils.isEmpty(zzh().zzo()) && zzdhVar != null && (bundle3 = zzdhVar.zzg) != null) {
                    zzR(zzhtVar);
                    if (zzhtVar.zzq(30)) {
                        zzjxVarZzj = com.google.android.gms.measurement.internal.zzjx.zzi(bundle3, 30);
                        if (!zzjxVarZzj.zzt()) {
                        }
                    }
                }
                zzjxVarZzj = null;
            }
        } else if (android.text.TextUtils.isEmpty(zzh().zzo())) {
            if (zzamVar.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp)) {
                zzjxVarZzj = null;
            } else {
                zzjxVarZzj = null;
            }
        } else if (zzamVar.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp)) {
            zzjxVarZzj = null;
        } else {
            zzjxVarZzj = null;
        }
        if (zzjxVarZzj != null) {
            com.google.android.gms.measurement.internal.zzlw zzlwVar2 = this.zzr;
            zzS(zzlwVar2);
            zzlwVar2.zzak(zzjxVarZzj, true);
            zzjxVarZzh = zzjxVarZzj;
        }
        com.google.android.gms.measurement.internal.zzlw zzlwVar3 = this.zzr;
        zzS(zzlwVar3);
        zzlwVar3.zzaj(zzjxVarZzh);
        zzR(zzhtVar);
        int iZza = zzhtVar.zzf().zza();
        com.google.android.gms.measurement.internal.zzju zzjuVarZzm3 = zzamVar.zzm("google_analytics_default_allow_ad_personalization_signals", true);
        if (zzjuVarZzm3 != zzjuVar) {
            com.google.android.gms.measurement.internal.zzhe zzheVar4 = this.zzk;
            zzT(zzheVar4);
            zzheVar4.zzj().zzb("Default ad personalization consent from Manifest", zzjuVarZzm3);
        }
        com.google.android.gms.measurement.internal.zzju zzjuVarZzm4 = zzamVar.zzm("google_analytics_default_allow_ad_user_data", true);
        if (zzjuVarZzm4 != com.google.android.gms.measurement.internal.zzju.UNINITIALIZED && com.google.android.gms.measurement.internal.zzjx.zzs(-10, iZza)) {
            zzS(zzlwVar3);
            zzlwVar3.zzag(com.google.android.gms.measurement.internal.zzba.zzd(zzjuVarZzm4, -10), true);
        } else if (android.text.TextUtils.isEmpty(zzh().zzo()) || !(iZza == 0 || iZza == 30)) {
            if (android.text.TextUtils.isEmpty(zzh().zzo()) && zzdhVar != null && (bundle2 = zzdhVar.zzg) != null && com.google.android.gms.measurement.internal.zzjx.zzs(30, iZza)) {
                com.google.android.gms.measurement.internal.zzba zzbaVarZzc = com.google.android.gms.measurement.internal.zzba.zzc(bundle2, 30);
                if (zzbaVarZzc.zzk()) {
                    zzS(zzlwVar3);
                    zzlwVar3.zzag(zzbaVarZzc, true);
                }
            }
            if (android.text.TextUtils.isEmpty(zzh().zzo()) && zzdhVar != null && (bundle = zzdhVar.zzg) != null) {
                zzR(zzhtVar);
                if (zzhtVar.zzh.zza() == null && (boolZzg = com.google.android.gms.measurement.internal.zzba.zzg(bundle)) != null) {
                    zzS(zzlwVar3);
                    zzlwVar3.zzal(zzdhVar.zze, com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzg.toString(), false);
                }
            }
        } else {
            zzS(zzlwVar3);
            zzlwVar3.zzag(new com.google.android.gms.measurement.internal.zzba((java.lang.Boolean) null, -10, (java.lang.Boolean) null, (java.lang.String) null), true);
        }
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzamVar.zzu;
        java.lang.Boolean boolZzn = zzamVar.zzn("google_analytics_tcf_data_enabled");
        if (boolZzn == null || boolZzn.booleanValue()) {
            com.google.android.gms.measurement.internal.zzhe zzheVar5 = this.zzk;
            zzT(zzheVar5);
            zzheVar5.zzd().zza("TCF client enabled.");
            zzS(zzlwVar3);
            zzlwVar3.zzW();
            zzS(zzlwVar3);
            zzlwVar3.zzN();
        }
        zzR(zzhtVar);
        com.google.android.gms.measurement.internal.zzhp zzhpVar = zzhtVar.zzc;
        if (zzhpVar.zza() == 0) {
            com.google.android.gms.measurement.internal.zzhe zzheVar6 = this.zzk;
            zzT(zzheVar6);
            long j = this.zza;
            zzheVar6.zzj().zzb("Persisting first open", java.lang.Long.valueOf(j));
            zzR(zzhtVar);
            zzhpVar.zzb(j);
        }
        zzS(zzlwVar3);
        zzlwVar3.zzb.zzc();
        if (zzM()) {
            if (!android.text.TextUtils.isEmpty(zzh().zzo()) || (!zzamVar.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp) && !android.text.TextUtils.isEmpty(zzh().zzl()))) {
                com.google.android.gms.measurement.internal.zzgg zzggVar2 = com.google.android.gms.measurement.internal.zzgi.zzbp;
                if (zzamVar.zzx(null, zzggVar2)) {
                    com.google.android.gms.measurement.internal.zzqf zzqfVar5 = this.zzn;
                    zzR(zzqfVar5);
                    java.lang.String strZzo = zzh().zzo();
                    zzR(zzhtVar);
                    zZzaw = zzqfVar5.zzav(strZzo, zzhtVar.zzj());
                } else {
                    com.google.android.gms.measurement.internal.zzqf zzqfVar6 = this.zzn;
                    zzR(zzqfVar6);
                    java.lang.String strZzo2 = zzh().zzo();
                    zzR(zzhtVar);
                    java.lang.String strZzj = zzhtVar.zzj();
                    java.lang.String strZzl = zzh().zzl();
                    zzR(zzhtVar);
                    zzhtVar.zzg();
                    zZzaw = zzqfVar6.zzaw(strZzo2, strZzj, strZzl, zzhtVar.zzb().getString("admob_app_id", null));
                }
                if (zZzaw) {
                    com.google.android.gms.measurement.internal.zzhe zzheVar7 = this.zzk;
                    zzT(zzheVar7);
                    zzheVar7.zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzR(zzhtVar);
                    zzhtVar.zzg();
                    java.lang.Boolean boolZzi = zzhtVar.zzi();
                    android.content.SharedPreferences.Editor editorEdit = zzhtVar.zzb().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolZzi != null) {
                        zzhtVar.zzm(boolZzi);
                    }
                    zzi().zzj();
                    this.zzw.zzC();
                    this.zzw.zzB();
                    zzR(zzhtVar);
                    zzhpVar.zzb(this.zza);
                    zzR(zzhtVar);
                    zzhtVar.zze.zzb(null);
                }
                zzR(zzhtVar);
                java.lang.String strZzo3 = zzh().zzo();
                zzhtVar.zzg();
                android.content.SharedPreferences.Editor editorEdit2 = zzhtVar.zzb().edit();
                editorEdit2.putString("gmp_app_id", strZzo3);
                editorEdit2.apply();
                if (zzamVar.zzx(null, zzggVar2)) {
                    zzR(zzhtVar);
                    zzhtVar.zzl(null);
                } else {
                    zzR(zzhtVar);
                    zzhtVar.zzl(zzh().zzl());
                }
            }
            zzR(zzhtVar);
            if (!zzhtVar.zzh().zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE)) {
                zzR(zzhtVar);
                zzhtVar.zze.zzb(null);
            }
            zzS(zzlwVar3);
            zzR(zzhtVar);
            zzlwVar3.zzac(zzhtVar.zze.zza());
            com.google.android.gms.measurement.internal.zzqf zzqfVar7 = this.zzn;
            zzR(zzqfVar7);
            try {
                zzqfVar7.zzu.zzc.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (java.lang.ClassNotFoundException unused) {
                com.google.android.gms.measurement.internal.zzht zzhtVar2 = this.zzj;
                zzR(zzhtVar2);
                com.google.android.gms.measurement.internal.zzhr zzhrVar = zzhtVar2.zzq;
                if (!android.text.TextUtils.isEmpty(zzhrVar.zza())) {
                    com.google.android.gms.measurement.internal.zzhe zzheVar8 = this.zzk;
                    zzT(zzheVar8);
                    zzheVar8.zzk().zza("Remote config removed with active feature rollouts");
                    zzR(zzhtVar2);
                    zzhrVar.zzb(null);
                }
            }
            if (!android.text.TextUtils.isEmpty(zzh().zzo()) || (!this.zzi.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp) && !android.text.TextUtils.isEmpty(zzh().zzl()))) {
                boolean zZzJ = zzJ();
                com.google.android.gms.measurement.internal.zzht zzhtVar3 = this.zzj;
                zzR(zzhtVar3);
                if (!zzhtVar3.zzo() && !this.zzi.zzA()) {
                    zzR(zzhtVar3);
                    zzhtVar3.zzn(!zZzJ);
                }
                if (zZzJ) {
                    com.google.android.gms.measurement.internal.zzlw zzlwVar4 = this.zzr;
                    zzS(zzlwVar4);
                    zzlwVar4.zzH();
                }
                com.google.android.gms.measurement.internal.zzop zzopVar = this.zzm;
                zzS(zzopVar);
                zzopVar.zza.zza();
                zzu().zzE(new java.util.concurrent.atomic.AtomicReference());
                com.google.android.gms.measurement.internal.zzny zznyVarZzu = zzu();
                zzR(zzhtVar3);
                zznyVarZzu.zzT(zzhtVar3.zzt.zza());
            }
        } else if (zzJ()) {
            com.google.android.gms.measurement.internal.zzqf zzqfVar8 = this.zzn;
            zzR(zzqfVar8);
            if (!zzqfVar8.zzaj("android.permission.INTERNET")) {
                com.google.android.gms.measurement.internal.zzhe zzheVar9 = this.zzk;
                zzT(zzheVar9);
                zzheVar9.zze().zza("App is missing INTERNET permission");
            }
            zzR(zzqfVar8);
            if (!zzqfVar8.zzaj("android.permission.ACCESS_NETWORK_STATE")) {
                com.google.android.gms.measurement.internal.zzhe zzheVar10 = this.zzk;
                zzT(zzheVar10);
                zzheVar10.zze().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            android.content.Context context = this.zzc;
            if (!com.google.android.gms.common.wrappers.Wrappers.packageManager(context).isCallerInstantApp() && !this.zzi.zzC()) {
                if (!com.google.android.gms.measurement.internal.zzqf.zzar(context)) {
                    com.google.android.gms.measurement.internal.zzhe zzheVar11 = this.zzk;
                    zzT(zzheVar11);
                    zzheVar11.zze().zza("AppMeasurementReceiver not registered/enabled");
                }
                if (!com.google.android.gms.measurement.internal.zzqf.zzat(context, false)) {
                    com.google.android.gms.measurement.internal.zzhe zzheVar12 = this.zzk;
                    zzT(zzheVar12);
                    zzheVar12.zze().zza("AppMeasurementService not registered/enabled");
                }
            }
            com.google.android.gms.measurement.internal.zzhe zzheVar13 = this.zzk;
            zzT(zzheVar13);
            zzheVar13.zze().zza("Uploading is not possible. App measurement disabled");
        }
        com.google.android.gms.internal.measurement.zzqr.zzb();
        if (this.zzi.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaW)) {
            com.google.android.gms.measurement.internal.zzqf zzqfVar9 = this.zzn;
            zzR(zzqfVar9);
            if (zzqfVar9.zzan()) {
                long jMax = java.lang.Math.max(500L, ((((long) ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzaw.zza(null)).intValue()) * 1000) + ((long) new java.util.Random().nextInt(5000))) - this.zzp.elapsedRealtime());
                if (jMax > 500) {
                    com.google.android.gms.measurement.internal.zzhe zzheVar14 = this.zzk;
                    zzT(zzheVar14);
                    zzheVar14.zzj().zzb("Waiting to fetch trigger URIs until some time after boot. Delay in millis", java.lang.Long.valueOf(jMax));
                }
                com.google.android.gms.measurement.internal.zzlw zzlwVar5 = this.zzr;
                zzS(zzlwVar5);
                zzlwVar5.zzab(jMax);
            }
        }
        com.google.android.gms.measurement.internal.zzht zzhtVar4 = this.zzj;
        zzR(zzhtVar4);
        zzhtVar4.zzj.zza(true);
    }

    public final boolean zzI() {
        return this.zzD != null && this.zzD.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        return this.zzE;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean zzL() {
        return android.text.TextUtils.isEmpty(this.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    protected final boolean zzM() {
        boolean z;
        if (!this.zzA) {
            throw new java.lang.IllegalStateException("AppMeasurement is not initialized");
        }
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        java.lang.Boolean bool = this.zzB;
        if (bool == null || this.zzC == 0 || (!bool.booleanValue() && java.lang.Math.abs(this.zzp.elapsedRealtime() - this.zzC) > 1000)) {
            this.zzC = this.zzp.elapsedRealtime();
            com.google.android.gms.measurement.internal.zzqf zzqfVar = this.zzn;
            zzR(zzqfVar);
            boolean z2 = true;
            if (zzqfVar.zzaj("android.permission.INTERNET")) {
                zzR(zzqfVar);
                if (zzqfVar.zzaj("android.permission.ACCESS_NETWORK_STATE")) {
                    android.content.Context context = this.zzc;
                    if (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).isCallerInstantApp() || this.zzi.zzC() || (com.google.android.gms.measurement.internal.zzqf.zzar(context) && com.google.android.gms.measurement.internal.zzqf.zzat(context, false))) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            this.zzB = boolValueOf;
            if (boolValueOf.booleanValue()) {
                zzR(zzqfVar);
                if (!zzqfVar.zzac(zzh().zzo(), zzh().zzl()) && (this.zzi.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp) || android.text.TextUtils.isEmpty(zzh().zzl()))) {
                    z2 = false;
                }
                this.zzB = java.lang.Boolean.valueOf(z2);
            }
        }
        return this.zzB.booleanValue();
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean zzN() {
        return this.zzg;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    public final boolean zzO() {
        android.net.NetworkInfo activeNetworkInfo;
        android.os.Bundle bundle;
        com.google.android.gms.measurement.internal.zzba zzbaVarZzc;
        int i;
        java.lang.String str;
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        com.google.android.gms.measurement.internal.zzmb zzmbVar = this.zzt;
        zzT(zzmbVar);
        zzT(zzmbVar);
        java.lang.String strZzm = zzh().zzm();
        if (!this.zzi.zzw()) {
            com.google.android.gms.measurement.internal.zzhe zzheVar = this.zzk;
            zzT(zzheVar);
            zzheVar.zzj().zza("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        com.google.android.gms.measurement.internal.zzht zzhtVar = this.zzj;
        zzR(zzhtVar);
        android.util.Pair pairZzd = zzhtVar.zzd(strZzm);
        if (((java.lang.Boolean) pairZzd.second).booleanValue() || android.text.TextUtils.isEmpty((java.lang.CharSequence) pairZzd.first)) {
            com.google.android.gms.measurement.internal.zzhe zzheVar2 = this.zzk;
            zzT(zzheVar2);
            zzheVar2.zzj().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        zzT(zzmbVar);
        zzmbVar.zzv();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) zzmbVar.zzu.zzc.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            com.google.android.gms.measurement.internal.zzhe zzheVar3 = this.zzk;
            zzT(zzheVar3);
            zzheVar3.zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.google.android.gms.measurement.internal.zzny zznyVarZzu = zzu();
        zznyVarZzu.zzg();
        zznyVarZzu.zza();
        if (zznyVarZzu.zzad()) {
            com.google.android.gms.measurement.internal.zzqf zzqfVar = zznyVarZzu.zzu.zzn;
            zzR(zzqfVar);
            if (zzqfVar.zzm() >= 234200) {
                com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzr;
                zzS(zzlwVar);
                com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
                zzlwVar.zzg();
                com.google.android.gms.measurement.internal.zzap zzapVarZzh = zzioVar.zzu().zzh();
                if (zzapVarZzh != null) {
                }
                if (bundle == null) {
                    i = this.zzG;
                    this.zzG = i + 1;
                    if (i < 10) {
                    }
                    com.google.android.gms.measurement.internal.zzhe zzheVar4 = this.zzk;
                    zzT(zzheVar4);
                    com.google.android.gms.measurement.internal.zzhc zzhcVarZzd = zzheVar4.zzd();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to retrieve DMA consent from the service, ");
                    if (i < 10) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    sb2.append(str);
                    sb2.append(" retryCount");
                    zzhcVarZzd.zzb(sb2.toString(), java.lang.Integer.valueOf(this.zzG));
                    return z;
                }
                com.google.android.gms.measurement.internal.zzjx zzjxVarZzi = com.google.android.gms.measurement.internal.zzjx.zzi(bundle, 100);
                sb.append("&gcs=");
                sb.append(zzjxVarZzi.zzp());
                zzbaVarZzc = com.google.android.gms.measurement.internal.zzba.zzc(bundle, 100);
                sb.append("&dma=");
                sb.append(!java.util.Objects.equals(zzbaVarZzc.zzh(), false) ? 1 : 0);
                if (!android.text.TextUtils.isEmpty(zzbaVarZzc.zzi())) {
                    sb.append("&dma_cps=");
                    sb.append(zzbaVarZzc.zzi());
                }
                int i2 = !java.util.Objects.equals(com.google.android.gms.measurement.internal.zzba.zzg(bundle), true) ? 1 : 0;
                sb.append("&npa=");
                sb.append(i2);
                com.google.android.gms.measurement.internal.zzhe zzheVar5 = this.zzk;
                zzT(zzheVar5);
                zzheVar5.zzj().zzb("Consent query parameters to Bow", sb);
            }
        } else {
            com.google.android.gms.measurement.internal.zzlw zzlwVar2 = this.zzr;
            zzS(zzlwVar2);
            com.google.android.gms.measurement.internal.zzio zzioVar2 = zzlwVar2.zzu;
            zzlwVar2.zzg();
            com.google.android.gms.measurement.internal.zzap zzapVarZzh2 = zzioVar2.zzu().zzh();
            bundle = zzapVarZzh2 != null ? zzapVarZzh2.zza : null;
            if (bundle == null) {
                i = this.zzG;
                this.zzG = i + 1;
                boolean z = i < 10;
                com.google.android.gms.measurement.internal.zzhe zzheVar6 = this.zzk;
                zzT(zzheVar6);
                com.google.android.gms.measurement.internal.zzhc zzhcVarZzd2 = zzheVar6.zzd();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to retrieve DMA consent from the service, ");
                if (i < 10) {
                    str = "Retrying.";
                } else {
                    str = "Skipping.";
                }
                sb3.append(str);
                sb3.append(" retryCount");
                zzhcVarZzd2.zzb(sb3.toString(), java.lang.Integer.valueOf(this.zzG));
                return z;
            }
            com.google.android.gms.measurement.internal.zzjx zzjxVarZzi2 = com.google.android.gms.measurement.internal.zzjx.zzi(bundle, 100);
            sb.append("&gcs=");
            sb.append(zzjxVarZzi2.zzp());
            zzbaVarZzc = com.google.android.gms.measurement.internal.zzba.zzc(bundle, 100);
            sb.append("&dma=");
            sb.append(!java.util.Objects.equals(zzbaVarZzc.zzh(), false) ? 1 : 0);
            if (!android.text.TextUtils.isEmpty(zzbaVarZzc.zzi())) {
                sb.append("&dma_cps=");
                sb.append(zzbaVarZzc.zzi());
            }
            int i3 = !java.util.Objects.equals(com.google.android.gms.measurement.internal.zzba.zzg(bundle), true) ? 1 : 0;
            sb.append("&npa=");
            sb.append(i3);
            com.google.android.gms.measurement.internal.zzhe zzheVar7 = this.zzk;
            zzT(zzheVar7);
            zzheVar7.zzj().zzb("Consent query parameters to Bow", sb);
        }
        com.google.android.gms.measurement.internal.zzqf zzqfVar2 = this.zzn;
        zzR(zzqfVar2);
        zzh().zzu.zzi.zzj();
        java.lang.String str2 = (java.lang.String) pairZzd.first;
        com.google.android.gms.measurement.internal.zzht zzhtVar2 = this.zzj;
        zzR(zzhtVar2);
        java.net.URL urlZzH = zzqfVar2.zzH(119002L, strZzm, str2, zzhtVar2.zzp.zza() - 1, sb.toString());
        if (urlZzH != null) {
            com.google.android.gms.measurement.internal.zzmb zzmbVar2 = this.zzt;
            zzT(zzmbVar2);
            com.google.android.gms.measurement.internal.zzly zzlyVar = new com.google.android.gms.measurement.internal.zzly() { // from class: com.google.android.gms.measurement.internal.zzim
                @Override // com.google.android.gms.measurement.internal.zzly
                public final void zza(java.lang.String str3, int i4, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
                    com.google.android.gms.measurement.internal.zzio.zzB(this.zza, str3, i4, th, bArr, map);
                }
            };
            zzmbVar2.zzv();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(urlZzH);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlyVar);
            com.google.android.gms.measurement.internal.zzil zzilVar2 = zzmbVar2.zzu.zzl;
            zzT(zzilVar2);
            zzilVar2.zzp(new com.google.android.gms.measurement.internal.zzma(zzmbVar2, strZzm, urlZzH, null, null, zzlyVar));
        }
        return false;
    }

    public final int zza() {
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        com.google.android.gms.measurement.internal.zzam zzamVar = this.zzi;
        if (zzamVar.zzA()) {
            return 1;
        }
        zzT(zzilVar);
        zzilVar.zzg();
        if (!this.zzE) {
            return 8;
        }
        com.google.android.gms.measurement.internal.zzht zzhtVar = this.zzj;
        zzR(zzhtVar);
        java.lang.Boolean boolZzi = zzhtVar.zzi();
        if (boolZzi != null) {
            return boolZzi.booleanValue() ? 0 : 3;
        }
        com.google.android.gms.measurement.internal.zzaf zzafVar = zzamVar.zzu.zzh;
        java.lang.Boolean boolZzn = zzamVar.zzn("firebase_analytics_collection_enabled");
        if (boolZzn != null) {
            return boolZzn.booleanValue() ? 0 : 4;
        }
        return (this.zzD == null || this.zzD.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    @org.checkerframework.dataflow.qual.Pure
    public final android.content.Context zzaT() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.common.util.Clock zzaU() {
        return this.zzp;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzaf zzaV() {
        return this.zzh;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzhe zzaW() {
        com.google.android.gms.measurement.internal.zzhe zzheVar = this.zzk;
        zzT(zzheVar);
        return zzheVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzil zzaX() {
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zzl;
        zzT(zzilVar);
        return zzilVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzd zzd() {
        com.google.android.gms.measurement.internal.zzd zzdVar = this.zzs;
        zzQ(zzdVar);
        return zzdVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzam zzf() {
        return this.zzi;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzbb zzg() {
        zzT(this.zzx);
        return this.zzx;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzgs zzh() {
        zzS(this.zzy);
        return this.zzy;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzgv zzi() {
        zzS(this.zzv);
        return this.zzv;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzgx zzj() {
        return this.zzo;
    }

    public final com.google.android.gms.measurement.internal.zzhe zzl() {
        com.google.android.gms.measurement.internal.zzhe zzheVar = this.zzk;
        if (zzheVar == null || !zzheVar.zzy()) {
            return null;
        }
        return zzheVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzht zzm() {
        com.google.android.gms.measurement.internal.zzht zzhtVar = this.zzj;
        zzR(zzhtVar);
        return zzhtVar;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    final com.google.android.gms.measurement.internal.zzil zzo() {
        return this.zzl;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzlw zzq() {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzr;
        zzS(zzlwVar);
        return zzlwVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzmb zzr() {
        com.google.android.gms.measurement.internal.zzmb zzmbVar = this.zzt;
        zzT(zzmbVar);
        return zzmbVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzmd zzs() {
        zzQ(this.zzz);
        return this.zzz;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzmo zzt() {
        com.google.android.gms.measurement.internal.zzmo zzmoVar = this.zzq;
        zzS(zzmoVar);
        return zzmoVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzny zzu() {
        zzS(this.zzw);
        return this.zzw;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzop zzv() {
        com.google.android.gms.measurement.internal.zzop zzopVar = this.zzm;
        zzS(zzopVar);
        return zzopVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzqf zzw() {
        com.google.android.gms.measurement.internal.zzqf zzqfVar = this.zzn;
        zzR(zzqfVar);
        return zzqfVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.String zzx() {
        if (this.zzi.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp)) {
            return null;
        }
        return this.zzd;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.String zzy() {
        if (this.zzi.zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp)) {
            return null;
        }
        return this.zze;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.String zzz() {
        return this.zzf;
    }
}

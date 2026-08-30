package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzny extends com.google.android.gms.measurement.internal.zzg {
    private final com.google.android.gms.measurement.internal.zznx zza;
    private com.google.android.gms.measurement.internal.zzgl zzb;
    private volatile java.lang.Boolean zzc;
    private final com.google.android.gms.measurement.internal.zzaz zzd;
    private java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.measurement.internal.zzou zzf;
    private final java.util.List zzg;
    private final com.google.android.gms.measurement.internal.zzaz zzh;

    protected zzny(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzg = new java.util.ArrayList();
        this.zzf = new com.google.android.gms.measurement.internal.zzou(zzioVar.zzaU());
        this.zza = new com.google.android.gms.measurement.internal.zznx(this);
        this.zzd = new com.google.android.gms.measurement.internal.zzne(this, zzioVar);
        this.zzh = new com.google.android.gms.measurement.internal.zzni(this, zzioVar);
    }

    private final com.google.android.gms.measurement.internal.zzr zzae(boolean z) {
        android.util.Pair pairZza;
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaV();
        com.google.android.gms.measurement.internal.zzgs zzgsVarZzh = this.zzu.zzh();
        java.lang.String str = null;
        if (z) {
            com.google.android.gms.measurement.internal.zzio zzioVar2 = zzioVar.zzaW().zzu;
            if (zzioVar2.zzm().zzb != null && (pairZza = zzioVar2.zzm().zzb.zza()) != null && pairZza != com.google.android.gms.measurement.internal.zzht.zza) {
                str = java.lang.String.valueOf(pairZza.second) + ":" + ((java.lang.String) pairZza.first);
            }
        }
        return zzgsVarZzh.zzk(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf() {
        zzg();
        com.google.android.gms.measurement.internal.zzhc zzhcVarZzj = this.zzu.zzaW().zzj();
        java.util.List list = this.zzg;
        zzhcVarZzj.zzb("Processing queued up service tasks", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((java.lang.Runnable) it.next()).run();
            } catch (java.lang.RuntimeException e) {
                this.zzu.zzaW().zze().zzb("Task exception while flushing queue", e);
            }
        }
        this.zzg.clear();
        this.zzh.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag() {
        zzg();
        this.zzf.zzb();
        this.zzu.zzf();
        this.zzd.zzd(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzX.zza(null)).longValue());
    }

    private final void zzah(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzg();
        if (zzaa()) {
            runnable.run();
            return;
        }
        java.util.List list = this.zzg;
        long size = list.size();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzf();
        if (size >= 1000) {
            zzioVar.zzaW().zze().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.zzh.zzd(60000L);
        zzB();
    }

    private final boolean zzai() {
        this.zzu.zzaV();
        return true;
    }

    public static /* synthetic */ void zzp(com.google.android.gms.measurement.internal.zzny zznyVar) {
        com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("Failed to send storage consent settings to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzrVarZzae = zznyVar.zzae(false);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVarZzae);
            zzglVar.zzA(zzrVarZzae);
            zznyVar.zzag();
        } catch (android.os.RemoteException e) {
            zznyVar.zzu.zzaW().zze().zzb("Failed to send storage consent settings to the service", e);
        }
    }

    public static /* synthetic */ void zzq(com.google.android.gms.measurement.internal.zzny zznyVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzpc zzpcVar) {
        synchronized (atomicReference) {
            try {
                com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                if (zzglVar == null) {
                    zznyVar.zzu.zzaW().zze().zza("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                zzglVar.zzo(zzrVar, zzpcVar, new com.google.android.gms.measurement.internal.zzmx(zznyVar, atomicReference));
                zznyVar.zzag();
            } catch (android.os.RemoteException e) {
                zznyVar.zzu.zzaW().zze().zzb("[sgtm] Failed to get upload batches; remote exception", e);
                atomicReference.notifyAll();
            }
        }
    }

    public static /* synthetic */ void zzr(com.google.android.gms.measurement.internal.zzny zznyVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) {
        synchronized (atomicReference) {
            try {
                com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                if (zzglVar == null) {
                    zznyVar.zzu.zzaW().zze().zza("Failed to request trigger URIs; not connected to service");
                    return;
                }
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                zzglVar.zzr(zzrVar, bundle, new com.google.android.gms.measurement.internal.zzmw(zznyVar, atomicReference));
                zznyVar.zzag();
            } catch (android.os.RemoteException e) {
                zznyVar.zzu.zzaW().zze().zzb("Failed to request trigger URIs; remote exception", e);
                atomicReference.notifyAll();
            }
        }
    }

    public static /* synthetic */ void zzs(com.google.android.gms.measurement.internal.zzny zznyVar, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzag zzagVar) {
        com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            zzglVar.zzC(zzrVar, zzagVar);
            zznyVar.zzag();
        } catch (android.os.RemoteException e) {
            zznyVar.zzu.zzaW().zze().zzc("[sgtm] Failed to update batch upload status, rowId, exception", java.lang.Long.valueOf(zzagVar.zza), e);
        }
    }

    public static /* synthetic */ void zzt(com.google.android.gms.measurement.internal.zzny zznyVar) {
        com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("Failed to send Dma consent settings to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzrVarZzae = zznyVar.zzae(false);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVarZzae);
            zzglVar.zzy(zzrVarZzae);
            zznyVar.zzag();
        } catch (android.os.RemoteException e) {
            zznyVar.zzu.zzaW().zze().zzb("Failed to send Dma consent settings to the service", e);
        }
    }

    static /* bridge */ /* synthetic */ void zzx(com.google.android.gms.measurement.internal.zzny zznyVar, android.content.ComponentName componentName) {
        zznyVar.zzg();
        if (zznyVar.zzb != null) {
            zznyVar.zzb = null;
            zznyVar.zzu.zzaW().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zznyVar.zzg();
            zznyVar.zzB();
        }
    }

    protected final void zzA() {
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zzr zzrVarZzae = zzae(true);
        zzai();
        this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbl);
        this.zzu.zzi().zzk();
        zzah(new com.google.android.gms.measurement.internal.zznc(this, zzrVarZzae, true));
    }

    final void zzB() {
        zzg();
        zza();
        if (zzaa()) {
            return;
        }
        if (zzad()) {
            this.zza.zzc();
            return;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzC()) {
            return;
        }
        zzioVar.zzaV();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = zzioVar.zzaT().getPackageManager().queryIntentServices(new android.content.Intent().setClassName(zzioVar.zzaT(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzioVar.zzaW().zze().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.measurement.START");
        android.content.Context contextZzaT = zzioVar.zzaT();
        zzioVar.zzaV();
        intent.setComponent(new android.content.ComponentName(contextZzaT, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zzb(intent);
    }

    public final void zzC() {
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zznx zznxVar = this.zza;
        zznxVar.zzd();
        try {
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzu.zzaT(), zznxVar);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzD(com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zznb(this, zzae(false), zzcyVar));
    }

    public final void zzE(java.util.concurrent.atomic.AtomicReference atomicReference) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zzna(this, atomicReference, zzae(false)));
    }

    protected final void zzF(com.google.android.gms.internal.measurement.zzcy zzcyVar, java.lang.String str, java.lang.String str2) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zzno(this, str, str2, zzae(false), zzcyVar));
    }

    protected final void zzG(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zznn(this, atomicReference, null, str2, str3, zzae(false)));
    }

    protected final void zzH(final java.util.concurrent.atomic.AtomicReference atomicReference, final android.os.Bundle bundle) {
        zzg();
        zza();
        final com.google.android.gms.measurement.internal.zzr zzrVarZzae = zzae(false);
        zzah(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzms
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzny.zzr(this.zza, atomicReference, zzrVarZzae, bundle);
            }
        });
    }

    protected final void zzI(final java.util.concurrent.atomic.AtomicReference atomicReference, final com.google.android.gms.measurement.internal.zzpc zzpcVar) {
        zzg();
        zza();
        final com.google.android.gms.measurement.internal.zzr zzrVarZzae = zzae(false);
        zzah(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzmt
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzny.zzq(this.zza, atomicReference, zzrVarZzae, zzpcVar);
            }
        });
    }

    protected final void zzJ(java.util.concurrent.atomic.AtomicReference atomicReference, boolean z) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zzmv(this, atomicReference, zzae(false), z));
    }

    protected final void zzK(com.google.android.gms.internal.measurement.zzcy zzcyVar, java.lang.String str, java.lang.String str2, boolean z) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zzmu(this, str, str2, zzae(false), z, zzcyVar));
    }

    protected final void zzL(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zznp(this, atomicReference, null, str2, str3, zzae(false), z));
    }

    protected final void zzM(com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbhVar);
        zzg();
        zza();
        zzai();
        zzah(new com.google.android.gms.measurement.internal.zznl(this, true, zzae(true), this.zzu.zzi().zzp(zzbhVar), zzbhVar, str));
    }

    public final void zzN(com.google.android.gms.internal.measurement.zzcy zzcyVar, com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str) {
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzw().zzp(12451000) == 0) {
            zzah(new com.google.android.gms.measurement.internal.zznh(this, zzbhVar, str, zzcyVar));
        } else {
            zzioVar.zzaW().zzk().zza("Not bundling data. Service unavailable or out of date");
            zzioVar.zzw().zzW(zzcyVar, new byte[0]);
        }
    }

    protected final void zzO() {
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zzr zzrVarZzae = zzae(false);
        zzai();
        this.zzu.zzi().zzj();
        zzah(new com.google.android.gms.measurement.internal.zzmz(this, zzrVarZzae));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0103  */
    final void zzP(com.google.android.gms.measurement.internal.zzgl zzglVar, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable, com.google.android.gms.measurement.internal.zzr zzrVar) {
        java.lang.String str;
        long j;
        long jElapsedRealtime;
        long j2;
        zzg();
        zza();
        zzai();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzf();
        com.google.android.gms.measurement.internal.zzr zzrVar2 = zzrVar;
        int size = 100;
        int i = 0;
        for (int i2 = 100; i < 1001 && size == i2; i2 = 100) {
            com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List listZzi = zzioVar2.zzi().zzi(i2);
            if (listZzi != null) {
                arrayList.addAll(listZzi);
                size = listZzi.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < i2) {
                arrayList.add(new com.google.android.gms.measurement.internal.zzgu(abstractSafeParcelable, zzrVar2.zzc, zzrVar2.zzj));
            }
            java.lang.String str2 = null;
            boolean zZzx = zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaU);
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                com.google.android.gms.measurement.internal.zzgu zzguVar = (com.google.android.gms.measurement.internal.zzgu) arrayList.get(i3);
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable2 = zzguVar.zza;
                if (zzioVar.zzf().zzx(str2, com.google.android.gms.measurement.internal.zzgi.zzbl)) {
                    java.lang.String str3 = zzguVar.zzb;
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        zzrVar2 = new com.google.android.gms.measurement.internal.zzr(zzrVar2.zza, zzrVar2.zzb, str3, zzguVar.zzc, zzrVar2.zzd, zzrVar2.zze, zzrVar2.zzf, zzrVar2.zzg, zzrVar2.zzh, zzrVar2.zzi, zzrVar2.zzk, zzrVar2.zzl, zzrVar2.zzm, zzrVar2.zzn, zzrVar2.zzo, zzrVar2.zzp, zzrVar2.zzq, zzrVar2.zzr, zzrVar2.zzs, zzrVar2.zzt, zzrVar2.zzu, zzrVar2.zzv, zzrVar2.zzw, zzrVar2.zzx, zzrVar2.zzy, zzrVar2.zzz, zzrVar2.zzA, zzrVar2.zzB, zzrVar2.zzC, zzrVar2.zzD, zzrVar2.zzE, zzrVar2.zzF, zzrVar2.zzG);
                    }
                }
                com.google.android.gms.measurement.internal.zzr zzrVar3 = zzrVar2;
                if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzbh) {
                    if (zZzx) {
                        try {
                            com.google.android.gms.measurement.internal.zzio zzioVar3 = this.zzu;
                            long jCurrentTimeMillis = zzioVar3.zzaU().currentTimeMillis();
                            try {
                                j2 = jCurrentTimeMillis;
                                jElapsedRealtime = zzioVar3.zzaU().elapsedRealtime();
                            } catch (android.os.RemoteException e) {
                                e = e;
                                jElapsedRealtime = 0;
                                j = jCurrentTimeMillis;
                                this.zzu.zzaW().zze().zzb("Failed to send event to the service", e);
                                if (zZzx) {
                                    com.google.android.gms.measurement.internal.zzio zzioVar4 = this.zzu;
                                    com.google.android.gms.measurement.internal.zzha.zza(zzioVar4).zzc(36301, 13, j, zzioVar4.zzaU().currentTimeMillis(), (int) (zzioVar4.zzaU().elapsedRealtime() - jElapsedRealtime));
                                }
                                str = null;
                                i3++;
                                zzrVar2 = zzrVar3;
                                str2 = str;
                            }
                        } catch (android.os.RemoteException e2) {
                            e = e2;
                            j = 0;
                            jElapsedRealtime = 0;
                        }
                    } else {
                        j2 = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        zzglVar.zzp((com.google.android.gms.measurement.internal.zzbh) abstractSafeParcelable2, zzrVar3);
                        if (zZzx) {
                            zzioVar.zzaW().zzj().zza("Logging telemetry for logEvent from database");
                            com.google.android.gms.measurement.internal.zzio zzioVar5 = this.zzu;
                            com.google.android.gms.measurement.internal.zzha.zza(zzioVar5).zzc(36301, 0, j2, zzioVar5.zzaU().currentTimeMillis(), (int) (zzioVar5.zzaU().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (android.os.RemoteException e3) {
                        e = e3;
                        j = j2;
                        this.zzu.zzaW().zze().zzb("Failed to send event to the service", e);
                        if (zZzx && j != 0) {
                            com.google.android.gms.measurement.internal.zzio zzioVar6 = this.zzu;
                            com.google.android.gms.measurement.internal.zzha.zza(zzioVar6).zzc(36301, 13, j, zzioVar6.zzaU().currentTimeMillis(), (int) (zzioVar6.zzaU().elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzqb) {
                    try {
                        zzglVar.zzB((com.google.android.gms.measurement.internal.zzqb) abstractSafeParcelable2, zzrVar3);
                    } catch (android.os.RemoteException e4) {
                        this.zzu.zzaW().zze().zzb("Failed to send user property to the service", e4);
                    }
                } else {
                    if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzai) {
                        try {
                            zzglVar.zzt((com.google.android.gms.measurement.internal.zzai) abstractSafeParcelable2, zzrVar3);
                        } catch (android.os.RemoteException e5) {
                            this.zzu.zzaW().zze().zzb("Failed to send conditional user property to the service", e5);
                        }
                    } else {
                        com.google.android.gms.measurement.internal.zzio zzioVar7 = this.zzu;
                        str = null;
                        if (zzioVar7.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbl) && (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzbf)) {
                            try {
                                zzglVar.zzx(((com.google.android.gms.measurement.internal.zzbf) abstractSafeParcelable2).zzc(), zzrVar3);
                            } catch (android.os.RemoteException e6) {
                                this.zzu.zzaW().zze().zzb("Failed to send default event parameters to the service", e6);
                            }
                        } else {
                            zzioVar7.zzaW().zze().zza("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i3++;
                    zzrVar2 = zzrVar3;
                    str2 = str;
                }
                str = null;
                i3++;
                zzrVar2 = zzrVar3;
                str2 = str;
            }
            i++;
        }
    }

    protected final void zzQ(com.google.android.gms.measurement.internal.zzai zzaiVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar);
        zzg();
        zza();
        this.zzu.zzaV();
        zzah(new com.google.android.gms.measurement.internal.zznm(this, true, zzae(true), this.zzu.zzi().zzn(zzaiVar), new com.google.android.gms.measurement.internal.zzai(zzaiVar), zzaiVar));
    }

    protected final void zzR(boolean z) {
        zzg();
        zza();
        if (zzab()) {
            zzah(new com.google.android.gms.measurement.internal.zznk(this, zzae(false)));
        }
    }

    protected final void zzS(com.google.android.gms.measurement.internal.zzmh zzmhVar) {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zznf(this, zzmhVar));
    }

    public final void zzT(android.os.Bundle bundle) {
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zzbf zzbfVar = new com.google.android.gms.measurement.internal.zzbf(bundle);
        zzai();
        zzah(new com.google.android.gms.measurement.internal.zzng(this, true, zzae(false), this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbl) && this.zzu.zzi().zzo(zzbfVar), zzbfVar, bundle));
    }

    protected final void zzU() {
        zzg();
        zza();
        zzah(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzmq
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzny.zzt(this.zza);
            }
        });
    }

    protected final void zzV() {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zznj(this, zzae(true)));
    }

    protected final void zzW(com.google.android.gms.measurement.internal.zzgl zzglVar) {
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzglVar);
        this.zzb = zzglVar;
        zzag();
        zzaf();
    }

    protected final void zzX(boolean z) {
        zzg();
        zza();
        zzah(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzmp
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzny.zzp(this.zza);
            }
        });
    }

    protected final void zzY(com.google.android.gms.measurement.internal.zzqb zzqbVar) {
        zzg();
        zza();
        zzai();
        zzah(new com.google.android.gms.measurement.internal.zzmy(this, zzae(true), this.zzu.zzi().zzq(zzqbVar), zzqbVar));
    }

    protected final void zzZ(final com.google.android.gms.measurement.internal.zzag zzagVar) {
        zzg();
        zza();
        final com.google.android.gms.measurement.internal.zzr zzrVarZzae = zzae(true);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVarZzae);
        zzah(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzmr
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzny.zzs(this.zza, zzrVarZzae, zzagVar);
            }
        });
    }

    public final boolean zzaa() {
        zzg();
        zza();
        return this.zzb != null;
    }

    final boolean zzab() {
        zzg();
        zza();
        return !zzad() || this.zzu.zzw().zzm() >= ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzaI.zza(null)).intValue();
    }

    final boolean zzac() {
        zzg();
        zza();
        return !zzad() || this.zzu.zzw().zzm() >= 241200;
    }

    final boolean zzad() {
        zzg();
        zza();
        if (this.zzc == null) {
            zzg();
            zza();
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
            zzhtVarZzm.zzg();
            boolean z = false;
            java.lang.Boolean boolValueOf = !zzhtVarZzm.zzb().contains("use_service") ? null : java.lang.Boolean.valueOf(zzhtVarZzm.zzb().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                zzioVar.zzaV();
                if (this.zzu.zzh().zzh() == 1) {
                    z = true;
                } else {
                    zzioVar.zzaW().zzj().zza("Checking service availability");
                    int iZzp = zzioVar.zzw().zzp(12451000);
                    if (iZzp == 0) {
                        zzioVar.zzaW().zzj().zza("Service available");
                    } else if (iZzp == 1) {
                        zzioVar.zzaW().zzj().zza("Service missing");
                    } else if (iZzp != 2) {
                        if (iZzp == 3) {
                            zzioVar.zzaW().zzk().zza("Service disabled");
                        } else if (iZzp == 9) {
                            zzioVar.zzaW().zzk().zza("Service invalid");
                        } else if (iZzp != 18) {
                            zzioVar.zzaW().zzk().zzb("Unexpected service status", java.lang.Integer.valueOf(iZzp));
                        } else {
                            zzioVar.zzaW().zzk().zza("Service updating");
                        }
                        z2 = false;
                    } else {
                        zzioVar.zzaW().zzd().zza("Service container out of date");
                        if (zzioVar.zzw().zzm() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && zzioVar.zzf().zzC()) {
                    zzioVar.zzaW().zze().zza("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    com.google.android.gms.measurement.internal.zzht zzhtVarZzm2 = zzioVar.zzm();
                    zzhtVarZzm2.zzg();
                    android.content.SharedPreferences.Editor editorEdit = zzhtVarZzm2.zzb().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.zzc = java.lang.Boolean.valueOf(z2);
        }
        return this.zzc.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return false;
    }

    protected final com.google.android.gms.measurement.internal.zzap zzh() {
        zzg();
        zza();
        com.google.android.gms.measurement.internal.zzgl zzglVar = this.zzb;
        if (zzglVar == null) {
            zzB();
            this.zzu.zzaW().zzd().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        com.google.android.gms.measurement.internal.zzr zzrVarZzae = zzae(false);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVarZzae);
        try {
            com.google.android.gms.measurement.internal.zzap zzapVarZze = zzglVar.zze(zzrVarZzae);
            zzag();
            return zzapVarZze;
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zze().zzb("Failed to get consents; remote exception", e);
            return null;
        }
    }

    final java.lang.Boolean zzl() {
        return this.zzc;
    }

    protected final void zzz() {
        zzg();
        zza();
        zzah(new com.google.android.gms.measurement.internal.zznd(this, zzae(true)));
    }
}

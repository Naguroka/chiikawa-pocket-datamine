package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcu {
    com.google.android.gms.measurement.internal.zzio zza = null;
    private final java.util.Map zzb = new androidx.collection.ArrayMap();

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdb zzdbVar) {
        try {
            zzdbVar.zze();
        } catch (android.os.RemoteException e) {
            ((com.google.android.gms.measurement.internal.zzio) com.google.android.gms.common.internal.Preconditions.checkNotNull(appMeasurementDynamiteService.zza)).zzaW().zzk().zzb("Failed to call IDynamiteUploadBatchesCallback", e);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcy zzcyVar, java.lang.String str) {
        zzb();
        this.zza.zzw().zzZ(zzcyVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void beginAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzJ(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearMeasurementEnabled(long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzai(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void endAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzd().zze(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void generateEventId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        long jZzs = this.zza.zzw().zzs();
        zzb();
        this.zza.zzw().zzY(zzcyVar, jZzs);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaX().zzq(new com.google.android.gms.measurement.internal.zzj(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        zzc(zzcyVar, this.zza.zzq().zzr());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaX().zzq(new com.google.android.gms.measurement.internal.zzn(this, zzcyVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        zzc(zzcyVar, this.zza.zzq().zzs());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        zzc(zzcyVar, this.zza.zzq().zzt());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVarZzq.zzu;
        java.lang.String strZzc = null;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp) || zzlwVarZzq.zzu.zzx() == null) {
            try {
                strZzc = com.google.android.gms.measurement.internal.zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzlwVarZzq.zzu.zzA());
            } catch (java.lang.IllegalStateException e) {
                zzlwVarZzq.zzu.zzaW().zze().zzb("getGoogleAppId failed with exception", e);
            }
        } else {
            strZzc = zzlwVarZzq.zzu.zzx();
        }
        zzc(zzcyVar, strZzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzi(str);
        zzb();
        this.zza.zzw().zzX(zzcyVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getSessionId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        zzlwVarZzq.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzlj(zzlwVarZzq, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcy zzcyVar, int i) throws android.os.RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzw().zzZ(zzcyVar, this.zza.zzq().zzu());
            return;
        }
        if (i == 1) {
            this.zza.zzw().zzY(zzcyVar, this.zza.zzq().zzq().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.zza.zzw().zzX(zzcyVar, this.zza.zzq().zzp().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.zza.zzw().zzT(zzcyVar, this.zza.zzq().zzl().booleanValue());
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzqf zzqfVarZzw = this.zza.zzw();
        double dDoubleValue = this.zza.zzq().zzm().doubleValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putDouble(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, dDoubleValue);
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            zzqfVarZzw.zzu.zzaW().zzk().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getUserProperties(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaX().zzq(new com.google.android.gms.measurement.internal.zzl(this, zzcyVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initForTests(java.util.Map map) throws android.os.RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initialize(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdh zzdhVar, long j) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
        if (zzioVar == null) {
            this.zza = com.google.android.gms.measurement.internal.zzio.zzp((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper)), zzdhVar, java.lang.Long.valueOf(j));
        } else {
            zzioVar.zzaW().zzk().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaX().zzq(new com.google.android.gms.measurement.internal.zzo(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzP(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        (bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle()).putString("_o", "app");
        this.zza.zzaX().zzq(new com.google.android.gms.measurement.internal.zzk(this, zzcyVar, new com.google.android.gms.measurement.internal.zzbh(str2, new com.google.android.gms.measurement.internal.zzbf(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logHealthData(int i, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        zzb();
        this.zza.zzaW().zzu(i, true, false, str, iObjectWrapper == null ? null : com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, android.os.Bundle bundle, long j) {
        zzb();
        com.google.android.gms.measurement.internal.zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zza(zzdjVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zzb(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zzc(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zzd(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), zzcyVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlv zzlvVar = this.zza.zzq().zza;
        android.os.Bundle bundle = new android.os.Bundle();
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zze(zzdjVar, bundle);
        }
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zza.zzaW().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        zzb();
        zzcyVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzkc zzqVar;
        zzb();
        java.util.Map map = this.zzb;
        synchronized (map) {
            zzqVar = (com.google.android.gms.measurement.internal.zzkc) map.get(java.lang.Integer.valueOf(zzdeVar.zze()));
            if (zzqVar == null) {
                zzqVar = new com.google.android.gms.measurement.internal.zzq(this, zzdeVar);
                map.put(java.lang.Integer.valueOf(zzdeVar.zze()), zzqVar);
            }
        }
        this.zza.zzq().zzV(zzqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void resetAnalyticsData(long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzX(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzdb zzdbVar) {
        zzb();
        if (this.zza.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaR)) {
            this.zza.zzq().zzY(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this.zza, zzdbVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConditionalUserProperty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zzb();
        if (bundle == null) {
            this.zza.zzaW().zze().zza("Conditional user property must not be null");
        } else {
            this.zza.zzq().zzae(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsent(final android.os.Bundle bundle, final long j) throws android.os.RemoteException {
        zzb();
        final com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        zzlwVarZzq.zzu.zzaX().zzr(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzkm
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzlw zzlwVar = zzlwVarZzq;
                if (!android.text.TextUtils.isEmpty(zzlwVar.zzu.zzh().zzo())) {
                    zzlwVar.zzu.zzaW().zzl().zza("Using developer consent only; google app id found");
                } else {
                    zzlwVar.zzaf(bundle, 0, j);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsentThirdParty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzaf(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzt().zzx(zzdjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDataCollectionEnabled(boolean z) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        zzlwVarZzq.zza();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVarZzq.zzu;
        zzlwVarZzq.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzkv(zzlwVarZzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDefaultEventParameters(android.os.Bundle bundle) {
        zzb();
        final com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        final android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        zzlwVarZzq.zzu.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzkk
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzlw.zzz(zzlwVarZzq, bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzde zzdeVar) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzp zzpVar = new com.google.android.gms.measurement.internal.zzp(this, zzdeVar);
        if (this.zza.zzaX().zzu()) {
            this.zza.zzq().zzah(zzpVar);
        } else {
            this.zza.zzaX().zzq(new com.google.android.gms.measurement.internal.zzm(this, zzpVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws android.os.RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMeasurementEnabled(boolean z, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzai(java.lang.Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMinimumSessionDuration(long j) throws android.os.RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSessionTimeoutDuration(long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVarZzq.zzu;
        zzlwVarZzq.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzkx(zzlwVarZzq, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSgtmDebugInfo(android.content.Intent intent) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        android.net.Uri data = intent.getData();
        if (data == null) {
            zzlwVarZzq.zzu.zzaW().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        java.lang.String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVarZzq.zzu;
            zzioVar.zzaW().zzi().zza("[sgtm] Preview Mode was not enabled.");
            zzioVar.zzf().zzv(null);
        } else {
            java.lang.String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (android.text.TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            com.google.android.gms.measurement.internal.zzio zzioVar2 = zzlwVarZzq.zzu;
            zzioVar2.zzaW().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zzioVar2.zzf().zzv(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserId(final java.lang.String str, long j) throws android.os.RemoteException {
        zzb();
        final com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = this.zza.zzq();
        if (str != null && android.text.TextUtils.isEmpty(str)) {
            zzlwVarZzq.zzu.zzaW().zzk().zza("User ID must be non-empty or null");
        } else {
            zzlwVarZzq.zzu.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzkg
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVarZzq.zzu;
                    if (zzioVar.zzh().zzr(str)) {
                        zzioVar.zzh().zzq();
                    }
                }
            });
            zzlwVarZzq.zzam(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserProperty(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzq().zzam(str, str2, com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzkc zzqVar;
        zzb();
        java.util.Map map = this.zzb;
        synchronized (map) {
            zzqVar = (com.google.android.gms.measurement.internal.zzkc) map.remove(java.lang.Integer.valueOf(zzdeVar.zze()));
        }
        if (zzqVar == null) {
            zzqVar = new com.google.android.gms.measurement.internal.zzq(this, zzdeVar);
        }
        this.zza.zzq().zzao(zzqVar);
    }
}

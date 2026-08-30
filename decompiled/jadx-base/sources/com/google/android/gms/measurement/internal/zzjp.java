package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjp extends com.google.android.gms.measurement.internal.zzgk {
    private final com.google.android.gms.measurement.internal.zzpv zza;
    private java.lang.Boolean zzb;
    private java.lang.String zzc;

    public zzjp(com.google.android.gms.measurement.internal.zzpv zzpvVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpvVar);
        this.zza = zzpvVar;
        this.zzc = null;
    }

    public static /* synthetic */ void zzE(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        zzpvVar.zzak(zzrVar);
    }

    public static /* synthetic */ void zzF(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzag zzagVar) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        zzpvVar.zzap((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza), zzagVar);
    }

    public static /* synthetic */ void zzG(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        zzpvVar.zzai(zzrVar);
    }

    public static /* synthetic */ void zzH(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzgo zzgoVar, java.lang.String str) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        try {
            zzgoVar.zze(zzpvVar.zzF(zzrVar, bundle));
        } catch (android.os.RemoteException e) {
            zzjpVar.zza.zzaW().zze().zzc("Failed to return trigger URIs for app", str, e);
        }
    }

    public static /* synthetic */ void zzI(com.google.android.gms.measurement.internal.zzjp zzjpVar, android.os.Bundle bundle, java.lang.String str, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzjpVar.zza;
        boolean zZzx = zzpvVar.zzi().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbc);
        boolean zZzx2 = zzpvVar.zzi().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbe);
        if (bundle.isEmpty() && zZzx) {
            com.google.android.gms.measurement.internal.zzaw zzawVarZzj = zzjpVar.zza.zzj();
            zzawVarZzj.zzg();
            zzawVarZzj.zzav();
            try {
                zzawVarZzj.zzj().execSQL("delete from default_event_params where app_id=?", new java.lang.String[]{str});
                return;
            } catch (android.database.sqlite.SQLiteException e) {
                zzawVarZzj.zzu.zzaW().zze().zzb("Error clearing default event params", e);
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj2 = zzpvVar.zzj();
        zzawVarZzj2.zzg();
        zzawVarZzj2.zzav();
        byte[] bArrZzcd = zzawVarZzj2.zzg.zzA().zzm(new com.google.android.gms.measurement.internal.zzbc(zzawVarZzj2.zzu, "", str, "dep", 0L, 0L, bundle)).zzcd();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzawVarZzj2.zzu;
        zzioVar.zzaW().zzj().zzc("Saving default event parameters, appId, data size", str, java.lang.Integer.valueOf(bArrZzcd.length));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzcd);
        try {
            if (zzawVarZzj2.zzj().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzioVar.zzaW().zze().zzb("Failed to insert default event parameters (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            zzawVarZzj2.zzu.zzaW().zze().zzc("Error storing default event parameters. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e2);
        }
        com.google.android.gms.measurement.internal.zzpv zzpvVar2 = zzjpVar.zza;
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj3 = zzpvVar2.zzj();
        long j = zzrVar.zzF;
        if (zzawVarZzj3.zzag(str, j)) {
            if (zZzx2) {
                zzpvVar2.zzj().zzG(str, java.lang.Long.valueOf(j), null, bundle);
            } else {
                zzpvVar2.zzj().zzG(str, null, null, bundle);
            }
        }
    }

    private final void zzM(com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzN(str, false);
        this.zza.zzB().zzac(zzrVar.zzb, zzrVar.zzp);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    private final void zzN(java.lang.String str, boolean z) {
        boolean z2;
        if (android.text.TextUtils.isEmpty(str)) {
            this.zza.zzaW().zze().zza("Measurement Service called without app package");
            throw new java.lang.SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    if ("com.google.android.gms".equals(this.zzc)) {
                        z2 = true;
                    } else {
                        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
                        if (com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(zzpvVar.zzaT(), android.os.Binder.getCallingUid()) || com.google.android.gms.common.GoogleSignatureVerifier.getInstance(zzpvVar.zzaT()).isUidGoogleSigned(android.os.Binder.getCallingUid())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    this.zzb = java.lang.Boolean.valueOf(z2);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (java.lang.SecurityException e) {
                this.zza.zzaW().zze().zzb("Measurement Service called with invalid calling package. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                throw e;
            }
        }
        if (this.zzc == null && com.google.android.gms.common.GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaT(), android.os.Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void zzO(com.google.android.gms.measurement.internal.zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        zzpvVar.zzL();
        zzpvVar.zzS(zzbhVar, zzrVar);
    }

    public static /* synthetic */ void zzd(com.google.android.gms.measurement.internal.zzjp zzjpVar, java.lang.String str, com.google.android.gms.measurement.internal.zzpc zzpcVar, com.google.android.gms.measurement.internal.zzgr zzgrVar) {
        com.google.android.gms.measurement.internal.zzpe zzpeVar;
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        if (zzpvVar.zzi().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
            zzpvVar.zzaX().zzg();
            zzpvVar.zzM();
            java.util.List<com.google.android.gms.measurement.internal.zzpz> listZzD = zzpvVar.zzj().zzD(str, zzpcVar, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzA.zza(null)).intValue());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.measurement.internal.zzpz zzpzVar : listZzD) {
                if (zzpvVar.zzay(str, zzpzVar.zzh())) {
                    int iZza = zzpzVar.zza();
                    if (iZza > 0) {
                        if (iZza <= ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzy.zza(null)).intValue()) {
                            if (zzpvVar.zzaU().currentTimeMillis() >= zzpzVar.zzb() + java.lang.Math.min(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzw.zza(null)).longValue() * (1 << (iZza - 1)), ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzx.zza(null)).longValue())) {
                            }
                        }
                        zzpvVar.zzaW().zzj().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, java.lang.Long.valueOf(zzpzVar.zzc()), java.lang.Long.valueOf(zzpzVar.zzb()));
                    }
                    com.google.android.gms.measurement.internal.zzpa zzpaVarZze = zzpzVar.zze();
                    try {
                        com.google.android.gms.internal.measurement.zzht zzhtVar = (com.google.android.gms.internal.measurement.zzht) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhv.zzb(), zzpaVarZze.zzb);
                        for (int i = 0; i < zzhtVar.zza(); i++) {
                            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzhtVar.zzh(i).zzch();
                            zzhwVar.zzaA(zzpvVar.zzaU().currentTimeMillis());
                            zzhtVar.zze(i, zzhwVar);
                        }
                        zzpaVarZze.zzb = ((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba()).zzcd();
                        if (android.util.Log.isLoggable(zzpvVar.zzaW().zzr(), 2)) {
                            zzpaVarZze.zzg = zzpvVar.zzA().zzq((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba());
                        }
                        arrayList.add(zzpaVarZze);
                    } catch (com.google.android.gms.internal.measurement.zzmm unused) {
                        zzpvVar.zzaW().zzk().zzb("Failed to parse queued batch. appId", str);
                    }
                } else {
                    zzpvVar.zzaW().zzj().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, java.lang.Long.valueOf(zzpzVar.zzc()), zzpzVar.zzh());
                }
            }
            zzpeVar = new com.google.android.gms.measurement.internal.zzpe(arrayList);
        } else {
            zzpeVar = new com.google.android.gms.measurement.internal.zzpe(java.util.Collections.emptyList());
        }
        try {
            zzgrVar.zze(zzpeVar);
            zzjpVar.zza.zzaW().zzj().zzc("[sgtm] Sending queued upload batches to client. appId, count", str, java.lang.Integer.valueOf(zzpeVar.zza.size()));
        } catch (android.os.RemoteException e) {
            zzjpVar.zza.zzaW().zze().zzc("[sgtm] Failed to return upload batches for app", str, e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzA(final com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zzu);
        zzK(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzir
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzjp.zzE(this.zza, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzB(com.google.android.gms.measurement.internal.zzqb zzqbVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzqbVar);
        zzM(zzrVar, false);
        zzL(new com.google.android.gms.measurement.internal.zzjm(this, zzqbVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzC(final com.google.android.gms.measurement.internal.zzr zzrVar, final com.google.android.gms.measurement.internal.zzag zzagVar) {
        if (this.zza.zzi().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
            zzM(zzrVar, false);
            zzL(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzip
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.zzjp.zzF(this.zza, zzrVar, zzagVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final byte[] zzD(com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbhVar);
        zzN(str, true);
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        com.google.android.gms.measurement.internal.zzhc zzhcVarZzd = zzpvVar.zzaW().zzd();
        com.google.android.gms.measurement.internal.zzgx zzgxVarZzo = zzpvVar.zzo();
        java.lang.String str2 = zzbhVar.zza;
        zzhcVarZzd.zzb("Log and bundle. event", zzgxVarZzo.zzd(str2));
        long jNanoTime = zzpvVar.zzaU().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpvVar.zzaX().zzh(new com.google.android.gms.measurement.internal.zzjl(this, zzbhVar, str)).get();
            if (bArr == null) {
                zzpvVar.zzaW().zze().zzb("Log and bundle returned null. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                bArr = new byte[0];
            }
            zzpvVar.zzaW().zzd().zzd("Log and bundle processed. event, size, time_ms", zzpvVar.zzo().zzd(str2), java.lang.Integer.valueOf(bArr.length), java.lang.Long.valueOf((zzpvVar.zzaU().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            com.google.android.gms.measurement.internal.zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzaW().zze().zzd("Failed to log and bundle. appId, event, error", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzpvVar2.zzo().zzd(zzbhVar.zza), e);
            return null;
        }
    }

    final void zzJ(com.google.android.gms.measurement.internal.zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        if (!((java.lang.Boolean) com.google.android.gms.measurement.internal.zzgi.zzbn.zza(null)).booleanValue()) {
            com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
            com.google.android.gms.measurement.internal.zzif zzifVarZzr = zzpvVar.zzr();
            java.lang.String str = zzrVar.zza;
            if (!zzifVarZzr.zzs(str)) {
                zzO(zzbhVar, zzrVar);
                return;
            }
            zzpvVar.zzaW().zzj().zzb("EES config found for", str);
        }
        com.google.android.gms.measurement.internal.zzpv zzpvVar2 = this.zza;
        com.google.android.gms.measurement.internal.zzif zzifVarZzr2 = zzpvVar2.zzr();
        java.lang.String str2 = zzrVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = android.text.TextUtils.isEmpty(str2) ? null : (com.google.android.gms.internal.measurement.zzc) zzifVarZzr2.zzd.get(str2);
        if (zzcVar == null) {
            this.zza.zzaW().zzj().zzb("EES not loaded for", zzrVar.zza);
            zzO(zzbhVar, zzrVar);
            return;
        }
        try {
            java.util.Map mapZzv = zzpvVar2.zzA().zzv(zzbhVar.zzb.zzc(), true);
            java.lang.String str3 = zzbhVar.zza;
            java.lang.String strZza = com.google.android.gms.measurement.internal.zzjy.zza(str3);
            if (strZza != null) {
                str3 = strZza;
            }
            if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(str3, zzbhVar.zzd, mapZzv))) {
                if (zzcVar.zzg()) {
                    com.google.android.gms.measurement.internal.zzpv zzpvVar3 = this.zza;
                    zzpvVar3.zzaW().zzj().zzb("EES edited event", zzbhVar.zza);
                    zzO(zzpvVar3.zzA().zzj(zzcVar.zza().zzb()), zzrVar);
                } else {
                    zzO(zzbhVar, zzrVar);
                }
                if (zzcVar.zzf()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                        com.google.android.gms.measurement.internal.zzpv zzpvVar4 = this.zza;
                        zzpvVar4.zzaW().zzj().zzb("EES logging created event", zzaaVar.zze());
                        zzO(zzpvVar4.zzA().zzj(zzaaVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaW().zze().zzc("EES error. appId, eventName", zzrVar.zzb, zzbhVar.zza);
        }
        this.zza.zzaW().zzj().zzb("EES was not applied to event", zzbhVar.zza);
        zzO(zzbhVar, zzrVar);
    }

    final void zzK(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        if (zzpvVar.zzaX().zzu()) {
            runnable.run();
        } else {
            zzpvVar.zzaX().zzr(runnable);
        }
    }

    final void zzL(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        if (zzpvVar.zzaX().zzu()) {
            runnable.run();
        } else {
            zzpvVar.zzaX().zzq(runnable);
        }
    }

    final com.google.android.gms.measurement.internal.zzbh zzb(com.google.android.gms.measurement.internal.zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzbf zzbfVar;
        if (com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbhVar.zza) && (zzbfVar = zzbhVar.zzb) != null && zzbfVar.zza() != 0) {
            java.lang.String strZzg = zzbfVar.zzg("_cis");
            if ("referrer broadcast".equals(strZzg) || "referrer API".equals(strZzg)) {
                this.zza.zzaW().zzi().zzb("Event has been filtered ", zzbhVar.toString());
                return new com.google.android.gms.measurement.internal.zzbh("_cmpx", zzbfVar, zzbhVar.zzc, zzbhVar.zzd);
            }
        }
        return zzbhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final com.google.android.gms.measurement.internal.zzap zze(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        try {
            return (com.google.android.gms.measurement.internal.zzap) this.zza.zzaX().zzh(new com.google.android.gms.measurement.internal.zzji(this, zzrVar)).get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            this.zza.zzaW().zze().zzc("Failed to get consent. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzrVar.zza), e);
            return new com.google.android.gms.measurement.internal.zzap(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.lang.String zzf(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        return this.zza.zzD(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzg(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) {
        zzM(zzrVar, false);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        if (!zzpvVar.zzi().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbh)) {
            try {
                return (java.util.List) this.zza.zzaX().zzf(new com.google.android.gms.measurement.internal.zzjo(this, zzrVar, bundle)).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                this.zza.zzaW().zze().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzrVar.zza), e);
                return java.util.Collections.emptyList();
            }
        }
        try {
            return (java.util.List) zzpvVar.zzaX().zzh(new com.google.android.gms.measurement.internal.zzjn(this, zzrVar, bundle)).get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e2) {
            this.zza.zzaW().zze().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzrVar.zza), e2);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzh(com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        zzM(zzrVar, false);
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzqd> list = (java.util.List) this.zza.zzaX().zzf(new com.google.android.gms.measurement.internal.zziv(this, str)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzqd zzqdVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzqf.zzap(zzqdVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzqb(zzqdVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaW().zze().zzc("Failed to get user properties. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzi(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        java.lang.String str3 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
        try {
            return (java.util.List) this.zza.zzaX().zzf(new com.google.android.gms.measurement.internal.zzjd(this, str3, str, str2)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaW().zze().zzb("Failed to get conditional user properties", e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzN(str, true);
        try {
            return (java.util.List) this.zza.zzaX().zzf(new com.google.android.gms.measurement.internal.zzje(this, str, str2, str3)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaW().zze().zzb("Failed to get conditional user properties as", e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzk(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        java.lang.String str3 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzqd> list = (java.util.List) this.zza.zzaX().zzf(new com.google.android.gms.measurement.internal.zzjb(this, str3, str, str2)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzqd zzqdVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzqf.zzap(zzqdVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzqb(zzqdVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaW().zze().zzc("Failed to query user properties. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzrVar.zza), e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        zzN(str, true);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzqd> list = (java.util.List) this.zza.zzaX().zzf(new com.google.android.gms.measurement.internal.zzjc(this, str, str2, str3)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzqd zzqdVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzqf.zzap(zzqdVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzqb(zzqdVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaW().zze().zzc("Failed to get user properties as. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzm(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        zzL(new com.google.android.gms.measurement.internal.zzix(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzn(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        zzL(new com.google.android.gms.measurement.internal.zziw(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzo(com.google.android.gms.measurement.internal.zzr zzrVar, final com.google.android.gms.measurement.internal.zzpc zzpcVar, final com.google.android.gms.measurement.internal.zzgr zzgrVar) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        if (zzpvVar.zzi().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
            zzM(zzrVar, false);
            final java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
            this.zza.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzis
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.zzjp.zzd(this.zza, str, zzpcVar, zzgrVar);
                }
            });
        } else {
            try {
                zzgrVar.zze(new com.google.android.gms.measurement.internal.zzpe(java.util.Collections.emptyList()));
                zzpvVar.zzaW().zzj().zza("[sgtm] Client upload is not enabled on the service side.");
            } catch (android.os.RemoteException e) {
                this.zza.zzaW().zzk().zzb("[sgtm] UploadBatchesCallback failed.", e);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzp(com.google.android.gms.measurement.internal.zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbhVar);
        zzM(zzrVar, false);
        zzL(new com.google.android.gms.measurement.internal.zzjj(this, zzbhVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzq(com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbhVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzN(str, true);
        zzL(new com.google.android.gms.measurement.internal.zzjk(this, zzbhVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzr(final com.google.android.gms.measurement.internal.zzr zzrVar, final android.os.Bundle bundle, final com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        zzM(zzrVar, false);
        final java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zziq
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzjp.zzH(this.zza, zzrVar, bundle, zzgoVar, str);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzs(com.google.android.gms.measurement.internal.zzr zzrVar) {
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzN(str, false);
        zzL(new com.google.android.gms.measurement.internal.zzjg(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzt(com.google.android.gms.measurement.internal.zzai zzaiVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar.zzc);
        zzM(zzrVar, false);
        com.google.android.gms.measurement.internal.zzai zzaiVar2 = new com.google.android.gms.measurement.internal.zzai(zzaiVar);
        zzaiVar2.zza = zzrVar.zza;
        zzL(new com.google.android.gms.measurement.internal.zziz(this, zzaiVar2, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzu(com.google.android.gms.measurement.internal.zzai zzaiVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar.zzc);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzaiVar.zza);
        zzN(zzaiVar.zza, true);
        zzL(new com.google.android.gms.measurement.internal.zzja(this, new com.google.android.gms.measurement.internal.zzai(zzaiVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzv(com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zzu);
        zzK(new com.google.android.gms.measurement.internal.zzjh(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzw(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzL(new com.google.android.gms.measurement.internal.zziy(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzx(final android.os.Bundle bundle, final com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        final java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzL(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zziu
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzjp.zzI(this.zza, bundle, str, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzy(final com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zzu);
        zzK(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzit
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzjp.zzG(this.zza, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzz(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzM(zzrVar, false);
        zzL(new com.google.android.gms.measurement.internal.zzjf(this, zzrVar));
    }
}

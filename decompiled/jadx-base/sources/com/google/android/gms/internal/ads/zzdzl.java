package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdzl extends com.google.android.gms.internal.ads.zzbux {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final com.google.android.gms.internal.ads.zzdzt zzc;
    private final com.google.android.gms.internal.ads.zzckx zzd;
    private final java.util.ArrayDeque zze;
    private final com.google.android.gms.internal.ads.zzfhk zzf;
    private final com.google.android.gms.internal.ads.zzbvs zzg;

    public zzdzl(android.content.Context context, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzbvs zzbvsVar, com.google.android.gms.internal.ads.zzckx zzckxVar, com.google.android.gms.internal.ads.zzdzt zzdztVar, java.util.ArrayDeque arrayDeque, com.google.android.gms.internal.ads.zzdzq zzdzqVar, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        this.zza = context;
        this.zzb = zzgcsVar;
        this.zzg = zzbvsVar;
        this.zzc = zzdztVar;
        this.zzd = zzckxVar;
        this.zze = arrayDeque;
        this.zzf = zzfhkVar;
    }

    private final synchronized com.google.android.gms.internal.ads.zzdzi zzl(java.lang.String str) {
        java.util.Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzdzi zzdziVar = (com.google.android.gms.internal.ads.zzdzi) it.next();
            if (zzdziVar.zzc.equals(str)) {
                it.remove();
                return zzdziVar;
            }
        }
        return null;
    }

    private static com.google.common.util.concurrent.ListenableFuture zzm(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfgn zzfgnVar, com.google.android.gms.internal.ads.zzbog zzbogVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        com.google.android.gms.internal.ads.zzbnw zzbnwVarZza = zzbogVar.zza("AFMA_getAdDictionary", com.google.android.gms.internal.ads.zzbod.zza, new com.google.android.gms.internal.ads.zzbny() { // from class: com.google.android.gms.internal.ads.zzdzc
            @Override // com.google.android.gms.internal.ads.zzbny
            public final java.lang.Object zza(org.json.JSONObject jSONObject) {
                return new com.google.android.gms.internal.ads.zzbvm(jSONObject);
            }
        });
        com.google.android.gms.internal.ads.zzfhg.zzd(listenableFuture, zzfgwVar);
        com.google.android.gms.internal.ads.zzfft zzfftVarZza = zzfgnVar.zzb(com.google.android.gms.internal.ads.zzfgh.BUILD_URL, listenableFuture).zzf(zzbnwVarZza).zza();
        com.google.android.gms.internal.ads.zzfhg.zzc(zzfftVarZza, zzfhhVar, zzfgwVar);
        return zzfftVarZza;
    }

    private static com.google.common.util.concurrent.ListenableFuture zzn(final com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzfgn zzfgnVar, final com.google.android.gms.internal.ads.zzeuu zzeuuVar) {
        com.google.android.gms.internal.ads.zzgbo zzgboVar = new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return zzeuuVar.zzb().zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((android.os.Bundle) obj), zzbvkVar.zzm, false);
            }
        };
        return zzfgnVar.zzb(com.google.android.gms.internal.ads.zzfgh.GMS_SIGNALS, com.google.android.gms.internal.ads.zzgch.zzh(zzbvkVar.zza)).zzf(zzgboVar).zze(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzo(com.google.android.gms.internal.ads.zzdzi zzdziVar) {
        zzp();
        this.zze.addLast(zzdziVar);
    }

    private final synchronized void zzp() {
        int iIntValue = ((java.lang.Long) com.google.android.gms.internal.ads.zzbes.zzb.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzbvc zzbvcVar, com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgch.zzn(listenableFuture, new com.google.android.gms.internal.ads.zzgbo(this) { // from class: com.google.android.gms.internal.ads.zzdzd
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.io.IOException {
                final java.io.InputStream inputStream = (java.io.InputStream) obj;
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
                android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final android.os.ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfdj
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.io.InputStream inputStream2 = inputStream;
                        try {
                            try {
                                android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    com.google.android.gms.common.util.IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } catch (java.lang.Throwable th) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (java.io.IOException unused) {
                        }
                    }
                });
                return com.google.android.gms.internal.ads.zzgch.zzh(parcelFileDescriptor);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zza), new com.google.android.gms.internal.ads.zzdzh(this, zzbvkVar, zzbvcVar), com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzbvk zzbvkVar, int i) {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbes.zza.zze()).booleanValue()) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.Exception("Split request is disabled."));
        }
        com.google.android.gms.internal.ads.zzfed zzfedVar = zzbvkVar.zzi;
        if (zzfedVar == null) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.Exception("Pool configuration missing from request."));
        }
        if (zzfedVar.zzc == 0 || zzfedVar.zzd == 0) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.Exception("Caching is disabled."));
        }
        com.google.android.gms.internal.ads.zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzf);
        com.google.android.gms.internal.ads.zzeuu zzeuuVarZzr = this.zzd.zzr(zzbvkVar, i);
        com.google.android.gms.internal.ads.zzfgn zzfgnVarZzc = zzeuuVarZzr.zzc();
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = zzn(zzbvkVar, zzfgnVarZzc, zzeuuVarZzr);
        com.google.android.gms.internal.ads.zzfhh zzfhhVarZzd = zzeuuVarZzr.zzd();
        final com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 9);
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzm = zzm(listenableFutureZzn, zzfgnVarZzc, zzbogVarZzb, zzfhhVarZzd, zzfgwVarZza);
        return zzfgnVarZzc.zza(com.google.android.gms.internal.ads.zzfgh.GET_URL_AND_CACHE_KEY, listenableFutureZzn, listenableFutureZzm).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdza
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzk(listenableFutureZzm, listenableFutureZzn, zzbvkVar, zzfgwVarZza);
            }
        }).zza();
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzbvk zzbvkVar, int i) {
        com.google.android.gms.internal.ads.zzdzi zzdziVarZzl;
        com.google.android.gms.internal.ads.zzfft zzfftVarZza;
        com.google.android.gms.internal.ads.zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzf);
        com.google.android.gms.internal.ads.zzeuu zzeuuVarZzr = this.zzd.zzr(zzbvkVar, i);
        com.google.android.gms.internal.ads.zzbnw zzbnwVarZza = zzbogVarZzb.zza("google.afma.response.normalize", com.google.android.gms.internal.ads.zzdzk.zza, com.google.android.gms.internal.ads.zzbod.zzb);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbes.zza.zze()).booleanValue()) {
            zzdziVarZzl = zzl(zzbvkVar.zzh);
            if (zzdziVarZzl == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            java.lang.String str = zzbvkVar.zzj;
            zzdziVarZzl = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = zzdziVarZzl == null ? com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 9) : zzdziVarZzl.zzd;
        com.google.android.gms.internal.ads.zzfhh zzfhhVarZzd = zzeuuVarZzr.zzd();
        zzfhhVarZzd.zzd(zzbvkVar.zza.getStringArrayList("ad_types"));
        com.google.android.gms.internal.ads.zzdzs zzdzsVar = new com.google.android.gms.internal.ads.zzdzs(zzbvkVar.zzg, zzfhhVarZzd, zzfgwVarZza);
        com.google.android.gms.internal.ads.zzdzp zzdzpVar = new com.google.android.gms.internal.ads.zzdzp(this.zza, zzbvkVar.zzb.afmaVersion, this.zzg, i);
        com.google.android.gms.internal.ads.zzfgn zzfgnVarZzc = zzeuuVarZzr.zzc();
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza2 = com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 11);
        if (zzdziVarZzl == null) {
            final com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = zzn(zzbvkVar, zzfgnVarZzc, zzeuuVarZzr);
            final com.google.common.util.concurrent.ListenableFuture listenableFutureZzm = zzm(listenableFutureZzn, zzfgnVarZzc, zzbogVarZzb, zzfhhVarZzd, zzfgwVarZza);
            com.google.android.gms.internal.ads.zzfgw zzfgwVarZza3 = com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 10);
            final com.google.android.gms.internal.ads.zzfft zzfftVarZza2 = zzfgnVarZzc.zza(com.google.android.gms.internal.ads.zzfgh.HTTP, listenableFutureZzm, listenableFutureZzn).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdyy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.google.android.gms.internal.ads.zzbvk zzbvkVar2;
                    android.os.Bundle bundle;
                    com.google.android.gms.internal.ads.zzbvm zzbvmVar = (com.google.android.gms.internal.ads.zzbvm) listenableFutureZzm.get();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && (bundle = (zzbvkVar2 = zzbvkVar).zzm) != null) {
                        bundle.putLong(com.google.android.gms.internal.ads.zzdre.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvmVar.zzc());
                        zzbvkVar2.zzm.putLong(com.google.android.gms.internal.ads.zzdre.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvmVar.zzb());
                    }
                    return new com.google.android.gms.internal.ads.zzdzr((org.json.JSONObject) listenableFutureZzn.get(), zzbvmVar);
                }
            }).zze(zzdzsVar).zze(new com.google.android.gms.internal.ads.zzfhc(zzfgwVarZza3)).zze(zzdzpVar).zza();
            com.google.android.gms.internal.ads.zzfhg.zza(zzfftVarZza2, zzfhhVarZzd, zzfgwVarZza3);
            com.google.android.gms.internal.ads.zzfhg.zzd(zzfftVarZza2, zzfgwVarZza2);
            zzfftVarZza = zzfgnVarZzc.zza(com.google.android.gms.internal.ads.zzfgh.PRE_PROCESS, listenableFutureZzn, listenableFutureZzm, zzfftVarZza2).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdyz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    android.os.Bundle bundle;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && (bundle = zzbvkVar.zzm) != null) {
                        bundle.putLong(com.google.android.gms.internal.ads.zzdre.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
                    }
                    return new com.google.android.gms.internal.ads.zzdzk((com.google.android.gms.internal.ads.zzdzo) zzfftVarZza2.get(), (org.json.JSONObject) listenableFutureZzn.get(), (com.google.android.gms.internal.ads.zzbvm) listenableFutureZzm.get());
                }
            }).zzf(zzbnwVarZza).zza();
        } else {
            com.google.android.gms.internal.ads.zzdzr zzdzrVar = new com.google.android.gms.internal.ads.zzdzr(zzdziVarZzl.zzb, zzdziVarZzl.zza);
            com.google.android.gms.internal.ads.zzfgw zzfgwVarZza4 = com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 10);
            final com.google.android.gms.internal.ads.zzfft zzfftVarZza3 = zzfgnVarZzc.zzb(com.google.android.gms.internal.ads.zzfgh.HTTP, com.google.android.gms.internal.ads.zzgch.zzh(zzdzrVar)).zze(zzdzsVar).zze(new com.google.android.gms.internal.ads.zzfhc(zzfgwVarZza4)).zze(zzdzpVar).zza();
            com.google.android.gms.internal.ads.zzfhg.zza(zzfftVarZza3, zzfhhVarZzd, zzfgwVarZza4);
            final com.google.common.util.concurrent.ListenableFuture listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(zzdziVarZzl);
            com.google.android.gms.internal.ads.zzfhg.zzd(zzfftVarZza3, zzfgwVarZza2);
            zzfftVarZza = zzfgnVarZzc.zza(com.google.android.gms.internal.ads.zzfgh.PRE_PROCESS, zzfftVarZza3, listenableFutureZzh).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdyv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.google.android.gms.internal.ads.zzdzo zzdzoVar = (com.google.android.gms.internal.ads.zzdzo) zzfftVarZza3.get();
                    com.google.common.util.concurrent.ListenableFuture listenableFuture = listenableFutureZzh;
                    return new com.google.android.gms.internal.ads.zzdzk(zzdzoVar, ((com.google.android.gms.internal.ads.zzdzi) listenableFuture.get()).zzb, ((com.google.android.gms.internal.ads.zzdzi) listenableFuture.get()).zza);
                }
            }).zzf(zzbnwVarZza).zza();
        }
        com.google.android.gms.internal.ads.zzfhg.zza(zzfftVarZza, zzfhhVarZzd, zzfgwVarZza2);
        return zzfftVarZza;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(final com.google.android.gms.internal.ads.zzbvk zzbvkVar, int i) {
        com.google.android.gms.internal.ads.zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzf);
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbex.zza.zze()).booleanValue()) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.Exception("Signal collection disabled."));
        }
        com.google.android.gms.internal.ads.zzeuu zzeuuVarZzr = this.zzd.zzr(zzbvkVar, i);
        final com.google.android.gms.internal.ads.zzetu zzetuVarZza = zzeuuVarZzr.zza();
        com.google.android.gms.internal.ads.zzbnw zzbnwVarZza = zzbogVarZzb.zza("google.afma.request.getSignals", com.google.android.gms.internal.ads.zzbod.zza, com.google.android.gms.internal.ads.zzbod.zzb);
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 22);
        com.google.android.gms.internal.ads.zzfft zzfftVarZza = zzeuuVarZzr.zzc().zzb(com.google.android.gms.internal.ads.zzfgh.GET_SIGNALS, com.google.android.gms.internal.ads.zzgch.zzh(zzbvkVar.zza)).zze(new com.google.android.gms.internal.ads.zzfhc(zzfgwVarZza)).zzf(new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws org.json.JSONException {
                return zzetuVarZza.zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((android.os.Bundle) obj), zzbvkVar.zzm, false);
            }
        }).zzb(com.google.android.gms.internal.ads.zzfgh.JS_SIGNALS).zzf(zzbnwVarZza).zza();
        com.google.android.gms.internal.ads.zzfhh zzfhhVarZzd = zzeuuVarZzr.zzd();
        zzfhhVarZzd.zzd(zzbvkVar.zza.getStringArrayList("ad_types"));
        zzfhhVarZzd.zzf(zzbvkVar.zza.getBundle("extras"));
        com.google.android.gms.internal.ads.zzfhg.zzb(zzfftVarZza, zzfhhVarZzd, zzfgwVarZza);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzf.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzdzt zzdztVar = this.zzc;
            java.util.Objects.requireNonNull(zzdztVar);
            zzfftVarZza.addListener(new com.google.android.gms.internal.ads.zzdzb(zzdztVar), this.zzb);
        }
        return zzfftVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zze(com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        zzq(zzb(zzbvkVar, android.os.Binder.getCallingUid()), zzbvcVar, zzbvkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzf(com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        android.os.Bundle bundle;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && (bundle = zzbvkVar.zzm) != null) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        zzq(zzd(zzbvkVar, android.os.Binder.getCallingUid()), zzbvcVar, zzbvkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzg(com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        android.os.Bundle bundle;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && (bundle = zzbvkVar.zzm) != null) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzc = zzc(zzbvkVar, android.os.Binder.getCallingUid());
        zzq(listenableFutureZzc, zzbvcVar, zzbvkVar);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zze.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzdzt zzdztVar = this.zzc;
            java.util.Objects.requireNonNull(zzdztVar);
            listenableFutureZzc.addListener(new com.google.android.gms.internal.ads.zzdzb(zzdztVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzh(java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        zzq(zzj(str), zzbvcVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(com.google.android.gms.internal.ads.zzbuu zzbuuVar, com.google.android.gms.internal.ads.zzbvd zzbvdVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbez.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            java.lang.String str = zzbuuVar.zza;
            com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzdzf(this, zzbvdVar, zzbuuVar), com.google.android.gms.internal.ads.zzbzw.zzg);
        } else {
            try {
                zzbvdVar.zzf("", zzbuuVar);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzj(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbes.zza.zze()).booleanValue()) {
            return zzl(str) == null ? com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.Exception("URL to be removed not found for cache key: ".concat(java.lang.String.valueOf(str)))) : com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzdzg(this));
        }
        return com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ java.io.InputStream zzk(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture2, com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) throws java.lang.Exception {
        java.lang.String strZze = ((com.google.android.gms.internal.ads.zzbvm) listenableFuture.get()).zze();
        zzo(new com.google.android.gms.internal.ads.zzdzi((com.google.android.gms.internal.ads.zzbvm) listenableFuture.get(), (org.json.JSONObject) listenableFuture2.get(), zzbvkVar.zzh, strZze, zzfgwVar));
        return new java.io.ByteArrayInputStream(strZze.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}

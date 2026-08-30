package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzex {
    public static final java.util.Set zza = new java.util.HashSet(java.util.Arrays.asList(com.google.android.gms.ads.AdFormat.APP_OPEN_AD, com.google.android.gms.ads.AdFormat.INTERSTITIAL, com.google.android.gms.ads.AdFormat.REWARDED));
    private static com.google.android.gms.ads.internal.client.zzex zzb;
    private com.google.android.gms.ads.internal.client.zzcz zzi;
    private final java.lang.Object zzc = new java.lang.Object();
    private final java.lang.Object zzd = new java.lang.Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private final java.lang.Object zzh = new java.lang.Object();
    private com.google.android.gms.ads.OnAdInspectorClosedListener zzj = null;
    private com.google.android.gms.ads.RequestConfiguration zzk = new com.google.android.gms.ads.RequestConfiguration.Builder().build();
    private final java.util.ArrayList zze = new java.util.ArrayList();

    private zzex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.ads.initialization.InitializationStatus zzA(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzbln zzblnVar = (com.google.android.gms.internal.ads.zzbln) it.next();
            map.put(zzblnVar.zza, new com.google.android.gms.internal.ads.zzblv(zzblnVar.zzb ? com.google.android.gms.ads.initialization.AdapterStatus.State.READY : com.google.android.gms.ads.initialization.AdapterStatus.State.NOT_READY, zzblnVar.zzd, zzblnVar.zzc));
        }
        return new com.google.android.gms.internal.ads.zzblw(map);
    }

    private final void zzB(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.zzbow.zza().zzb(context, null);
            this.zzi.zzk();
            this.zzi.zzl(null, com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzC(android.content.Context context) {
        if (this.zzi == null) {
            this.zzi = (com.google.android.gms.ads.internal.client.zzcz) new com.google.android.gms.ads.internal.client.zzav(com.google.android.gms.ads.internal.client.zzbc.zza(), context).zzd(context, false);
        }
    }

    private final void zzD(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        try {
            this.zzi.zzu(new com.google.android.gms.ads.internal.client.zzfv(requestConfiguration));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static com.google.android.gms.ads.internal.client.zzex zzf() {
        com.google.android.gms.ads.internal.client.zzex zzexVar;
        synchronized (com.google.android.gms.ads.internal.client.zzex.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.ads.internal.client.zzex();
            }
            zzexVar = zzb;
        }
        return zzexVar;
    }

    static /* bridge */ /* synthetic */ java.util.Optional zzk(com.google.android.gms.ads.internal.client.zzex zzexVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        java.lang.String str = zzftVar.zza;
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return java.util.Optional.empty();
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzftVar.zzc;
        final com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
        java.util.List list = zzmVar.zze;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((java.lang.String) it.next());
            }
        }
        builder.zzc(zzmVar.zzm);
        for (java.lang.String str2 : zzmVar.zzn.keySet()) {
            builder.addCustomTargeting(str2, zzmVar.zzn.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        java.util.Optional optionalOfNullable = java.util.Optional.ofNullable(zzmVar.zzl);
        java.util.Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.ads.internal.client.zzq
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                builder.setContentUrl((java.lang.String) obj);
            }
        });
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        com.google.android.gms.ads.AdRequest adRequestBuild = builder.build();
        com.google.android.gms.ads.preload.PreloadConfiguration.Builder builder2 = new com.google.android.gms.ads.preload.PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(adRequestBuild);
        builder2.setBufferSize(zzftVar.zzd);
        return java.util.Optional.of(builder2.build());
    }

    public final com.google.android.gms.ads.RequestConfiguration zzc() {
        return this.zzk;
    }

    public final com.google.android.gms.ads.initialization.InitializationStatus zze() {
        com.google.android.gms.ads.initialization.InitializationStatus initializationStatusZzA;
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                initializationStatusZzA = zzA(this.zzi.zzg());
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get Initialization status.");
                return new com.google.android.gms.ads.initialization.InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzem
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final java.util.Map getAdapterStatusMap() {
                        java.util.HashMap map = new java.util.HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new com.google.android.gms.ads.internal.client.zzet(this.zza));
                        return map;
                    }
                };
            }
        }
        return initializationStatusZzA;
    }

    public final com.google.android.gms.common.api.Status zzg(android.content.Context context, java.util.List list, com.google.android.gms.ads.preload.PreloadCallback preloadCallback) {
        boolean z;
        com.google.android.gms.common.api.Status status;
        int bufferSize;
        int iIntValue;
        int iIntValue2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration = (com.google.android.gms.ads.preload.PreloadConfiguration) it.next();
            java.lang.String str = java.lang.String.valueOf(preloadConfiguration.getAdFormat()) + "#" + preloadConfiguration.getAdUnitId();
            map.put(str, java.lang.Integer.valueOf(((java.lang.Integer) map.getOrDefault(str, 0)).intValue() + 1));
        }
        java.util.Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (((java.lang.Integer) ((java.util.Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration2 = (com.google.android.gms.ads.preload.PreloadConfiguration) it3.next();
            com.google.android.gms.ads.AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.compute(adFormat, new java.util.function.BiFunction() { // from class: com.google.android.gms.ads.internal.client.zzen
                    @Override // java.util.function.BiFunction
                    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                        java.lang.Integer num = (java.lang.Integer) obj2;
                        java.util.Set set = com.google.android.gms.ads.internal.client.zzex.zza;
                        return java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1);
                    }
                });
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(java.lang.String.format(java.util.Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(java.lang.String.format(java.util.Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(java.lang.String.valueOf(java.lang.String.valueOf(preloadConfiguration2.getAdFormat()))));
            }
            z = true;
        }
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.google.android.gms.ads.AdFormat.APP_OPEN_AD, (java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeB)), new java.util.AbstractMap.SimpleEntry(com.google.android.gms.ads.AdFormat.INTERSTITIAL, (java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzez)), new java.util.AbstractMap.SimpleEntry(com.google.android.gms.ads.AdFormat.REWARDED, (java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeA))};
        java.util.HashMap map3 = new java.util.HashMap(3);
        for (int i = 0; i < 3; i++) {
            java.util.Map.Entry entry = entryArr[i];
            java.lang.Object objRequireNonNull = java.util.Objects.requireNonNull(entry.getKey());
            if (map3.put(objRequireNonNull, java.util.Objects.requireNonNull(entry.getValue())) != null) {
                new java.lang.StringBuilder("duplicate key: ").append(objRequireNonNull);
                throw new java.lang.IllegalArgumentException("duplicate key: ".concat(java.lang.String.valueOf(objRequireNonNull)));
            }
        }
        java.util.Map mapUnmodifiableMap = java.util.Collections.unmodifiableMap(map3);
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            com.google.android.gms.ads.AdFormat adFormat2 = (com.google.android.gms.ads.AdFormat) entry2.getKey();
            int iIntValue3 = ((java.lang.Integer) entry2.getValue()).intValue();
            int iIntValue4 = ((java.lang.Integer) mapUnmodifiableMap.getOrDefault(adFormat2, 0)).intValue();
            if (iIntValue3 > iIntValue4) {
                hashSet.add(java.lang.String.format(java.util.Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", java.lang.Integer.valueOf(iIntValue4), adFormat2.name()));
                z = true;
            }
        }
        if (z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((java.lang.String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            java.lang.String string = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzg(string);
            status = new com.google.android.gms.common.api.Status(13, string);
        } else {
            status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        java.lang.String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(status.isSuccess(), statusMessage);
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        synchronized (this.zzd) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration3 = (com.google.android.gms.ads.preload.PreloadConfiguration) it5.next();
                com.google.android.gms.ads.internal.client.zzm zzmVarZza = com.google.android.gms.ads.internal.client.zzr.zza.zza(context, preloadConfiguration3.getAdRequest().zza());
                zzmVarZza.zzc.putBoolean("is_sdk_preload", true);
                if (preloadConfiguration3.getBufferSize() <= 0) {
                    int iOrdinal = preloadConfiguration3.getAdFormat().ordinal();
                    if (iOrdinal == 1) {
                        bufferSize = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzF)).intValue();
                    } else if (iOrdinal != 2) {
                        bufferSize = iOrdinal != 5 ? 1 : ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzE)).intValue();
                    } else {
                        bufferSize = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzG)).intValue();
                    }
                } else {
                    bufferSize = preloadConfiguration3.getBufferSize();
                }
                int iOrdinal2 = preloadConfiguration3.getAdFormat().ordinal();
                if (iOrdinal2 == 1) {
                    iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzC)).intValue();
                } else if (iOrdinal2 != 2) {
                    iIntValue = iOrdinal2 != 5 ? 1 : ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzB)).intValue();
                } else {
                    iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzD)).intValue();
                }
                int iMax = java.lang.Math.max(java.lang.Math.min(iIntValue, 15), 1);
                int iOrdinal3 = preloadConfiguration3.getAdFormat().ordinal();
                if (iOrdinal3 == 1) {
                    iIntValue2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzI)).intValue();
                } else if (iOrdinal3 != 2) {
                    iIntValue2 = iOrdinal3 != 5 ? 1 : ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzH)).intValue();
                } else {
                    iIntValue2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzJ)).intValue();
                }
                arrayList.add(new com.google.android.gms.ads.internal.client.zzft(preloadConfiguration3.getAdUnitId(), preloadConfiguration3.getAdFormat().getValue(), zzmVarZza, java.lang.Math.max(java.lang.Math.min(bufferSize, iMax), java.lang.Math.min(iIntValue2, iMax))));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zzi(arrayList, new com.google.android.gms.ads.internal.client.zzes(this, preloadCallback));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to start preload.", e);
                return com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
            }
        }
        return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    public final java.lang.String zzi() {
        java.lang.String strZzc;
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                strZzc = com.google.android.gms.internal.ads.zzfve.zzc(this.zzi.zzf());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get internal version.", e);
                return "";
            }
        }
        return strZzc;
    }

    public final void zzn(android.content.Context context) {
        synchronized (this.zzh) {
            zzC(context);
            try {
                this.zzi.zzi();
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzo(final android.content.Context context, java.lang.String str, com.google.android.gms.ads.initialization.OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            if (this.zzf) {
                if (onInitializationCompleteListener != null) {
                    this.zze.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zzg) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
                return;
            }
            this.zzf = true;
            if (onInitializationCompleteListener != null) {
                this.zze.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.zzh) {
                com.google.android.gms.ads.internal.client.zzew zzewVar = null;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                try {
                    zzC(context);
                    this.zzi.zzs(new com.google.android.gms.ads.internal.client.zzev(this, zzewVar));
                    this.zzi.zzo(new com.google.android.gms.internal.ads.zzbpa());
                    if (this.zzk.getTagForChildDirectedTreatment() != -1 || this.zzk.getTagForUnderAgeOfConsent() != -1) {
                        zzD(this.zzk);
                    }
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e);
                }
                com.google.android.gms.internal.ads.zzbcl.zza(context);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zza.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkZ)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on bg thread");
                        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                        final java.lang.Object[] objArr3 = objArr2 == true ? 1 : 0;
                        threadPoolExecutor.execute(new java.lang.Runnable(context, objArr3) { // from class: com.google.android.gms.ads.internal.client.zzeo
                            public final /* synthetic */ android.content.Context zzb;

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzp(this.zzb, null);
                            }
                        });
                    } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzb.zze()).booleanValue()) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkZ)).booleanValue()) {
                            java.util.concurrent.ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                            final java.lang.Object[] objArr4 = objArr == true ? 1 : 0;
                            executorService.execute(new java.lang.Runnable(context, objArr4) { // from class: com.google.android.gms.ads.internal.client.zzep
                                public final /* synthetic */ android.content.Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzq(this.zzb, null);
                                }
                            });
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                            zzB(context, null);
                        }
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                        zzB(context, null);
                    }
                } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzb.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkZ)).booleanValue()) {
                        java.util.concurrent.ExecutorService executorService2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                        final java.lang.String objArr5 = objArr == true ? 1 : 0;
                        executorService2.execute(new java.lang.Runnable(context, objArr5) { // from class: com.google.android.gms.ads.internal.client.zzep
                            public final /* synthetic */ android.content.Context zzb;

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzq(this.zzb, null);
                            }
                        });
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                        zzB(context, null);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                    zzB(context, null);
                }
            }
        }
    }

    final /* synthetic */ void zzp(android.content.Context context, java.lang.String str) {
        synchronized (this.zzh) {
            zzB(context, null);
        }
    }

    final /* synthetic */ void zzq(android.content.Context context, java.lang.String str) {
        synchronized (this.zzh) {
            zzB(context, null);
        }
    }

    public final void zzr(android.content.Context context, com.google.android.gms.ads.OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzh) {
            zzC(context);
            this.zzj = onAdInspectorClosedListener;
            try {
                this.zzi.zzm(new com.google.android.gms.ads.internal.client.zzeu(null));
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new com.google.android.gms.ads.AdInspectorError(0, "Ad inspector had an internal error.", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(android.content.Context context, java.lang.String str) {
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzi.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzt(java.lang.Class cls) {
        synchronized (this.zzh) {
            try {
                this.zzi.zzh(cls.getCanonicalName());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzu(boolean z) {
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzi.zzp(z);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzv(float f) {
        boolean z = true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzh) {
            if (this.zzi == null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzi.zzq(f);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzw(java.lang.String str) {
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzi.zzt(str);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzx(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzh) {
            com.google.android.gms.ads.RequestConfiguration requestConfiguration2 = this.zzk;
            this.zzk = requestConfiguration;
            if (this.zzi == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzD(requestConfiguration);
            }
        }
    }

    public final boolean zzz(boolean z) {
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.zzi.zzj(z);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to " + (z ? com.json.mediationsdk.metadata.a.j : "disable") + " the publisher first-party ID.", e);
                return false;
            }
        }
        return true;
    }

    public final float zza() {
        synchronized (this.zzh) {
            com.google.android.gms.ads.internal.client.zzcz zzczVar = this.zzi;
            float fZze = 1.0f;
            if (zzczVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzczVar.zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    public final boolean zzy() {
        synchronized (this.zzh) {
            com.google.android.gms.ads.internal.client.zzcz zzczVar = this.zzi;
            boolean zZzv = false;
            if (zzczVar == null) {
                return false;
            }
            try {
                zZzv = zzczVar.zzv();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeul implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzgcs zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzecu zze;
    private final com.google.android.gms.internal.ads.zzfcj zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;

    zzeul(com.google.android.gms.ads.internal.util.zzg zzgVar, android.content.Context context, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzecu zzecuVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgcsVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzecuVar;
        this.zzf = zzfcjVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzetr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzg;
        java.lang.String str;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkm)).booleanValue() && this.zza.zzO()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkq)).booleanValue()) {
                if (this.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) {
                    if (this.zzg.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkk)).intValue()) {
                        if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkl)).intValue()) {
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzki)).booleanValue()) {
                                str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkj);
                                if (!android.text.TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                listenableFutureZzg = com.google.android.gms.internal.ads.zzgch.zzo(this.zze.zza(false), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzko)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd);
                            } catch (java.lang.Exception e) {
                                listenableFutureZzg = com.google.android.gms.internal.ads.zzgch.zzg(e);
                            }
                            return com.google.android.gms.internal.ads.zzgch.zzo((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzf((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(listenableFutureZzg), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeuj
                                @Override // com.google.android.gms.internal.ads.zzgbo
                                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                    androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse getTopicsResponse = (androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse) obj;
                                    if (getTopicsResponse == null) {
                                        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeun("", 1, null));
                                    }
                                    com.google.android.gms.internal.ads.zzhbb zzhbbVarZzc = com.google.android.gms.internal.ads.zzhbc.zzc();
                                    for (androidx.privacysandbox.ads.adservices.topics.Topic topic : getTopicsResponse.getTopics()) {
                                        com.google.android.gms.internal.ads.zzhaz zzhazVarZzc = com.google.android.gms.internal.ads.zzhba.zzc();
                                        zzhazVarZzc.zzc(topic.getTopicId());
                                        zzhazVarZzc.zza(topic.getModelVersion());
                                        zzhazVarZzc.zzb(topic.getTaxonomyVersion());
                                        zzhbbVarZzc.zza((com.google.android.gms.internal.ads.zzhba) zzhazVarZzc.zzbr());
                                    }
                                    return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeun(android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzhbc) zzhbbVarZzc.zzbr()).zzaV(), 1), 1, null));
                                }
                            }, this.zzc), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeuk
                                @Override // com.google.android.gms.internal.ads.zzgbo
                                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                    return this.zza.zzc((java.lang.Throwable) obj);
                                }
                            }, this.zzc), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzko)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd);
                        }
                    }
                }
            } else {
                if (this.zzg.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkk)).intValue()) {
                    if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkl)).intValue()) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzki)).booleanValue()) {
                            str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkj);
                            if (!android.text.TextUtils.isEmpty(str)) {
                            }
                        }
                        listenableFutureZzg = com.google.android.gms.internal.ads.zzgch.zzo(this.zze.zza(false), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzko)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd);
                        return com.google.android.gms.internal.ads.zzgch.zzo((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzf((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(listenableFutureZzg), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeuj
                            @Override // com.google.android.gms.internal.ads.zzgbo
                            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse getTopicsResponse = (androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse) obj;
                                if (getTopicsResponse == null) {
                                    return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeun("", 1, null));
                                }
                                com.google.android.gms.internal.ads.zzhbb zzhbbVarZzc = com.google.android.gms.internal.ads.zzhbc.zzc();
                                for (androidx.privacysandbox.ads.adservices.topics.Topic topic : getTopicsResponse.getTopics()) {
                                    com.google.android.gms.internal.ads.zzhaz zzhazVarZzc = com.google.android.gms.internal.ads.zzhba.zzc();
                                    zzhazVarZzc.zzc(topic.getTopicId());
                                    zzhazVarZzc.zza(topic.getModelVersion());
                                    zzhazVarZzc.zzb(topic.getTaxonomyVersion());
                                    zzhbbVarZzc.zza((com.google.android.gms.internal.ads.zzhba) zzhazVarZzc.zzbr());
                                }
                                return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeun(android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzhbc) zzhbbVarZzc.zzbr()).zzaV(), 1), 1, null));
                            }
                        }, this.zzc), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeuk
                            @Override // com.google.android.gms.internal.ads.zzgbo
                            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                return this.zza.zzc((java.lang.Throwable) obj);
                            }
                        }, this.zzc), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzko)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd);
                    }
                }
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeun("", -1, null));
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(final java.lang.Throwable th) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzeun zzeunVar;
        this.zzc.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkn)).booleanValue();
                java.lang.Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof java.lang.SecurityException) {
            zzeunVar = new com.google.android.gms.internal.ads.zzeun("", 2, null);
        } else if (th instanceof java.lang.IllegalStateException) {
            zzeunVar = new com.google.android.gms.internal.ads.zzeun("", 3, null);
        } else if (th instanceof java.lang.IllegalArgumentException) {
            zzeunVar = new com.google.android.gms.internal.ads.zzeun("", 4, null);
        } else {
            zzeunVar = th instanceof java.util.concurrent.TimeoutException ? new com.google.android.gms.internal.ads.zzeun("", 5, null) : new com.google.android.gms.internal.ads.zzeun("", 0, null);
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(zzeunVar);
    }
}

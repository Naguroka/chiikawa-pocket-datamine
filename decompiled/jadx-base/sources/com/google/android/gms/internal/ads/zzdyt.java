package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdyt {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzdxy zzb;
    private final com.google.android.gms.internal.ads.zzhel zzc;

    public zzdyt(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzdxy zzdxyVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        this.zza = zzgcsVar;
        this.zzb = zzdxyVar;
        this.zzc = zzhelVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(final com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzdys zzdysVar, final com.google.android.gms.internal.ads.zzdys zzdysVar2, final com.google.android.gms.internal.ads.zzgbo zzgboVar) {
        java.lang.String str = zzbvkVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzf((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(com.google.android.gms.ads.internal.util.zzs.zzD(str) ? com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdyh(1)) : com.google.android.gms.internal.ads.zzgch.zzf(zzdysVar.zza(zzbvkVar), java.util.concurrent.ExecutionException.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyr
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                java.util.concurrent.ExecutionException executionException = (java.util.concurrent.ExecutionException) obj;
                java.lang.Throwable cause = executionException.getCause();
                java.util.concurrent.ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return com.google.android.gms.internal.ads.zzgch.zzg(cause2);
            }
        }, this.zza)), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyp
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzh(((com.google.android.gms.internal.ads.zzdyi) obj).zzb());
            }
        }, this.zza), zzgboVar, this.zza), com.google.android.gms.internal.ads.zzdyh.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyq
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzb(zzdysVar2, zzbvkVar, zzgboVar, (com.google.android.gms.internal.ads.zzdyh) obj);
            }
        }, this.zza);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        com.google.android.gms.internal.ads.zzgbo zzgboVar = new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdym
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                java.lang.String str = new java.lang.String(com.google.android.gms.internal.ads.zzgad.zzb((java.io.InputStream) obj), java.nio.charset.StandardCharsets.UTF_8);
                com.google.android.gms.internal.ads.zzbvk zzbvkVar2 = zzbvkVar;
                zzbvkVar2.zzj = str;
                return com.google.android.gms.internal.ads.zzgch.zzh(zzbvkVar2);
            }
        };
        final com.google.android.gms.internal.ads.zzdxy zzdxyVar = this.zzb;
        java.util.Objects.requireNonNull(zzdxyVar);
        return zzg(zzbvkVar, new com.google.android.gms.internal.ads.zzdys() { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzdys
            public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar2) {
                return zzdxyVar.zza(zzbvkVar2);
            }
        }, new com.google.android.gms.internal.ads.zzdys() { // from class: com.google.android.gms.internal.ads.zzdyo
            @Override // com.google.android.gms.internal.ads.zzdys
            public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar2) {
                return this.zza.zzc(zzbvkVar2);
            }
        }, zzgboVar);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzdys zzdysVar, com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzgbo zzgboVar, com.google.android.gms.internal.ads.zzdyh zzdyhVar) throws java.lang.Exception {
        return com.google.android.gms.internal.ads.zzgch.zzn(zzdysVar.zza(zzbvkVar), zzgboVar, this.zza);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        return ((com.google.android.gms.internal.ads.zzdzl) this.zzc.zzb()).zzb(zzbvkVar, android.os.Binder.getCallingUid());
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        return this.zzb.zzd(zzbvkVar.zzh);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        return ((com.google.android.gms.internal.ads.zzdzl) this.zzc.zzb()).zzj(zzbvkVar.zzh);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        return zzg(zzbvkVar, new com.google.android.gms.internal.ads.zzdys() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzdys
            public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar2) {
                return this.zza.zzd(zzbvkVar2);
            }
        }, new com.google.android.gms.internal.ads.zzdys() { // from class: com.google.android.gms.internal.ads.zzdyl
            @Override // com.google.android.gms.internal.ads.zzdys
            public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar2) {
                return this.zza.zze(zzbvkVar2);
            }
        }, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyj
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzh(null);
            }
        });
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcmk {
    com.google.android.gms.internal.ads.zzbuj zza;
    com.google.android.gms.internal.ads.zzbuj zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final com.google.android.gms.internal.ads.zzecs zze;
    private final com.google.android.gms.internal.ads.zzdpb zzf;
    private final com.google.android.gms.internal.ads.zzgcs zzg;
    private final java.util.concurrent.Executor zzh;
    private final java.util.concurrent.ScheduledExecutorService zzi;

    zzcmk(android.content.Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzecs zzecsVar, com.google.android.gms.internal.ads.zzdpb zzdpbVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar2, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzecsVar;
        this.zzf = zzdpbVar;
        this.zzg = zzgcsVar;
        this.zzh = zzgcsVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzka));
    }

    private final com.google.common.util.concurrent.ListenableFuture zzk(final java.lang.String str, final android.view.InputEvent inputEvent, java.util.Random random) {
        try {
            if (!str.contains((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzka)) || this.zzd.zzN()) {
                return com.google.android.gms.internal.ads.zzgch.zzh(str);
            }
            final android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkb), java.lang.String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzf((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(this.zze.zza()), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcme
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return this.zza.zzd(builderBuildUpon, str, inputEvent, (java.lang.Integer) obj);
                    }
                }, this.zzh), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcmf
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return this.zza.zze(builderBuildUpon, (java.lang.Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkc), "11");
            return com.google.android.gms.internal.ads.zzgch.zzh(builderBuildUpon.toString());
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzgch.zzg(e);
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final java.lang.String str, java.util.Random random) {
        return android.text.TextUtils.isEmpty(str) ? com.google.android.gms.internal.ads.zzgch.zzh(str) : com.google.android.gms.internal.ads.zzgch.zzf(zzk(str, this.zzf.zza(), random), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcmb
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(str, (java.lang.Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.String str, final java.lang.Throwable th) throws java.lang.Exception {
        this.zzg.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(th);
            }
        });
        return com.google.android.gms.internal.ads.zzgch.zzh(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(final android.net.Uri.Builder builder, java.lang.String str, android.view.InputEvent inputEvent, java.lang.Integer num) throws java.lang.Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkc), "10");
            return com.google.android.gms.internal.ads.zzgch.zzh(builder.toString());
        }
        android.net.Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkd), "1");
        builderBuildUpon.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkc), "12");
        if (str.contains((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzke))) {
            builderBuildUpon.authority((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkf));
        }
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkc);
                android.net.Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return com.google.android.gms.internal.ads.zzgch.zzh(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(android.net.Uri.Builder builder, final java.lang.Throwable th) throws java.lang.Exception {
        this.zzg.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(th);
            }
        });
        builder.appendQueryParameter((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkc), "9");
        return com.google.android.gms.internal.ads.zzgch.zzh(builder.toString());
    }

    final /* synthetic */ void zzg(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkh)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbuj zzbujVarZzc = com.google.android.gms.internal.ads.zzbuh.zzc(this.zzc);
            this.zzb = zzbujVarZzc;
            zzbujVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            com.google.android.gms.internal.ads.zzbuj zzbujVarZza = com.google.android.gms.internal.ads.zzbuh.zza(this.zzc);
            this.zza = zzbujVarZza;
            zzbujVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void zzh(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkh)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbuj zzbujVarZzc = com.google.android.gms.internal.ads.zzbuh.zzc(this.zzc);
            this.zzb = zzbujVarZzc;
            zzbujVarZzc.zzh(th, "AttributionReporting");
        } else {
            com.google.android.gms.internal.ads.zzbuj zzbujVarZza = com.google.android.gms.internal.ads.zzbuh.zza(this.zzc);
            this.zza = zzbujVarZza;
            zzbujVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final void zzi(java.lang.String str, com.google.android.gms.internal.ads.zzfja zzfjaVar, java.util.Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgch.zzo(zzk(str, this.zzf.zza(), random), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkg)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzi), new com.google.android.gms.internal.ads.zzcmj(this, zzfjaVar, str, zzvVar), this.zzg);
    }
}

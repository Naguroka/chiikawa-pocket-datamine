package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfiq {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final com.google.android.gms.internal.ads.zzgct zzc;
    private final com.google.android.gms.internal.ads.zzfir zzd;

    public zzfiq(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.internal.ads.zzgct zzgctVar, com.google.android.gms.internal.ads.zzfir zzfirVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgctVar;
        this.zzd = zzfirVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str) throws java.lang.Exception {
        return this.zzb.zza(str);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzb(java.lang.String str) throws java.lang.Exception {
        return this.zzb.zza(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(int i, long j, java.lang.String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) throws java.lang.Exception {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return com.google.android.gms.internal.ads.zzgch.zzh(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long jZzb = zzxVar.zzb();
        if (i != 1) {
            jZzb = (long) (zzxVar.zza() * j);
        }
        return zze(str, jZzb, i + 1);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str) {
        try {
            return zze(str, 0L, 1);
        } catch (java.lang.NullPointerException | java.util.concurrent.RejectedExecutionException unused) {
            return com.google.android.gms.internal.ads.zzgch.zzh(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
        }
    }

    private final com.google.common.util.concurrent.ListenableFuture zze(final java.lang.String str, final long j, final int i) {
        final java.lang.String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zzc()) {
            com.google.android.gms.internal.ads.zzfir zzfirVar = this.zzd;
            if (zzfirVar == null || !zzxVar.zzd()) {
                return com.google.android.gms.internal.ads.zzgch.zzh(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfirVar.zza(str, "", 2);
            return com.google.android.gms.internal.ads.zzgch.zzh(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziv)).booleanValue()) {
            android.net.Uri uri = android.net.Uri.parse(str);
            java.lang.String encodedQuery = uri.getEncodedQuery();
            android.net.Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", java.lang.Integer.toString(i));
            str2 = java.lang.String.valueOf(builderClearQuery.build()) + com.ironsource.y8.i.c + encodedQuery;
        } else {
            str2 = str;
        }
        com.google.android.gms.internal.ads.zzgbo zzgboVar = new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzfip
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        return j == 0 ? com.google.android.gms.internal.ads.zzgch.zzn(this.zzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfio
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zza(str2);
            }
        }), zzgboVar, this.zzc) : com.google.android.gms.internal.ads.zzgch.zzn(this.zzc.schedule(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfin
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzb(str2);
            }
        }, j, java.util.concurrent.TimeUnit.MILLISECONDS), zzgboVar, this.zzc);
    }
}

package com.google.android.gms.ads.query;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class QueryInfo {
    private final com.google.android.gms.ads.internal.client.zzfa zza;

    public QueryInfo(com.google.android.gms.ads.internal.client.zzfa zzfaVar) {
        this.zza = zzfaVar;
    }

    public static void generate(android.content.Context context, com.google.android.gms.ads.AdFormat adFormat, com.google.android.gms.ads.AdRequest adRequest, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    private static void zza(final android.content.Context context, final com.google.android.gms.ads.AdFormat adFormat, final com.google.android.gms.ads.AdRequest adRequest, final java.lang.String str, final com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzj.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        com.google.android.gms.ads.internal.client.zzei zzeiVarZza = adRequest2 == null ? null : adRequest2.zza();
                        new com.google.android.gms.internal.ads.zzbtv(context, adFormat, zzeiVarZza, str).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbtv(context, adFormat, adRequest == null ? null : adRequest.zza(), str).zzb(queryInfoGenerationCallback);
    }

    public java.lang.String getQuery() {
        return this.zza.zzb();
    }

    public android.os.Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public java.lang.String getRequestId() {
        return this.zza.zzc();
    }

    public static void generate(android.content.Context context, com.google.android.gms.ads.AdFormat adFormat, com.google.android.gms.ads.AdRequest adRequest, java.lang.String str, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}

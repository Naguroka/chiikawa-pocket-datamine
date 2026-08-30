package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzp extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zza;
    private final com.google.android.gms.internal.ads.zzdsb zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
    private final java.lang.Boolean zzf;

    public zzp(com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, boolean z, int i, java.lang.Boolean bool, com.google.android.gms.internal.ads.zzdsb zzdsbVar) {
        this.zza = zzoVar;
        this.zzc = z;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzdsbVar;
    }

    private static long zza() {
        return com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() + ((java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zzf.zze()).longValue();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String str) {
        android.util.Pair[] pairArr = new android.util.Pair[9];
        pairArr[0] = new android.util.Pair("sgf_reason", str);
        pairArr[1] = new android.util.Pair("se", "query_g");
        pairArr[2] = new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name());
        pairArr[3] = new android.util.Pair("rtype", java.lang.Integer.toString(6));
        pairArr[4] = new android.util.Pair("scar", com.json.mediationsdk.metadata.a.g);
        pairArr[5] = new android.util.Pair("lat_ms", java.lang.Long.toString(zzb()));
        pairArr[6] = new android.util.Pair("sgpc_rn", java.lang.Integer.toString(this.zzd));
        pairArr[7] = new android.util.Pair("sgpc_lsu", java.lang.String.valueOf(this.zzf));
        pairArr[8] = new android.util.Pair("tpc", true != this.zzc ? "0" : "1");
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zzb, null, "sgpcf", pairArr);
        this.zza.zzf(this.zzc, new com.google.android.gms.ads.nonagon.signalgeneration.zzq(null, str, zza(), this.zzd));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo queryInfo) {
        android.util.Pair[] pairArr = new android.util.Pair[8];
        pairArr[0] = new android.util.Pair("se", "query_g");
        pairArr[1] = new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name());
        pairArr[2] = new android.util.Pair("rtype", java.lang.Integer.toString(6));
        pairArr[3] = new android.util.Pair("scar", com.json.mediationsdk.metadata.a.g);
        pairArr[4] = new android.util.Pair("lat_ms", java.lang.Long.toString(zzb()));
        pairArr[5] = new android.util.Pair("sgpc_rn", java.lang.Integer.toString(this.zzd));
        pairArr[6] = new android.util.Pair("sgpc_lsu", java.lang.String.valueOf(this.zzf));
        pairArr[7] = new android.util.Pair("tpc", true != this.zzc ? "0" : "1");
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zzb, null, "sgpcs", pairArr);
        this.zza.zzf(this.zzc, new com.google.android.gms.ads.nonagon.signalgeneration.zzq(queryInfo, "", zza(), this.zzd));
    }
}

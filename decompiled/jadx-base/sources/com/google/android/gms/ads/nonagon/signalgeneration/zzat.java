package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzat implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzau zza;

    zzat(com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar) {
        this.zza = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zza.zzp, null, "sgf", new android.util.Pair("sgf_reason", th.getMessage()), new android.util.Pair("se", "query_g"), new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", com.json.mediationsdk.metadata.a.g), new android.util.Pair("sgi_rn", java.lang.Integer.toString(this.zza.zzH.get())));
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjB)).booleanValue() || this.zza.zzG.get() || this.zza.zzH.getAndIncrement() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjC)).intValue()) {
            return;
        }
        this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized webview successfully for SDKCore.");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjB)).booleanValue()) {
            com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zza.zzp, null, "sgs", new android.util.Pair("se", "query_g"), new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", com.json.mediationsdk.metadata.a.g), new android.util.Pair("sgi_rn", java.lang.Integer.toString(this.zza.zzH.get())));
            this.zza.zzG.set(true);
        }
    }
}

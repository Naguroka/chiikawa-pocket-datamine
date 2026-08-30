package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class MediationConfiguration {
    public static final java.lang.String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final com.google.android.gms.ads.AdFormat zza;
    private final android.os.Bundle zzb;

    public MediationConfiguration(com.google.android.gms.ads.AdFormat adFormat, android.os.Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    public com.google.android.gms.ads.AdFormat getFormat() {
        return this.zza;
    }

    public android.os.Bundle getServerParameters() {
        return this.zzb;
    }
}

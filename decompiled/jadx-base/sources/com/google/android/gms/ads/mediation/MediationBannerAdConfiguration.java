package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class MediationBannerAdConfiguration extends com.google.android.gms.ads.mediation.MediationAdConfiguration {
    private final com.google.android.gms.ads.AdSize zza;

    public MediationBannerAdConfiguration(android.content.Context context, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, android.location.Location location, int i, int i2, java.lang.String str2, com.google.android.gms.ads.AdSize adSize, java.lang.String str3) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = adSize;
    }

    public com.google.android.gms.ads.AdSize getAdSize() {
        return this.zza;
    }
}

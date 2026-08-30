package com.google.ads.mediation.admob;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdMobAdapter extends com.google.ads.mediation.AbstractAdViewAdapter {
    static final java.lang.String AD_JSON_PARAMETER = "adJson";
    static final java.lang.String AD_PARAMETER = "_ad";
    static final java.lang.String HOUSE_ADS_PARAMETER = "mad_hac";
    public static final java.lang.String NEW_BUNDLE = "_newBundle";

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    protected android.os.Bundle buildExtrasBundle(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (bundle.getBoolean(NEW_BUNDLE)) {
            bundle = new android.os.Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString(HOUSE_ADS_PARAMETER, bundle2.getString(HOUSE_ADS_PARAMETER));
        if (!android.text.TextUtils.isEmpty(bundle2.getString(AD_JSON_PARAMETER))) {
            bundle.putString(AD_PARAMETER, bundle2.getString(AD_JSON_PARAMETER));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}

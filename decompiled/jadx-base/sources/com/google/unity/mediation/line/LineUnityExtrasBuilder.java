package com.google.unity.mediation.line;

/* JADX INFO: loaded from: classes5.dex */
public class LineUnityExtrasBuilder implements com.google.unity.ads.AdNetworkExtras {
    private static final java.lang.String KEY_ENABLE_AD_SOUND = "enable_ad_sound";

    @Override // com.google.unity.ads.AdNetworkExtras
    public android.os.Bundle buildExtras(java.util.HashMap<java.lang.String, java.lang.String> map) {
        com.google.ads.mediation.line.LineExtras lineExtras = new com.google.ads.mediation.line.LineExtras();
        java.lang.String str = map.get(KEY_ENABLE_AD_SOUND);
        if (str != null) {
            lineExtras = new com.google.ads.mediation.line.LineExtras(java.lang.Boolean.parseBoolean(str));
        }
        return lineExtras.build();
    }

    @Override // com.google.unity.ads.AdNetworkExtras
    public java.lang.Class getAdapterClass() {
        return com.google.ads.mediation.line.LineMediationAdapter.class;
    }
}

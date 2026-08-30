package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/google/ads/mediation/line/LineInitializer;", "", "()V", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "context", "Landroid/content/Context;", "appId", "", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineInitializer {
    public static final com.google.ads.mediation.line.LineInitializer INSTANCE = new com.google.ads.mediation.line.LineInitializer();

    private LineInitializer() {
    }

    public final void initialize(android.content.Context context, java.lang.String appId) {
        com.five_corp.ad.NeedChildDirectedTreatment needChildDirectedTreatment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        if (com.google.ads.mediation.line.LineSdkWrapper.INSTANCE.getDelegate$line_release().isInitialized()) {
            return;
        }
        com.five_corp.ad.FiveAdConfig fiveAdConfigCreateFiveAdConfig = com.google.ads.mediation.line.LineSdkFactory.INSTANCE.getDelegate$line_release().createFiveAdConfig(appId);
        int tagForChildDirectedTreatment = com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment();
        if (tagForChildDirectedTreatment == 0) {
            needChildDirectedTreatment = com.five_corp.ad.NeedChildDirectedTreatment.FALSE;
        } else if (tagForChildDirectedTreatment == 1) {
            needChildDirectedTreatment = com.five_corp.ad.NeedChildDirectedTreatment.TRUE;
        } else {
            needChildDirectedTreatment = com.five_corp.ad.NeedChildDirectedTreatment.UNSPECIFIED;
        }
        fiveAdConfigCreateFiveAdConfig.needChildDirectedTreatment = needChildDirectedTreatment;
        java.util.List<java.lang.String> testDeviceIds = com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTestDeviceIds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(testDeviceIds, "getRequestConfiguration().testDeviceIds");
        fiveAdConfigCreateFiveAdConfig.isTest = !testDeviceIds.isEmpty();
        com.google.ads.mediation.line.LineSdkWrapper.INSTANCE.getDelegate$line_release().initialize(context, fiveAdConfigCreateFiveAdConfig);
    }
}

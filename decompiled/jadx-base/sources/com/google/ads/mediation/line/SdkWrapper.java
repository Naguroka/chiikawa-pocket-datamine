package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineSdkWrapper.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/google/ads/mediation/line/SdkWrapper;", "", "getSdkVersion", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "context", "Landroid/content/Context;", "configuration", "Lcom/five_corp/ad/FiveAdConfig;", "isInitialized", "", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SdkWrapper {
    java.lang.String getSdkVersion();

    void initialize(android.content.Context context, com.five_corp.ad.FiveAdConfig configuration);

    boolean isInitialized();
}

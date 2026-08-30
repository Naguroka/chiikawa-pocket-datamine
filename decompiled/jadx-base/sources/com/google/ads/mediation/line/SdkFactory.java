package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineSdkFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lcom/google/ads/mediation/line/SdkFactory;", "", "createFiveAdConfig", "Lcom/five_corp/ad/FiveAdConfig;", "appId", "", "createFiveAdCustomLayout", "Lcom/five_corp/ad/FiveAdCustomLayout;", "context", "Landroid/content/Context;", "slotId", "width", "", "createFiveAdInterstitial", "Lcom/five_corp/ad/FiveAdInterstitial;", "activity", "Landroid/app/Activity;", "createFiveAdNative", "Lcom/five_corp/ad/FiveAdNative;", "createFiveVideoRewarded", "Lcom/five_corp/ad/FiveAdVideoReward;", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SdkFactory {
    com.five_corp.ad.FiveAdConfig createFiveAdConfig(java.lang.String appId);

    com.five_corp.ad.FiveAdCustomLayout createFiveAdCustomLayout(android.content.Context context, java.lang.String slotId, int width);

    com.five_corp.ad.FiveAdInterstitial createFiveAdInterstitial(android.app.Activity activity, java.lang.String slotId);

    com.five_corp.ad.FiveAdNative createFiveAdNative(android.content.Context context, java.lang.String slotId);

    com.five_corp.ad.FiveAdVideoReward createFiveVideoRewarded(android.app.Activity activity, java.lang.String slotId);
}

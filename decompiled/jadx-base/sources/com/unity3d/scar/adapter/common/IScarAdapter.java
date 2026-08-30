package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public interface IScarAdapter {
    void getSCARBiddingSignals(android.content.Context context, boolean z, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener);

    void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener);

    void loadBannerAd(android.content.Context context, android.widget.RelativeLayout relativeLayout, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, int i, int i2, com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper);

    void loadInterstitialAd(android.content.Context context, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper);

    void loadRewardedAd(android.content.Context context, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper);

    void show(android.app.Activity activity, java.lang.String str, java.lang.String str2);
}

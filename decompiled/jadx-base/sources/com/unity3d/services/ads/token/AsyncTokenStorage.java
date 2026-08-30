package com.unity3d.services.ads.token;

/* JADX INFO: compiled from: AsyncTokenStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "", "getToken", "", "biddingManager", "Lcom/unity3d/services/ads/gmascar/managers/IBiddingManager;", "onTokenAvailable", "setConfiguration", "configuration", "Lcom/unity3d/services/core/configuration/Configuration;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AsyncTokenStorage {
    void getToken(com.unity3d.services.ads.gmascar.managers.IBiddingManager biddingManager);

    void onTokenAvailable();

    void setConfiguration(com.unity3d.services.core.configuration.Configuration configuration);
}

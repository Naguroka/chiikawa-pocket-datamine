package com.applovin.mediation.adapter.listeners;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxAppOpenAdapterListener extends com.applovin.mediation.adapter.listeners.MaxAdapterListener {
    void onAppOpenAdClicked();

    void onAppOpenAdClicked(android.os.Bundle bundle);

    void onAppOpenAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onAppOpenAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle);

    void onAppOpenAdDisplayed();

    void onAppOpenAdDisplayed(android.os.Bundle bundle);

    void onAppOpenAdHidden();

    void onAppOpenAdHidden(android.os.Bundle bundle);

    void onAppOpenAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onAppOpenAdLoaded();

    void onAppOpenAdLoaded(android.os.Bundle bundle);
}

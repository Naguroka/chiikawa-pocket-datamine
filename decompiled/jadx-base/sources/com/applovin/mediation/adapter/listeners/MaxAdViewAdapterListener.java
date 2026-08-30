package com.applovin.mediation.adapter.listeners;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxAdViewAdapterListener extends com.applovin.mediation.adapter.listeners.MaxAdapterListener {
    void onAdViewAdClicked();

    void onAdViewAdClicked(android.os.Bundle bundle);

    void onAdViewAdCollapsed();

    void onAdViewAdCollapsed(android.os.Bundle bundle);

    void onAdViewAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onAdViewAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle);

    void onAdViewAdDisplayed();

    void onAdViewAdDisplayed(android.os.Bundle bundle);

    void onAdViewAdExpanded();

    void onAdViewAdExpanded(android.os.Bundle bundle);

    void onAdViewAdHidden();

    void onAdViewAdHidden(android.os.Bundle bundle);

    void onAdViewAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError);

    void onAdViewAdLoaded(android.view.View view);

    void onAdViewAdLoaded(android.view.View view, android.os.Bundle bundle);
}

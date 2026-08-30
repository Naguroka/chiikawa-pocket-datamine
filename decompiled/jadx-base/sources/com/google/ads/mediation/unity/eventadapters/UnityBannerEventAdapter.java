package com.google.ads.mediation.unity.eventadapters;

/* JADX INFO: loaded from: classes4.dex */
public class UnityBannerEventAdapter implements com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter {
    final com.google.android.gms.ads.mediation.MediationBannerAdapter adapter;
    final com.google.android.gms.ads.mediation.MediationBannerListener listener;

    public UnityBannerEventAdapter(com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter) {
        this.listener = mediationBannerListener;
        this.adapter = mediationBannerAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.listener == null) {
            return;
        }
        int i = com.google.ads.mediation.unity.eventadapters.UnityBannerEventAdapter.AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[adEvent.ordinal()];
        if (i == 1) {
            this.listener.onAdLoaded(this.adapter);
            return;
        }
        if (i == 2) {
            this.listener.onAdOpened(this.adapter);
            return;
        }
        if (i == 3) {
            this.listener.onAdClicked(this.adapter);
        } else if (i == 4) {
            this.listener.onAdClosed(this.adapter);
        } else {
            if (i != 5) {
                return;
            }
            this.listener.onAdLeftApplication(this.adapter);
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.unity.eventadapters.UnityBannerEventAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent;

        static {
            int[] iArr = new int[com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.values().length];
            $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent = iArr;
            try {
                iArr[com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }
}

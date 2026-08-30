package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public interface FiveAdInterface {
    void enableSound(boolean z);

    com.five_corp.ad.CreativeType getCreativeType();

    java.lang.String getFiveAdTag();

    java.lang.String getSlotId();

    @java.lang.Deprecated
    com.five_corp.ad.FiveAdState getState();

    boolean isSoundEnabled();

    void setFiveAdTag(java.lang.String str);

    void setLoadListener(com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener);

    @java.lang.Deprecated
    void setViewEventListener(com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener);
}

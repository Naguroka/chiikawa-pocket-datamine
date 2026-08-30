package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxErrorImpl implements com.applovin.mediation.MaxError {
    private java.lang.String adLoadFailureInfo;
    private final int errorCode;
    private final java.lang.String errorMessage;
    private java.lang.String loadTag;
    private final int mediatedNetworkErrorCode;
    private final java.lang.String mediatedNetworkErrorMessage;
    private long requestLatencyMillis;
    private com.applovin.mediation.MaxAdWaterfallInfo waterfall;

    public MaxErrorImpl(int i) {
        this(i, "");
    }

    @Override // com.applovin.mediation.MaxError
    public java.lang.String getAdLoadFailureInfo() {
        return this.adLoadFailureInfo;
    }

    @Override // com.applovin.mediation.MaxError
    public int getCode() {
        return this.errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public java.lang.String getLoadTag() {
        return this.loadTag;
    }

    @Override // com.applovin.mediation.MaxError
    public int getMediatedNetworkErrorCode() {
        return this.mediatedNetworkErrorCode;
    }

    @Override // com.applovin.mediation.MaxError
    public java.lang.String getMediatedNetworkErrorMessage() {
        return this.mediatedNetworkErrorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public java.lang.String getMessage() {
        return this.errorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public long getRequestLatencyMillis() {
        return this.requestLatencyMillis;
    }

    @Override // com.applovin.mediation.MaxError
    public com.applovin.mediation.MaxAdWaterfallInfo getWaterfall() {
        return this.waterfall;
    }

    public void setAdLoadFailureInfo(java.lang.String str) {
        this.adLoadFailureInfo = str;
    }

    public void setLoadTag(java.lang.String str) {
        this.loadTag = str;
    }

    public void setRequestLatencyMillis(long j) {
        this.requestLatencyMillis = j;
    }

    public void setWaterfall(com.applovin.mediation.MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.waterfall = maxAdWaterfallInfo;
    }

    public java.lang.String toString() {
        return "MaxError{code=" + getCode() + ", message=\"" + getMessage() + "\", mediatedNetworkErrorCode=" + getMediatedNetworkErrorCode() + ", mediatedNetworkErrorMessage=\"" + getMediatedNetworkErrorMessage() + "\"}";
    }

    public MaxErrorImpl(java.lang.String str) {
        this(-1, str);
    }

    public MaxErrorImpl(int i, java.lang.String str) {
        this(i, str, -1, "");
    }

    public MaxErrorImpl(int i, java.lang.String str, int i2, java.lang.String str2) {
        this.errorCode = i;
        this.errorMessage = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(str);
        this.mediatedNetworkErrorCode = i2;
        this.mediatedNetworkErrorMessage = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(str2);
    }
}

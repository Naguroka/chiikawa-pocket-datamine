package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0012\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\bJ\u0012\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\bJ\u0012\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b¨\u0006 "}, d2 = {"Lcom/ironsource/tb;", "", "Lcom/ironsource/kg;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "networkError", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "error", "", "description", "b", "c", "d", "e", "f", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "g", "k", "m", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "o", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, com.json.zb.q, "q", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "t", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.tb f3430a = new com.json.tb();

    private tb() {
    }

    private final com.json.mediationsdk.logger.IronSourceError a(com.json.kg errorCode, com.json.mediationsdk.logger.IronSourceError networkError) {
        return new com.json.mediationsdk.logger.IronSourceError(errorCode.getErrorCode(), networkError != null ? errorCode.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String() + " Underlying network error: '" + networkError.getErrorCode() + ':' + networkError.getErrorMessage() + '\'' : errorCode.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
    }

    private final com.json.mediationsdk.logger.IronSourceError a(com.json.kg error, java.lang.String description) {
        if (description == null || description.length() == 0) {
            description = error.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
        }
        return new com.json.mediationsdk.logger.IronSourceError(error.getErrorCode(), description);
    }

    static /* synthetic */ com.json.mediationsdk.logger.IronSourceError a(com.json.tb tbVar, com.json.kg kgVar, com.json.mediationsdk.logger.IronSourceError ironSourceError, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return tbVar.a(kgVar, ironSourceError);
    }

    public static /* synthetic */ com.json.mediationsdk.logger.IronSourceError a(com.json.tb tbVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return tbVar.a(str);
    }

    public static /* synthetic */ com.json.mediationsdk.logger.IronSourceError b(com.json.tb tbVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return tbVar.b(str);
    }

    public static /* synthetic */ com.json.mediationsdk.logger.IronSourceError c(com.json.tb tbVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return tbVar.d(str);
    }

    public final com.json.mediationsdk.logger.IronSourceError a() {
        return a(this, com.json.kg.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError a(com.json.mediationsdk.logger.IronSourceError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(com.json.kg.ISErrorInitNetworkFailed, networkError);
    }

    public final com.json.mediationsdk.logger.IronSourceError a(java.lang.String message) {
        return a(com.json.kg.ISErrorBannerLoadNoConfig, message);
    }

    public final com.json.mediationsdk.logger.IronSourceError b() {
        return a(this, com.json.kg.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError b(com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        return a(com.json.kg.ISErrorLoadNetworkFailed, error);
    }

    public final com.json.mediationsdk.logger.IronSourceError b(java.lang.String message) {
        return a(com.json.kg.ISErrorInterstitialLoadNoConfig, message);
    }

    public final com.json.mediationsdk.logger.IronSourceError c() {
        return a(this, com.json.kg.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError c(com.json.mediationsdk.logger.IronSourceError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(com.json.kg.ISErrorShowNetworkFailed, networkError);
    }

    public final com.json.mediationsdk.logger.IronSourceError c(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        return a(com.json.kg.ISErrorLoadNetworkFailed, description);
    }

    public final com.json.mediationsdk.logger.IronSourceError d() {
        return a(this, com.json.kg.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError d(java.lang.String message) {
        return a(com.json.kg.ISErrorRewardedLoadNoConfig, message);
    }

    public final com.json.mediationsdk.logger.IronSourceError e() {
        return a(this, com.json.kg.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError f() {
        return a(this, com.json.kg.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError g() {
        return a(this, com.json.kg.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError h() {
        return a(this, com.json.kg.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError i() {
        return a(this, com.json.kg.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError j() {
        return a(this, com.json.kg.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError k() {
        return a(this, com.json.kg.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError l() {
        return a(this, com.json.kg.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError m() {
        return a(this, com.json.kg.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError n() {
        return a(this, com.json.kg.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError o() {
        return a(this, com.json.kg.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError p() {
        return a(this, com.json.kg.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError q() {
        return a(this, com.json.kg.ISErrorLoadNullADM, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError r() {
        return a(this, com.json.kg.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError s() {
        return a(this, com.json.kg.ISErrorLoadTimedOut, null, 2, null);
    }

    public final com.json.mediationsdk.logger.IronSourceError t() {
        return a(this, com.json.kg.ISErrorShowNotReadyToShowAd, null, 2, null);
    }
}

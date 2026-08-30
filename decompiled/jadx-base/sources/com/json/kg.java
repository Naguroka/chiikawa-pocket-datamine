package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/ironsource/kg;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "()I", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "Ljava/lang/String;", "c", "()Ljava/lang/String;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "d", "e", "f", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "k", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "m", com.json.zb.q, "o", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "q", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "t", "u", "v", "w", "x", "y", "z", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum kg {
    ISErrorInitNetworkFailed(7001, "Initialization failed due to network failure."),
    ISErrorInitDecryptionFailure(7002, "Initialization failed due to decryption failure."),
    ISErrorInitHttpRequestFailed(7003, "Initialization failed due to HTTP request failure."),
    ISErrorInitInvalidResponse(com.facebook.ads.AdError.INCORRECT_STATE_ERROR, "Initialization failed due to invalid response."),
    ISErrorLoadNetworkFailed(7101, "Loading failed due to network failure."),
    ISErrorLoadADMDecryptionFailure(7102, "Loading failed due to ADM decryption failure."),
    ISErrorLoadADMEmptyServerData(7103, "Loading failed due to empty server data."),
    ISErrorLoadADMEmptyWaterfall(7104, "Loading failed due to empty waterfall."),
    ISErrorLoadADMInvalidJSON(7105, "Loading failed due to invalid ADM JSON."),
    ISErrorLoadADMNoAuctionID(7106, "Loading failed due to missing auction ID."),
    ISErrorLoadADMNoConfigurationForRequestedNetwork(7107, "Loading failed due to no configuration for requested network."),
    ISErrorLoadADMInvalidConfigurationForRequestedNetwork(7108, "Loading failed due to invalid configuration for requested network."),
    ISErrorLoadBiddingInNonBidding(7109, "Loading failed due to non-bidding in bidding context."),
    ISErrorLoadNullADM(7110, "Loading failed due to null ADM."),
    ISErrorLoadInstanceNotInInitResponse(7111, "Loading failed due to instance not being in init response."),
    ISErrorLoadNoAdFormatConfigurations(7112, "Loading failed due to no ad format configurations."),
    ISErrorLoadTimedOut(7113, "Loading failed due to timeout."),
    ISErrorLoadSDKNotInitialized(7115, "Loading failed due to SDK not being initialized."),
    ISErrorLoadBannerNetworkViewIsNull(7116, "Loading failed due to null network banner view."),
    ISErrorLoadBannerSizeIsNull(7117, "Loading failed because the banner size is null."),
    ISErrorLoadBannerNotSupportedSize(7118, "Loading failed due to banner size not supported."),
    ISErrorShowNetworkFailed(7201, "Showing ad failed due to network failure."),
    ISErrorShowNotReadyToShowAd(7202, "Showing ad failed because the ad is not ready to show."),
    ISErrorInterstitialLoadNoConfig(10000, "Load failed due to no config"),
    ISErrorBannerLoadNoConfig(com.google.android.gms.games.GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED, "Load failed due to no config"),
    ISErrorRewardedLoadNoConfig(com.google.android.gms.games.GamesActivityResultCodes.RESULT_SIGN_IN_FAILED, "Load failed due to no config");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String message;

    kg(int i, java.lang.String str) {
        this.errorCode = i;
        this.message = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }
}

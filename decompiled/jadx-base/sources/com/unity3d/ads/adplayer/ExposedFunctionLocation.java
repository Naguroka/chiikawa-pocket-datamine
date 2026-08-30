package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: ExposedFunctionLocation.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b5\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/unity3d/ads/adplayer/ExposedFunctionLocation;", "", "()V", "ATTRIBUTION_REGISTER_CLICK", "", "ATTRIBUTION_REGISTER_VIEW", "BROADCAST_EVENT", "CANCEL_SHOW_TIMEOUT", "CLICKED", "COMPLETED", "DOWNLOAD", "FAILED", "GET_AD_CONTEXT", "GET_ALLOWED_PII", "GET_CONNECTION_TYPE", "GET_DEVICE_MAX_VOLUME", "GET_DEVICE_VOLUME", "GET_PRIVACY", "GET_PRIVACY_FSM", "GET_SCREEN_HEIGHT", "GET_SCREEN_WIDTH", "GET_SESSION_TOKEN", "HEADER_BIDDING_TOKEN_INCREMENT_STARTS", "HEADER_BIDDING_TOKEN_INCREMENT_WINS", "HEADER_BIDDING_TOKEN_RESET", "INCREMENT_BANNER_IMPRESSION_COUNT", "IS_ATTRIBUTION_AVAILABLE", "IS_FILE_CACHED", "LEFT_APPLICATION", "LOAD_COMPLETE", "LOAD_ERROR", "MARK_CAMPAIGN_STATE_SHOWN", "OM_FINISH_SESSION", "OM_GET_DATA", "OM_IMPRESSION", "OM_START_SESSION", "OPEN_URL", "REFRESH_AD_DATA", "REQUEST_GET", "REQUEST_HEAD", "REQUEST_POST", "SEND_DIAGNOSTIC_EVENT", "SEND_OPERATIVE_EVENT", "SEND_PRIVACY_UPDATE_REQUEST", "SET_ALLOWED_PII", "SET_PRIVACY", "SET_PRIVACY_FSM", "STARTED", "STORAGE_CLEAR", "STORAGE_DELETE", "STORAGE_GET", "STORAGE_GET_KEYS", "STORAGE_READ", "STORAGE_SET", "STORAGE_WRITE", "UPDATE_CAMPAIGN_STATE", "UPDATE_TRACKING_TOKEN", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExposedFunctionLocation {
    public static final java.lang.String ATTRIBUTION_REGISTER_CLICK = "com.unity3d.services.ads.api.AdViewer.attributionRegisterClick";
    public static final java.lang.String ATTRIBUTION_REGISTER_VIEW = "com.unity3d.services.ads.api.AdViewer.attributionRegisterView";
    public static final java.lang.String BROADCAST_EVENT = "com.unity3d.services.ads.api.AdViewer.broadcastEvent";
    public static final java.lang.String CANCEL_SHOW_TIMEOUT = "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout";
    public static final java.lang.String CLICKED = "com.unity3d.services.ads.api.AdViewer.clicked";
    public static final java.lang.String COMPLETED = "com.unity3d.services.ads.api.AdViewer.completed";
    public static final java.lang.String DOWNLOAD = "com.unity3d.services.ads.api.AdViewer.download";
    public static final java.lang.String FAILED = "com.unity3d.services.ads.api.AdViewer.failed";
    public static final java.lang.String GET_AD_CONTEXT = "com.unity3d.services.ads.api.AdViewer.getAdContext";
    public static final java.lang.String GET_ALLOWED_PII = "com.unity3d.services.ads.api.AdViewer.getPrivacyAllowedPii";
    public static final java.lang.String GET_CONNECTION_TYPE = "com.unity3d.services.core.api.DeviceInfo.getConnectionType";
    public static final java.lang.String GET_DEVICE_MAX_VOLUME = "com.unity3d.services.core.api.DeviceInfo.getDeviceMaxVolume";
    public static final java.lang.String GET_DEVICE_VOLUME = "com.unity3d.services.core.api.DeviceInfo.getDeviceVolume";
    public static final java.lang.String GET_PRIVACY = "com.unity3d.services.ads.api.AdViewer.getPrivacyPayload";
    public static final java.lang.String GET_PRIVACY_FSM = "com.unity3d.services.ads.api.AdViewer.getPrivacyFsm";
    public static final java.lang.String GET_SCREEN_HEIGHT = "com.unity3d.services.core.api.DeviceInfo.getScreenHeight";
    public static final java.lang.String GET_SCREEN_WIDTH = "com.unity3d.services.core.api.DeviceInfo.getScreenWidth";
    public static final java.lang.String GET_SESSION_TOKEN = "com.unity3d.services.ads.api.AdViewer.getSessionToken";
    public static final java.lang.String HEADER_BIDDING_TOKEN_INCREMENT_STARTS = "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementStarts";
    public static final java.lang.String HEADER_BIDDING_TOKEN_INCREMENT_WINS = "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementWins";
    public static final java.lang.String HEADER_BIDDING_TOKEN_RESET = "com.unity3d.services.ads.api.AdViewer.hbTokenReset";
    public static final java.lang.String INCREMENT_BANNER_IMPRESSION_COUNT = "com.unity3d.services.ads.api.AdViewer.incrementBannerImpressionCount";
    public static final com.unity3d.ads.adplayer.ExposedFunctionLocation INSTANCE = new com.unity3d.ads.adplayer.ExposedFunctionLocation();
    public static final java.lang.String IS_ATTRIBUTION_AVAILABLE = "com.unity3d.services.ads.api.AdViewer.isAttributionAvailable";
    public static final java.lang.String IS_FILE_CACHED = "com.unity3d.services.ads.api.AdViewer.isFileCached";
    public static final java.lang.String LEFT_APPLICATION = "com.unity3d.services.ads.api.AdViewer.leftApplication";
    public static final java.lang.String LOAD_COMPLETE = "com.unity3d.services.ads.api.AdViewer.loadComplete";
    public static final java.lang.String LOAD_ERROR = "com.unity3d.services.ads.api.AdViewer.loadError";
    public static final java.lang.String MARK_CAMPAIGN_STATE_SHOWN = "com.unity3d.services.ads.api.AdViewer.markCampaignStateAsShown";
    public static final java.lang.String OM_FINISH_SESSION = "com.unity3d.services.ads.api.AdViewer.omidFinishSession";
    public static final java.lang.String OM_GET_DATA = "com.unity3d.services.ads.api.AdViewer.omidGetData";
    public static final java.lang.String OM_IMPRESSION = "com.unity3d.services.ads.api.AdViewer.omidImpression";
    public static final java.lang.String OM_START_SESSION = "com.unity3d.services.ads.api.AdViewer.omidStartSession";
    public static final java.lang.String OPEN_URL = "com.unity3d.services.ads.api.AdViewer.openUrl";
    public static final java.lang.String REFRESH_AD_DATA = "com.unity3d.services.ads.api.AdViewer.refreshAdData";
    public static final java.lang.String REQUEST_GET = "com.unity3d.services.core.api.Request.get";
    public static final java.lang.String REQUEST_HEAD = "com.unity3d.services.core.api.Request.head";
    public static final java.lang.String REQUEST_POST = "com.unity3d.services.core.api.Request.post";
    public static final java.lang.String SEND_DIAGNOSTIC_EVENT = "com.unity3d.services.ads.api.AdViewer.sendDiagnosticEvent";
    public static final java.lang.String SEND_OPERATIVE_EVENT = "com.unity3d.services.ads.api.AdViewer.sendOperativeEvent";
    public static final java.lang.String SEND_PRIVACY_UPDATE_REQUEST = "com.unity3d.services.ads.api.AdViewer.sendPrivacyUpdateRequest";
    public static final java.lang.String SET_ALLOWED_PII = "com.unity3d.services.ads.api.AdViewer.setPrivacyAllowedPii";
    public static final java.lang.String SET_PRIVACY = "com.unity3d.services.ads.api.AdViewer.setPrivacyPayload";
    public static final java.lang.String SET_PRIVACY_FSM = "com.unity3d.services.ads.api.AdViewer.setPrivacyFsm";
    public static final java.lang.String STARTED = "com.unity3d.services.ads.api.AdViewer.started";
    public static final java.lang.String STORAGE_CLEAR = "com.unity3d.services.core.api.Storage.clear";
    public static final java.lang.String STORAGE_DELETE = "com.unity3d.services.core.api.Storage.delete";
    public static final java.lang.String STORAGE_GET = "com.unity3d.services.core.api.Storage.get";
    public static final java.lang.String STORAGE_GET_KEYS = "com.unity3d.services.core.api.Storage.getKeys";
    public static final java.lang.String STORAGE_READ = "com.unity3d.services.core.api.Storage.read";
    public static final java.lang.String STORAGE_SET = "com.unity3d.services.core.api.Storage.set";
    public static final java.lang.String STORAGE_WRITE = "com.unity3d.services.core.api.Storage.write";
    public static final java.lang.String UPDATE_CAMPAIGN_STATE = "com.unity3d.services.ads.api.AdViewer.updateCampaignState";
    public static final java.lang.String UPDATE_TRACKING_TOKEN = "com.unity3d.services.ads.api.AdViewer.updateTrackingToken";

    private ExposedFunctionLocation() {
    }
}

package com.applovin.mediation.adapter;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdapterError extends com.applovin.impl.mediation.MaxErrorImpl {
    public static final int ERROR_CODE_INVALID_LOAD_STATE = -5201;
    public static final int ERROR_CODE_MISSING_ACTIVITY = -5601;
    public static final int ERROR_CODE_NO_FILL = 204;
    public static final com.applovin.mediation.adapter.MaxAdapterError NO_FILL = new com.applovin.mediation.adapter.MaxAdapterError(204, "No Fill");
    public static final int ERROR_CODE_UNSPECIFIED = -5200;
    public static final com.applovin.mediation.adapter.MaxAdapterError UNSPECIFIED = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_UNSPECIFIED, "Unspecified Error");
    public static final com.applovin.mediation.adapter.MaxAdapterError INVALID_LOAD_STATE = new com.applovin.mediation.adapter.MaxAdapterError(-5201, "Invalid Load State");
    public static final int ERROR_CODE_INVALID_CONFIGURATION = -5202;
    public static final com.applovin.mediation.adapter.MaxAdapterError INVALID_CONFIGURATION = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_INVALID_CONFIGURATION, "Invalid Configuration");
    public static final int ERROR_CODE_BAD_REQUEST = -5203;
    public static final com.applovin.mediation.adapter.MaxAdapterError BAD_REQUEST = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_BAD_REQUEST, "Bad Request");
    public static final int ERROR_CODE_NOT_INITIALIZED = -5204;
    public static final com.applovin.mediation.adapter.MaxAdapterError NOT_INITIALIZED = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_NOT_INITIALIZED, "Not Initialized");
    public static final int ERROR_CODE_AD_NOT_READY = -5205;
    public static final com.applovin.mediation.adapter.MaxAdapterError AD_NOT_READY = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_AD_NOT_READY, "Ad Not Ready");
    public static final int ERROR_CODE_TIMEOUT = -5206;
    public static final com.applovin.mediation.adapter.MaxAdapterError TIMEOUT = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_TIMEOUT, "Request Timed Out");
    public static final int ERROR_CODE_NO_CONNECTION = -5207;
    public static final com.applovin.mediation.adapter.MaxAdapterError NO_CONNECTION = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_NO_CONNECTION, "No Connection");
    public static final int ERROR_CODE_SERVER_ERROR = -5208;
    public static final com.applovin.mediation.adapter.MaxAdapterError SERVER_ERROR = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_SERVER_ERROR, "Server Error");
    public static final int ERROR_CODE_INTERNAL_ERROR = -5209;
    public static final com.applovin.mediation.adapter.MaxAdapterError INTERNAL_ERROR = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_INTERNAL_ERROR, "Internal Error");
    public static final int ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT = -5210;
    public static final com.applovin.mediation.adapter.MaxAdapterError SIGNAL_COLLECTION_TIMEOUT = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "Signal Collection Timed Out");
    public static final int ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED = -5211;
    public static final com.applovin.mediation.adapter.MaxAdapterError SIGNAL_COLLECTION_NOT_SUPPORTED = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "Signal Collection Not Supported");
    public static final int ERROR_CODE_WEBVIEW_ERROR = -5212;
    public static final com.applovin.mediation.adapter.MaxAdapterError WEBVIEW_ERROR = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_WEBVIEW_ERROR, "WebView Error");
    public static final int ERROR_CODE_AD_EXPIRED = -5213;
    public static final com.applovin.mediation.adapter.MaxAdapterError AD_EXPIRED = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_AD_EXPIRED, "Ad Expired");
    public static final int ERROR_CODE_AD_FREQUENCY_CAPPED = -5214;
    public static final com.applovin.mediation.adapter.MaxAdapterError AD_FREQUENCY_CAPPED = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_AD_FREQUENCY_CAPPED, "Ad Frequency Capped");
    public static final int ERROR_CODE_REWARD_ERROR = -5302;
    public static final com.applovin.mediation.adapter.MaxAdapterError REWARD_ERROR = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_REWARD_ERROR, "Reward Error");
    public static final int ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS = -5400;
    public static final com.applovin.mediation.adapter.MaxAdapterError MISSING_REQUIRED_NATIVE_AD_ASSETS = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets");
    public static final com.applovin.mediation.adapter.MaxAdapterError MISSING_ACTIVITY = new com.applovin.mediation.adapter.MaxAdapterError(-5601, "Missing Activity");
    public static final int ERROR_CODE_AD_DISPLAY_FAILED = -4205;
    public static final com.applovin.mediation.adapter.MaxAdapterError AD_DISPLAY_FAILED = new com.applovin.mediation.adapter.MaxAdapterError(ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed");

    public MaxAdapterError(int i) {
        this(i, "", 0, "");
    }

    public MaxAdapterError(int i, int i2) {
        this(i, "", i2, "");
    }

    public MaxAdapterError(int i, java.lang.String str) {
        this(i, str, 0, "");
    }

    public MaxAdapterError(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, int i, java.lang.String str) {
        this(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i, str);
    }

    public MaxAdapterError(int i, java.lang.String str, int i2, java.lang.String str2) {
        super(i, str, i2, str2);
    }
}

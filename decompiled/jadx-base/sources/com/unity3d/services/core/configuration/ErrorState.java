package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public enum ErrorState {
    CreateWebApp("create_webapp"),
    NetworkConfigRequest("network_config"),
    NetworkWebviewRequest("network_webview"),
    InvalidHash("invalid_hash"),
    CreateWebview("create_webview"),
    MalformedWebviewRequest("malformed_webview"),
    ResetWebApp("reset_webapp"),
    LoadCache("load_cache"),
    InitModules("init_modules"),
    CreateWebviewTimeout("create_webview_timeout"),
    CreateWebviewGameIdDisabled("create_webview_game_id_disabled"),
    CreateWebviewConfigError("create_webview_config_error"),
    CreateWebviewInvalidArgument("create_webview_invalid_arg");

    private java.lang.String _stateMetricName;

    ErrorState(java.lang.String str) {
        this._stateMetricName = str;
    }

    public java.lang.String getMetricName() {
        return this._stateMetricName;
    }
}

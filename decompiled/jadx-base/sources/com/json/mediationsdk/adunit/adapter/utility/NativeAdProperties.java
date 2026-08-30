package com.json.mediationsdk.adunit.adapter.utility;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "", "config", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "adOptionsPosition", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdOptionsPosition;", "getAdOptionsPosition", "()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdOptionsPosition;", "defaultAdOptionPosition", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NativeAdProperties {
    private final com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition adOptionsPosition;
    private final com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.defaultAdOptionPosition = com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    private final com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition getAdOptionsPosition(org.json.JSONObject config) {
        java.lang.String position = config.optString(com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(position, "position");
            return com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.valueOf(position);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return this.defaultAdOptionPosition;
        }
    }

    public final com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }
}

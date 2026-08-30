package com.bytedance.sdk.openadsdk.core.PX.bg;

/* JADX INFO: loaded from: classes4.dex */
public enum bg {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int Kg;

    bg(int i) {
        this.Kg = i;
    }

    public java.lang.String bg() {
        return java.lang.String.valueOf(this.Kg);
    }
}

package com.bytedance.sdk.openadsdk.api;

/* JADX INFO: loaded from: classes4.dex */
public interface PAGConstant {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface PAGChildDirectedType {
        public static final int PAG_CHILD_DIRECTED_TYPE_CHILD = 1;
        public static final int PAG_CHILD_DIRECTED_TYPE_DEFAULT = -1;
        public static final int PAG_CHILD_DIRECTED_TYPE_NON_CHILD = 0;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface PAGDoNotSellType {
        public static final int PAG_DO_NOT_SELL_TYPE_DEFAULT = -1;
        public static final int PAG_DO_NOT_SELL_TYPE_NOT_SELL = 1;
        public static final int PAG_DO_NOT_SELL_TYPE_SELL = 0;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface PAGGDPRConsentType {
        public static final int PAG_GDPR_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_GDPR_CONSENT_TYPE_DEFAULT = -1;
        public static final int PAG_GDPR_CONSENT_TYPE_NO_CONSENT = 0;
    }
}

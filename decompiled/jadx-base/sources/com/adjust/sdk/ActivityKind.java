package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64a;

        static {
            int[] iArr = new int[com.adjust.sdk.ActivityKind.values().length];
            f64a = iArr;
            try {
                iArr[com.adjust.sdk.ActivityKind.SESSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.EVENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.CLICK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.ATTRIBUTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.INFO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.GDPR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.AD_REVENUE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.SUBSCRIPTION.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f64a[com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    public static com.adjust.sdk.ActivityKind fromString(java.lang.String str) {
        if ("session".equals(str)) {
            return SESSION;
        }
        if (androidx.core.app.NotificationCompat.CATEGORY_EVENT.equals(str)) {
            return EVENT;
        }
        if (com.json.z8.d.equals(str)) {
            return CLICK;
        }
        if (com.json.z8.c.equals(str)) {
            return ATTRIBUTION;
        }
        if ("info".equals(str)) {
            return INFO;
        }
        if ("gdpr".equals(str)) {
            return GDPR;
        }
        if ("ad_revenue".equals(str)) {
            return AD_REVENUE;
        }
        if ("subscription".equals(str)) {
            return SUBSCRIPTION;
        }
        if ("third_party_sharing".equals(str)) {
            return THIRD_PARTY_SHARING;
        }
        if ("measurement_consent".equals(str)) {
            return MEASUREMENT_CONSENT;
        }
        return "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        switch (com.adjust.sdk.ActivityKind.a.f64a[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return androidx.core.app.NotificationCompat.CATEGORY_EVENT;
            case 3:
                return com.json.z8.d;
            case 4:
                return com.json.z8.c;
            case 5:
                return "info";
            case 6:
                return "gdpr";
            case 7:
                return "ad_revenue";
            case 8:
                return "subscription";
            case 9:
                return "third_party_sharing";
            case 10:
                return "measurement_consent";
            case 11:
                return "purchase_verification";
            default:
                return "unknown";
        }
    }
}

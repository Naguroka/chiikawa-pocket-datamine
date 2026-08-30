package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdInspectorError extends com.google.android.gms.ads.AdError {
    public static final int ERROR_CODE_ALREADY_OPEN = 3;
    public static final int ERROR_CODE_FAILED_TO_LOAD = 1;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_NOT_IN_TEST_MODE = 2;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdInspectorErrorCode {
    }

    public AdInspectorError(int i, java.lang.String str, java.lang.String str2) {
        super(i, str, str2);
    }

    @Override // com.google.android.gms.ads.AdError
    public int getCode() {
        return super.getCode();
    }
}

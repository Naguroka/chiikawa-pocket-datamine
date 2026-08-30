package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ApiExceptionUtil {
    public static com.google.android.gms.common.api.ApiException fromStatus(com.google.android.gms.common.api.Status status) {
        return status.hasResolution() ? new com.google.android.gms.common.api.ResolvableApiException(status) : new com.google.android.gms.common.api.ApiException(status);
    }
}

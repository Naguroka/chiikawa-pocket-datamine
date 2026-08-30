package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ApiExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final java.lang.Exception getException(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status);
    }
}

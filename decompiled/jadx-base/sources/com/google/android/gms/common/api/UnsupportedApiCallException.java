package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature zza;

    public UnsupportedApiCallException(com.google.android.gms.common.Feature feature) {
        this.zza = feature;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return "Missing ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza)));
    }
}

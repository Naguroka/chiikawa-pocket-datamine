package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GooglePlayServicesNotAvailableException extends java.lang.Exception {
    public final int errorCode;

    public GooglePlayServicesNotAvailableException(int i) {
        this.errorCode = i;
    }
}

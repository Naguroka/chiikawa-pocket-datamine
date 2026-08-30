package com.google.firebase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public class FirebaseExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final java.lang.Exception getException(com.google.android.gms.common.api.Status status) {
        return status.getStatusCode() == 8 ? new com.google.firebase.FirebaseException(status.zza()) : new com.google.firebase.FirebaseApiNotAvailableException(status.zza());
    }
}

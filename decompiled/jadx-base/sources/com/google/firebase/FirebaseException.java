package com.google.firebase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public class FirebaseException extends java.lang.Exception {
    @java.lang.Deprecated
    protected FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(java.lang.String str) {
        super(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}

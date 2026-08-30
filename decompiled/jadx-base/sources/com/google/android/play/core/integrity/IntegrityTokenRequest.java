package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class IntegrityTokenRequest {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class Builder {
        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest build();

        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setCloudProjectNumber(long j);

        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setNonce(java.lang.String str);
    }

    public static com.google.android.play.core.integrity.IntegrityTokenRequest.Builder builder() {
        return new com.google.android.play.core.integrity.am();
    }

    public abstract java.lang.Long cloudProjectNumber();

    public abstract java.lang.String nonce();
}

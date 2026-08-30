package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface StandardIntegrityManager {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class PrepareIntegrityTokenRequest {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
        public static abstract class Builder {
            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest build();

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j);
        }

        public static com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder builder() {
            com.google.android.play.core.integrity.c cVar = new com.google.android.play.core.integrity.c();
            cVar.a(0);
            return cVar;
        }

        abstract int a();

        public abstract long b();
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class StandardIntegrityToken {
        public abstract com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity activity, int i);

        public abstract java.lang.String token();
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public interface StandardIntegrityTokenProvider {
        com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken> request(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class StandardIntegrityTokenRequest {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
        public static abstract class Builder {
            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest build();

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(java.lang.String str);
        }

        public static com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder builder() {
            return new com.google.android.play.core.integrity.f();
        }

        public abstract java.lang.String a();
    }

    com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}

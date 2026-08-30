package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class e extends com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2315a;

    /* synthetic */ e(long j, int i, com.google.android.play.core.integrity.d dVar) {
        this.f2315a = j;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.f2315a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f2315a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2315a;
        return (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
    }

    public final java.lang.String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f2315a + ", webViewRequestMode=0}";
    }
}

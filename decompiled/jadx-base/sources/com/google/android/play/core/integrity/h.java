package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class h extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2317a;

    /* synthetic */ h(java.lang.String str, com.google.android.play.core.integrity.g gVar) {
        this.f2317a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final java.lang.String a() {
        return this.f2317a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        java.lang.String str = this.f2317a;
        if (str == null) {
            return standardIntegrityTokenRequest.a() == null;
        }
        return str.equals(standardIntegrityTokenRequest.a());
    }

    public final int hashCode() {
        java.lang.String str = this.f2317a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f2317a + "}";
    }
}

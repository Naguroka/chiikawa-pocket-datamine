package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class f extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2316a;

    f() {
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new com.google.android.play.core.integrity.h(this.f2316a, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(java.lang.String str) {
        this.f2316a = str;
        return this;
    }
}

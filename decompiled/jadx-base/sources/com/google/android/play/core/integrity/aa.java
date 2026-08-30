package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class aa implements com.google.android.play.core.integrity.IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.integrity.aj f2276a;

    aa(com.google.android.play.core.integrity.aj ajVar) {
        this.f2276a = ajVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.IntegrityTokenResponse> requestIntegrityToken(com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest) {
        return this.f2276a.c(integrityTokenRequest);
    }
}

package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface IntegrityManager {
    com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.IntegrityTokenResponse> requestIntegrityToken(com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest);
}

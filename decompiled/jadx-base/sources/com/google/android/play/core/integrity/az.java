package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class az implements com.google.android.play.core.integrity.StandardIntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.integrity.bn f2296a;
    private final com.google.android.play.core.integrity.bt b;

    az(com.google.android.play.core.integrity.bn bnVar, com.google.android.play.core.integrity.bt btVar) {
        this.f2296a = bnVar;
        this.b = btVar;
    }

    final /* synthetic */ com.google.android.gms.tasks.Task a(com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, java.lang.Long l) throws java.lang.Exception {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l.longValue();
        prepareIntegrityTokenRequest.a();
        final com.google.android.play.core.integrity.bt btVar = this.b;
        final int i = 0;
        return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i) { // from class: com.google.android.play.core.integrity.bs
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final com.google.android.gms.tasks.Task request(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f2311a.a(this.b, this.c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f2296a.e(jB, 0).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return this.f2295a.a(prepareIntegrityTokenRequest, (java.lang.Long) obj);
            }
        });
    }
}

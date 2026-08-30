package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class b extends com.google.android.play.core.integrity.bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2297a;
    private com.google.android.play.core.integrity.y b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.bq
    final com.google.android.play.core.integrity.bq a(com.google.android.play.core.integrity.y yVar) {
        this.b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final com.google.android.play.core.integrity.bq b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null token");
        }
        this.f2297a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final com.google.android.play.core.integrity.br c() {
        com.google.android.play.core.integrity.y yVar;
        java.lang.String str = this.f2297a;
        if (str != null && (yVar = this.b) != null) {
            return new com.google.android.play.core.integrity.br(str, yVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f2297a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

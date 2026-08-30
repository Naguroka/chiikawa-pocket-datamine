package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class a extends com.google.android.play.core.integrity.ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2275a;
    private com.google.android.play.core.integrity.y b;

    a() {
    }

    @Override // com.google.android.play.core.integrity.ap
    final com.google.android.play.core.integrity.ap a(com.google.android.play.core.integrity.y yVar) {
        this.b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final com.google.android.play.core.integrity.ap b(java.lang.String str) {
        this.f2275a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final com.google.android.play.core.integrity.aq c() {
        com.google.android.play.core.integrity.y yVar;
        java.lang.String str = this.f2275a;
        if (str != null && (yVar = this.b) != null) {
            return new com.google.android.play.core.integrity.aq(str, yVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f2275a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

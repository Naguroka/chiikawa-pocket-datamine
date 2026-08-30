package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ao extends com.google.android.play.core.integrity.IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2288a;
    private final java.lang.Long b;
    private final java.lang.Object c = null;

    /* synthetic */ ao(java.lang.String str, java.lang.Long l, java.lang.Object obj, com.google.android.play.core.integrity.an anVar) {
        this.f2288a = str;
        this.b = l;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final java.lang.Long cloudProjectNumber() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        java.lang.Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.integrity.IntegrityTokenRequest) {
            com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest = (com.google.android.play.core.integrity.IntegrityTokenRequest) obj;
            if (!this.f2288a.equals(integrityTokenRequest.nonce()) || ((l = this.b) != null ? !l.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!(obj instanceof com.google.android.play.core.integrity.ao) || !a()) {
            return z;
        }
        com.google.android.play.core.integrity.ao aoVar = (com.google.android.play.core.integrity.ao) obj;
        if (!z) {
            return false;
        }
        java.lang.Object obj2 = aoVar.c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f2288a.hashCode() ^ 1000003;
        java.lang.Long l = this.b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final java.lang.String nonce() {
        return this.f2288a;
    }

    public final java.lang.String toString() {
        java.lang.String strConcat = "IntegrityTokenRequest{nonce=" + this.f2288a + ", cloudProjectNumber=" + this.b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}

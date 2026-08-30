package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class e extends com.google.android.play.integrity.internal.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2337a;
    private final long b;

    e(int i, long j) {
        this.f2337a = i;
        this.b = j;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f2337a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.integrity.internal.f) {
            com.google.android.play.integrity.internal.f fVar = (com.google.android.play.integrity.internal.f) obj;
            if (this.f2337a == fVar.a() && this.b == fVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f2337a ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "EventRecord{eventType=" + this.f2337a + ", eventTimestamp=" + this.b + "}";
    }
}

package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bp extends com.google.android.play.core.assetpacks.em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2159a;
    private final java.lang.String b;
    private final long c;
    private final long d;
    private final int e;

    bp(int i, java.lang.String str, long j, long j2, int i2) {
        this.f2159a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.em
    final int a() {
        return this.f2159a;
    }

    @Override // com.google.android.play.core.assetpacks.em
    final int b() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.em
    final long c() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.em
    final long d() {
        return this.d;
    }

    @Override // com.google.android.play.core.assetpacks.em
    final java.lang.String e() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.assetpacks.em) {
            com.google.android.play.core.assetpacks.em emVar = (com.google.android.play.core.assetpacks.em) obj;
            if (this.f2159a == emVar.a() && ((str = this.b) != null ? str.equals(emVar.e()) : emVar.e() == null) && this.c == emVar.c() && this.d == emVar.d() && this.e == emVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2159a ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode = ((i * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.c;
        int i2 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        return ((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e;
    }

    public final java.lang.String toString() {
        return "SliceCheckpoint{fileExtractionStatus=" + this.f2159a + ", filePath=" + this.b + ", fileOffset=" + this.c + ", remainingBytes=" + this.d + ", previousChunk=" + this.e + "}";
    }
}

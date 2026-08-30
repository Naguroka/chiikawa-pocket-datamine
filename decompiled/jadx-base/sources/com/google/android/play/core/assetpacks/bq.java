package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bq extends com.google.android.play.core.assetpacks.eu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2160a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    bq(java.lang.String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f2160a = str;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    @Override // com.google.android.play.core.assetpacks.eu
    final int a() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.eu
    final long b() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.eu
    final java.lang.String c() {
        return this.f2160a;
    }

    @Override // com.google.android.play.core.assetpacks.eu
    final boolean d() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.eu
    final boolean e() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.assetpacks.eu) {
            com.google.android.play.core.assetpacks.eu euVar = (com.google.android.play.core.assetpacks.eu) obj;
            java.lang.String str = this.f2160a;
            if (str != null ? str.equals(euVar.c()) : euVar.c() == null) {
                if (this.b == euVar.b() && this.c == euVar.a() && this.d == euVar.e() && this.e == euVar.d()) {
                    if (java.util.Arrays.equals(this.f, euVar instanceof com.google.android.play.core.assetpacks.bq ? ((com.google.android.play.core.assetpacks.bq) euVar).f : euVar.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.eu
    final byte[] f() {
        return this.f;
    }

    public final java.lang.String toString() {
        return "ZipEntry{name=" + this.f2160a + ", size=" + this.b + ", compressionMethod=" + this.c + ", isPartial=" + this.d + ", isEndOfArchive=" + this.e + ", headerBytes=" + java.util.Arrays.toString(this.f) + "}";
    }

    public final int hashCode() {
        java.lang.String str = this.f2160a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ java.util.Arrays.hashCode(this.f);
    }
}

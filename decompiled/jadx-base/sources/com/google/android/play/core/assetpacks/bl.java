package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bl extends com.google.android.play.core.assetpacks.AssetLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2155a;
    private final long b;
    private final long c;

    bl(java.lang.String str, long j, long j2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null path");
        }
        this.f2155a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.assetpacks.AssetLocation) {
            com.google.android.play.core.assetpacks.AssetLocation assetLocation = (com.google.android.play.core.assetpacks.AssetLocation) obj;
            if (this.f2155a.equals(assetLocation.path()) && this.b == assetLocation.offset() && this.c == assetLocation.size()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2155a.hashCode() ^ 1000003;
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        return (((iHashCode * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long offset() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final java.lang.String path() {
        return this.f2155a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long size() {
        return this.c;
    }

    public final java.lang.String toString() {
        return "AssetLocation{path=" + this.f2155a + ", offset=" + this.b + ", size=" + this.c + "}";
    }
}

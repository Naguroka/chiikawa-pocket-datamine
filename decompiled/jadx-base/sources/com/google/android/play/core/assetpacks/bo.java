package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bo extends com.google.android.play.core.assetpacks.AssetPackStates {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2158a;
    private final java.util.Map b;

    bo(long j, java.util.Map map) {
        this.f2158a = j;
        this.b = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.assetpacks.AssetPackStates) {
            com.google.android.play.core.assetpacks.AssetPackStates assetPackStates = (com.google.android.play.core.assetpacks.AssetPackStates) obj;
            if (this.f2158a == assetPackStates.totalBytes() && this.b.equals(assetPackStates.packStates())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2158a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackState> packStates() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "AssetPackStates{totalBytes=" + this.f2158a + ", packStates=" + this.b.toString() + "}";
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final long totalBytes() {
        return this.f2158a;
    }
}

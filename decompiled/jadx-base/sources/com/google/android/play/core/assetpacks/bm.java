package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bm extends com.google.android.play.core.assetpacks.AssetPackLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2156a;
    private final java.lang.String b;
    private final java.lang.String c;

    bm(int i, java.lang.String str, java.lang.String str2) {
        this.f2156a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final java.lang.String assetsPath() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.assetpacks.AssetPackLocation) {
            com.google.android.play.core.assetpacks.AssetPackLocation assetPackLocation = (com.google.android.play.core.assetpacks.AssetPackLocation) obj;
            if (this.f2156a == assetPackLocation.packStorageMethod() && ((str = this.b) != null ? str.equals(assetPackLocation.path()) : assetPackLocation.path() == null) && ((str2 = this.c) != null ? str2.equals(assetPackLocation.assetsPath()) : assetPackLocation.assetsPath() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final int packStorageMethod() {
        return this.f2156a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final java.lang.String path() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "AssetPackLocation{packStorageMethod=" + this.f2156a + ", path=" + this.b + ", assetsPath=" + this.c + "}";
    }

    public final int hashCode() {
        int i = this.f2156a ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode = ((i * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.c;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }
}

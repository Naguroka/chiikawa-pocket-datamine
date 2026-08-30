package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bn extends com.google.android.play.core.assetpacks.AssetPackState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2157a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final int f;
    private final int g;
    private final java.lang.String h;
    private final java.lang.String i;

    bn(java.lang.String str, int i, int i2, long j, long j2, int i3, int i4, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.f2157a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = i3;
        this.g = i4;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null availableVersionTag");
        }
        this.h = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null installedVersionTag");
        }
        this.i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final java.lang.String availableVersionTag() {
        return this.h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long bytesDownloaded() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.assetpacks.AssetPackState) {
            com.google.android.play.core.assetpacks.AssetPackState assetPackState = (com.google.android.play.core.assetpacks.AssetPackState) obj;
            if (this.f2157a.equals(assetPackState.name()) && this.b == assetPackState.status() && this.c == assetPackState.errorCode() && this.d == assetPackState.bytesDownloaded() && this.e == assetPackState.totalBytesToDownload() && this.f == assetPackState.transferProgressPercentage() && this.g == assetPackState.updateAvailability() && this.h.equals(assetPackState.availableVersionTag()) && this.i.equals(assetPackState.installedVersionTag())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int errorCode() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f2157a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
        long j = this.d;
        long j2 = this.e;
        return (((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final java.lang.String installedVersionTag() {
        return this.i;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final java.lang.String name() {
        return this.f2157a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int status() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "AssetPackState{name=" + this.f2157a + ", status=" + this.b + ", errorCode=" + this.c + ", bytesDownloaded=" + this.d + ", totalBytesToDownload=" + this.e + ", transferProgressPercentage=" + this.f + ", updateAvailability=" + this.g + ", availableVersionTag=" + this.h + ", installedVersionTag=" + this.i + "}";
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long totalBytesToDownload() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int transferProgressPercentage() {
        return this.f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int updateAvailability() {
        return this.g;
    }
}

package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AssetPackLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.AssetPackLocation f2128a = new com.google.android.play.core.assetpacks.bm(1, null, null);

    static com.google.android.play.core.assetpacks.AssetPackLocation a() {
        return f2128a;
    }

    public abstract java.lang.String assetsPath();

    public abstract int packStorageMethod();

    public abstract java.lang.String path();
}

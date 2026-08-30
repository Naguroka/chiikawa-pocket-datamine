package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class AssetPackManagerFactory {
    private AssetPackManagerFactory() {
    }

    public static synchronized com.google.android.play.core.assetpacks.AssetPackManager getInstance(android.content.Context context) {
        return com.google.android.play.core.assetpacks.d.a(context).a();
    }
}

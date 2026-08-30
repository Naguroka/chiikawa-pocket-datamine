package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface AssetPackManager {
    com.google.android.play.core.assetpacks.AssetPackStates cancel(java.util.List<java.lang.String> list);

    void clearListeners();

    com.google.android.gms.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> fetch(java.util.List<java.lang.String> list);

    com.google.android.play.core.assetpacks.AssetLocation getAssetLocation(java.lang.String str, java.lang.String str2);

    com.google.android.play.core.assetpacks.AssetPackLocation getPackLocation(java.lang.String str);

    java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackLocation> getPackLocations();

    com.google.android.gms.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> getPackStates(java.util.List<java.lang.String> list);

    void registerListener(com.google.android.play.core.assetpacks.AssetPackStateUpdateListener assetPackStateUpdateListener);

    com.google.android.gms.tasks.Task<java.lang.Void> removePack(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Integer> showCellularDataConfirmation(android.app.Activity activity);

    boolean showCellularDataConfirmation(androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> activityResultLauncher);

    void unregisterListener(com.google.android.play.core.assetpacks.AssetPackStateUpdateListener assetPackStateUpdateListener);
}

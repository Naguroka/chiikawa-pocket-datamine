package com.unity3d.ads.core.data.manager;

/* JADX INFO: compiled from: StorageManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00060\nj\u0002`\u000b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\b\u0010\f\u001a\u00020\u0003H&J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0014\u0010\u0012\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0014\u0010\u0013\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/data/manager/StorageManager;", "", "addStorageLocation", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Lcom/unity3d/ads/core/data/manager/LegacyStorageType;", com.ironsource.rc.c.b, "", "getStorage", "Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/ads/core/data/manager/LegacyStorage;", "hasInitialized", "hasStorage", "", com.ironsource.y8.a.f, "context", "Landroid/content/Context;", "initStorage", "removeStorage", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StorageManager {
    void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType type, java.lang.String fileName);

    com.unity3d.services.core.device.Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType type);

    void hasInitialized();

    boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType type);

    boolean init(android.content.Context context);

    void initStorage(com.unity3d.services.core.device.StorageManager.StorageType type);

    void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType type);
}

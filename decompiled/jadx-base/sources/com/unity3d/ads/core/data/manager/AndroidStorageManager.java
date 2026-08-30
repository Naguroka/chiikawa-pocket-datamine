package com.unity3d.ads.core.data.manager;

/* JADX INFO: compiled from: AndroidStorageManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidStorageManager;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "()V", "addStorageLocation", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Lcom/unity3d/ads/core/data/manager/LegacyStorageType;", com.ironsource.rc.c.b, "", "getStorage", "Lcom/unity3d/services/core/device/Storage;", "hasInitialized", "hasStorage", "", com.ironsource.y8.a.f, "context", "Landroid/content/Context;", "initStorage", "removeStorage", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidStorageManager implements com.unity3d.ads.core.data.manager.StorageManager {
    private static final java.lang.String KEY_INITIALIZED = "configuration.hasInitialized";

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public com.unity3d.services.core.device.Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(type);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storage, "getStorage(type)");
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType type, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        com.unity3d.services.core.device.StorageManager.addStorageLocation(type, fileName);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        com.unity3d.services.core.device.Storage storage = getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, true);
        storage.writeStorage();
    }
}

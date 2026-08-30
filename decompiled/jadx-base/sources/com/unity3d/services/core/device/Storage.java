package com.unity3d.services.core.device;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/services/core/misc/JsonStorage;", "_targetFileName", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "(Ljava/lang/String;Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "getType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "clearStorage", "", "initStorage", "readStorage", "sendEvent", "", "eventType", "Lcom/unity3d/services/core/device/StorageEvent;", "value", "", "storageFileExists", "writeStorage", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Storage extends com.unity3d.services.core.misc.JsonStorage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.services.core.device.Storage.Companion INSTANCE = new com.unity3d.services.core.device.Storage.Companion(null);
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit>>> onStorageEventCallbacks = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
    private final java.lang.String _targetFileName;
    private final com.unity3d.services.core.device.StorageManager.StorageType type;

    public Storage(java.lang.String _targetFileName, com.unity3d.services.core.device.StorageManager.StorageType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_targetFileName, "_targetFileName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public final com.unity3d.services.core.device.StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean readStorage() {
        boolean z = true;
        try {
            try {
                byte[] fileBytes = com.unity3d.services.core.misc.Utilities.readFileBytes(new java.io.File(this._targetFileName));
                if (fileBytes == null) {
                    return false;
                }
                setData(new org.json.JSONObject(new java.lang.String(fileBytes, kotlin.text.Charsets.UTF_8)));
            } catch (java.io.FileNotFoundException e) {
                com.unity3d.services.core.log.DeviceLog.debug("Storage JSON file not found in local cache:", e);
                z = false;
            }
        } catch (java.lang.Exception e2) {
            com.unity3d.services.core.log.DeviceLog.debug("Failed to read storage JSON file:", e2);
            z = false;
        }
        return z;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public final synchronized boolean writeStorage() {
        java.io.File file = new java.io.File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return com.unity3d.services.core.misc.Utilities.writeFile(file, getData().toString());
    }

    public final synchronized boolean clearStorage() {
        clearData();
        return new java.io.File(this._targetFileName).delete();
    }

    public final synchronized boolean storageFileExists() {
        return new java.io.File(this._targetFileName).exists();
    }

    public final synchronized void sendEvent(com.unity3d.services.core.device.StorageEvent eventType, java.lang.Object value) {
        java.util.List<kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit>> value2 = onStorageEventCallbacks.getValue();
        if (!value2.isEmpty()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(eventType);
            com.unity3d.services.core.device.StorageEventInfo storageEventInfo = new com.unity3d.services.core.device.StorageEventInfo(eventType, this.type, value);
            java.util.Iterator<T> it = value2.iterator();
            while (it.hasNext()) {
                ((kotlin.jvm.functions.Function1) it.next()).invoke(storageEventInfo);
            }
            return;
        }
        if (!(com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null ? com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.STORAGE, eventType, this.type.name(), value) : false)) {
            com.unity3d.services.core.log.DeviceLog.debug("Couldn't send storage event to WebApp");
        }
    }

    /* JADX INFO: compiled from: Storage.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001a\u0010\u000b\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R&\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/device/Storage$Companion;", "", "()V", "onStorageEventCallbacks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "", "addStorageEventCallback", "callback", "removeStorageEventCallback", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void addStorageEventCallback(kotlin.jvm.functions.Function1<? super com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit> callback) {
            java.lang.Object value;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.unity3d.services.core.device.Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.jvm.functions.Function1<? super com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit>>) value, callback)));
        }

        public final void removeStorageEventCallback(kotlin.jvm.functions.Function1<? super com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit> callback) {
            java.lang.Object value;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.unity3d.services.core.device.Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.minus((java.util.List) value, callback)));
        }
    }
}

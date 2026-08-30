package com.unity3d.services.core.device;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/unity3d/services/core/device/StorageEventInfo;", "", "eventType", "Lcom/unity3d/services/core/device/StorageEvent;", "storageType", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "value", "(Lcom/unity3d/services/core/device/StorageEvent;Lcom/unity3d/services/core/device/StorageManager$StorageType;Ljava/lang/Object;)V", "getEventType", "()Lcom/unity3d/services/core/device/StorageEvent;", "getStorageType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StorageEventInfo {
    private final com.unity3d.services.core.device.StorageEvent eventType;
    private final com.unity3d.services.core.device.StorageManager.StorageType storageType;
    private final java.lang.Object value;

    public static /* synthetic */ com.unity3d.services.core.device.StorageEventInfo copy$default(com.unity3d.services.core.device.StorageEventInfo storageEventInfo, com.unity3d.services.core.device.StorageEvent storageEvent, com.unity3d.services.core.device.StorageManager.StorageType storageType, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            storageEvent = storageEventInfo.eventType;
        }
        if ((i & 2) != 0) {
            storageType = storageEventInfo.storageType;
        }
        if ((i & 4) != 0) {
            obj = storageEventInfo.value;
        }
        return storageEventInfo.copy(storageEvent, storageType, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.unity3d.services.core.device.StorageEvent getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.unity3d.services.core.device.StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.Object getValue() {
        return this.value;
    }

    public final com.unity3d.services.core.device.StorageEventInfo copy(com.unity3d.services.core.device.StorageEvent eventType, com.unity3d.services.core.device.StorageManager.StorageType storageType, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageType, "storageType");
        return new com.unity3d.services.core.device.StorageEventInfo(eventType, storageType, value);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.services.core.device.StorageEventInfo)) {
            return false;
        }
        com.unity3d.services.core.device.StorageEventInfo storageEventInfo = (com.unity3d.services.core.device.StorageEventInfo) other;
        return this.eventType == storageEventInfo.eventType && this.storageType == storageEventInfo.storageType && kotlin.jvm.internal.Intrinsics.areEqual(this.value, storageEventInfo.value);
    }

    public int hashCode() {
        int iHashCode = ((this.eventType.hashCode() * 31) + this.storageType.hashCode()) * 31;
        java.lang.Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "StorageEventInfo(eventType=" + this.eventType + ", storageType=" + this.storageType + ", value=" + this.value + ')';
    }

    public StorageEventInfo(com.unity3d.services.core.device.StorageEvent eventType, com.unity3d.services.core.device.StorageManager.StorageType storageType, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.eventType = eventType;
        this.storageType = storageType;
        this.value = obj;
    }

    public final com.unity3d.services.core.device.StorageEvent getEventType() {
        return this.eventType;
    }

    public final com.unity3d.services.core.device.StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    public final java.lang.Object getValue() {
        return this.value;
    }
}

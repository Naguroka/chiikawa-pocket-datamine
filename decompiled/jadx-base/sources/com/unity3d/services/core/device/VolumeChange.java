package com.unity3d.services.core.device;

/* JADX INFO: compiled from: VolumeChange.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/device/VolumeChange;", "", "clearAllListeners", "", "registerListener", "volumeChangeListener", "Lcom/unity3d/services/core/device/VolumeChangeListener;", "startObserving", "stopObserving", "unregisterListener", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface VolumeChange {
    void clearAllListeners();

    void registerListener(com.unity3d.services.core.device.VolumeChangeListener volumeChangeListener);

    void startObserving();

    void stopObserving();

    void unregisterListener(com.unity3d.services.core.device.VolumeChangeListener volumeChangeListener);
}

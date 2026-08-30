package com.unity3d.services.core.device;

/* JADX INFO: compiled from: VolumeChangeMonitor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "volumeChange", "Lcom/unity3d/services/core/device/VolumeChange;", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;Lcom/unity3d/services/core/device/VolumeChange;)V", "volumeChangeListeners", "Landroid/util/SparseArray;", "Lcom/unity3d/services/core/device/VolumeChangeListener;", "registerVolumeChangeListener", "", "streamType", "", "unregisterVolumeChangeListener", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VolumeChangeMonitor {
    private final com.unity3d.services.core.webview.bridge.IEventSender eventSender;
    private final com.unity3d.services.core.device.VolumeChange volumeChange;
    private final android.util.SparseArray<com.unity3d.services.core.device.VolumeChangeListener> volumeChangeListeners;

    public VolumeChangeMonitor(com.unity3d.services.core.webview.bridge.IEventSender eventSender, com.unity3d.services.core.device.VolumeChange volumeChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volumeChange, "volumeChange");
        this.eventSender = eventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new android.util.SparseArray<>();
    }

    public final void registerVolumeChangeListener(final int streamType) {
        if (this.volumeChangeListeners.get(streamType) == null) {
            com.unity3d.services.core.device.VolumeChangeListener volumeChangeListener = new com.unity3d.services.core.device.VolumeChangeListener() { // from class: com.unity3d.services.core.device.VolumeChangeMonitor$registerVolumeChangeListener$listener$1
                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int volume) {
                    this.this$0.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.DEVICEINFO, com.unity3d.services.core.device.DeviceInfoEvent.VOLUME_CHANGED, java.lang.Integer.valueOf(get$streamType()), java.lang.Integer.valueOf(volume), java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getStreamMaxVolume(streamType)));
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                /* JADX INFO: renamed from: getStreamType, reason: from getter */
                public int get$streamType() {
                    return streamType;
                }
            };
            this.volumeChangeListeners.append(streamType, volumeChangeListener);
            this.volumeChange.registerListener(volumeChangeListener);
        }
    }

    public final void unregisterVolumeChangeListener(int streamType) {
        if (this.volumeChangeListeners.get(streamType) != null) {
            com.unity3d.services.core.device.VolumeChangeListener listener = this.volumeChangeListeners.get(streamType);
            com.unity3d.services.core.device.VolumeChange volumeChange = this.volumeChange;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listener, "listener");
            volumeChange.unregisterListener(listener);
            this.volumeChangeListeners.remove(streamType);
        }
    }
}

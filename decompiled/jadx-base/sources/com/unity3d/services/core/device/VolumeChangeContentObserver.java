package com.unity3d.services.core.device;

/* JADX INFO: compiled from: VolumeChangeContentObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/core/device/VolumeChangeContentObserver;", "Lcom/unity3d/services/core/device/VolumeChange;", "()V", "contentObserver", "Landroid/database/ContentObserver;", "listeners", "", "Lcom/unity3d/services/core/device/VolumeChangeListener;", "clearAllListeners", "", "registerListener", "volumeChangeListener", "startObserving", "stopObserving", "triggerListeners", "unregisterListener", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VolumeChangeContentObserver implements com.unity3d.services.core.device.VolumeChange {
    private android.database.ContentObserver contentObserver;
    private java.util.List<com.unity3d.services.core.device.VolumeChangeListener> listeners = new java.util.ArrayList();

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void startObserving() {
        android.content.ContentResolver contentResolver;
        if (this.contentObserver != null) {
            return;
        }
        this.contentObserver = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.unity3d.services.core.device.VolumeChangeContentObserver.startObserving.1
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return false;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, android.net.Uri uri) {
                com.unity3d.services.core.device.VolumeChangeContentObserver.this.triggerListeners();
            }
        };
        android.content.Context applicationContext = com.unity3d.services.core.properties.ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            android.net.Uri uri = android.provider.Settings.System.CONTENT_URI;
            android.database.ContentObserver contentObserver = this.contentObserver;
            kotlin.jvm.internal.Intrinsics.checkNotNull(contentObserver, "null cannot be cast to non-null type android.database.ContentObserver");
            contentResolver.registerContentObserver(uri, true, contentObserver);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void stopObserving() {
        android.content.ContentResolver contentResolver;
        if (this.contentObserver == null) {
            return;
        }
        android.content.Context applicationContext = com.unity3d.services.core.properties.ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            android.database.ContentObserver contentObserver = this.contentObserver;
            kotlin.jvm.internal.Intrinsics.checkNotNull(contentObserver);
            contentResolver.unregisterContentObserver(contentObserver);
        }
        this.contentObserver = null;
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void registerListener(com.unity3d.services.core.device.VolumeChangeListener volumeChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volumeChangeListener, "volumeChangeListener");
        if (!this.listeners.contains(volumeChangeListener)) {
            startObserving();
            this.listeners.add(volumeChangeListener);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void unregisterListener(com.unity3d.services.core.device.VolumeChangeListener volumeChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volumeChangeListener, "volumeChangeListener");
        this.listeners.remove(volumeChangeListener);
        if (this.listeners.isEmpty()) {
            stopObserving();
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void clearAllListeners() {
        this.listeners.clear();
        stopObserving();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void triggerListeners() {
        for (com.unity3d.services.core.device.VolumeChangeListener volumeChangeListener : this.listeners) {
            volumeChangeListener.onVolumeChanged(com.unity3d.services.core.device.Device.getStreamVolume(volumeChangeListener.get$streamType()));
        }
    }
}

package androidx.media3.exoplayer.scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class RequirementsWatcher {
    private final android.content.Context context;
    private final android.os.Handler handler = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper();
    private final androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener listener;
    private androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback networkCallback;
    private int notMetRequirements;
    private androidx.media3.exoplayer.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver receiver;
    private final androidx.media3.exoplayer.scheduler.Requirements requirements;

    public interface Listener {
        void onRequirementsStateChanged(androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher, int i);
    }

    public RequirementsWatcher(android.content.Context context, androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener listener, androidx.media3.exoplayer.scheduler.Requirements requirements) {
        this.context = context.getApplicationContext();
        this.listener = listener;
        this.requirements = requirements;
    }

    public int start() {
        this.notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (this.requirements.isNetworkRequired()) {
            if (androidx.media3.common.util.Util.SDK_INT >= 24) {
                registerNetworkCallbackV24();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.requirements.isIdleRequired()) {
            if (androidx.media3.common.util.Util.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.requirements.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        androidx.media3.exoplayer.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver deviceStatusChangeReceiver = new androidx.media3.exoplayer.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver();
        this.receiver = deviceStatusChangeReceiver;
        this.context.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.handler);
        return this.notMetRequirements;
    }

    public void stop() {
        this.context.unregisterReceiver((android.content.BroadcastReceiver) androidx.media3.common.util.Assertions.checkNotNull(this.receiver));
        this.receiver = null;
        if (androidx.media3.common.util.Util.SDK_INT < 24 || this.networkCallback == null) {
            return;
        }
        unregisterNetworkCallbackV24();
    }

    public androidx.media3.exoplayer.scheduler.Requirements getRequirements() {
        return this.requirements;
    }

    private void registerNetworkCallbackV24() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) androidx.media3.common.util.Assertions.checkNotNull((android.net.ConnectivityManager) this.context.getSystemService("connectivity"));
        androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback networkCallback = new androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback();
        this.networkCallback = networkCallback;
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    private void unregisterNetworkCallbackV24() {
        ((android.net.ConnectivityManager) androidx.media3.common.util.Assertions.checkNotNull((android.net.ConnectivityManager) this.context.getSystemService("connectivity"))).unregisterNetworkCallback((android.net.ConnectivityManager.NetworkCallback) androidx.media3.common.util.Assertions.checkNotNull(this.networkCallback));
        this.networkCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequirements() {
        int notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        if (this.notMetRequirements != notMetRequirements) {
            this.notMetRequirements = notMetRequirements;
            this.listener.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recheckNotMetNetworkRequirements() {
        if ((this.notMetRequirements & 3) == 0) {
            return;
        }
        checkRequirements();
    }

    private class DeviceStatusChangeReceiver extends android.content.BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.checkRequirements();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class NetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;

        private NetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(android.net.Network network, boolean z) {
            if (z) {
                return;
            }
            postRecheckNotMetNetworkRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.receivedCapabilitiesChange && this.networkValidated == zHasCapability) {
                if (zHasCapability) {
                    postRecheckNotMetNetworkRequirements();
                }
            } else {
                this.receivedCapabilitiesChange = true;
                this.networkValidated = zHasCapability;
                postCheckRequirements();
            }
        }

        private void postCheckRequirements() {
            androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m177xcc18be42();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$postCheckRequirements$0$androidx-media3-exoplayer-scheduler-RequirementsWatcher$NetworkCallback, reason: not valid java name */
        /* synthetic */ void m177xcc18be42() {
            if (androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.networkCallback != null) {
                androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.checkRequirements();
            }
        }

        private void postRecheckNotMetNetworkRequirements() {
            androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m178xfb2bca45();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$postRecheckNotMetNetworkRequirements$1$androidx-media3-exoplayer-scheduler-RequirementsWatcher$NetworkCallback, reason: not valid java name */
        /* synthetic */ void m178xfb2bca45() {
            if (androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.networkCallback != null) {
                androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.recheckNotMetNetworkRequirements();
            }
        }
    }
}

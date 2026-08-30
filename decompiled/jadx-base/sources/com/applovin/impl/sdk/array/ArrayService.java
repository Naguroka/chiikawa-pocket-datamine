package com.applovin.impl.sdk.array;

/* JADX INFO: loaded from: classes3.dex */
public class ArrayService extends com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.Stub {
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final java.lang.String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final java.lang.String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final java.lang.String TAG = "ArrayService";
    private java.lang.String appHubPackageName;
    private com.applovin.array.apphub.aidl.IAppHubService appHubService;
    private final android.content.Intent appHubServiceIntent;
    private long appHubVersionCode = -1;
    private com.applovin.impl.sdk.array.ArrayService.DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final com.applovin.impl.sdk.array.ArrayDataCollector dataCollector;
    private java.lang.Boolean isDirectDownloadEnabled;
    private final com.applovin.impl.sdk.n logger;
    private java.lang.String randomUserToken;
    private final com.applovin.impl.sdk.j sdk;

    public interface DirectDownloadListener {
        void onAppDetailsDismissed();

        void onAppDetailsDisplayed();

        void onFailure();
    }

    private static class DirectDownloadState {
        private final java.lang.String adToken;
        private final java.util.concurrent.atomic.AtomicBoolean errorCallbackInvoked = new java.util.concurrent.atomic.AtomicBoolean();
        private final com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener listener;
        private final android.os.Bundle parameters;

        public DirectDownloadState(java.lang.String str, android.os.Bundle bundle, com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        protected boolean canEqual(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.sdk.array.ArrayService.DirectDownloadState;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sdk.array.ArrayService.DirectDownloadState)) {
                return false;
            }
            com.applovin.impl.sdk.array.ArrayService.DirectDownloadState directDownloadState = (com.applovin.impl.sdk.array.ArrayService.DirectDownloadState) obj;
            if (!directDownloadState.canEqual(this)) {
                return false;
            }
            java.util.concurrent.atomic.AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            java.util.concurrent.atomic.AtomicBoolean errorCallbackInvoked2 = directDownloadState.getErrorCallbackInvoked();
            if (errorCallbackInvoked != null ? !errorCallbackInvoked.equals(errorCallbackInvoked2) : errorCallbackInvoked2 != null) {
                return false;
            }
            java.lang.String adToken = getAdToken();
            java.lang.String adToken2 = directDownloadState.getAdToken();
            if (adToken != null ? !adToken.equals(adToken2) : adToken2 != null) {
                return false;
            }
            android.os.Bundle parameters = getParameters();
            android.os.Bundle parameters2 = directDownloadState.getParameters();
            if (parameters != null ? !parameters.equals(parameters2) : parameters2 != null) {
                return false;
            }
            com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener listener = getListener();
            com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener listener2 = directDownloadState.getListener();
            return listener != null ? listener.equals(listener2) : listener2 == null;
        }

        public java.lang.String getAdToken() {
            return this.adToken;
        }

        public java.util.concurrent.atomic.AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener getListener() {
            return this.listener;
        }

        public android.os.Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            java.util.concurrent.atomic.AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            int iHashCode = errorCallbackInvoked == null ? 43 : errorCallbackInvoked.hashCode();
            java.lang.String adToken = getAdToken();
            int iHashCode2 = ((iHashCode + 59) * 59) + (adToken == null ? 43 : adToken.hashCode());
            android.os.Bundle parameters = getParameters();
            int iHashCode3 = (iHashCode2 * 59) + (parameters == null ? 43 : parameters.hashCode());
            com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener listener = getListener();
            return (iHashCode3 * 59) + (listener != null ? listener.hashCode() : 43);
        }

        public java.lang.String toString() {
            return "ArrayService.DirectDownloadState(errorCallbackInvoked=" + getErrorCallbackInvoked() + ", adToken=" + getAdToken() + ", parameters=" + getParameters() + ", listener=" + getListener() + ")";
        }
    }

    public ArrayService(com.applovin.impl.sdk.j jVar) {
        this.sdk = jVar;
        this.logger = jVar.I();
        this.dataCollector = new com.applovin.impl.sdk.array.ArrayDataCollector(jVar);
        android.content.Intent intentCreateAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = intentCreateAppHubServiceIntent;
        if (intentCreateAppHubServiceIntent != null) {
            bindAppHubService();
        }
        jVar.e().a(new com.applovin.impl.p() { // from class: com.applovin.impl.sdk.array.ArrayService.1
            @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
                com.applovin.impl.sdk.array.ArrayService.DirectDownloadState directDownloadState = com.applovin.impl.sdk.array.ArrayService.this.currentDownloadState;
                if (com.applovin.impl.sdk.array.ArrayService.this.appHubService == null || directDownloadState == null) {
                    return;
                }
                try {
                    com.applovin.impl.sdk.n unused = com.applovin.impl.sdk.array.ArrayService.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.array.ArrayService.this.logger.a(com.applovin.impl.sdk.array.ArrayService.TAG, "Dismissing Direct Download Activity");
                    }
                    com.applovin.impl.sdk.array.ArrayService.this.appHubService.dismissDirectDownloadAppDetails(directDownloadState.adToken);
                    directDownloadState.listener.onAppDetailsDismissed();
                    com.applovin.impl.sdk.array.ArrayService.this.currentDownloadState = null;
                } catch (android.os.RemoteException e) {
                    com.applovin.impl.sdk.n unused2 = com.applovin.impl.sdk.array.ArrayService.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.array.ArrayService.this.logger.a(com.applovin.impl.sdk.array.ArrayService.TAG, "Failed dismiss Direct Download Activity", e);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount > 3) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.k(TAG, "Exceeded maximum retry count");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "Attempting connection to App Hub service...");
        }
        this.currentRetryCount++;
        try {
            if (com.applovin.impl.sdk.j.m().bindService(this.appHubServiceIntent, new android.content.ServiceConnection() { // from class: com.applovin.impl.sdk.array.ArrayService.2
                @Override // android.content.ServiceConnection
                public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
                    com.applovin.impl.sdk.n unused = com.applovin.impl.sdk.array.ArrayService.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.array.ArrayService.this.logger.a(com.applovin.impl.sdk.array.ArrayService.TAG, "Connection successful: " + componentName);
                    }
                    com.applovin.impl.sdk.array.ArrayService.this.appHubService = com.applovin.array.apphub.aidl.IAppHubService.Stub.asInterface(iBinder);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(android.content.ComponentName componentName) {
                    com.applovin.impl.sdk.n unused = com.applovin.impl.sdk.array.ArrayService.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.array.ArrayService.this.logger.b(com.applovin.impl.sdk.array.ArrayService.TAG, "Service disconnected: " + componentName);
                    }
                    com.applovin.impl.sdk.array.ArrayService.this.appHubService = null;
                    com.applovin.impl.sdk.n unused2 = com.applovin.impl.sdk.array.ArrayService.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.array.ArrayService.this.logger.b(com.applovin.impl.sdk.array.ArrayService.TAG, "Retrying...");
                    }
                    com.applovin.impl.sdk.array.ArrayService.this.bindAppHubService();
                }
            }, com.applovin.impl.z3.c() ? androidx.core.view.InputDeviceCompat.SOURCE_DPAD : 1) || !com.applovin.impl.sdk.n.a()) {
                return;
            }
            this.logger.k(TAG, "App Hub not available");
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Failed to bind to service", th);
            }
        }
    }

    private android.content.Intent createAppHubServiceIntent() {
        android.content.Intent intent = new android.content.Intent(SERVICE_INTENT_FILTER_ACTION);
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = com.applovin.impl.sdk.j.m().getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.logger.k(TAG, "App Hub not available");
            return null;
        }
        java.lang.String str = listQueryIntentServices.get(0).serviceInfo.packageName;
        this.appHubPackageName = str;
        intent.setClassName(str, SERVICE_INTENT_CLASS_NAME);
        return intent;
    }

    public void collectAppHubData() {
        if (isAppHubInstalled()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Collecting data...");
            }
            if (this.isDirectDownloadEnabled == null && ((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.d0)).booleanValue()) {
                this.isDirectDownloadEnabled = this.dataCollector.collectDirectDownloadEnabled(this.appHubService);
            }
            if (this.appHubVersionCode == -1 && ((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.c0)).booleanValue()) {
                this.appHubVersionCode = this.dataCollector.collectAppHubVersionCode(this.appHubService);
            }
            if (android.text.TextUtils.isEmpty(this.randomUserToken) && ((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.e0)).booleanValue()) {
                this.randomUserToken = this.dataCollector.collectRandomUserToken(this.appHubService);
            }
        }
    }

    public java.lang.String getAppHubPackageName() {
        return this.appHubPackageName;
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    public java.lang.Boolean getIsDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    public java.lang.String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        return this.appHubService != null;
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsDismissed(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "App details dismissed");
        }
        com.applovin.impl.sdk.array.ArrayService.DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        directDownloadState.listener.onAppDetailsDismissed();
        this.currentDownloadState = null;
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsShown(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "App details shown");
        }
        com.applovin.impl.sdk.array.ArrayService.DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        directDownloadState.listener.onAppDetailsDisplayed();
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onDownloadStarted(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "Download started");
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onError(java.lang.String str, java.lang.String str2) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.b(TAG, "Encountered error: " + str2);
        }
        com.applovin.impl.sdk.array.ArrayService.DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null && directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
            directDownloadState.listener.onFailure();
            this.currentDownloadState = null;
        }
    }

    public void startDirectInstallOrDownloadProcess(com.applovin.impl.sdk.array.ArrayDirectDownloadAd arrayDirectDownloadAd, android.os.Bundle bundle, com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener directDownloadListener) {
        if (this.appHubService == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - service disconnected");
            }
            directDownloadListener.onFailure();
            return;
        }
        if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - missing token");
            }
            directDownloadListener.onFailure();
            return;
        }
        try {
            android.os.Bundle directDownloadParameters = arrayDirectDownloadAd.getDirectDownloadParameters();
            if (bundle != null) {
                directDownloadParameters.putAll(bundle);
            }
            this.currentDownloadState = new com.applovin.impl.sdk.array.ArrayService.DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), directDownloadParameters, directDownloadListener);
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Starting Direct Download Activity");
            }
            if (this.appHubVersionCode >= 21) {
                this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
            } else {
                this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Activity started");
            }
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Failed to execute Direct Install / Download process", th);
            }
            this.sdk.D().a(TAG, "directInstallDownload", th);
            this.currentDownloadState = null;
            directDownloadListener.onFailure();
        }
    }
}

package com.android.installreferrer.api;

/* JADX INFO: loaded from: classes3.dex */
class InstallReferrerClientImpl extends com.android.installreferrer.api.InstallReferrerClient {
    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final java.lang.String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final java.lang.String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final java.lang.String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final java.lang.String TAG = "InstallReferrerClient";
    private int clientState = 0;
    private final android.content.Context mApplicationContext;
    private com.google.android.finsky.externalreferrer.IGetInstallReferrerService service;
    private android.content.ServiceConnection serviceConnection;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    private final class InstallReferrerServiceConnection implements android.content.ServiceConnection {
        private final com.android.installreferrer.api.InstallReferrerStateListener mListener;

        private InstallReferrerServiceConnection(com.android.installreferrer.api.InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new java.lang.RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.mListener = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(com.android.installreferrer.api.InstallReferrerClientImpl.TAG, "Install Referrer service connected.");
            com.android.installreferrer.api.InstallReferrerClientImpl.this.service = com.google.android.finsky.externalreferrer.IGetInstallReferrerService.Stub.b(iBinder);
            com.android.installreferrer.api.InstallReferrerClientImpl.this.clientState = 2;
            this.mListener.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(com.android.installreferrer.api.InstallReferrerClientImpl.TAG, "Install Referrer service disconnected.");
            com.android.installreferrer.api.InstallReferrerClientImpl.this.service = null;
            com.android.installreferrer.api.InstallReferrerClientImpl.this.clientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(android.content.Context context) {
        this.mApplicationContext = context.getApplicationContext();
    }

    private boolean isPlayStoreCompatible() {
        try {
            return this.mApplicationContext.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= PLAY_STORE_MIN_APP_VER;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(TAG, "Unbinding from service.");
            this.mApplicationContext.unbindService(this.serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public com.android.installreferrer.api.ReferrerDetails getInstallReferrer() throws android.os.RemoteException {
        if (!isReady()) {
            throw new java.lang.IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.ironsource.y8.h.V, this.mApplicationContext.getPackageName());
        try {
            return new com.android.installreferrer.api.ReferrerDetails(this.service.c(bundle));
        } catch (android.os.RemoteException e) {
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(TAG, "RemoteException getting install referrer information");
            this.clientState = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(com.android.installreferrer.api.InstallReferrerStateListener installReferrerStateListener) {
        if (isReady()) {
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(TAG, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.clientState;
        if (i == 1) {
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(TAG, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(TAG, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(TAG, "Starting install referrer service setup.");
        android.content.Intent intent = new android.content.Intent(SERVICE_ACTION_NAME);
        intent.setComponent(new android.content.ComponentName("com.android.vending", SERVICE_NAME));
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                java.lang.String str = resolveInfo.serviceInfo.packageName;
                java.lang.String str2 = resolveInfo.serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null || !isPlayStoreCompatible()) {
                    com.android.installreferrer.commons.InstallReferrerCommons.logWarn(TAG, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                    this.clientState = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(2);
                    return;
                }
                android.content.Intent intent2 = new android.content.Intent(intent);
                com.android.installreferrer.api.InstallReferrerClientImpl.InstallReferrerServiceConnection installReferrerServiceConnection = new com.android.installreferrer.api.InstallReferrerClientImpl.InstallReferrerServiceConnection(installReferrerStateListener);
                this.serviceConnection = installReferrerServiceConnection;
                try {
                    if (this.mApplicationContext.bindService(intent2, installReferrerServiceConnection, 1)) {
                        com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(TAG, "Service was bonded successfully.");
                        return;
                    }
                    com.android.installreferrer.commons.InstallReferrerCommons.logWarn(TAG, "Connection to service is blocked.");
                    this.clientState = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(1);
                    return;
                } catch (java.lang.SecurityException unused) {
                    com.android.installreferrer.commons.InstallReferrerCommons.logWarn(TAG, "No permission to connect to service.");
                    this.clientState = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(4);
                    return;
                }
            }
        }
        this.clientState = 0;
        com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(TAG, "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}

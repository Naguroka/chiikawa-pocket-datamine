package com.pairip.licensecheck;

/* JADX INFO: loaded from: classes2.dex */
public class LicenseClient implements android.content.ServiceConnection {
    private static final java.lang.String BACKGROUND_SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.IBackgroundLicensingService";
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int EVENTUAL_SHUTDOWN_DELAY_MILLIS = 30000;
    private static final java.lang.String EXTRA_END_CUSTOM_TRIAL = "end_custom_trial";
    private static final int FIRST_ISOLATED_UID = 99000;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LAST_ISOLATED_UID = 99999;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final long MIN_TRIAL_END_INTERVAL_MILLIS = 3000;
    private static final int NOT_LICENSED = 2;
    private static final java.lang.String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int PER_USER_RANGE = 100000;
    private static final int REPEATED_CHECK_RETRY_DELAY_MILLIS = 300000;
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final java.lang.String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final java.lang.String SERVICE_PACKAGE = "com.android.vending";
    private static final java.lang.String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static boolean backgroundLicensingServiceEnabled = false;
    protected static boolean customTrialEndTriggered = false;
    protected static boolean eventualShutdownEnabled = true;
    public static boolean gracefulShutdownEnabled = true;
    private static final android.os.Handler handler;
    private static com.pairip.licensecheck.LicenseClient instance = null;
    protected static long lastTrialEndElapsedRealtimeMillis = 0;
    protected static java.lang.String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA57umn+0CliwGESUDovYhP8kLjljKWjeTu/3Bcnc/qDQhX87+vtYziwFSzbOj5R/TBVD0EcMO2xDPOvZlKaub/xfwFSLatmB817FZqu5HY8OSAZT2AKSZYD7krLu1Moxb9YlKiW5OF8xDvoNYZbcNwBlYnWise4ZMkDVbwt3q3F1jV52seobrVjrVIbaogawcCEqDiLOXLjmkKIxkjHwjab5yIs7FIOUpGJtW2UbfjWWidX59d/t6R+UHbeEVf4AXS4PdRPYrXLqYIPOVZCWD8N3rX/7wmVqs82IyAchjzbkM0BJhCZSodJSTKBk4e54N52K/TH7ke3Owv0CQQGlPRQIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor mainThreadRunner = null;
    protected static java.lang.String packageName = "jp.co.applibot.chiikawapocketgl";
    protected static boolean repeatedCheckEnabled = true;
    protected static android.os.Bundle responsePayload;
    private final android.content.Context context;
    protected static java.lang.Runnable exitAction = new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient.1
        @Override // java.lang.Runnable
        public void run() {
            java.lang.System.exit(0);
        }
    };
    protected static com.pairip.licensecheck.LicenseClient.LicenseCheckState licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.CHECK_REQUIRED;
    protected static com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor backgroundRunner = new com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda4
        @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
        public final void run(java.lang.Runnable runnable) {
            new java.lang.Thread(runnable).start();
        }
    };
    protected com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor delayedTaskExecutor = new com.pairip.licensecheck.LicenseClient.DelayedTaskExecutorImpl();
    protected int retryNum = 0;
    protected boolean waitingForRepeatedCheck = false;
    private long repeatedCheckStartElapsedRealtime = 0;

    public interface DelayedTaskExecutor {
        void schedule(java.lang.Runnable task, long delayMillis);
    }

    public interface ImmediateTaskExecutor {
        void run(java.lang.Runnable task);
    }

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED,
        REPEATED_CHECK_REQUIRED
    }

    static {
        final android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
        handler = handler2;
        java.util.Objects.requireNonNull(handler2);
        mainThreadRunner = new com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda5
            @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
            public final void run(java.lang.Runnable runnable) {
                handler2.post(runnable);
            }
        };
        customTrialEndTriggered = false;
        lastTrialEndElapsedRealtimeMillis = 0L;
    }

    private static synchronized com.pairip.licensecheck.LicenseClient getInstance(android.content.Context context) {
        com.pairip.licensecheck.LicenseClient licenseClient;
        licenseClient = instance;
        if (licenseClient == null) {
            licenseClient = new com.pairip.licensecheck.LicenseClient(context);
            instance = licenseClient;
        }
        return licenseClient;
    }

    public static void checkLicense(final android.content.Context context) {
        if (context == null) {
            android.util.Log.w(TAG, "Cannot check license with null context.");
        } else if (isIsolatedProcess()) {
            android.util.Log.i(TAG, "Skipping license check in isolated process.");
        } else {
            mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.pairip.licensecheck.LicenseClient.getInstance(context).initializeLicenseCheck();
                }
            });
        }
    }

    static void stopTrial(final android.content.Context context) {
        if (context == null) {
            android.util.Log.w(TAG, "Cannot trigger trial end with null context.");
        } else if (isIsolatedProcess()) {
            android.util.Log.i(TAG, "Skipping trial end in isolated process.");
        } else {
            mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.pairip.licensecheck.LicenseClient.getInstance(context).handleTrialEnd();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleTrialEnd() {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis();
        long j = lastTrialEndElapsedRealtimeMillis;
        long j2 = elapsedRealtimeMillis - j;
        if (j <= 0 || j2 >= 3000) {
            android.util.Log.i(TAG, "Trial end event triggered; initiating full license check.");
            lastTrialEndElapsedRealtimeMillis = elapsedRealtimeMillis;
            customTrialEndTriggered = true;
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.CHECK_REQUIRED;
            this.waitingForRepeatedCheck = false;
            initiateFreshLicensingServiceConnection(false);
            return;
        }
        android.util.Log.w(TAG, java.lang.String.format("Trial end trigger throttled. Ignoring request (sent %d ms ago).", java.lang.Long.valueOf(j2)));
    }

    private static boolean isIsolatedProcess() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.os.Process.isIsolated();
        }
        int iMyUid = android.os.Process.myUid() % 100000;
        return iMyUid >= FIRST_ISOLATED_UID && iMyUid <= 99999;
    }

    public static java.lang.String getLicensePubKey() {
        return licensePubKey;
    }

    public LicenseClient(android.content.Context context) {
        this.context = context;
    }

    public void initializeLicenseCheck() {
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal == 0) {
            if (localCheckEnabled && !customTrialEndTriggered) {
                backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$initializeLicenseCheck$0();
                    }
                });
                return;
            } else {
                initiateFreshLicensingServiceConnection(false);
                return;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 4) {
                return;
            }
            initiateFreshLicensingServiceConnection(false);
        } else {
            try {
                com.pairip.licensecheck.LicenseResponseHelper.validateResponse(responsePayload, packageName);
            } catch (com.pairip.licensecheck.LicenseCheckException e) {
                handleError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$0() {
        final boolean zPerformLocalInstallerCheck = performLocalInstallerCheck();
        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$initializeLicenseCheck$1(zPerformLocalInstallerCheck);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$1(boolean z) {
        if (z) {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_OK;
        }
        initiateFreshLicensingServiceConnection(z && backgroundLicensingServiceEnabled);
    }

    private boolean performLocalInstallerCheck() {
        try {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.util.Log.i(TAG, "Local install check bypassed due to old SDK version.");
                return false;
            }
            android.content.pm.PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                android.util.Log.i(TAG, "Local install check bypassed due to package manager not found.");
                return false;
            }
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                int i = packageInfo.applicationInfo.flags;
                if ((i & 1) == 0 && (i & 128) == 0) {
                    android.content.pm.InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                    if (installSourceInfo == null) {
                        android.util.Log.i(TAG, "Local install check bypassed due to install source info not found.");
                        return false;
                    }
                    java.lang.String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null && installingPackageName.equals("com.android.vending")) {
                        return true;
                    }
                    android.util.Log.i(TAG, "Local install check failed due to wrong installer.");
                    return false;
                }
                android.util.Log.i(TAG, "Local install check passed due to system app.");
                return true;
            }
            android.util.Log.i(TAG, "Local install check bypassed due to app package info not found.");
            return false;
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Could not obtain package info for local installer check.", e);
            return false;
        }
    }

    private void initiateFreshLicensingServiceConnection(boolean useBackgroundService) {
        this.retryNum = 0;
        lambda$retryOrThrow$1(useBackgroundService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bindToLicensingService, reason: merged with bridge method [inline-methods] */
    public void lambda$retryOrThrow$1(boolean useBackgroundService) {
        java.lang.String str;
        java.lang.String str2;
        if (useBackgroundService) {
            str = "Connecting to the background licensing service...";
        } else {
            str = "Connecting to the main licensing service...";
        }
        android.util.Log.d(TAG, str);
        if (useBackgroundService) {
            str2 = BACKGROUND_SERVICE_INTERFACE_CLASS_NAME;
        } else {
            str2 = SERVICE_INTERFACE_CLASS_NAME;
        }
        try {
            if (this.context.bindService(new android.content.Intent(str2).setPackage("com.android.vending").setAction(str2), this, 1)) {
                return;
            }
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Could not bind with the licensing service: ".concat(str2)), useBackgroundService, useBackgroundService);
        } catch (java.lang.SecurityException e) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Not allowed to bind with the licensing service: ".concat(str2), e), useBackgroundService, useBackgroundService);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder licensingServiceBinder) {
        android.util.Log.d(TAG, "Connected to the licensing service.");
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$onServiceConnected$1(licensingServiceBinder);
                    }
                });
                return;
            } else if (iOrdinal != 4) {
                return;
            }
        }
        backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onServiceConnected$0(licensingServiceBinder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(android.os.IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (android.os.RemoteException e) {
            handleError(new com.pairip.licensecheck.LicenseCheckException("Error when getting interface descriptor.", e));
        } catch (com.pairip.licensecheck.LicenseCheckException e2) {
            handleError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$1(android.os.IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Error while reporting license check: " + android.util.Log.getStackTraceString(e));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        if (licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.REPEATED_CHECK_REQUIRED) && this.waitingForRepeatedCheck) {
            android.util.Log.d(TAG, "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
        } else {
            android.util.Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service unexpectedly disconnected."));
        }
    }

    private void checkLicenseInternal(android.os.IBinder licensingServiceBinder) throws com.pairip.licensecheck.LicenseCheckException, android.os.RemoteException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."));
            return;
        }
        if (licensingServiceBinder.getInterfaceDescriptor().equals(BACKGROUND_SERVICE_INTERFACE_CLASS_NAME)) {
            throw new com.pairip.licensecheck.LicenseCheckException("Background licensing service does not support full license check.");
        }
        android.util.Log.d(TAG, "Sending request to licensing service...");
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        try {
            populateInputDataForLicenseCheckV2(parcelObtain, licensingServiceBinder);
            if (!licensingServiceBinder.transact(2, parcelObtain, parcelObtain2, 0)) {
                handleError(new com.pairip.licensecheck.LicenseCheckException("Licensing service could not process request."));
            }
        } catch (android.os.DeadObjectException e) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service process died.", e));
        } catch (android.os.RemoteException e2) {
            handleError(new com.pairip.licensecheck.LicenseCheckException("Error when calling licensing service.", e2));
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            android.util.Log.d(TAG, "Request to licensing service sent.");
        }
    }

    public void reportSuccessfulLicenseCheck(android.os.IBinder licensingServiceBinder) throws com.pairip.licensecheck.LicenseCheckException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."), true, backgroundLicensingServiceEnabled);
            return;
        }
        android.util.Log.d(TAG, "Sending request to license reporting service...");
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        try {
            populateInputDataForReportAutoVerifiedLicense(parcelObtain, licensingServiceBinder);
            boolean zTransact = licensingServiceBinder.transact(3, parcelObtain, parcelObtain2, 0);
            if (!zTransact) {
                android.util.Log.e(TAG, "Error sending request to license reporting service.");
            }
            if (zTransact) {
                mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_REPORTED;
                    }
                });
            }
        } catch (android.os.RemoteException e) {
            android.util.Log.e(TAG, "Error when calling licensing service." + java.lang.String.valueOf(e));
        } catch (android.os.DeadObjectException e2) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service process died.", e2), true, backgroundLicensingServiceEnabled);
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            android.util.Log.d(TAG, "Request to licensing reporting service sent.");
        }
    }

    private void populateInputDataForLicenseCheckV2(android.os.Parcel inputData, android.os.IBinder licensingService) throws android.os.RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        android.os.Bundle bundle = new android.os.Bundle();
        if (customTrialEndTriggered) {
            bundle.putBoolean(EXTRA_END_CUSTOM_TRIAL, true);
        }
        if (!bundle.isEmpty()) {
            inputData.writeInt(1);
            bundle.writeToParcel(inputData, 0);
        } else {
            inputData.writeInt(0);
        }
    }

    private void populateInputDataForReportAutoVerifiedLicense(android.os.Parcel inputData, android.os.IBinder licensingService) throws android.os.RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeInt(0);
    }

    private static com.pairip.licensecheck.ILicenseV2ResultListener createResultListener(com.pairip.licensecheck.LicenseClient client) {
        return new com.pairip.licensecheck.ILicenseV2ResultListener.Stub() { // from class: com.pairip.licensecheck.LicenseClient.2
            @Override // com.pairip.licensecheck.ILicenseV2ResultListener
            public void verifyLicense(int responseCode, android.os.Bundle responsePayload2) {
                com.pairip.licensecheck.LicenseClient.this.processResponse(responseCode, responsePayload2);
            }
        };
    }

    private void retryOrThrow(com.pairip.licensecheck.LicenseCheckException error) {
        retryOrThrow(error, false, false);
    }

    private void retryOrThrow(final com.pairip.licensecheck.LicenseCheckException error, final boolean ignoreErrorOnFinalFailure, final boolean useBackgroundService) {
        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$retryOrThrow$0(useBackgroundService, error, ignoreErrorOnFinalFailure);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryOrThrow$0(final boolean z, com.pairip.licensecheck.LicenseCheckException licenseCheckException, boolean z2) {
        int i = this.retryNum;
        if (i < 3) {
            this.retryNum = i + 1;
            this.delayedTaskExecutor.schedule(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$retryOrThrow$1(z);
                }
            }, 1000L);
            android.util.Log.d(TAG, java.lang.String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", java.lang.Integer.valueOf(this.retryNum), licenseCheckException == null ? "null" : licenseCheckException.getMessage(), 1L));
        } else {
            if (z2) {
                android.util.Log.e(TAG, "Retry limit reached for: " + java.lang.String.valueOf(licenseCheckException));
                return;
            }
            handleError(licenseCheckException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(int responseCode, final android.os.Bundle responsePayload2) {
        try {
            if (responseCode == 3) {
                throw new com.pairip.licensecheck.LicenseCheckException("Request package name invalid.");
            }
            if (responseCode != 0) {
                if (responseCode == 2) {
                    startPaywallActivity((android.app.PendingIntent) responsePayload2.getParcelable(PAYLOAD_PAYWALL));
                    return;
                }
                throw new com.pairip.licensecheck.LicenseCheckException(java.lang.String.format("Unexpected response code %d received.", java.lang.Integer.valueOf(responseCode)));
            }
            com.pairip.licensecheck.LicenseResponseHelper.validateResponse(responsePayload2, packageName);
            android.util.Log.i(TAG, "License check succeeded.");
            final com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata = repeatedCheckEnabled ? com.pairip.licensecheck.LicenseResponseHelper.getRepeatedCheckMetadata(responsePayload2) : null;
            mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$processResponse$0(repeatedCheckMetadata, responsePayload2);
                }
            });
        } catch (com.pairip.licensecheck.LicenseCheckException e) {
            handleError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processResponse$0(com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata, android.os.Bundle bundle) {
        if (repeatedCheckMetadata != null) {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.REPEATED_CHECK_REQUIRED;
            this.repeatedCheckStartElapsedRealtime = getElapsedRealtimeMillis();
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        } else {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.FULL_CHECK_OK;
        }
        responsePayload = bundle;
    }

    private void scheduleRepeatedLicenseCheck(final com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata) {
        long jMin = java.lang.Math.min(java.lang.Math.min(repeatedCheckMetadata.getDurationToRetryMillis(), java.lang.Math.max(0L, repeatedCheckMetadata.getTimeToRetryMillis() - getCurrentTimeMillis())), 300000L);
        if (!this.waitingForRepeatedCheck) {
            this.waitingForRepeatedCheck = true;
            try {
                this.context.unbindService(this);
            } catch (java.lang.RuntimeException e) {
                android.util.Log.e(TAG, "Failed to unbind service for repeated license check.", e);
            }
        }
        this.delayedTaskExecutor.schedule(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleRepeatedLicenseCheck$0(repeatedCheckMetadata);
            }
        }, jMin);
        android.util.Log.d(TAG, java.lang.String.format("Repeated license check is scheduled in %d ms...", java.lang.Long.valueOf(jMin)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleRepeatedLicenseCheck$0(com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata) {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis() - this.repeatedCheckStartElapsedRealtime;
        if (getCurrentTimeMillis() >= repeatedCheckMetadata.getTimeToRetryMillis() || elapsedRealtimeMillis >= repeatedCheckMetadata.getDurationToRetryMillis()) {
            this.waitingForRepeatedCheck = false;
            initiateFreshLicensingServiceConnection(false);
        } else {
            android.util.Log.d(TAG, "Repeated license check is rescheduled.");
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        }
    }

    private void handleError(final com.pairip.licensecheck.LicenseCheckException ex) {
        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$handleError$0(ex);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleError$0(com.pairip.licensecheck.LicenseCheckException licenseCheckException) {
        android.util.Log.e(TAG, "Error while checking license: " + android.util.Log.getStackTraceString(licenseCheckException));
        if (licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.FULL_CHECK_OK)) {
            return;
        }
        startErrorDialogActivity();
    }

    private void startPaywallActivity(android.app.PendingIntent paywallIntent) {
        android.content.Intent intentCreateCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.PAYWALL_INTENT_ARG_NAME, paywallIntent);
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.ACTIVITY_TYPE_ARG_NAME, com.pairip.licensecheck.LicenseActivity.ActivityType.PAYWALL);
        scheduleAppShutdown();
        this.context.startActivity(intentCreateCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        android.content.Intent intentCreateCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.ACTIVITY_TYPE_ARG_NAME, com.pairip.licensecheck.LicenseActivity.ActivityType.ERROR_DIALOG);
        scheduleAppShutdown();
        this.context.startActivity(intentCreateCloseAppIntentOrExitIfAppInBackground);
    }

    private android.content.Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) com.pairip.licensecheck.LicenseActivity.class);
        if (gracefulShutdownEnabled) {
            intent.addFlags(65536);
        } else {
            intent.addFlags(67108864);
            intent.addFlags(32768);
        }
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    protected long getCurrentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    protected long getElapsedRealtimeMillis() {
        return android.os.SystemClock.elapsedRealtime();
    }

    private void scheduleAppShutdown() {
        if (eventualShutdownEnabled) {
            this.delayedTaskExecutor.schedule(exitAction, 30000L);
        }
    }

    private static class DelayedTaskExecutorImpl implements com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor {
        private final android.os.Handler handler;

        private DelayedTaskExecutorImpl() {
            this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }

        @Override // com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor
        public void schedule(java.lang.Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }
}

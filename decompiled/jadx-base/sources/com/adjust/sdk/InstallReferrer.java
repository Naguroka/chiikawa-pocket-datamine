package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class InstallReferrer implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String PACKAGE_BASE_NAME = "com.android.installreferrer.";
    private static final int STATUS_DEVELOPER_ERROR = 3;
    private static final int STATUS_FEATURE_NOT_SUPPORTED = 2;
    private static final int STATUS_OK = 0;
    private static final int STATUS_SERVICE_DISCONNECTED = -1;
    private static final int STATUS_SERVICE_UNAVAILABLE = 1;
    private android.content.Context context;
    private final com.adjust.sdk.InstallReferrerReadListener referrerCallback;
    private java.lang.Object referrerClient;
    private int retryWaitTime = 3000;
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private final java.util.concurrent.atomic.AtomicBoolean shouldTryToRead = new java.util.concurrent.atomic.AtomicBoolean(true);
    private int retries = 0;
    private com.adjust.sdk.scheduler.TimerOnce retryTimer = new com.adjust.sdk.scheduler.TimerOnce(new com.adjust.sdk.InstallReferrer.a(), "InstallReferrer");
    private com.adjust.sdk.scheduler.ThreadExecutor executor = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("InstallReferrer");

    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.InstallReferrer.this.startConnection();
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.Object f83a;
        public final /* synthetic */ java.lang.reflect.Method b;
        public final /* synthetic */ java.lang.Object[] c;

        public b(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            this.f83a = obj;
            this.b = method;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.adjust.sdk.InstallReferrer.this.invokeI(this.f83a, this.b, this.c);
            } catch (java.lang.Throwable th) {
                com.adjust.sdk.InstallReferrer.this.referrerCallback.onFail(com.adjust.sdk.Util.formatString("invoke error (%s) thrown by (%s)", th.getMessage(), th.getClass().getCanonicalName()));
            }
        }
    }

    public InstallReferrer(android.content.Context context, com.adjust.sdk.InstallReferrerReadListener installReferrerReadListener) {
        this.context = context;
        this.referrerCallback = installReferrerReadListener;
    }

    private void closeReferrerClient() {
        java.lang.Object obj = this.referrerClient;
        if (obj == null) {
            return;
        }
        try {
            com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "endConnection", null, new java.lang.Object[0]);
            this.logger.debug("Install Referrer API connection closed", new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            this.logger.error("closeReferrerClient error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
        }
        this.referrerClient = null;
    }

    private java.lang.Object createInstallReferrerClient(android.content.Context context) {
        com.adjust.sdk.InstallReferrerReadListener installReferrerReadListener;
        java.lang.String string;
        try {
            return com.adjust.sdk.Reflection.invokeInstanceMethod(com.adjust.sdk.Reflection.invokeStaticMethod("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new java.lang.Class[]{android.content.Context.class}, context), "build", null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException e) {
            installReferrerReadListener = this.referrerCallback;
            string = com.adjust.sdk.Util.formatString("InstallReferrer not integrated in project (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            installReferrerReadListener.onFail(string);
            return null;
        } catch (java.lang.Exception e2) {
            installReferrerReadListener = this.referrerCallback;
            string = com.adjust.sdk.Util.formatString("createInstallReferrerClient error (%s) from (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            installReferrerReadListener.onFail(string);
            return null;
        }
    }

    private java.lang.Object createProxyInstallReferrerStateListener(java.lang.Class cls) {
        com.adjust.sdk.InstallReferrerReadListener installReferrerReadListener;
        java.lang.String str;
        try {
            return java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, this);
        } catch (java.lang.IllegalArgumentException unused) {
            installReferrerReadListener = this.referrerCallback;
            str = "InstallReferrer proxy violating parameter restrictions";
            installReferrerReadListener.onFail(str);
            return null;
        } catch (java.lang.NullPointerException unused2) {
            installReferrerReadListener = this.referrerCallback;
            str = "Null argument passed to InstallReferrer proxy";
            installReferrerReadListener.onFail(str);
            return null;
        }
    }

    private java.lang.Boolean getBooleanGooglePlayInstantParam(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return java.lang.Boolean.valueOf(((java.lang.Boolean) com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getGooglePlayInstantParam", null, new java.lang.Object[0])).booleanValue());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private long getInstallBeginTimestampSeconds(java.lang.Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((java.lang.Long) com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getInstallBeginTimestampSeconds", null, new java.lang.Object[0])).longValue();
        } catch (java.lang.Exception e) {
            this.logger.error("getInstallBeginTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1L;
        }
    }

    private long getInstallBeginTimestampServerSeconds(java.lang.Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((java.lang.Long) com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getInstallBeginTimestampServerSeconds", null, new java.lang.Object[0])).longValue();
        } catch (java.lang.Exception unused) {
            return -1L;
        }
    }

    private java.lang.Object getInstallReferrer() {
        java.lang.Object obj = this.referrerClient;
        if (obj == null) {
            return null;
        }
        try {
            return com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getInstallReferrer", null, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            this.logger.error("getInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    private java.lang.Class getInstallReferrerStateListenerClass() {
        try {
            return java.lang.Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
        } catch (java.lang.Exception e) {
            this.referrerCallback.onFail(com.adjust.sdk.Util.formatString("getInstallReferrerStateListenerClass error (%s) from (%s)", e.getMessage(), e.getClass().getCanonicalName()));
            return null;
        }
    }

    private long getReferrerClickTimestampSeconds(java.lang.Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((java.lang.Long) com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getReferrerClickTimestampSeconds", null, new java.lang.Object[0])).longValue();
        } catch (java.lang.Exception e) {
            this.logger.error("getReferrerClickTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1L;
        }
    }

    private long getReferrerClickTimestampServerSeconds(java.lang.Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((java.lang.Long) com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getReferrerClickTimestampServerSeconds", null, new java.lang.Object[0])).longValue();
        } catch (java.lang.Exception unused) {
            return -1L;
        }
    }

    private java.lang.String getStringInstallReferrer(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (java.lang.String) com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getInstallReferrer", null, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            this.logger.error("getStringInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    private java.lang.String getStringInstallVersion(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (java.lang.String) com.adjust.sdk.Reflection.invokeInstanceMethod(obj, "getInstallVersion", null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object invokeI(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        com.adjust.sdk.InstallReferrerReadListener installReferrerReadListener;
        java.lang.String string;
        if (method == null) {
            installReferrerReadListener = this.referrerCallback;
            string = "InstallReferrer invoke method null";
        } else {
            java.lang.String name = method.getName();
            if (name != null) {
                this.logger.debug("InstallReferrer invoke method name: %s", name);
                if (objArr == null) {
                    this.logger.warn("InstallReferrer invoke args null", new java.lang.Object[0]);
                    objArr = new java.lang.Object[0];
                }
                for (java.lang.Object obj2 : objArr) {
                    this.logger.debug("InstallReferrer invoke arg: %s", obj2);
                }
                if (name.equals("onInstallReferrerSetupFinished")) {
                    if (objArr.length != 1) {
                        installReferrerReadListener = this.referrerCallback;
                        string = com.adjust.sdk.Util.formatString("InstallReferrer invoke onInstallReferrerSetupFinished args lenght not 1: %d", java.lang.Integer.valueOf(objArr.length));
                    } else {
                        java.lang.Object obj3 = objArr[0];
                        if (obj3 instanceof java.lang.Integer) {
                            java.lang.Integer num = (java.lang.Integer) obj3;
                            if (num == null) {
                                installReferrerReadListener = this.referrerCallback;
                                string = "InstallReferrer invoke onInstallReferrerSetupFinished responseCode arg is null";
                            } else {
                                onInstallReferrerSetupFinishedIntI(num.intValue());
                            }
                        } else {
                            installReferrerReadListener = this.referrerCallback;
                            string = "InstallReferrer invoke onInstallReferrerSetupFinished arg not int";
                        }
                    }
                } else if (name.equals("onInstallReferrerServiceDisconnected")) {
                    this.logger.debug("Connection to install referrer service was lost. Retrying ...", new java.lang.Object[0]);
                    retryI("onInstallReferrerServiceDisconnected");
                } else {
                    this.referrerCallback.onFail(com.adjust.sdk.Util.formatString("Reflection call method name not expected: %s", name));
                }
                return null;
            }
            installReferrerReadListener = this.referrerCallback;
            string = "InstallReferrer invoke method name null";
        }
        installReferrerReadListener.onFail(string);
        return null;
    }

    private void onInstallReferrerSetupFinishedIntI(int i) {
        boolean z = true;
        if (i == -1) {
            this.logger.debug("Play Store service is not connected now. Retrying...", new java.lang.Object[0]);
        } else if (i == 0) {
            try {
                java.lang.Object installReferrer = getInstallReferrer();
                java.lang.String stringInstallReferrer = getStringInstallReferrer(installReferrer);
                long referrerClickTimestampSeconds = getReferrerClickTimestampSeconds(installReferrer);
                long installBeginTimestampSeconds = getInstallBeginTimestampSeconds(installReferrer);
                this.logger.debug("installReferrer: %s, clickTime: %d, installBeginTime: %d", stringInstallReferrer, java.lang.Long.valueOf(referrerClickTimestampSeconds), java.lang.Long.valueOf(installBeginTimestampSeconds));
                java.lang.String stringInstallVersion = getStringInstallVersion(installReferrer);
                long referrerClickTimestampServerSeconds = getReferrerClickTimestampServerSeconds(installReferrer);
                long installBeginTimestampServerSeconds = getInstallBeginTimestampServerSeconds(installReferrer);
                java.lang.Boolean booleanGooglePlayInstantParam = getBooleanGooglePlayInstantParam(installReferrer);
                this.logger.debug("installVersion: %s, clickTimeServer: %d, installBeginServer: %d, googlePlayInstant: %b", stringInstallVersion, java.lang.Long.valueOf(referrerClickTimestampServerSeconds), java.lang.Long.valueOf(installBeginTimestampServerSeconds), booleanGooglePlayInstantParam);
                this.logger.debug("Install Referrer read successfully. Closing connection", new java.lang.Object[0]);
                this.referrerCallback.onInstallReferrerRead(new com.adjust.sdk.ReferrerDetails(stringInstallReferrer, referrerClickTimestampSeconds, installBeginTimestampSeconds, referrerClickTimestampServerSeconds, installBeginTimestampServerSeconds, stringInstallVersion, booleanGooglePlayInstantParam, null), "google");
                z = false;
            } catch (java.lang.Exception e) {
                this.logger.warn("Couldn't get install referrer from client (%s). Retrying...", e.getMessage());
            }
        } else if (i != 1) {
            if (i == 2) {
                this.referrerCallback.onFail("Install Referrer API not supported by the installed Play Store app. Closing connection");
            } else if (i != 3) {
                this.referrerCallback.onFail(com.adjust.sdk.Util.formatString("Unexpected response code of install referrer response: %d. Closing connection", java.lang.Integer.valueOf(i)));
            } else {
                this.logger.debug("Install Referrer API general errors caused by incorrect usage. Retrying...", new java.lang.Object[0]);
            }
            z = false;
        } else {
            this.logger.debug("Could not initiate connection to the Install Referrer service. Retrying...", new java.lang.Object[0]);
        }
        if (z) {
            retryI("end of onInstallReferrerSetupFinishedIntI");
        } else {
            this.shouldTryToRead.set(false);
            closeReferrerClient();
        }
    }

    private void retryI(java.lang.String str) {
        if (!this.shouldTryToRead.get()) {
            this.referrerCallback.onFail(com.adjust.sdk.Util.formatString("Should not try to read Install referrer from %s", str));
            closeReferrerClient();
            return;
        }
        if (this.retries + 1 > 2) {
            this.referrerCallback.onFail(com.adjust.sdk.Util.formatString("Limit number of retry of %d for install referrer surpassed from %s", 2, str));
            return;
        }
        long fireIn = this.retryTimer.getFireIn();
        if (fireIn > 0) {
            this.logger.debug("Already waiting to retry to read install referrer in %d milliseconds", java.lang.Long.valueOf(fireIn));
            return;
        }
        int i = this.retries + 1;
        this.retries = i;
        this.logger.debug("Retry number %d to connect to install referrer API", java.lang.Integer.valueOf(i));
        this.retryTimer.startIn(this.retryWaitTime);
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        this.executor.submit(new com.adjust.sdk.InstallReferrer.b(obj, method, objArr));
        return null;
    }

    public void startConnection() {
        java.lang.Class installReferrerStateListenerClass;
        java.lang.Object objCreateProxyInstallReferrerStateListener;
        com.adjust.sdk.InstallReferrerReadListener installReferrerReadListener;
        java.lang.String str;
        if (com.adjust.sdk.AdjustFactory.getTryInstallReferrer()) {
            closeReferrerClient();
            if (this.shouldTryToRead.get()) {
                android.content.Context context = this.context;
                if (context != null) {
                    java.lang.Object objCreateInstallReferrerClient = createInstallReferrerClient(context);
                    this.referrerClient = objCreateInstallReferrerClient;
                    if (objCreateInstallReferrerClient == null || (installReferrerStateListenerClass = getInstallReferrerStateListenerClass()) == null || (objCreateProxyInstallReferrerStateListener = createProxyInstallReferrerStateListener(installReferrerStateListenerClass)) == null) {
                        return;
                    }
                    startConnection(installReferrerStateListenerClass, objCreateProxyInstallReferrerStateListener);
                    return;
                }
                installReferrerReadListener = this.referrerCallback;
                str = "Requires context to read the install referrer";
            } else {
                installReferrerReadListener = this.referrerCallback;
                str = "Should not try to read the install referrer any longer";
            }
        } else {
            installReferrerReadListener = this.referrerCallback;
            str = "Sdk has been configured to not try install referrer";
        }
        installReferrerReadListener.onFail(str);
    }

    private void startConnection(java.lang.Class cls, java.lang.Object obj) {
        com.adjust.sdk.InstallReferrerReadListener installReferrerReadListener;
        java.lang.String string;
        try {
            com.adjust.sdk.Reflection.invokeInstanceMethod(this.referrerClient, "startConnection", new java.lang.Class[]{cls}, obj);
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (!com.adjust.sdk.Util.hasRootCause(e)) {
                this.referrerCallback.onFail("InstallReferrer encountered an InvocationTargetException");
                return;
            }
            installReferrerReadListener = this.referrerCallback;
            string = com.adjust.sdk.Util.formatString("InstallReferrer encountered an InvocationTargetException %s", com.adjust.sdk.Util.getRootCause(e));
            installReferrerReadListener.onFail(string);
        } catch (java.lang.Exception e2) {
            installReferrerReadListener = this.referrerCallback;
            string = com.adjust.sdk.Util.formatString("startConnection error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            installReferrerReadListener.onFail(string);
        }
    }
}

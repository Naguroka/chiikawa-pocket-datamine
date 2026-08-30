package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class UnityPlayer extends android.widget.FrameLayout implements com.unity3d.player.IUnityPlayerLifecycleEvents {
    private static final java.lang.String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final java.lang.String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final java.lang.String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final int RUN_STATE_CHANGED_MSG_CODE = 2269;
    private static final java.lang.String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final java.lang.String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static android.app.Activity currentActivity;
    public static android.content.Context currentContext;
    private android.app.Activity mActivity;
    private android.content.Context mContext;
    private com.unity3d.player.C1716i0 mGlView;
    android.os.Handler mHandler;
    private int mInitialScreenOrientation;
    private boolean mIsFullscreen;
    private boolean mMainDisplayOverride;
    private int mNaturalOrientation;
    private com.unity3d.player.E mOnHandleFocusListener;
    private android.view.OrientationEventListener mOrientationListener;
    private boolean mProcessKillRequested;
    private boolean mQuitting;
    com.unity3d.player.S mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private com.unity3d.player.W0 mState;
    private com.unity3d.player.i1 mVideoPlayerProxy;
    private com.unity3d.player.GoogleARCoreApi m_ARCoreApi;
    private boolean m_AddPhoneCallListener;
    private com.unity3d.player.AudioVolumeHandler m_AudioVolumeHandler;
    private com.unity3d.player.Camera2Wrapper m_Camera2Wrapper;
    private android.content.ClipboardManager m_ClipboardManager;
    private final java.util.concurrent.ConcurrentLinkedQueue m_Events;
    private com.unity3d.player.Q0 m_FakeListener;
    private com.unity3d.player.HFPStatus m_HFPStatus;
    private int m_IsNoWindowMode;
    com.unity3d.player.U0 m_MainThread;
    private com.unity3d.player.NetworkConnectivity m_NetworkConnectivity;
    private com.unity3d.player.C m_OnBackPressedDispatcher;
    private com.unity3d.player.OrientationLockListener m_OrientationLockListener;
    private com.unity3d.player.R0 m_PhoneCallListener;
    private com.unity3d.player.a.f m_SplashScreen;
    private android.telephony.TelephonyManager m_TelephonyManager;
    private com.unity3d.player.IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    android.view.Window m_Window;
    private android.net.Uri m_launchUri;
    private android.content.res.Configuration prevConfig;

    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);

        private int m_TimeoutMilliseconds = 2000;
        final int value;

        SynchronizationTimeout(int i) {
            this.value = i;
        }

        public static void setTimeoutForAll(int i) {
            for (com.unity3d.player.UnityPlayer.SynchronizationTimeout synchronizationTimeout : (com.unity3d.player.UnityPlayer.SynchronizationTimeout[]) com.unity3d.player.UnityPlayer.SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }

        public void setTimeout(int i) {
            this.m_TimeoutMilliseconds = i;
        }
    }

    static {
        new com.unity3d.player.C1712g0().a();
    }

    public UnityPlayer(android.content.Context context) {
        this(context, null);
    }

    public UnityPlayer(android.content.Context context, com.unity3d.player.IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        super(context);
        this.mHandler = new android.os.Handler();
        this.mInitialScreenOrientation = -1;
        this.mMainDisplayOverride = false;
        this.mIsFullscreen = true;
        this.mState = new com.unity3d.player.W0();
        this.m_Events = new java.util.concurrent.ConcurrentLinkedQueue();
        this.mOrientationListener = null;
        this.m_MainThread = new com.unity3d.player.U0(this);
        this.m_AddPhoneCallListener = false;
        this.m_PhoneCallListener = new com.unity3d.player.R0(this);
        this.m_ARCoreApi = null;
        this.m_FakeListener = new com.unity3d.player.Q0();
        this.m_Camera2Wrapper = null;
        this.m_HFPStatus = null;
        this.m_AudioVolumeHandler = null;
        this.m_OrientationLockListener = null;
        this.m_launchUri = null;
        this.m_NetworkConnectivity = null;
        this.m_OnBackPressedDispatcher = null;
        this.m_UnityPlayerLifecycleEvents = null;
        this.m_IsNoWindowMode = -1;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        this.mProcessKillRequested = true;
        this.mSoftInput = null;
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents == null ? this : iUnityPlayerLifecycleEvents;
        com.unity3d.player.C1712g0.a(getUnityNativeLibraryPath(context));
        currentContext = context;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            this.mActivity = activity;
            currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
            this.m_launchUri = this.mActivity.getIntent().getData();
        }
        this.mContext = context;
        EarlyEnableFullScreenIfEnabled();
        android.content.res.Configuration configuration = getResources().getConfiguration();
        this.prevConfig = configuration;
        this.mNaturalOrientation = getNaturalOrientation(configuration.orientation);
        if (this.mActivity != null && getSplashEnabled()) {
            com.unity3d.player.a.f fVar = new com.unity3d.player.a.f(this.mContext, com.unity3d.player.a.e.a()[getSplashMode()]);
            this.m_SplashScreen = fVar;
            addView(fVar);
        }
        preloadJavaPlugins();
        java.lang.String strLoadNative = loadNative(getUnityNativeLibraryPath(this.mContext));
        if (!com.unity3d.player.W0.d()) {
            com.unity3d.player.AbstractC1749z.Log(6, "Your hardware does not support this application.");
            android.app.AlertDialog alertDialogCreate = new android.app.AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new com.unity3d.player.DialogInterfaceOnClickListenerC1744w0(this)).setMessage("Your hardware does not support this application.\n\n" + strLoadNative + "\n\n Press OK to quit.").create();
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.show();
            return;
        }
        initJni(context);
        this.mState.d(true);
        com.unity3d.player.C1716i0 c1716i0 = new com.unity3d.player.C1716i0(context, this);
        this.mGlView = c1716i0;
        addView(c1716i0);
        bringChildToFront(this.m_SplashScreen);
        this.mQuitting = false;
        android.app.Activity activity2 = this.mActivity;
        if (activity2 != null) {
            this.m_Window = activity2.getWindow();
        }
        hideStatusBar();
        this.m_TelephonyManager = (android.telephony.TelephonyManager) this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (android.content.ClipboardManager) this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new com.unity3d.player.Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new com.unity3d.player.HFPStatus(this.mContext);
        this.m_MainThread.start();
        this.m_OnBackPressedDispatcher = com.unity3d.player.D.a(this.mActivity, 1, new com.unity3d.player.H0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DisableStaticSplashScreen() {
        runOnUiThread(new com.unity3d.player.J0(this));
    }

    private void EarlyEnableFullScreenIfEnabled() {
        android.view.View decorView;
        android.app.Activity activity = this.mActivity;
        if (activity != null && activity.getWindow() != null && ((getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false)) && (decorView = this.mActivity.getWindow().getDecorView()) != null)) {
            decorView.setSystemUiVisibility(7);
        }
        com.unity3d.player.AbstractC1745x.a(this.mActivity);
    }

    private java.lang.String GetGlViewContentDescription(android.content.Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, context.getPackageName()));
    }

    private boolean IsWindowTranslucent() {
        android.app.Activity activity = this.mActivity;
        if (activity == null) {
            return false;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static void UnitySendMessage(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!com.unity3d.player.W0.d()) {
            com.unity3d.player.AbstractC1749z.Log(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
        } else {
            try {
                nativeUnitySendMessage(str, str2, str3.getBytes(com.adjust.sdk.Constants.ENCODING));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
    }

    private void checkResumePlayer() {
        android.app.Activity activity = this.mActivity;
        if (this.mState.a(activity != null ? com.unity3d.player.MultiWindowSupport.isInMultiWindowMode(activity) : false)) {
            this.mState.c(true);
            queueGLThreadEvent(new com.unity3d.player.RunnableC1720k0(this));
            this.m_MainThread.a(com.unity3d.player.S0.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSoftInput() {
        com.unity3d.player.S s = this.mSoftInput;
        if (s != null) {
            s.c();
            nativeReportKeyboardConfigChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        android.app.Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.finish();
    }

    private boolean getARCoreEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(ARCORE_ENABLE_METADATA_NAME);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private android.content.pm.ActivityInfo getActivityInfo() {
        return this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
    }

    private android.content.pm.ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getAutoReportFullyDrawnEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    private boolean getLaunchFullscreen() {
        try {
            return getApplicationInfo().metaData.getBoolean(LAUNCH_FULLSCREEN);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private int getNaturalOrientation(int i) {
        int rotation = ((android.view.WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && i == 2) {
            return 0;
        }
        return ((rotation == 1 || rotation == 3) && i == 1) ? 0 : 1;
    }

    private java.lang.String getProcessName() {
        int iMyPid = android.os.Process.myPid();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    private long getSoftInputTimeout() {
        return java.lang.Math.round(this.mSoftInputTimeoutMilliSeconds * ((double) java.lang.Math.max(1.0f, android.provider.Settings.System.getFloat(this.mContext.getContentResolver(), "animator_duration_scale", 0.0f))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getSplashEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(SPLASH_ENABLE_METADATA_NAME);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static java.lang.String getUnityNativeLibraryPath(android.content.Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    private void hidePreservedContent() {
        runOnUiThread(new com.unity3d.player.RunnableC1726n0(this));
    }

    private void hideStatusBar() {
        android.app.Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    private final native void initJni(android.content.Context context);

    private static java.lang.String loadNative(java.lang.String str) {
        java.lang.String str2 = str + "/libmain.so";
        try {
            try {
                try {
                    java.lang.System.load(str2);
                } catch (java.lang.SecurityException e) {
                    return logLoadLibMainError(str2, e.toString());
                }
            } catch (java.lang.UnsatisfiedLinkError e2) {
                return logLoadLibMainError(str2, e2.toString());
            }
        } catch (java.lang.UnsatisfiedLinkError unused) {
            java.lang.System.loadLibrary(com.ironsource.y8.h.Z);
        }
        if (com.unity3d.player.NativeLoader.load(str)) {
            com.unity3d.player.W0.e();
            return "";
        }
        com.unity3d.player.AbstractC1749z.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
        return "NativeLoader.load failure, Unity libraries were not loaded.";
    }

    private static java.lang.String logLoadLibMainError(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "Failed to load 'libmain.so'\n\n" + str2;
        com.unity3d.player.AbstractC1749z.Log(6, str3);
        return str3;
    }

    private final native void nativeApplicationUnload();

    private final native boolean nativeDone();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeFocusChanged(boolean z);

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeHidePreservedContent();

    private final native boolean nativeInjectEvent(android.view.InputEvent inputEvent, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeIsAutorotationOn();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeLowMemory();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeMuteMasterAudio(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOrientationChanged(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i, android.view.Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeRender();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetLaunchURL(java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    private static native void nativeUnitySendMessage(java.lang.String str, java.lang.String str2, byte[] bArr);

    private void pauseUnity() {
        reportSoftInputStr(null, 1, true);
        com.unity3d.player.C c = this.m_OnBackPressedDispatcher;
        if (c != null) {
            c.c = c.f3860a != null;
            c.unregisterOnBackPressedCallback();
        }
        if (!this.mState.c() || this.mState.b()) {
            return;
        }
        if (com.unity3d.player.W0.d()) {
            java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
            java.lang.Runnable o0 = isFinishing() ? new com.unity3d.player.O0(this, semaphore) : new com.unity3d.player.P0(this, semaphore);
            com.unity3d.player.U0 u0 = this.m_MainThread;
            if (u0.f3897a != null) {
                u0.a(com.unity3d.player.S0.f3893a);
                android.os.Message.obtain(u0.f3897a, o0).sendToTarget();
            }
            try {
                com.unity3d.player.UnityPlayer.SynchronizationTimeout synchronizationTimeout = com.unity3d.player.UnityPlayer.SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    com.unity3d.player.AbstractC1749z.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            } catch (java.lang.InterruptedException unused) {
                com.unity3d.player.AbstractC1749z.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        this.mState.c(false);
        this.mState.e(true);
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    private static void preloadJavaPlugins() {
        try {
            java.lang.Class.forName("com.unity3d.JavaPluginPreloader");
        } catch (java.lang.ClassNotFoundException unused) {
        } catch (java.lang.LinkageError e) {
            com.unity3d.player.AbstractC1749z.Log(6, "Java class preloading failed: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueDestroy() {
        com.unity3d.player.AbstractC1749z.Log(4, "Queue Destroy");
        runOnUiThread(new com.unity3d.player.N0(this));
    }

    private void queueGLThreadEvent(com.unity3d.player.V0 v0) {
        if (isFinishing()) {
            return;
        }
        queueGLThreadEvent((java.lang.Runnable) v0);
    }

    private void raiseFocusListener(boolean z) {
        com.unity3d.player.E e = this.mOnHandleFocusListener;
        if (e != null) {
            com.unity3d.player.RunnableC1732q0 runnableC1732q0 = ((com.unity3d.player.C1728o0) e).f3940a;
            runnableC1732q0.b = true;
            if (runnableC1732q0.f3943a) {
                runnableC1732q0.c.release();
            }
        }
    }

    private void setBackButtonLeavesApp(boolean z) {
        com.unity3d.player.C c = this.m_OnBackPressedDispatcher;
        if (c != null) {
            if (!z) {
                c.registerOnBackPressedCallback();
            } else {
                c.unregisterOnBackPressedCallback();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.mProcessKillRequested = nativeDone();
        this.mState.d(false);
    }

    private void startActivityIndicator(int i) {
        postOnUiThread(new com.unity3d.player.G0(this, i));
    }

    private void stopActivityIndicator() {
        postOnUiThread(new com.unity3d.player.I0());
    }

    private void swapViews(android.view.View view, android.view.View view2) {
        boolean z;
        if (this.mState.b()) {
            z = false;
        } else {
            setupUnityToBePaused();
            z = true;
        }
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (!(parent instanceof com.unity3d.player.UnityPlayer) || ((com.unity3d.player.UnityPlayer) parent) != this) {
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(view);
                }
                addView(view);
                bringChildToFront(view);
                view.setVisibility(0);
            }
        }
        if (view2 != null && view2.getParent() == this) {
            view2.setVisibility(8);
            removeView(view2);
        }
        if (z) {
            setupUnityToBeResumed();
        }
    }

    private static void unloadNative() {
        if (com.unity3d.player.W0.d()) {
            if (!com.unity3d.player.NativeLoader.unload()) {
                throw new java.lang.UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
            }
            com.unity3d.player.W0.f();
        }
    }

    private boolean updateDisplayInternal(int i, android.view.Surface surface) {
        if (!com.unity3d.player.W0.d() || !this.mState.a()) {
            return false;
        }
        java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
        com.unity3d.player.L0 l0 = new com.unity3d.player.L0(this, i, surface, semaphore);
        if (i == 0) {
            com.unity3d.player.U0 u0 = this.m_MainThread;
            android.os.Handler handler = u0.f3897a;
            if (surface == null) {
                if (handler != null) {
                    u0.a(com.unity3d.player.S0.d);
                    android.os.Message.obtain(u0.f3897a, l0).sendToTarget();
                }
            } else if (handler != null) {
                android.os.Message.obtain(handler, l0).sendToTarget();
                u0.a(com.unity3d.player.S0.e);
            }
        } else {
            l0.run();
        }
        if (surface != null || i != 0) {
            return true;
        }
        try {
            com.unity3d.player.UnityPlayer.SynchronizationTimeout synchronizationTimeout = com.unity3d.player.UnityPlayer.SynchronizationTimeout.SurfaceDetach;
            if (semaphore.tryAcquire(synchronizationTimeout.getTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return true;
            }
            com.unity3d.player.AbstractC1749z.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
            return true;
        } catch (java.lang.InterruptedException unused) {
            com.unity3d.player.AbstractC1749z.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    protected void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
    }

    public boolean addViewToPlayer(android.view.View view, boolean z) {
        swapViews(view, z ? this.mGlView : null);
        boolean z2 = true;
        boolean z3 = view.getParent() == this;
        boolean z4 = z && this.mGlView.getParent() == null;
        boolean z5 = this.mGlView.getParent() == this;
        if (!z3 || (!z4 && !z5)) {
            z2 = false;
        }
        if (!z2) {
            if (!z3) {
                com.unity3d.player.AbstractC1749z.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z4 && !z5) {
                com.unity3d.player.AbstractC1749z.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z2;
    }

    public void configurationChanged(android.content.res.Configuration configuration) {
        int iDiff = this.prevConfig.diff(configuration);
        if ((iDiff & 256) != 0 || (iDiff & 1024) != 0 || (iDiff & 2048) != 0 || (iDiff & 128) != 0) {
            nativeHidePreservedContent();
        }
        this.prevConfig = new android.content.res.Configuration(configuration);
        com.unity3d.player.i1 i1Var = this.mVideoPlayerProxy;
        if (i1Var != null) {
            i1Var.a();
        }
    }

    public void destroy() {
        com.unity3d.player.Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.a();
            this.m_Camera2Wrapper = null;
        }
        com.unity3d.player.HFPStatus hFPStatus = this.m_HFPStatus;
        if (hFPStatus != null) {
            hFPStatus.b();
            this.m_HFPStatus = null;
        }
        com.unity3d.player.NetworkConnectivity networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            networkConnectivity.a();
            this.m_NetworkConnectivity = null;
        }
        com.unity3d.player.C c = this.m_OnBackPressedDispatcher;
        if (c != null) {
            c.unregisterOnBackPressedCallback();
            this.m_OnBackPressedDispatcher = null;
        }
        this.mQuitting = true;
        if (!this.mState.b()) {
            setupUnityToBePaused();
        }
        this.m_MainThread.a(com.unity3d.player.S0.c);
        try {
            this.m_MainThread.join(com.unity3d.player.UnityPlayer.SynchronizationTimeout.Destroy.getTimeout());
        } catch (java.lang.InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (com.unity3d.player.W0.d()) {
            removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
        unloadNative();
    }

    protected void disableLogger() {
        com.unity3d.player.AbstractC1749z.f3955a = true;
    }

    public boolean displayChanged(int i, android.view.Surface surface) {
        if (i == 0) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new com.unity3d.player.M0(this));
        }
        return updateDisplayInternal(i, surface);
    }

    protected void executeGLThreadJobs() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.m_Events.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    android.app.Activity getActivity() {
        return this.mActivity;
    }

    protected java.lang.String getClipboardText() {
        android.content.ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        return primaryClip != null ? primaryClip.getItemAt(0).coerceToText(this.mContext).toString() : "";
    }

    protected java.lang.String getKeyboardLayout() {
        com.unity3d.player.S s = this.mSoftInput;
        if (s == null) {
            return null;
        }
        return s.a();
    }

    protected java.lang.String getLaunchURL() {
        android.net.Uri uri = this.m_launchUri;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    protected int getNetworkConnectivity() {
        com.unity3d.player.NetworkConnectivity networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            return networkConnectivity.b();
        }
        this.m_NetworkConnectivity = com.unity3d.player.PlatformSupport.NOUGAT_SUPPORT ? new com.unity3d.player.NetworkConnectivityNougat(this.mContext) : new com.unity3d.player.NetworkConnectivity(this.mContext);
        return this.m_NetworkConnectivity.b();
    }

    public java.lang.String getNetworkProxySettings(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        if (!str.startsWith("http:")) {
            if (str.startsWith("https:")) {
                str2 = "https.proxyHost";
                str3 = "https.proxyPort";
            }
            return null;
        }
        str2 = "http.proxyHost";
        str3 = "http.proxyPort";
        java.lang.String property = java.lang.System.getProperties().getProperty(str2);
        if (property != null && !"".equals(property)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(property);
            java.lang.String property2 = java.lang.System.getProperties().getProperty(str3);
            if (property2 != null && !"".equals(property2)) {
                sb.append(":").append(property2);
            }
            java.lang.String property3 = java.lang.System.getProperties().getProperty("http.nonProxyHosts");
            if (property3 != null && !"".equals(property3)) {
                sb.append('\n').append(property3);
            }
            return sb.toString();
        }
        return null;
    }

    public float getScreenBrightness() {
        android.view.Window window = this.m_Window;
        if (window == null) {
            return 1.0f;
        }
        float f = window.getAttributes().screenBrightness;
        if (f >= 0.0f) {
            return f;
        }
        int i = android.provider.Settings.System.getInt(getContext().getContentResolver(), "screen_brightness", 255);
        return com.unity3d.player.PlatformSupport.PIE_SUPPORT ? (float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, ((java.lang.Math.log(i) * 19.811d) - 9.411d) / 100.0d)) : i / 255.0f;
    }

    public android.os.Bundle getSettings() {
        return android.os.Bundle.EMPTY;
    }

    protected int getSplashMode() {
        try {
            return getApplicationInfo().metaData.getInt(SPLASH_MODE_METADATA_NAME);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    protected int getUaaLLaunchProcessType() {
        java.lang.String processName = getProcessName();
        return (processName == null || processName.equals(this.mContext.getPackageName())) ? 0 : 1;
    }

    public android.view.View getView() {
        return this;
    }

    protected void hideSoftInput() {
        if (this.mSoftInput == null) {
            return;
        }
        reportSoftInputArea(new android.graphics.Rect());
        reportSoftInputIsVisible(false);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            dismissSoftInput();
            this.mSoftInput = null;
            return;
        }
        java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
        postOnUiThread(new com.unity3d.player.RunnableC1732q0(this, semaphore, this));
        try {
            try {
                if (!semaphore.tryAcquire(getSoftInputTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    com.unity3d.player.AbstractC1749z.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
                }
            } catch (java.lang.InterruptedException unused) {
                com.unity3d.player.AbstractC1749z.Log(6, "UI thread got interrupted while waiting softinput hiding operation.");
            }
        } finally {
            this.mSoftInput = null;
        }
    }

    public void init(int i, boolean z) {
    }

    protected boolean initializeGoogleAr() {
        if (this.m_ARCoreApi != null || this.mActivity == null || !getARCoreEnabled()) {
            return false;
        }
        com.unity3d.player.GoogleARCoreApi googleARCoreApi = new com.unity3d.player.GoogleARCoreApi();
        this.m_ARCoreApi = googleARCoreApi;
        googleARCoreApi.initializeARCore(this.mActivity);
        if (this.mState.b()) {
            return false;
        }
        this.m_ARCoreApi.resumeARCore();
        return false;
    }

    public boolean injectEvent(android.view.InputEvent inputEvent) {
        return injectEvent(inputEvent, 0);
    }

    public boolean injectEvent(android.view.InputEvent inputEvent, int i) {
        if (com.unity3d.player.W0.d()) {
            return nativeInjectEvent(inputEvent, i);
        }
        return false;
    }

    protected boolean isFinishing() {
        if (this.mQuitting) {
            return true;
        }
        android.app.Activity activity = this.mActivity;
        if (activity != null) {
            this.mQuitting = activity.isFinishing();
        }
        return this.mQuitting;
    }

    protected boolean isUaaLUseCase() {
        java.lang.String callingPackage;
        android.app.Activity activity = this.mActivity;
        return (activity == null || (callingPackage = activity.getCallingPackage()) == null || !callingPackage.equals(this.mContext.getPackageName())) ? false : true;
    }

    protected void kill() {
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    protected boolean loadLibrary(java.lang.String str) {
        try {
            java.lang.System.loadLibrary(str);
            return true;
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public void lowMemory() {
        if (com.unity3d.player.W0.d()) {
            queueGLThreadEvent(new com.unity3d.player.RunnableC1718j0(this));
        }
    }

    public void newIntent(android.content.Intent intent) {
        this.m_launchUri = intent.getData();
        this.m_MainThread.a(com.unity3d.player.S0.i);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (this.mGlView.c()) {
            return false;
        }
        return injectEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, android.view.KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, android.view.KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    public void onPause() {
        com.unity3d.player.MultiWindowSupport.saveMultiWindowMode(this.mActivity);
        if (com.unity3d.player.MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBePaused();
    }

    public void onResume() {
        if (!com.unity3d.player.MultiWindowSupport.isInMultiWindowMode(this.mActivity) || com.unity3d.player.MultiWindowSupport.isMultiWindowModeChangedToTrue(this.mActivity)) {
            setupUnityToBeResumed();
        }
    }

    public void onStart() {
        if (com.unity3d.player.MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            setupUnityToBeResumed();
        }
    }

    public void onStop() {
        if (com.unity3d.player.MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            setupUnityToBePaused();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.mGlView.c()) {
            return false;
        }
        return injectEvent(motionEvent);
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    public void pause() {
        setupUnityToBePaused();
    }

    protected void pauseJavaAndCallUnloadCallback() {
        runOnUiThread(new com.unity3d.player.C0(this));
    }

    void postOnUiThread(java.lang.Runnable runnable) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
    }

    void queueGLThreadEvent(java.lang.Runnable runnable) {
        if (com.unity3d.player.W0.d()) {
            if (java.lang.Thread.currentThread() == this.m_MainThread) {
                runnable.run();
            } else {
                this.m_Events.add(runnable);
            }
        }
    }

    public void quit() {
        destroy();
    }

    public void removeViewFromPlayer(android.view.View view) {
        swapViews(this.mGlView, view);
        boolean z = view.getParent() == null;
        boolean z2 = this.mGlView.getParent() == this;
        if (z && z2) {
            return;
        }
        if (!z) {
            com.unity3d.player.AbstractC1749z.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
        }
        if (z2) {
            return;
        }
        com.unity3d.player.AbstractC1749z.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
    }

    public void reportError(java.lang.String str, java.lang.String str2) {
        com.unity3d.player.AbstractC1749z.Log(6, str + ": " + str2);
    }

    protected void reportSoftInputArea(android.graphics.Rect rect) {
        queueGLThreadEvent((com.unity3d.player.V0) new com.unity3d.player.C1748y0(this, rect));
    }

    protected void reportSoftInputIsVisible(boolean z) {
        queueGLThreadEvent((com.unity3d.player.V0) new com.unity3d.player.C1750z0(this, z));
    }

    protected void reportSoftInputSelection(int i, int i2) {
        queueGLThreadEvent((com.unity3d.player.V0) new com.unity3d.player.C1746x0(this, i, i2));
    }

    protected void reportSoftInputStr(java.lang.String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        queueGLThreadEvent((com.unity3d.player.V0) new com.unity3d.player.C1742v0(this, z, str, i));
    }

    protected void requestUserAuthorization(java.lang.String str) {
        if (str == null || str.isEmpty() || this.mActivity == null) {
            return;
        }
        com.unity3d.player.UnityPermissions.ModalWaitForPermissionResponse modalWaitForPermissionResponse = new com.unity3d.player.UnityPermissions.ModalWaitForPermissionResponse();
        com.unity3d.player.UnityPermissions.requestUserPermissions(this.mActivity, new java.lang.String[]{str}, modalWaitForPermissionResponse);
        modalWaitForPermissionResponse.waitForResponse();
    }

    public void resume() {
        setupUnityToBeResumed();
    }

    void runOnAnonymousThread(java.lang.Runnable runnable) {
        new java.lang.Thread(runnable).start();
    }

    void runOnUiThread(java.lang.Runnable runnable) {
        android.app.Activity activity = this.mActivity;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    void sendSurfaceChangedEvent() {
        if (com.unity3d.player.W0.d() && this.mState.a()) {
            com.unity3d.player.K0 k0 = new com.unity3d.player.K0(this);
            android.os.Handler handler = this.m_MainThread.f3897a;
            if (handler != null) {
                android.os.Message.obtain(handler, k0).sendToTarget();
            }
        }
    }

    protected void setCharacterLimit(int i) {
        runOnUiThread(new com.unity3d.player.RunnableC1736s0(this, i));
    }

    protected void setClipboardText(java.lang.String str) {
        this.m_ClipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("Text", str));
    }

    protected void setHideInputField(boolean z) {
        runOnUiThread(new com.unity3d.player.RunnableC1738t0(this, z));
    }

    public void setMainSurfaceViewAspectRatio(float f) {
        if (this.mGlView != null) {
            runOnUiThread(new com.unity3d.player.E0(this, f));
        }
    }

    public void setOnHandleFocusListener(com.unity3d.player.E e) {
        this.mOnHandleFocusListener = e;
    }

    public void setScreenBrightness(float f) {
        float fMax = java.lang.Math.max(0.04f, f);
        if (this.m_Window == null || getScreenBrightness() == fMax) {
            return;
        }
        runOnUiThread(new com.unity3d.player.F0(this, fMax));
    }

    protected void setSelection(int i, int i2) {
        runOnUiThread(new com.unity3d.player.RunnableC1740u0(this, i, i2));
    }

    protected void setSoftInputStr(java.lang.String str) {
        runOnUiThread(new com.unity3d.player.RunnableC1734r0(this, str));
    }

    protected void setupUnityToBePaused() {
        com.unity3d.player.GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        com.unity3d.player.i1 i1Var = this.mVideoPlayerProxy;
        if (i1Var != null) {
            i1Var.b();
        }
        com.unity3d.player.AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            audioVolumeHandler.a();
            this.m_AudioVolumeHandler = null;
        }
        com.unity3d.player.OrientationLockListener orientationLockListener = this.m_OrientationLockListener;
        if (orientationLockListener != null) {
            orientationLockListener.a();
            this.m_OrientationLockListener = null;
        }
        pauseUnity();
    }

    protected void setupUnityToBeResumed() {
        com.unity3d.player.GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.mState.e(false);
        com.unity3d.player.i1 i1Var = this.mVideoPlayerProxy;
        if (i1Var != null) {
            i1Var.c();
        }
        checkResumePlayer();
        if (this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new com.unity3d.player.AudioVolumeHandler(this.mContext);
        }
        if (this.m_OrientationLockListener == null && com.unity3d.player.W0.d()) {
            this.m_OrientationLockListener = new com.unity3d.player.OrientationLockListener(this.mContext);
        }
        com.unity3d.player.C c = this.m_OnBackPressedDispatcher;
        if (c != null && c.c) {
            c.registerOnBackPressedCallback();
        }
        this.prevConfig = getResources().getConfiguration();
    }

    protected void showSoftInput(java.lang.String str, int i, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str2, int i2, boolean z5, boolean z6) {
        java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
        postOnUiThread(new com.unity3d.player.RunnableC1724m0(this, this, str, i, z, z2, z3, z4, str2, i2, z5, z6, semaphore));
        try {
            if (semaphore.tryAcquire(getSoftInputTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return;
            }
            com.unity3d.player.AbstractC1749z.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
        } catch (java.lang.InterruptedException unused) {
            com.unity3d.player.AbstractC1749z.Log(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }

    protected boolean showVideoPlayer(java.lang.String str, int i, int i2, int i3, boolean z, int i4, int i5) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new com.unity3d.player.i1(this);
        }
        boolean zA = this.mVideoPlayerProxy.a(this.mContext, str, i, i2, i3, z, i4, i5, new com.unity3d.player.A0(this));
        if (zA) {
            runOnUiThread(new com.unity3d.player.B0(this));
        }
        return zA;
    }

    protected boolean skipPermissionsDialog() {
        android.app.Activity activity = this.mActivity;
        if (activity != null) {
            return com.unity3d.player.UnityPermissions.skipPermissionsDialog(activity);
        }
        return false;
    }

    public boolean startOrientationListener(int i) {
        java.lang.String str;
        if (this.mOrientationListener != null) {
            str = "Orientation Listener already started.";
        } else {
            com.unity3d.player.D0 d0 = new com.unity3d.player.D0(this, this.mContext, i);
            this.mOrientationListener = d0;
            if (d0.canDetectOrientation()) {
                this.mOrientationListener.enable();
                return true;
            }
            str = "Orientation Listener cannot detect orientation.";
        }
        com.unity3d.player.AbstractC1749z.Log(5, str);
        return false;
    }

    public boolean stopOrientationListener() {
        android.view.OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            com.unity3d.player.AbstractC1749z.Log(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        return true;
    }

    protected void toggleGyroscopeSensor(boolean z) {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.mContext.getSystemService("sensor");
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z) {
            sensorManager.registerListener(this.m_FakeListener, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.m_FakeListener);
        }
    }

    public void unload() {
        nativeApplicationUnload();
    }

    void updateGLDisplay(int i, android.view.Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i, surface);
    }

    public void windowFocusChanged(boolean z) {
        com.unity3d.player.S s;
        this.mState.b(z);
        if (!this.mState.a() || ((s = this.mSoftInput) != null && !s.d())) {
            raiseFocusListener(z);
            return;
        }
        this.m_MainThread.a(z ? com.unity3d.player.S0.g : com.unity3d.player.S0.f);
        raiseFocusListener(z);
        checkResumePlayer();
    }
}

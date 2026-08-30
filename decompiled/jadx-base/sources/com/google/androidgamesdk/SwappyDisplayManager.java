package com.google.androidgamesdk;

/* JADX INFO: loaded from: classes5.dex */
public class SwappyDisplayManager implements android.hardware.display.DisplayManager.DisplayListener {
    private android.app.Activity mActivity;
    private long mCookie;
    private android.view.Display.Mode mCurrentMode;
    private com.google.androidgamesdk.d mLooper;
    private android.view.WindowManager mWindowManager;
    private final java.lang.String LOG_TAG = "SwappyDisplayManager";
    private final boolean DEBUG = false;
    private final long ONE_MS_IN_NS = 1000000;
    private final long ONE_S_IN_NS = androidx.media3.common.C.NANOS_PER_SECOND;

    public SwappyDisplayManager(long j, android.app.Activity activity) {
        java.lang.String string;
        try {
            android.os.Bundle bundle = activity.getPackageManager().getActivityInfo(activity.getIntent().getComponent(), 128).metaData;
            if (bundle != null && (string = bundle.getString("android.app.lib_name")) != null) {
                java.lang.System.loadLibrary(string);
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e("SwappyDisplayManager", th.getMessage());
        }
        this.mCookie = j;
        this.mActivity = activity;
        android.view.WindowManager windowManager = (android.view.WindowManager) activity.getSystemService(android.view.WindowManager.class);
        this.mWindowManager = windowManager;
        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
        this.mCurrentMode = defaultDisplay.getMode();
        updateSupportedRefreshRates(defaultDisplay);
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.mActivity.getSystemService(android.hardware.display.DisplayManager.class);
        synchronized (this) {
            com.google.androidgamesdk.d dVar = new com.google.androidgamesdk.d();
            this.mLooper = dVar;
            dVar.start();
            displayManager.registerDisplayListener(this, this.mLooper.f2347a);
        }
    }

    private boolean modeMatchesCurrentResolution(android.view.Display.Mode mode) {
        return mode.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight() && mode.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth();
    }

    private native void nOnRefreshPeriodChanged(long j, long j2, long j3, long j4);

    private native void nSetSupportedRefreshPeriods(long j, long[] jArr, int[] iArr);

    private void updateSupportedRefreshRates(android.view.Display display) {
        android.view.Display.Mode[] supportedModes = display.getSupportedModes();
        int i = 0;
        for (android.view.Display.Mode mode : supportedModes) {
            if (modeMatchesCurrentResolution(mode)) {
                i++;
            }
        }
        long[] jArr = new long[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < supportedModes.length; i3++) {
            if (modeMatchesCurrentResolution(supportedModes[i3])) {
                jArr[i2] = (long) (1.0E9f / supportedModes[i3].getRefreshRate());
                iArr[i2] = supportedModes[i3].getModeId();
                i2++;
            }
        }
        nSetSupportedRefreshPeriods(this.mCookie, jArr, iArr);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        synchronized (this) {
            android.view.Display defaultDisplay = this.mWindowManager.getDefaultDisplay();
            float refreshRate = defaultDisplay.getRefreshRate();
            android.view.Display.Mode mode = defaultDisplay.getMode();
            boolean z = true;
            boolean z2 = (mode.getPhysicalWidth() != this.mCurrentMode.getPhysicalWidth()) | (mode.getPhysicalHeight() != this.mCurrentMode.getPhysicalHeight());
            if (refreshRate == this.mCurrentMode.getRefreshRate()) {
                z = false;
            }
            this.mCurrentMode = mode;
            if (z2) {
                updateSupportedRefreshRates(defaultDisplay);
            }
            if (z) {
                long j = (long) (1.0E9f / refreshRate);
                nOnRefreshPeriodChanged(this.mCookie, j, defaultDisplay.getAppVsyncOffsetNanos(), j - (this.mWindowManager.getDefaultDisplay().getPresentationDeadlineNanos() - 1000000));
            }
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
    }

    public void setPreferredDisplayModeId(int i) {
        this.mActivity.runOnUiThread(new com.google.androidgamesdk.c(this, i));
    }

    public void terminate() {
        this.mLooper.f2347a.getLooper().quit();
    }
}

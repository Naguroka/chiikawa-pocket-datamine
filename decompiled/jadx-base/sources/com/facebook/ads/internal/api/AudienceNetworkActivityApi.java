package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface AudienceNetworkActivityApi {
    public static final int EXTERNAL_FINISH_REASON = 0;

    void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    void finish(int i);

    void onActivityResult(int i, int i2, android.content.Intent intent);

    void onBackPressed();

    void onConfigurationChanged(android.content.res.Configuration configuration);

    void onCreate(android.os.Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(android.os.Bundle bundle);

    void onStart();

    void onStop();

    boolean onTouchEvent(android.view.MotionEvent motionEvent);
}

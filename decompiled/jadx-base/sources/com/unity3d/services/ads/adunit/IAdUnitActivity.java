package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public interface IAdUnitActivity {
    void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    void finish();

    android.app.Activity getActivity();

    android.content.Context getContext();

    android.content.Intent getIntent();

    com.unity3d.services.ads.adunit.AdUnitRelativeLayout getLayout();

    int getRequestedOrientation();

    java.util.Map<java.lang.String, java.lang.Integer> getViewFrame(java.lang.String str);

    java.lang.String[] getViews();

    android.view.Window getWindow();

    boolean isFinishing();

    void requestPermissions(java.lang.String[] strArr, int i);

    boolean setKeepScreenOn(boolean z);

    void setKeyEventList(java.util.ArrayList<java.lang.Integer> arrayList);

    void setLayoutInDisplayCutoutMode(int i);

    void setOrientation(int i);

    void setRequestedOrientation(int i);

    boolean setSystemUiVisibility(int i);

    void setViewFrame(java.lang.String str, int i, int i2, int i3, int i4);

    void setViews(java.lang.String[] strArr);
}

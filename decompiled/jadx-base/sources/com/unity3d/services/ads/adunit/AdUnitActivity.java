package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class AdUnitActivity extends android.app.Activity implements com.unity3d.services.ads.adunit.IAdUnitActivity {
    public static final java.lang.String EXTRA_ACTIVITY_ID = "activityId";
    public static final java.lang.String EXTRA_DISPLAY_CUTOUT_MODE = "displayCutoutMode";
    public static final java.lang.String EXTRA_KEEP_SCREEN_ON = "keepScreenOn";
    public static final java.lang.String EXTRA_KEY_EVENT_LIST = "keyEvents";
    public static final java.lang.String EXTRA_ORIENTATION = "orientation";
    public static final java.lang.String EXTRA_SYSTEM_UI_VISIBILITY = "systemUiVisibility";
    public static final java.lang.String EXTRA_VIEWS = "views";
    protected com.unity3d.services.ads.adunit.AdUnitActivityController _controller;

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public android.content.Context getContext() {
        return this;
    }

    protected com.unity3d.services.ads.adunit.AdUnitActivityController createController() {
        return new com.unity3d.services.ads.adunit.AdUnitActivityController(this, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender(), new com.unity3d.services.ads.adunit.AdUnitViewHandlerFactory());
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.unity3d.services.ads.adunit.AdUnitActivityController adUnitActivityControllerCreateController = createController();
        this._controller = adUnitActivityControllerCreateController;
        adUnitActivityControllerCreateController.onCreate(bundle);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public com.unity3d.services.ads.adunit.AdUnitRelativeLayout getLayout() {
        return this._controller.getLayout();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this._controller.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this._controller.onStop();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this._controller.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this._controller.onPause();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this._controller.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.unity3d.services.ads.adunit.AdUnitActivityController adUnitActivityController = this._controller;
        if (adUnitActivityController != null) {
            adUnitActivityController.onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        return this._controller.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this._controller.onWindowFocusChanged(z);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this._controller.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setViewFrame(java.lang.String str, int i, int i2, int i3, int i4) {
        this._controller.setViewFrame(str, i, i2, i3, i4);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public java.util.Map<java.lang.String, java.lang.Integer> getViewFrame(java.lang.String str) {
        return this._controller.getViewFrame(str);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setViews(java.lang.String[] strArr) {
        this._controller.setViews(strArr);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public java.lang.String[] getViews() {
        return this._controller.getViews();
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setOrientation(int i) {
        this._controller.setOrientation(i);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public boolean setKeepScreenOn(boolean z) {
        return this._controller.setKeepScreenOn(z);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public boolean setSystemUiVisibility(int i) {
        return this._controller.setSystemUiVisibility(i);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setKeyEventList(java.util.ArrayList<java.lang.Integer> arrayList) {
        this._controller.setKeyEventList(arrayList);
    }

    public com.unity3d.services.ads.adunit.IAdUnitViewHandler getViewHandler(java.lang.String str) {
        return this._controller.getViewHandler(str);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setLayoutInDisplayCutoutMode(int i) {
        this._controller.setLayoutInDisplayCutoutMode(i);
    }
}

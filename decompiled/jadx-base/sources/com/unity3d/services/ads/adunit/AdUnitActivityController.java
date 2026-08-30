package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class AdUnitActivityController {
    private int _activityId;
    private final com.unity3d.services.ads.adunit.IAdUnitActivity _adUnitActivity;
    private final com.unity3d.services.ads.adunit.IAdUnitViewHandlerFactory _adUnitViewHandlerFactory;
    private int _displayCutoutMode;
    private final com.unity3d.services.core.webview.bridge.IEventSender _eventSender;
    boolean _keepScreenOn;
    private java.util.ArrayList<java.lang.Integer> _keyEventList;
    protected com.unity3d.services.ads.adunit.AdUnitRelativeLayout _layout;
    private int _orientation = -1;
    private int _systemUiVisibility;
    private java.util.Map<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> _viewHandlers;
    private java.lang.String[] _views;

    public AdUnitActivityController(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity, com.unity3d.services.core.webview.bridge.IEventSender iEventSender, com.unity3d.services.ads.adunit.IAdUnitViewHandlerFactory iAdUnitViewHandlerFactory) {
        this._adUnitActivity = iAdUnitActivity;
        this._eventSender = iEventSender;
        this._adUnitViewHandlerFactory = iAdUnitViewHandlerFactory;
    }

    public void onCreate(android.os.Bundle bundle) {
        com.unity3d.services.ads.adunit.AdUnitEvent adUnitEvent;
        if (!this._eventSender.canSend()) {
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onCreate");
            this._adUnitActivity.finish();
            return;
        }
        com.unity3d.services.ads.api.AdUnit.setAdUnitActivity(this._adUnitActivity);
        com.unity3d.services.core.api.Intent.setActiveActivity(this._adUnitActivity.getActivity());
        createLayout();
        com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(this._layout);
        com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity = this._adUnitActivity;
        com.unity3d.services.ads.adunit.AdUnitRelativeLayout adUnitRelativeLayout = this._layout;
        iAdUnitActivity.addContentView(adUnitRelativeLayout, adUnitRelativeLayout.getLayoutParams());
        if (bundle == null) {
            this._views = this._adUnitActivity.getIntent().getStringArrayExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_VIEWS);
            this._keyEventList = this._adUnitActivity.getIntent().getIntegerArrayListExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_KEY_EVENT_LIST);
            if (this._adUnitActivity.getIntent().hasExtra("orientation")) {
                this._orientation = this._adUnitActivity.getIntent().getIntExtra("orientation", -1);
            }
            if (this._adUnitActivity.getIntent().hasExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY)) {
                this._systemUiVisibility = this._adUnitActivity.getIntent().getIntExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, 0);
            }
            if (this._adUnitActivity.getIntent().hasExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_ACTIVITY_ID)) {
                this._activityId = this._adUnitActivity.getIntent().getIntExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_ACTIVITY_ID, -1);
            }
            if (this._adUnitActivity.getIntent().hasExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE)) {
                this._displayCutoutMode = this._adUnitActivity.getIntent().getIntExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, 0);
            }
            adUnitEvent = com.unity3d.services.ads.adunit.AdUnitEvent.ON_CREATE;
        } else {
            this._views = bundle.getStringArray(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_VIEWS);
            this._orientation = bundle.getInt("orientation", -1);
            this._systemUiVisibility = bundle.getInt(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, 0);
            this._keyEventList = bundle.getIntegerArrayList(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_KEY_EVENT_LIST);
            this._keepScreenOn = bundle.getBoolean(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_KEEP_SCREEN_ON);
            this._activityId = bundle.getInt(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_ACTIVITY_ID, -1);
            this._displayCutoutMode = bundle.getInt(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, 0);
            setKeepScreenOn(this._keepScreenOn);
            adUnitEvent = com.unity3d.services.ads.adunit.AdUnitEvent.ON_RESTORE;
        }
        setOrientation(this._orientation);
        setSystemUiVisibility(this._systemUiVisibility);
        setLayoutInDisplayCutoutMode(this._displayCutoutMode);
        java.lang.String[] strArr = this._views;
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                com.unity3d.services.ads.adunit.IAdUnitViewHandler viewHandler = getViewHandler(str);
                if (viewHandler != null) {
                    viewHandler.onCreate(this._adUnitActivity, bundle);
                }
            }
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, adUnitEvent, java.lang.Integer.valueOf(this._activityId));
    }

    public com.unity3d.services.ads.adunit.AdUnitRelativeLayout getLayout() {
        return this._layout;
    }

    public void onStart() {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStart");
            this._adUnitActivity.finish();
            return;
        }
        java.util.Map<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onStart(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.ON_START, java.lang.Integer.valueOf(this._activityId));
    }

    public void onStop() {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStop");
            this._adUnitActivity.finish();
            return;
        }
        java.util.Map<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onStop(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.ON_STOP, java.lang.Integer.valueOf(this._activityId));
    }

    public void onResume() {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onResume");
            this._adUnitActivity.finish();
            return;
        }
        setViews(this._views);
        java.util.Map<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onResume(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.ON_RESUME, java.lang.Integer.valueOf(this._activityId));
    }

    public void onPause() {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onPause");
            this._adUnitActivity.finish();
            return;
        }
        if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebView() == null) {
            com.unity3d.services.core.log.DeviceLog.warning("Unity Ads web view is null, from onPause");
        } else if (this._adUnitActivity.isFinishing()) {
            com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebView());
        }
        java.util.Map<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onPause(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.ON_PAUSE, java.lang.Boolean.valueOf(this._adUnitActivity.isFinishing()), java.lang.Integer.valueOf(this._activityId));
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("orientation", this._orientation);
        bundle.putInt(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, this._systemUiVisibility);
        bundle.putIntegerArrayList(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_KEY_EVENT_LIST, this._keyEventList);
        bundle.putBoolean(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_KEEP_SCREEN_ON, this._keepScreenOn);
        bundle.putStringArray(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_VIEWS, this._views);
        bundle.putInt(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_ACTIVITY_ID, this._activityId);
    }

    public void onDestroy() {
        if (!this._eventSender.canSend()) {
            if (this._adUnitActivity.isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onDestroy");
            this._adUnitActivity.finish();
            return;
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.ON_DESTROY, java.lang.Boolean.valueOf(this._adUnitActivity.isFinishing()), java.lang.Integer.valueOf(this._activityId));
        java.util.Map<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().onDestroy(this._adUnitActivity);
                }
            }
        }
        if (com.unity3d.services.ads.api.AdUnit.getCurrentAdUnitActivityId() == this._activityId) {
            com.unity3d.services.ads.api.AdUnit.setAdUnitActivity(null);
        }
        com.unity3d.services.core.api.Intent.removeActiveActivity(this._adUnitActivity.getActivity());
    }

    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        java.util.ArrayList<java.lang.Integer> arrayList = this._keyEventList;
        if (arrayList == null || !arrayList.contains(java.lang.Integer.valueOf(i))) {
            return false;
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.KEY_DOWN, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(keyEvent.getEventTime()), java.lang.Long.valueOf(keyEvent.getDownTime()), java.lang.Integer.valueOf(keyEvent.getRepeatCount()), java.lang.Integer.valueOf(this._activityId));
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.ON_FOCUS_GAINED, java.lang.Integer.valueOf(this._activityId));
        } else {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ADUNIT, com.unity3d.services.ads.adunit.AdUnitEvent.ON_FOCUS_LOST, java.lang.Integer.valueOf(this._activityId));
        }
    }

    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (java.lang.String str : strArr) {
                jSONArray.put(str);
            }
            for (int i2 : iArr) {
                jSONArray2.put(i2);
            }
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.PERMISSIONS, com.unity3d.services.ads.adunit.PermissionsEvent.PERMISSIONS_RESULT, java.lang.Integer.valueOf(i), jSONArray, jSONArray2);
        } catch (java.lang.Exception e) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.PERMISSIONS, com.unity3d.services.ads.adunit.PermissionsEvent.PERMISSIONS_ERROR, e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public void setViewFrame(java.lang.String str, int i, int i2, int i3, int i4) {
        android.view.View view;
        com.unity3d.services.ads.adunit.IAdUnitViewHandler viewHandler = getViewHandler(str);
        if (str.equals("adunit")) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this._layout.setLayoutParams(layoutParams);
        } else {
            view = viewHandler != null ? viewHandler.getView() : null;
            if (view != null) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i3, i4);
                layoutParams2.setMargins(i, i2, 0, 0);
                view.setLayoutParams(layoutParams2);
            }
        }
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(i3, i4);
            layoutParams3.setMargins(i, i2, 0, 0);
            view.setLayoutParams(layoutParams3);
        }
    }

    public java.util.Map<java.lang.String, java.lang.Integer> getViewFrame(java.lang.String str) {
        com.unity3d.services.ads.adunit.IAdUnitViewHandler viewHandler = getViewHandler(str);
        if (str.equals("adunit")) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this._layout.getLayoutParams();
            java.util.HashMap map = new java.util.HashMap();
            map.put("x", java.lang.Integer.valueOf(layoutParams.leftMargin));
            map.put("y", java.lang.Integer.valueOf(layoutParams.topMargin));
            map.put("width", java.lang.Integer.valueOf(this._layout.getWidth()));
            map.put("height", java.lang.Integer.valueOf(this._layout.getHeight()));
            return map;
        }
        android.view.View view = viewHandler != null ? viewHandler.getView() : null;
        if (view == null) {
            return null;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("x", java.lang.Integer.valueOf(layoutParams2.leftMargin));
        map2.put("y", java.lang.Integer.valueOf(layoutParams2.topMargin));
        map2.put("width", java.lang.Integer.valueOf(view.getWidth()));
        map2.put("height", java.lang.Integer.valueOf(view.getHeight()));
        return map2;
    }

    public void setViews(java.lang.String[] strArr) {
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(strArr));
        if (this._views == null) {
            this._views = new java.lang.String[0];
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.util.Arrays.asList(this._views));
        arrayList2.removeAll(arrayList);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            getViewHandler((java.lang.String) it.next()).destroy();
        }
        this._views = strArr;
        for (java.lang.String str : strArr) {
            if (str != null) {
                com.unity3d.services.ads.adunit.IAdUnitViewHandler viewHandler = getViewHandler(str);
                viewHandler.create(this._adUnitActivity);
                if (!handleViewPlacement(viewHandler.getView())) {
                    return;
                }
            }
        }
    }

    private boolean handleViewPlacement(android.view.View view) {
        if (view == null) {
            this._adUnitActivity.finish();
            com.unity3d.services.core.log.DeviceLog.error("Could not place view because it is null, finishing activity");
            return false;
        }
        if (view.getParent() != null && view.getParent().equals(this._layout)) {
            this._layout.bringChildToFront(view);
            return true;
        }
        com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(view);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.setMargins(0, 0, 0, 0);
        view.setPadding(0, 0, 0, 0);
        this._layout.addView(view, layoutParams);
        return true;
    }

    public java.lang.String[] getViews() {
        return this._views;
    }

    public void setOrientation(int i) {
        this._orientation = i;
        this._adUnitActivity.setRequestedOrientation(i);
    }

    public boolean setKeepScreenOn(boolean z) {
        this._keepScreenOn = z;
        if (this._adUnitActivity.getWindow() == null) {
            return false;
        }
        if (z) {
            this._adUnitActivity.getWindow().addFlags(128);
            return true;
        }
        this._adUnitActivity.getWindow().clearFlags(128);
        return true;
    }

    public boolean setSystemUiVisibility(int i) {
        this._systemUiVisibility = i;
        try {
            this._adUnitActivity.getWindow().getDecorView().setSystemUiVisibility(i);
            return true;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error while setting SystemUIVisibility", e);
            return false;
        }
    }

    public void setKeyEventList(java.util.ArrayList<java.lang.Integer> arrayList) {
        this._keyEventList = arrayList;
    }

    public com.unity3d.services.ads.adunit.IAdUnitViewHandler getViewHandler(java.lang.String str) {
        java.util.Map<java.lang.String, com.unity3d.services.ads.adunit.IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null && map.containsKey(str)) {
            return this._viewHandlers.get(str);
        }
        com.unity3d.services.ads.adunit.IAdUnitViewHandler iAdUnitViewHandlerCreateViewHandler = createViewHandler(str);
        if (iAdUnitViewHandlerCreateViewHandler != null) {
            if (this._viewHandlers == null) {
                this._viewHandlers = new java.util.HashMap();
            }
            this._viewHandlers.put(str, iAdUnitViewHandlerCreateViewHandler);
        }
        return iAdUnitViewHandlerCreateViewHandler;
    }

    public void setLayoutInDisplayCutoutMode(int i) {
        this._displayCutoutMode = i;
        if (android.os.Build.VERSION.SDK_INT < 28 || this._adUnitActivity.getWindow() == null) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = this._adUnitActivity.getWindow().getAttributes();
        try {
            attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, i);
        } catch (java.lang.IllegalAccessException e) {
            com.unity3d.services.core.log.DeviceLog.debug("Error setting layoutInDisplayCutoutMode", e);
        } catch (java.lang.NoSuchFieldException e2) {
            com.unity3d.services.core.log.DeviceLog.debug("Error getting layoutInDisplayCutoutMode", e2);
        }
    }

    protected void createLayout() {
        if (this._layout != null) {
            return;
        }
        com.unity3d.services.ads.adunit.AdUnitRelativeLayout adUnitRelativeLayout = new com.unity3d.services.ads.adunit.AdUnitRelativeLayout(this._adUnitActivity.getContext());
        this._layout = adUnitRelativeLayout;
        adUnitRelativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.unity3d.services.core.misc.ViewUtilities.setBackground(this._layout, new android.graphics.drawable.ColorDrawable(androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
    }

    private com.unity3d.services.ads.adunit.IAdUnitViewHandler createViewHandler(java.lang.String str) {
        return this._adUnitViewHandlerFactory.createViewHandler(str);
    }
}

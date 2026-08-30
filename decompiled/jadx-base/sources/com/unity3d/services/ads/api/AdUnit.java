package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class AdUnit {
    private static com.unity3d.services.ads.adunit.IAdUnitActivity _adUnitActivity = null;
    private static int _currentActivityId = -1;

    private AdUnit() {
    }

    public static void setAdUnitActivity(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
        _adUnitActivity = iAdUnitActivity;
    }

    public static com.unity3d.services.ads.adunit.IAdUnitActivity getAdUnitActivity() {
        return _adUnitActivity;
    }

    public static int getCurrentAdUnitActivityId() {
        return _currentActivityId;
    }

    public static void setCurrentAdUnitActivityId(int i) {
        _currentActivityId = i;
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void open(java.lang.Integer num, org.json.JSONArray jSONArray, java.lang.Integer num2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, null, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void open(java.lang.Integer num, org.json.JSONArray jSONArray, java.lang.Integer num2, org.json.JSONArray jSONArray2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, 0, true, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void open(java.lang.Integer num, org.json.JSONArray jSONArray, java.lang.Integer num2, org.json.JSONArray jSONArray2, java.lang.Integer num3, java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, false, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void open(java.lang.Integer num, org.json.JSONArray jSONArray, java.lang.Integer num2, org.json.JSONArray jSONArray2, java.lang.Integer num3, java.lang.Boolean bool, java.lang.Boolean bool2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, bool2, 0, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void open(java.lang.Integer num, org.json.JSONArray jSONArray, java.lang.Integer num2, org.json.JSONArray jSONArray2, java.lang.Integer num3, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num4, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        android.content.Intent intent;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent = new android.content.Intent(com.unity3d.services.core.properties.ClientProperties.getActivity(), (java.lang.Class<?>) com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity.class);
        } else if (bool.booleanValue() && !bool2.booleanValue()) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads opening new hardware accelerated ad unit activity");
            intent = new android.content.Intent(com.unity3d.services.core.properties.ClientProperties.getActivity(), (java.lang.Class<?>) com.unity3d.services.ads.adunit.AdUnitActivity.class);
        } else if (bool.booleanValue() && bool2.booleanValue()) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent = new android.content.Intent(com.unity3d.services.core.properties.ClientProperties.getActivity(), (java.lang.Class<?>) com.unity3d.services.ads.adunit.AdUnitTransparentActivity.class);
        } else {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent = new android.content.Intent(com.unity3d.services.core.properties.ClientProperties.getActivity(), (java.lang.Class<?>) com.unity3d.services.ads.adunit.AdUnitSoftwareActivity.class);
        }
        intent.addFlags(268500992);
        if (num != null) {
            try {
                intent.putExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_ACTIVITY_ID, num.intValue());
                setCurrentAdUnitActivityId(num.intValue());
                try {
                    intent.putExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_VIEWS, getViewList(jSONArray));
                    if (jSONArray2 != null) {
                        try {
                            intent.putExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_KEY_EVENT_LIST, getKeyEventList(jSONArray2));
                        } catch (java.lang.Exception e) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error parsing views from viewList", e);
                            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray2, e.getMessage());
                            return;
                        }
                    }
                    intent.putExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, num3);
                    intent.putExtra("orientation", num2);
                    intent.putExtra(com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, num4);
                    com.unity3d.services.core.properties.ClientProperties.getActivity().startActivity(intent);
                    com.unity3d.services.core.log.DeviceLog.debug("Opened AdUnitActivity with: " + jSONArray.toString());
                    webViewCallback.invoke(new java.lang.Object[0]);
                    return;
                } catch (java.lang.Exception e2) {
                    com.unity3d.services.core.log.DeviceLog.exception("Error parsing views from viewList", e2);
                    webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.CORRUPTED_VIEWLIST, jSONArray, e2.getMessage());
                    return;
                }
            } catch (java.lang.Exception e3) {
                com.unity3d.services.core.log.DeviceLog.exception("Could not set activityId for intent", e3);
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ACTIVITY_ID, java.lang.Integer.valueOf(num.intValue()), e3.getMessage());
                return;
            }
        }
        com.unity3d.services.core.log.DeviceLog.error("Activity ID is NULL");
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ACTIVITY_ID, "Activity ID NULL");
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void close(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            getAdUnitActivity().finish();
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setViews(final org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        boolean z;
        try {
            getViewList(jSONArray);
            z = false;
        } catch (org.json.JSONException unused) {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.CORRUPTED_VIEWLIST, jSONArray);
            z = true;
        }
        if (!z) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() != null) {
                        try {
                            com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().setViews(com.unity3d.services.ads.api.AdUnit.getViewList(jSONArray));
                        } catch (java.lang.Exception e) {
                            com.unity3d.services.core.log.DeviceLog.exception("Corrupted viewlist", e);
                        }
                    }
                }
            });
        }
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(jSONArray);
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getViews(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new org.json.JSONArray((java.util.Collection) java.util.Arrays.asList(getAdUnitActivity().getViews())));
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setOrientation(final java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() != null) {
                    com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().setOrientation(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getOrientation(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(java.lang.Integer.valueOf(getAdUnitActivity().getRequestedOrientation()));
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setKeepScreenOn(final java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() != null) {
                    com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().setKeepScreenOn(bool.booleanValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setSystemUiVisibility(final java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() != null) {
                    com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().setSystemUiVisibility(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setKeyEventList(org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            try {
                getAdUnitActivity().setKeyEventList(getKeyEventList(jSONArray));
                webViewCallback.invoke(jSONArray);
                return;
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Error parsing views from viewList", e);
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray, e.getMessage());
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setViewFrame(final java.lang.String str, final java.lang.Integer num, final java.lang.Integer num2, final java.lang.Integer num3, final java.lang.Integer num4, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() != null) {
                    com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().setViewFrame(str, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getViewFrame(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getViewFrame(str) != null) {
                java.util.Map<java.lang.String, java.lang.Integer> viewFrame = getAdUnitActivity().getViewFrame(str);
                webViewCallback.invoke(viewFrame.get("x"), viewFrame.get("y"), viewFrame.get("width"), viewFrame.get("height"));
                return;
            } else {
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.UNKNOWN_VIEW, new java.lang.Object[0]);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void startMotionEventCapture(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().startCapture(num.intValue());
                webViewCallback.invoke(new java.lang.Object[0]);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.LAYOUT_NULL, new java.lang.Object[0]);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void endMotionEventCapture(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().endCapture();
                webViewCallback.invoke(new java.lang.Object[0]);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.LAYOUT_NULL, new java.lang.Object[0]);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void clearMotionEventCapture(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().clearCapture();
                webViewCallback.invoke(new java.lang.Object[0]);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.LAYOUT_NULL, new java.lang.Object[0]);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getMotionEventCount(org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(java.lang.Integer.valueOf(jSONArray.getInt(i)));
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Error retrieving int from eventTypes", e);
            }
        }
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new java.lang.Object[0]);
                    return;
                }
                android.util.SparseIntArray eventCount = getAdUnitActivity().getLayout().getEventCount(arrayList);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (int i2 = 0; i2 < eventCount.size(); i2++) {
                    int iKeyAt = eventCount.keyAt(i2);
                    try {
                        jSONObject.put(java.lang.Integer.toString(iKeyAt), eventCount.get(iKeyAt));
                    } catch (java.lang.Exception e2) {
                        com.unity3d.services.core.log.DeviceLog.exception("Error building response JSON", e2);
                    }
                }
                webViewCallback.invoke(jSONObject);
                return;
            }
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.LAYOUT_NULL, new java.lang.Object[0]);
            return;
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getMotionEventData(org.json.JSONObject jSONObject, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        org.json.JSONArray jSONArray;
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        android.util.SparseArray<java.util.ArrayList<java.lang.Integer>> sparseArray = new android.util.SparseArray<>();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            java.lang.String next = itKeys.next();
            int i = java.lang.Integer.parseInt(next);
            if (sparseArray.get(i) == null) {
                sparseArray.put(i, new java.util.ArrayList<>());
            }
            try {
                jSONArray = jSONObject.getJSONArray(next);
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Couldn't fetch keyIndices", e);
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        sparseArray.get(i).add(java.lang.Integer.valueOf(jSONArray.getInt(i2)));
                    } catch (java.lang.Exception e2) {
                        com.unity3d.services.core.log.DeviceLog.exception("Couldn't add value to requested infos", e2);
                    }
                }
            }
        }
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new java.lang.Object[0]);
                    return;
                }
                android.util.SparseArray<android.util.SparseArray<com.unity3d.services.ads.adunit.AdUnitMotionEvent>> events = getAdUnitActivity().getLayout().getEvents(sparseArray);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                for (int i3 = 0; i3 < events.size(); i3++) {
                    int iKeyAt = events.keyAt(i3);
                    android.util.SparseArray<com.unity3d.services.ads.adunit.AdUnitMotionEvent> sparseArray2 = events.get(iKeyAt);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        int iKeyAt2 = sparseArray2.keyAt(i4);
                        com.unity3d.services.ads.adunit.AdUnitMotionEvent adUnitMotionEvent = sparseArray2.get(iKeyAt2);
                        try {
                            jSONObject4.put("action", adUnitMotionEvent.getAction());
                            jSONObject4.put("isObscured", adUnitMotionEvent.isObscured());
                            jSONObject4.put("toolType", adUnitMotionEvent.getToolType());
                            jSONObject4.put("source", adUnitMotionEvent.getSource());
                            jSONObject4.put("deviceId", adUnitMotionEvent.getDeviceId());
                            jSONObject4.put("x", adUnitMotionEvent.getX());
                            jSONObject4.put("y", adUnitMotionEvent.getY());
                            jSONObject4.put("eventTime", adUnitMotionEvent.getEventTime());
                            jSONObject4.put("pressure", adUnitMotionEvent.getPressure());
                            jSONObject4.put("size", adUnitMotionEvent.getSize());
                            jSONObject3.put(java.lang.Integer.toString(iKeyAt2), jSONObject4);
                        } catch (java.lang.Exception e3) {
                            com.unity3d.services.core.log.DeviceLog.debug("Couldn't construct event info", e3);
                        }
                    }
                    try {
                        jSONObject2.put(java.lang.Integer.toString(iKeyAt), jSONObject3);
                    } catch (java.lang.Exception e4) {
                        com.unity3d.services.core.log.DeviceLog.debug("Couldn't construct info object", e4);
                    }
                }
                webViewCallback.invoke(jSONObject2);
                return;
            }
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.LAYOUT_NULL, new java.lang.Object[0]);
            return;
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getCurrentMotionEventCount(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                webViewCallback.invoke(java.lang.Integer.valueOf(getAdUnitActivity().getLayout().getCurrentEventCount()));
                return;
            } else {
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.LAYOUT_NULL, new java.lang.Object[0]);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSafeAreaInsets(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null && getAdUnitActivity().getLayout() != null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.view.WindowInsets rootWindowInsets = getAdUnitActivity().getLayout().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        java.lang.Object objInvoke = rootWindowInsets.getClass().getMethod("getDisplayCutout", new java.lang.Class[0]).invoke(rootWindowInsets, new java.lang.Object[0]);
                        if (objInvoke != null) {
                            java.lang.Object objInvoke2 = objInvoke.getClass().getMethod("getSafeInsetTop", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
                            java.lang.Object objInvoke3 = objInvoke.getClass().getMethod("getSafeInsetRight", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
                            java.lang.Object objInvoke4 = objInvoke.getClass().getMethod("getSafeInsetBottom", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
                            java.lang.Object objInvoke5 = objInvoke.getClass().getMethod("getSafeInsetLeft", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
                            jSONObject.put("top", objInvoke2);
                            jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, objInvoke3);
                            jSONObject.put("bottom", objInvoke4);
                            jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, objInvoke5);
                            webViewCallback.invoke(jSONObject);
                        } else {
                            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new java.lang.Object[0]);
                        }
                        return;
                    } catch (java.lang.IllegalAccessException e) {
                        e = e;
                        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new java.lang.Object[0]);
                        com.unity3d.services.core.log.DeviceLog.debug("Error while calling displayCutout getter", e);
                        return;
                    } catch (java.lang.NoSuchMethodException e2) {
                        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new java.lang.Object[0]);
                        com.unity3d.services.core.log.DeviceLog.debug("Method getDisplayCutout not found", e2);
                        return;
                    } catch (java.lang.reflect.InvocationTargetException e3) {
                        e = e3;
                        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new java.lang.Object[0]);
                        com.unity3d.services.core.log.DeviceLog.debug("Error while calling displayCutout getter", e);
                        return;
                    } catch (org.json.JSONException e4) {
                        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.DISPLAY_CUTOUT_JSON_ERROR, new java.lang.Object[0]);
                        com.unity3d.services.core.log.DeviceLog.debug("JSON error while constructing display cutout object", e4);
                        return;
                    }
                }
                webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new java.lang.Object[0]);
                return;
            }
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.API_LEVEL_ERROR, new java.lang.Object[0]);
            return;
        }
        webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setLayoutInDisplayCutoutMode(final java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.6
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() != null) {
                    com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().setLayoutInDisplayCutoutMode(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String[] getViewList(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    private static java.util.ArrayList<java.lang.Integer> getKeyEventList(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int iIntValue = 0;
        while (true) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iIntValue);
            if (numValueOf.intValue() >= jSONArray.length()) {
                return arrayList;
            }
            arrayList.add(java.lang.Integer.valueOf(jSONArray.getInt(numValueOf.intValue())));
            iIntValue = numValueOf.intValue() + 1;
        }
    }
}

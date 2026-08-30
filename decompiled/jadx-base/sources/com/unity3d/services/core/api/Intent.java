package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Intent {
    private static java.lang.ref.WeakReference<android.app.Activity> _activeActivity;

    public enum IntentError {
        COULDNT_PARSE_EXTRAS,
        COULDNT_PARSE_CATEGORIES,
        INTENT_WAS_NULL,
        JSON_EXCEPTION,
        ACTIVITY_WAS_NULL
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void launch(org.json.JSONObject jSONObject, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        android.content.Intent launchIntentForPackage;
        java.lang.String str = (java.lang.String) jSONObject.opt("className");
        java.lang.String str2 = (java.lang.String) jSONObject.opt(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        java.lang.String str3 = (java.lang.String) jSONObject.opt("action");
        java.lang.String str4 = (java.lang.String) jSONObject.opt("uri");
        java.lang.String str5 = (java.lang.String) jSONObject.opt("mimeType");
        org.json.JSONArray jSONArray = (org.json.JSONArray) jSONObject.opt("categories");
        java.lang.Integer num = (java.lang.Integer) jSONObject.opt("flags");
        org.json.JSONArray jSONArray2 = (org.json.JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            launchIntentForPackage = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage != null && num.intValue() > -1) {
                launchIntentForPackage.addFlags(num.intValue());
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            if (str != null && str2 != null) {
                intent.setClassName(str2, str);
            } else if (str2 != null) {
                intent.setPackage(str2);
            }
            if (str3 != null) {
                intent.setAction(str3);
            }
            if (str4 != null && str5 != null) {
                intent.setDataAndType(android.net.Uri.parse(str4), str5);
            } else if (str4 != null) {
                intent.setData(android.net.Uri.parse(str4));
            } else if (str5 != null) {
                intent.setType(str5);
            }
            if (num != null && num.intValue() > -1) {
                intent.setFlags(num.intValue());
            }
            if (!setCategories(intent, jSONArray)) {
                webViewCallback.error(com.unity3d.services.core.api.Intent.IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
            }
            if (!setExtras(intent, jSONArray2)) {
                webViewCallback.error(com.unity3d.services.core.api.Intent.IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
            }
            launchIntentForPackage = intent;
        }
        if (launchIntentForPackage != null) {
            if (getStartingActivity() != null) {
                getStartingActivity().startActivity(launchIntentForPackage);
                webViewCallback.invoke(new java.lang.Object[0]);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.core.api.Intent.IntentError.ACTIVITY_WAS_NULL, new java.lang.Object[0]);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.api.Intent.IntentError.INTENT_WAS_NULL, new java.lang.Object[0]);
    }

    private static boolean setCategories(android.content.Intent intent, org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return true;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                intent.addCategory(jSONArray.getString(i));
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Couldn't parse categories for intent", e);
                return false;
            }
        }
        return true;
    }

    private static boolean setExtras(android.content.Intent intent, org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return true;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!setExtra(intent, jSONObject.getString(com.ironsource.y8.h.W), jSONObject.get("value"))) {
                    return false;
                }
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Couldn't parse extras", e);
                return false;
            }
        }
        return true;
    }

    private static boolean setExtra(android.content.Intent intent, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            intent.putExtra(str, (java.lang.String) obj);
            return true;
        }
        if (obj instanceof java.lang.Integer) {
            intent.putExtra(str, ((java.lang.Integer) obj).intValue());
            return true;
        }
        if (obj instanceof java.lang.Double) {
            intent.putExtra(str, ((java.lang.Double) obj).doubleValue());
            return true;
        }
        if (obj instanceof java.lang.Boolean) {
            intent.putExtra(str, ((java.lang.Boolean) obj).booleanValue());
            return true;
        }
        com.unity3d.services.core.log.DeviceLog.error("Unable to parse launch intent extra " + str);
        return false;
    }

    private static android.app.Activity getStartingActivity() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = _activeActivity;
        if (weakReference != null && weakReference.get() != null) {
            return _activeActivity.get();
        }
        if (com.unity3d.services.core.properties.ClientProperties.getActivity() != null) {
            return com.unity3d.services.core.properties.ClientProperties.getActivity();
        }
        return null;
    }

    public static void setActiveActivity(android.app.Activity activity) {
        if (activity == null) {
            _activeActivity = null;
        } else {
            _activeActivity = new java.lang.ref.WeakReference<>(activity);
        }
    }

    public static void removeActiveActivity(android.app.Activity activity) {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = _activeActivity;
        if (weakReference == null || weakReference.get() == null || activity == null || !activity.equals(_activeActivity.get())) {
            return;
        }
        _activeActivity = null;
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void canOpenIntent(org.json.JSONObject jSONObject, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            webViewCallback.invoke(java.lang.Boolean.valueOf(checkIntentResolvable(intentFromMetadata(jSONObject))));
        } catch (com.unity3d.services.core.api.Intent.IntentException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Couldn't resolve intent", e);
            webViewCallback.error(e.getError(), e.getField());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void canOpenIntents(org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            try {
                jSONObject.put(jSONObjectOptJSONObject.optString("id"), checkIntentResolvable(intentFromMetadata(jSONObjectOptJSONObject)));
            } catch (com.unity3d.services.core.api.Intent.IntentException e) {
                com.unity3d.services.core.log.DeviceLog.exception("Exception parsing intent", e);
                webViewCallback.error(e.getError(), e.getField());
                return;
            } catch (org.json.JSONException e2) {
                webViewCallback.error(com.unity3d.services.core.api.Intent.IntentError.JSON_EXCEPTION, e2.getMessage());
                return;
            }
        }
        webViewCallback.invoke(jSONObject);
    }

    private static boolean checkIntentResolvable(android.content.Intent intent) {
        return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private static android.content.Intent intentFromMetadata(org.json.JSONObject jSONObject) throws com.unity3d.services.core.api.Intent.IntentException {
        java.lang.String str = (java.lang.String) jSONObject.opt("className");
        java.lang.String str2 = (java.lang.String) jSONObject.opt(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        java.lang.String str3 = (java.lang.String) jSONObject.opt("action");
        java.lang.String str4 = (java.lang.String) jSONObject.opt("uri");
        java.lang.String str5 = (java.lang.String) jSONObject.opt("mimeType");
        org.json.JSONArray jSONArray = (org.json.JSONArray) jSONObject.opt("categories");
        java.lang.Integer num = (java.lang.Integer) jSONObject.opt("flags");
        org.json.JSONArray jSONArray2 = (org.json.JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            android.content.Intent launchIntentForPackage = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null || num.intValue() <= -1) {
                return launchIntentForPackage;
            }
            launchIntentForPackage.addFlags(num.intValue());
            return launchIntentForPackage;
        }
        android.content.Intent intent = new android.content.Intent();
        if (str != null && str2 != null) {
            intent.setClassName(str2, str);
        }
        if (str3 != null) {
            intent.setAction(str3);
        }
        if (str4 != null) {
            intent.setData(android.net.Uri.parse(str4));
        }
        if (str5 != null) {
            intent.setType(str5);
        }
        if (num != null && num.intValue() > -1) {
            intent.setFlags(num.intValue());
        }
        if (!setCategories(intent, jSONArray)) {
            throw new com.unity3d.services.core.api.Intent.IntentException(com.unity3d.services.core.api.Intent.IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
        }
        if (setExtras(intent, jSONArray2)) {
            return intent;
        }
        throw new com.unity3d.services.core.api.Intent.IntentException(com.unity3d.services.core.api.Intent.IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
    }

    private static class IntentException extends java.lang.Exception {
        private com.unity3d.services.core.api.Intent.IntentError error;
        private java.lang.Object field;

        public IntentException(com.unity3d.services.core.api.Intent.IntentError intentError, java.lang.Object obj) {
            this.error = intentError;
            this.field = obj;
        }

        public com.unity3d.services.core.api.Intent.IntentError getError() {
            return this.error;
        }

        public java.lang.Object getField() {
            return this.field;
        }
    }
}

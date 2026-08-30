package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Request {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void get(final java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            com.unity3d.services.core.request.WebRequestThread.request(str2, com.unity3d.services.core.request.WebRequest.RequestType.GET, getHeadersMap(jSONArray), null, num, num2, new com.unity3d.services.core.request.IWebRequestListener() { // from class: com.unity3d.services.core.api.Request.1
                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onComplete(java.lang.String str3, java.lang.String str4, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
                    try {
                        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.COMPLETE, str, str3, str4, java.lang.Integer.valueOf(i), com.unity3d.services.core.api.Request.getResponseHeadersMap(map));
                    } catch (java.lang.Exception e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Error parsing response headers", e);
                        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.FAILED, str, str3, "Error parsing response headers");
                    }
                }

                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onFailed(java.lang.String str3, java.lang.String str4) {
                    com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.FAILED, str, str3, str4);
                }
            });
            webViewCallback.invoke(str);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error mapping headers for the request", e);
            webViewCallback.error(com.unity3d.services.core.request.WebRequestError.MAPPING_HEADERS_FAILED, str);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void post(final java.lang.String str, java.lang.String str2, java.lang.String str3, org.json.JSONArray jSONArray, java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.String str4 = (str3 == null || str3.length() != 0) ? str3 : null;
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            com.unity3d.services.core.request.WebRequestThread.request(str2, com.unity3d.services.core.request.WebRequest.RequestType.POST, getHeadersMap(jSONArray), str4, num, num2, new com.unity3d.services.core.request.IWebRequestListener() { // from class: com.unity3d.services.core.api.Request.2
                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onComplete(java.lang.String str5, java.lang.String str6, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
                    try {
                        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.COMPLETE, str, str5, str6, java.lang.Integer.valueOf(i), com.unity3d.services.core.api.Request.getResponseHeadersMap(map));
                    } catch (java.lang.Exception e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Error parsing response headers", e);
                        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.FAILED, str, str5, "Error parsing response headers");
                    }
                }

                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onFailed(java.lang.String str5, java.lang.String str6) {
                    com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.FAILED, str, str5, str6);
                }
            });
            webViewCallback.invoke(str);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error mapping headers for the request", e);
            webViewCallback.error(com.unity3d.services.core.request.WebRequestError.MAPPING_HEADERS_FAILED, str);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void head(final java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            com.unity3d.services.core.request.WebRequestThread.request(str2, com.unity3d.services.core.request.WebRequest.RequestType.HEAD, getHeadersMap(jSONArray), num, num2, new com.unity3d.services.core.request.IWebRequestListener() { // from class: com.unity3d.services.core.api.Request.3
                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onComplete(java.lang.String str3, java.lang.String str4, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
                    try {
                        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.COMPLETE, str, str3, str4, java.lang.Integer.valueOf(i), com.unity3d.services.core.api.Request.getResponseHeadersMap(map));
                    } catch (java.lang.Exception e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Error parsing response headers", e);
                        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.FAILED, str, str3, "Error parsing response headers");
                    }
                }

                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onFailed(java.lang.String str3, java.lang.String str4) {
                    com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.REQUEST, com.unity3d.services.core.request.WebRequestEvent.FAILED, str, str3, str4);
                }
            });
            webViewCallback.invoke(str);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error mapping headers for the request", e);
            webViewCallback.error(com.unity3d.services.core.request.WebRequestError.MAPPING_HEADERS_FAILED, str);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setConcurrentRequestCount(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.request.WebRequestThread.setConcurrentRequestCount(num.intValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setMaximumPoolSize(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.request.WebRequestThread.setMaximumPoolSize(num.intValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setKeepAliveTime(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.request.WebRequestThread.setKeepAliveTime(num.longValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    public static org.json.JSONArray getResponseHeadersMap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (map != null && map.size() > 0) {
            for (java.lang.String str : map.keySet()) {
                org.json.JSONArray jSONArray2 = null;
                for (java.lang.String str2 : map.get(str)) {
                    org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                    jSONArray3.put(str);
                    jSONArray3.put(str2);
                    jSONArray2 = jSONArray3;
                }
                jSONArray.put(jSONArray2);
            }
        }
        return jSONArray;
    }

    public static java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> getHeadersMap(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray == null) {
            return null;
        }
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map = new java.util.HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) jSONArray.get(i);
            java.util.List<java.lang.String> arrayList = map.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
            }
            arrayList.add(jSONArray2.getString(1));
            map.put(jSONArray2.getString(0), arrayList);
        }
        return map;
    }
}

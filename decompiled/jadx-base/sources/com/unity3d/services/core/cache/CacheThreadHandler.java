package com.unity3d.services.core.cache;

/* JADX INFO: loaded from: classes6.dex */
class CacheThreadHandler extends android.os.Handler {
    private com.unity3d.services.core.request.WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    CacheThreadHandler() {
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map;
        android.os.Bundle data = message.getData();
        java.lang.String string = data.getString("source");
        data.remove("source");
        java.lang.String string2 = data.getString(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        data.remove(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean(org.jacoco.core.runtime.AgentOptions.APPEND, false);
        data.remove(org.jacoco.core.runtime.AgentOptions.APPEND);
        com.unity3d.services.core.cache.CacheEventSender cacheEventSender = (com.unity3d.services.core.cache.CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            com.unity3d.services.core.log.DeviceLog.debug("There are headers left in data, reading them");
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map2 = new java.util.HashMap<>();
            for (java.lang.String str : data.keySet()) {
                map2.put(str, java.util.Arrays.asList(data.getStringArray(str)));
            }
            map = map2;
        } else {
            map = null;
        }
        java.io.File file = new java.io.File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR, com.unity3d.services.core.cache.CacheError.FILE_STATE_WRONG, string, string2, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, map, z, cacheEventSender);
        }
    }

    public void setCancelStatus(boolean z) {
        com.unity3d.services.core.request.WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }

    public boolean isActive() {
        return this._active;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private void downloadFile(java.lang.String r25, java.lang.String r26, int r27, int r28, int r29, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r30, boolean r31, com.unity3d.services.core.cache.CacheEventSender r32) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.CacheThreadHandler.downloadFile(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean, com.unity3d.services.core.cache.CacheEventSender):void");
    }

    private void postProcessDownload(long j, java.lang.String str, java.io.File file, long j2, long j3, boolean z, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.unity3d.services.core.cache.CacheEventSender cacheEventSender) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (!z) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + jElapsedRealtime + "ms");
            cacheEventSender.sendEvent(com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_END, str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(jElapsedRealtime), java.lang.Integer.valueOf(i), com.unity3d.services.core.api.Request.getResponseHeadersMap(map));
        } else {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_STOPPED, str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(jElapsedRealtime), java.lang.Integer.valueOf(i), com.unity3d.services.core.api.Request.getResponseHeadersMap(map));
        }
    }

    private com.unity3d.services.core.request.WebRequest getWebRequest(java.lang.String str, int i, int i2, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map) throws java.net.MalformedURLException {
        java.util.HashMap map2 = new java.util.HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new com.unity3d.services.core.request.WebRequest(str, "GET", map2, i, i2);
    }
}

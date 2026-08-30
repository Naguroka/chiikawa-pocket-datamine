package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Cache {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void download(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.cache.CacheThread.isActive()) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_ALREADY_CACHING, new java.lang.Object[0]);
            return;
        }
        if (!com.unity3d.services.core.device.Device.isActiveNetworkConnected()) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.NO_INTERNET, new java.lang.Object[0]);
            return;
        }
        try {
            com.unity3d.services.core.cache.CacheThread.download(str, fileIdToFilename(str2), com.unity3d.services.core.api.Request.getHeadersMap(jSONArray), bool.booleanValue(), com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
            webViewCallback.invoke(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error mapping headers for the request", e);
            webViewCallback.error(com.unity3d.services.core.request.WebRequestError.MAPPING_HEADERS_FAILED, str, str2);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void stop(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (!com.unity3d.services.core.cache.CacheThread.isActive()) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.NOT_CACHING, new java.lang.Object[0]);
        } else {
            com.unity3d.services.core.cache.CacheThread.cancel();
            webViewCallback.invoke(new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void isCaching(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.cache.CacheThread.isActive()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFileContent(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) throws java.lang.Throwable {
        java.lang.Object objEncodeToString;
        java.lang.String strFileIdToFilename = fileIdToFilename(str);
        java.io.File file = new java.io.File(strFileIdToFilename);
        if (!file.exists()) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_NOT_FOUND, str, strFileIdToFilename);
            return;
        }
        try {
            byte[] fileBytes = com.unity3d.services.core.misc.Utilities.readFileBytes(file);
            if (str2 == null) {
                webViewCallback.error(com.unity3d.services.core.cache.CacheError.UNSUPPORTED_ENCODING, str, strFileIdToFilename, str2);
                return;
            }
            if (str2.equals(com.adjust.sdk.Constants.ENCODING)) {
                objEncodeToString = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING).decode(java.nio.ByteBuffer.wrap(fileBytes)).toString();
            } else if (str2.equals("Base64")) {
                objEncodeToString = android.util.Base64.encodeToString(fileBytes, 2);
            } else {
                webViewCallback.error(com.unity3d.services.core.cache.CacheError.UNSUPPORTED_ENCODING, str, strFileIdToFilename, str2);
                return;
            }
            webViewCallback.invoke(objEncodeToString);
        } catch (java.io.IOException e) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR, str, strFileIdToFilename, e.getMessage() + ", " + e.getClass().getName());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setFileContent(java.lang.String str, java.lang.String str2, java.lang.String str3, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) throws java.lang.Throwable {
        java.lang.String strFileIdToFilename = fileIdToFilename(str);
        boolean z = true;
        try {
            byte[] bytes = str3.getBytes(com.adjust.sdk.Constants.ENCODING);
            if (str2 != null && str2.length() > 0) {
                if (str2.equals("Base64")) {
                    bytes = android.util.Base64.decode(str3, 2);
                } else if (!str2.equals(com.adjust.sdk.Constants.ENCODING)) {
                    webViewCallback.error(com.unity3d.services.core.cache.CacheError.UNSUPPORTED_ENCODING, str, strFileIdToFilename, str2);
                    return;
                }
            }
            java.io.FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(strFileIdToFilename);
                        try {
                            fileOutputStream2.write(bytes);
                            fileOutputStream2.flush();
                            try {
                                fileOutputStream2.close();
                            } catch (java.lang.Exception e) {
                                com.unity3d.services.core.log.DeviceLog.exception("Error closing FileOutputStream", e);
                            }
                        } catch (java.io.FileNotFoundException unused) {
                            fileOutputStream = fileOutputStream2;
                            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_NOT_FOUND, str, strFileIdToFilename, str2);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            z = false;
                        } catch (java.io.IOException unused2) {
                            fileOutputStream = fileOutputStream2;
                            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR, str, strFileIdToFilename, str2);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            z = false;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.lang.Exception e2) {
                                    com.unity3d.services.core.log.DeviceLog.exception("Error closing FileOutputStream", e2);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception e3) {
                        com.unity3d.services.core.log.DeviceLog.exception("Error closing FileOutputStream", e3);
                        z = false;
                    }
                } catch (java.io.FileNotFoundException unused3) {
                } catch (java.io.IOException unused4) {
                }
                if (z) {
                    webViewCallback.invoke(new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.io.UnsupportedEncodingException unused5) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.UNSUPPORTED_ENCODING, str, strFileIdToFilename, str2);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFiles(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.io.File cacheDirectory = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory();
        if (cacheDirectory == null) {
            return;
        }
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: checking app directory for Unity Ads cached files");
        java.io.File[] fileArrListFiles = cacheDirectory.listFiles(new java.io.FilenameFilter() { // from class: com.unity3d.services.core.api.Cache.1
            @Override // java.io.FilenameFilter
            public boolean accept(java.io.File file, java.lang.String str) {
                return str.startsWith(com.unity3d.services.core.properties.SdkProperties.getCacheFilePrefix());
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            webViewCallback.invoke(new org.json.JSONArray());
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.io.File file : fileArrListFiles) {
                java.lang.String strSubstring = file.getName().substring(com.unity3d.services.core.properties.SdkProperties.getCacheFilePrefix().length());
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: found " + strSubstring + ", " + file.length() + " bytes");
                jSONArray.put(getFileJson(strSubstring));
            }
            webViewCallback.invoke(jSONArray);
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error creating JSON", e);
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.JSON_ERROR, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFileInfo(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            webViewCallback.invoke(getFileJson(str));
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error creating JSON", e);
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.JSON_ERROR, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFilePath(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (new java.io.File(fileIdToFilename(str)).exists()) {
            webViewCallback.invoke(fileIdToFilename(str));
        } else {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_NOT_FOUND, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void deleteFile(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (new java.io.File(fileIdToFilename(str)).delete()) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getHash(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.misc.Utilities.Sha256(str));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setTimeouts(java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.cache.CacheThread.setConnectTimeout(num.intValue());
        com.unity3d.services.core.cache.CacheThread.setReadTimeout(num2.intValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTimeouts(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.cache.CacheThread.getConnectTimeout()), java.lang.Integer.valueOf(com.unity3d.services.core.cache.CacheThread.getReadTimeout()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setProgressInterval(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.cache.CacheThread.setProgressInterval(num.intValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getProgressInterval(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.cache.CacheThread.getProgressInterval()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFreeSpace(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getFreeSpace(com.unity3d.services.core.properties.SdkProperties.getCacheDirectory())));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTotalSpace(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getTotalSpace(com.unity3d.services.core.properties.SdkProperties.getCacheDirectory())));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getMetaData(java.lang.String str, org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            android.util.SparseArray<java.lang.String> metaData = getMetaData(fileIdToFilename(str), jSONArray);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i = 0; i < metaData.size(); i++) {
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                jSONArray3.put(metaData.keyAt(i));
                jSONArray3.put(metaData.valueAt(i));
                jSONArray2.put(jSONArray3);
            }
            webViewCallback.invoke(jSONArray2);
        } catch (java.io.IOException e) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR, e.getMessage());
        } catch (java.lang.RuntimeException e2) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.INVALID_ARGUMENT, e2.getMessage());
        } catch (org.json.JSONException e3) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.JSON_ERROR, e3.getMessage());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getCacheDirectoryType(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.cache.CacheDirectory cacheDirectoryObject = com.unity3d.services.core.properties.SdkProperties.getCacheDirectoryObject();
        if (cacheDirectoryObject == null || cacheDirectoryObject.getCacheDirectory(com.unity3d.services.core.properties.ClientProperties.getApplicationContext()) == null) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.CACHE_DIRECTORY_NULL, new java.lang.Object[0]);
            return;
        }
        if (!cacheDirectoryObject.getCacheDirectory(com.unity3d.services.core.properties.ClientProperties.getApplicationContext()).exists()) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.CACHE_DIRECTORY_DOESNT_EXIST, new java.lang.Object[0]);
            return;
        }
        com.unity3d.services.core.cache.CacheDirectoryType type = cacheDirectoryObject.getType();
        if (type == null) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.CACHE_DIRECTORY_TYPE_NULL, new java.lang.Object[0]);
        } else {
            webViewCallback.invoke(type.name());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getCacheDirectoryExists(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.io.File cacheDirectory = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory();
        if (cacheDirectory == null) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.CACHE_DIRECTORY_NULL, new java.lang.Object[0]);
        } else {
            webViewCallback.invoke(java.lang.Boolean.valueOf(cacheDirectory.exists()));
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void recreateCacheDirectory(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.properties.SdkProperties.getCacheDirectory().exists()) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.CACHE_DIRECTORY_EXISTS, new java.lang.Object[0]);
            return;
        }
        com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(null);
        if (com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() == null) {
            webViewCallback.error(com.unity3d.services.core.cache.CacheError.CACHE_DIRECTORY_NULL, new java.lang.Object[0]);
        } else {
            webViewCallback.invoke(new java.lang.Object[0]);
        }
    }

    private static android.util.SparseArray<java.lang.String> getMetaData(java.lang.String str, org.json.JSONArray jSONArray) throws org.json.JSONException, java.io.IOException, java.lang.RuntimeException {
        java.io.File file = new java.io.File(str);
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        if (file.exists()) {
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            for (int i = 0; i < jSONArray.length(); i++) {
                int i2 = jSONArray.getInt(i);
                java.lang.String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i2);
                if (strExtractMetadata != null) {
                    sparseArray.put(i2, strExtractMetadata);
                }
            }
            return sparseArray;
        }
        throw new java.io.IOException("File: " + file.getAbsolutePath() + " doesn't exist");
    }

    private static java.lang.String fileIdToFilename(java.lang.String str) {
        return com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() == null ? "" : com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() + "/" + com.unity3d.services.core.properties.SdkProperties.getCacheFilePrefix() + str;
    }

    private static org.json.JSONObject getFileJson(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", str);
        java.io.File file = new java.io.File(fileIdToFilename(str));
        if (file.exists()) {
            jSONObject.put("found", true);
            jSONObject.put("size", file.length());
            jSONObject.put("mtime", file.lastModified());
        } else {
            jSONObject.put("found", false);
        }
        return jSONObject;
    }
}

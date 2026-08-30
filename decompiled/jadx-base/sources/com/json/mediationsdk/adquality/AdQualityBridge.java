package com.json.mediationsdk.adquality;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0019"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/AdQualityBridge;", "", "", "logLevel", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;", "convertToAdQualityLogLevel", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityDeviceIdType;", "getDeviceIdType", "", "getCoppaValue", "", "userId", "", "changeUserId", "Lcom/ironsource/mediationsdk/IronSourceSegment;", com.json.y3.i, "setSegment", "Landroid/content/Context;", "context", "appKey", "Lcom/ironsource/f1;", "adQualityDataProvider", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/f1;I)V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class AdQualityBridge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.json.mediationsdk.adquality.AdQualityBridge.Companion INSTANCE = new com.json.mediationsdk.adquality.AdQualityBridge.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010\u0007\u001a\u00020\u0004H\u0003J-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0003¨\u0006\u0012"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/AdQualityBridge$Companion;", "", "()V", "adQualityAvailable", "", "getAdQualitySdkVersion", "", "isGetVersionMethodExist", "logEvent", "", "eventId", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "errorReason", "(ILjava/lang/Integer;Ljava/lang/String;)V", "versionCompare", "ver1", "ver2", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final java.lang.String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new java.lang.String();
            }
            java.lang.String sDKVersion = com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getSDKVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final boolean isGetVersionMethodExist() throws org.json.JSONException {
            try {
                return java.lang.Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getDeclaredMethods().length >= 10;
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                logEvent$default(this, 84, null, null, 6, null);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final void logEvent(int eventId, java.lang.Integer errorCode, java.lang.String errorReason) throws org.json.JSONException {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false);
            if (errorCode != null) {
                mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, errorCode.intValue());
            }
            if (errorReason != null) {
                mediationAdditionalData.put("reason", errorReason);
            }
            com.json.wq.i().a(new com.json.wb(eventId, mediationAdditionalData));
        }

        static /* synthetic */ void logEvent$default(com.json.mediationsdk.adquality.AdQualityBridge.Companion companion, int i, java.lang.Integer num, java.lang.String str, int i2, java.lang.Object obj) throws org.json.JSONException {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            companion.logEvent(i, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final int versionCompare(java.lang.String ver1, java.lang.String ver2) {
            if (android.text.TextUtils.isEmpty(ver1) || android.text.TextUtils.isEmpty(ver2)) {
                return -1;
            }
            int i = 0;
            java.lang.String[] strArr = (java.lang.String[]) kotlin.text.StringsKt.split$default((java.lang.CharSequence) new kotlin.text.Regex("[^0-9.]").replace(ver1, ""), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            java.lang.String[] strArr2 = (java.lang.String[]) kotlin.text.StringsKt.split$default((java.lang.CharSequence) new kotlin.text.Regex("[^0-9.]").replace(ver2, ""), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            while (i < strArr.length && i < strArr2.length && kotlin.jvm.internal.Intrinsics.areEqual(strArr[i], strArr2[i])) {
                i++;
            }
            if (i >= strArr.length || i >= strArr2.length) {
                return java.lang.Integer.signum(strArr.length - strArr2.length);
            }
            int iIntValue = java.lang.Integer.valueOf(strArr[i]).intValue();
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(strArr2[i]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(vals2[i])");
            return java.lang.Integer.signum(kotlin.jvm.internal.Intrinsics.compare(iIntValue, numValueOf.intValue()));
        }

        @kotlin.jvm.JvmStatic
        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }
    }

    public AdQualityBridge(android.content.Context context, java.lang.String appKey, java.lang.String str, com.json.f1 adQualityDataProvider, int i) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityDataProvider, "adQualityDataProvider");
        com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder deviceIdType = new com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            public void adQualitySdkInitFailed(com.ironsource.adqualitysdk.sdk.ISAdQualityInitError isAdQualityInitError, java.lang.String message) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAdQualityInitError, "isAdQualityInitError");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                com.json.mediationsdk.adquality.AdQualityBridge.INSTANCE.logEvent(isAdQualityInitError == com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED ? 82 : 83, java.lang.Integer.valueOf(isAdQualityInitError.getValue()), message);
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + message, 3);
            }

            public void adQualitySdkInitSuccess() throws org.json.JSONException {
                com.json.mediationsdk.adquality.AdQualityBridge.Companion.logEvent$default(com.json.mediationsdk.adquality.AdQualityBridge.INSTANCE, 81, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!android.text.TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        com.json.mediationsdk.adquality.AdQualityBridge.Companion companion = INSTANCE;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            org.json.JSONObject jSONObjectA = adQualityDataProvider.a();
            if (jSONObjectA.length() > 0) {
                deviceIdType.setMetaData(jSONObjectA);
            }
        }
        com.json.mediationsdk.adquality.AdQualityBridge.Companion.logEvent$default(companion, 80, null, null, 6, null);
        com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    @kotlin.jvm.JvmStatic
    public static final boolean adQualityAvailable() {
        return INSTANCE.adQualityAvailable();
    }

    private final com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel convertToAdQualityLogLevel(int logLevel) {
        if (logLevel == 0) {
            return com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE;
        }
        if (logLevel != 2) {
            return logLevel != 3 ? com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.INFO : com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR;
        }
        return com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.WARNING;
    }

    @kotlin.jvm.JvmStatic
    private static final java.lang.String getAdQualitySdkVersion() {
        return INSTANCE.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        java.lang.String strA = com.json.zd.a().a("is_coppa");
        return strA != null && java.lang.Boolean.parseBoolean(strA);
    }

    private final com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType getDeviceIdType() {
        return !android.text.TextUtils.isEmpty(com.json.zd.a().a(com.json.ae.N)) ? com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType.NONE : com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType.GAID;
    }

    @kotlin.jvm.JvmStatic
    private static final boolean isGetVersionMethodExist() {
        return INSTANCE.isGetVersionMethodExist();
    }

    @kotlin.jvm.JvmStatic
    private static final void logEvent(int i, java.lang.Integer num, java.lang.String str) throws org.json.JSONException {
        INSTANCE.logEvent(i, num, str);
    }

    @kotlin.jvm.JvmStatic
    private static final int versionCompare(java.lang.String str, java.lang.String str2) {
        return INSTANCE.versionCompare(str, str2);
    }

    public final void changeUserId(java.lang.String userId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(com.json.mediationsdk.IronSourceSegment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder builder = new com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder();
        if (segment.getSegmentName() != null) {
            builder.setSegmentName(segment.getSegmentName());
        }
        if (segment.getAge() > -1) {
            builder.setAge(segment.getAge());
        }
        if (segment.getGender() != null) {
            builder.setGender(segment.getGender());
        }
        if (segment.getLevel() > -1) {
            builder.setLevel(segment.getLevel());
        }
        if (segment.getIsPaying() != null) {
            builder.setIsPaying(segment.getIsPaying().get());
        }
        if (segment.getIapt() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.getIapt());
        }
        if (segment.getUcd() > 0) {
            builder.setUserCreationDate(segment.getUcd());
        }
        for (android.util.Pair<java.lang.String, java.lang.String> pair : segment.getSegmentData()) {
            java.lang.String key = (java.lang.String) pair.first;
            java.lang.String str = (java.lang.String) pair.second;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
            if (kotlin.text.StringsKt.startsWith$default(key, androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX, false, 2, (java.lang.Object) null)) {
                builder.setCustomData(kotlin.text.StringsKt.removePrefix(key, (java.lang.CharSequence) androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX), str);
            }
        }
        com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}

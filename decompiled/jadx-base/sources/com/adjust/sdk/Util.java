package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class Util {
    private static final java.lang.String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    public static final java.text.DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    private static final java.lang.String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final java.text.SimpleDateFormat dateFormatter = new java.text.SimpleDateFormat(DATE_FORMAT, java.util.Locale.US);
    private static volatile com.adjust.sdk.scheduler.SingleThreadFutureScheduler playAdIdScheduler = null;

    public class a implements java.util.concurrent.Callable<java.lang.Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.content.Context f101a;

        public a(android.content.Context context) {
            this.f101a = context;
        }

        @Override // java.util.concurrent.Callable
        public final java.lang.Object call() {
            try {
                return com.adjust.sdk.Reflection.getAdvertisingInfoObject(this.f101a);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    public class b implements java.util.concurrent.Callable<java.lang.String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.content.Context f102a;
        public final /* synthetic */ java.lang.Object b;

        public b(android.content.Context context, java.lang.Object obj) {
            this.f102a = context;
            this.b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final java.lang.String call() {
            return com.adjust.sdk.Reflection.getPlayAdId(this.f102a, this.b);
        }
    }

    public class c implements java.util.concurrent.Callable<java.lang.Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.content.Context f103a;
        public final /* synthetic */ java.lang.Object b;

        public c(android.content.Context context, java.lang.Object obj) {
            this.f103a = context;
            this.b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final java.lang.Boolean call() {
            return com.adjust.sdk.Reflection.isPlayTrackingEnabled(this.f103a, this.b);
        }
    }

    public class d extends com.adjust.sdk.scheduler.AsyncTaskExecutor<android.content.Context, java.lang.String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnGoogleAdIdReadListener f104a;

        public d(com.adjust.sdk.OnGoogleAdIdReadListener onGoogleAdIdReadListener) {
            this.f104a = onGoogleAdIdReadListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final java.lang.String doInBackground(android.content.Context[] contextArr) {
            com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
            java.lang.String googleAdId = com.adjust.sdk.Util.getGoogleAdId(contextArr[0]);
            logger.debug("GoogleAdId read " + googleAdId, new java.lang.Object[0]);
            return googleAdId;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(java.lang.String str) {
            java.lang.String str2 = str;
            com.adjust.sdk.OnGoogleAdIdReadListener onGoogleAdIdReadListener = this.f104a;
            if (onGoogleAdIdReadListener != null) {
                onGoogleAdIdReadListener.onGoogleAdIdRead(str2);
            }
        }
    }

    public static com.adjust.sdk.AdjustAttribution attributionFromJson(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String strOptString;
        if (jSONObject == null) {
            return null;
        }
        com.adjust.sdk.AdjustAttribution adjustAttribution = new com.adjust.sdk.AdjustAttribution();
        if ("unity".equals(str)) {
            adjustAttribution.trackerToken = jSONObject.optString("tracker_token", "");
            adjustAttribution.trackerName = jSONObject.optString("tracker_name", "");
            adjustAttribution.network = jSONObject.optString("network", "");
            adjustAttribution.campaign = jSONObject.optString("campaign", "");
            adjustAttribution.adgroup = jSONObject.optString("adgroup", "");
            adjustAttribution.creative = jSONObject.optString("creative", "");
            adjustAttribution.clickLabel = jSONObject.optString("click_label", "");
            adjustAttribution.costType = jSONObject.optString("cost_type", "");
            adjustAttribution.costAmount = java.lang.Double.valueOf(jSONObject.optDouble("cost_amount", 0.0d));
            adjustAttribution.costCurrency = jSONObject.optString("cost_currency", "");
            strOptString = jSONObject.optString("fb_install_referrer", "");
        } else {
            adjustAttribution.trackerToken = jSONObject.optString("tracker_token");
            adjustAttribution.trackerName = jSONObject.optString("tracker_name");
            adjustAttribution.network = jSONObject.optString("network");
            adjustAttribution.campaign = jSONObject.optString("campaign");
            adjustAttribution.adgroup = jSONObject.optString("adgroup");
            adjustAttribution.creative = jSONObject.optString("creative");
            adjustAttribution.clickLabel = jSONObject.optString("click_label");
            adjustAttribution.costType = jSONObject.optString("cost_type");
            adjustAttribution.costAmount = java.lang.Double.valueOf(jSONObject.optDouble("cost_amount"));
            adjustAttribution.costCurrency = jSONObject.optString("cost_currency");
            strOptString = jSONObject.optString("fb_install_referrer");
        }
        adjustAttribution.fbInstallReferrer = strOptString;
        return adjustAttribution;
    }

    public static boolean canReadNonPlayIds(com.adjust.sdk.AdjustConfig adjustConfig) {
        return (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) ? false : true;
    }

    public static boolean canReadPlayIds(com.adjust.sdk.AdjustConfig adjustConfig) {
        return (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) ? false : true;
    }

    public static boolean checkPermission(android.content.Context context, java.lang.String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (java.lang.Exception e) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    public static java.lang.String convertToHex(byte[] bArr) {
        return formatString("%0" + (bArr.length << 1) + "x", new java.math.BigInteger(1, bArr));
    }

    public static java.lang.String createUuid() {
        return java.util.UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(java.lang.Enum r0, java.lang.Enum r1) {
        return equalObject(r0, r1);
    }

    public static boolean equalInt(java.lang.Integer num, java.lang.Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(java.lang.Long l, java.lang.Long l2) {
        return equalObject(l, l2);
    }

    public static boolean equalObject(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean equalString(java.lang.String str, java.lang.String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(java.lang.Double d2, java.lang.Double d3) {
        if (d2 == null || d3 == null) {
            return d2 == null && d3 == null;
        }
        return java.lang.Double.doubleToLongBits(d2.doubleValue()) == java.lang.Double.doubleToLongBits(d3.doubleValue());
    }

    public static java.lang.String formatString(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.lang.Object getAdvertisingInfoObject(android.content.Context context, long j) {
        return runSyncInPlayAdIdSchedulerWithTimeout(context, new com.adjust.sdk.Util.a(context), j);
    }

    public static java.lang.String getAndroidId(android.content.Context context) {
        return com.adjust.sdk.AndroidIdUtil.getAndroidId(context);
    }

    public static java.lang.String getCpuAbi() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getGoogleAdId(android.content.Context context) {
        java.lang.String gpsAdid;
        java.lang.Object advertisingInfoObject;
        try {
            com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = com.adjust.sdk.GooglePlayServicesClient.getGooglePlayServicesInfo(context, 11000L);
            gpsAdid = googlePlayServicesInfo != null ? googlePlayServicesInfo.getGpsAdid() : null;
        } catch (java.lang.Exception unused) {
        }
        return (gpsAdid != null || (advertisingInfoObject = getAdvertisingInfoObject(context, 11000L)) == null) ? gpsAdid : getPlayAdId(context, advertisingInfoObject, 1000L);
    }

    public static java.util.Locale getLocale(android.content.res.Configuration configuration) {
        android.os.LocaleList locales = configuration.getLocales();
        if (locales == null || locales.isEmpty()) {
            return null;
        }
        return locales.get(0);
    }

    private static com.adjust.sdk.ILogger getLogger() {
        return com.adjust.sdk.AdjustFactory.getLogger();
    }

    public static java.lang.String getPlayAdId(android.content.Context context, java.lang.Object obj, long j) {
        return (java.lang.String) runSyncInPlayAdIdSchedulerWithTimeout(context, new com.adjust.sdk.Util.b(context, obj), j);
    }

    public static java.lang.String getReasonString(java.lang.String str, java.lang.Throwable th) {
        return th != null ? formatString("%s: %s", str, th) : formatString("%s", str);
    }

    public static java.lang.String getRootCause(java.lang.Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.lang.String string = stringWriter.toString();
        int iIndexOf = string.indexOf("Caused by:");
        return string.substring(iIndexOf, string.indexOf("\n", iIndexOf));
    }

    private static java.lang.String getSdkPrefix(java.lang.String str) {
        java.lang.String[] strArrSplit;
        if (str != null && str.contains("@") && (strArrSplit = str.split("@")) != null && strArrSplit.length == 2) {
            return strArrSplit[0];
        }
        return null;
    }

    public static java.lang.String getSdkPrefixPlatform(java.lang.String str) {
        java.lang.String[] strArrSplit;
        java.lang.String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (strArrSplit = sdkPrefix.split("\\d+", 2)) == null || strArrSplit.length == 0) {
            return null;
        }
        return strArrSplit[0];
    }

    public static java.lang.String getSdkVersion() {
        return com.adjust.sdk.Constants.CLIENT_SDK;
    }

    public static java.lang.String[] getSupportedAbis() {
        return android.os.Build.SUPPORTED_ABIS;
    }

    public static long getWaitingTime(int i, com.adjust.sdk.BackoffStrategy backoffStrategy) {
        int i2 = backoffStrategy.minRetries;
        if (i < i2) {
            return 0L;
        }
        return (long) (java.lang.Math.min(((long) java.lang.Math.pow(2.0d, i - i2)) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static java.lang.String hash(java.lang.String str, java.lang.String str2) {
        try {
            byte[] bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return convertToHex(messageDigest.digest());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(java.lang.Boolean bool, int i) {
        int i2 = i * 37;
        return bool == null ? i2 : bool.hashCode() + i2;
    }

    public static int hashDouble(java.lang.Double d2, int i) {
        int i2 = i * 37;
        return d2 == null ? i2 : d2.hashCode() + i2;
    }

    public static int hashEnum(java.lang.Enum r0, int i) {
        int i2 = i * 37;
        return r0 == null ? i2 : r0.hashCode() + i2;
    }

    public static int hashLong(java.lang.Long l, int i) {
        int i2 = i * 37;
        return l == null ? i2 : l.hashCode() + i2;
    }

    public static int hashObject(java.lang.Object obj, int i) {
        int i2 = i * 37;
        return obj == null ? i2 : obj.hashCode() + i2;
    }

    public static int hashString(java.lang.String str, int i) {
        int i2 = i * 37;
        return str == null ? i2 : str.hashCode() + i2;
    }

    public static boolean isAdjustUninstallDetectionPayload(java.util.Map<java.lang.String, java.lang.String> map) {
        return map != null && map.size() == 1 && java.util.Objects.equals(map.get(com.adjust.sdk.Constants.FCM_PAYLOAD_KEY), com.adjust.sdk.Constants.FCM_PAYLOAD_VALUE);
    }

    public static boolean isEnabledFromActivityStateFile(android.content.Context context) {
        com.adjust.sdk.ActivityState activityState = (com.adjust.sdk.ActivityState) readObject(context, com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME, "Activity state", com.adjust.sdk.ActivityState.class);
        if (activityState == null) {
            return true;
        }
        return activityState.enabled;
    }

    private static boolean isEqualGoogleReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant);
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei);
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery);
    }

    private static boolean isEqualMetaReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeMeta && equalString(referrerDetails.installReferrer, activityState.installReferrerMeta) && equalBoolean(referrerDetails.isClick, activityState.isClickMeta);
    }

    public static boolean isEqualReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str, com.adjust.sdk.ActivityState activityState) {
        if (str.equals("google")) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG)) {
            return isEqualSamsungReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_XIAOMI)) {
            return isEqualXiaomiReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_VIVO)) {
            return isEqualVivoReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_META)) {
            return isEqualMetaReferrerDetails(referrerDetails, activityState);
        }
        return false;
    }

    private static boolean isEqualSamsungReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeSamsung && referrerDetails.installBeginTimestampSeconds == activityState.installBeginSamsung && equalString(referrerDetails.installReferrer, activityState.installReferrerSamsung);
    }

    private static boolean isEqualVivoReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeVivo && referrerDetails.installBeginTimestampSeconds == activityState.installBeginVivo && equalString(referrerDetails.installReferrer, activityState.installReferrerVivo) && equalString(referrerDetails.installVersion, activityState.installVersionVivo);
    }

    private static boolean isEqualXiaomiReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeXiaomi && referrerDetails.installBeginTimestampSeconds == activityState.installBeginXiaomi && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServerXiaomi && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServerXiaomi && equalString(referrerDetails.installReferrer, activityState.installReferrerXiaomi) && equalString(referrerDetails.installVersion, activityState.installVersionXiaomi);
    }

    public static boolean isGooglePlayGamesForPC(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
    }

    public static java.lang.Boolean isPlayTrackingEnabled(android.content.Context context, java.lang.Object obj, long j) {
        return (java.lang.Boolean) runSyncInPlayAdIdSchedulerWithTimeout(context, new com.adjust.sdk.Util.c(context, obj), j);
    }

    public static boolean isUrlFilteredOut(android.net.Uri uri) {
        java.lang.String string;
        return uri == null || (string = uri.toString()) == null || string.length() == 0 || string.matches(com.adjust.sdk.Constants.FB_AUTH_REGEX);
    }

    public static boolean isValidParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        }
        if (!str.equals("")) {
            return true;
        }
        getLogger().error("%s parameter %s is empty", str3, str2);
        return false;
    }

    public static java.util.Map<java.lang.String, java.lang.String> mergeParameters(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        java.util.HashMap map3 = new java.util.HashMap(map);
        com.adjust.sdk.ILogger logger = getLogger();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map2.entrySet()) {
            java.lang.String str2 = (java.lang.String) map3.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return map3;
    }

    private static java.text.DecimalFormat newLocalDecimalFormat() {
        return new java.text.DecimalFormat(com.google.firebase.crashlytics.internal.common.IdManager.DEFAULT_VERSION_NAME, new java.text.DecimalFormatSymbols(java.util.Locale.US));
    }

    public static java.lang.String quote(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !java.util.regex.Pattern.compile("\\s").matcher(str).find() ? str : formatString("'%s'", str);
    }

    private static double randomInRange(double d2, double d3) {
        return (new java.util.Random().nextDouble() * (d3 - d2)) + d2;
    }

    public static boolean readBooleanField(java.io.ObjectInputStream.GetField getField, java.lang.String str, boolean z) {
        try {
            return getField.get(str, z);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return z;
        }
    }

    public static double readDoubleField(java.io.ObjectInputStream.GetField getField, java.lang.String str, double d2) {
        try {
            return getField.get(str, d2);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return d2;
        }
    }

    public static int readIntField(java.io.ObjectInputStream.GetField getField, java.lang.String str, int i) {
        try {
            return getField.get(str, i);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return i;
        }
    }

    public static long readLongField(java.io.ObjectInputStream.GetField getField, java.lang.String str, long j) {
        try {
            return getField.get(str, j);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static <T> T readObject(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Class<T> cls) {
        T t;
        T t2;
        java.lang.Exception e;
        ?? bufferedInputStream;
        ?? r8;
        ?? OpenFileInput;
        T tCast = null;
        try {
            OpenFileInput = context.openFileInput(str);
            try {
                bufferedInputStream = new java.io.BufferedInputStream(OpenFileInput);
                try {
                    OpenFileInput = new java.io.ObjectInputStream(bufferedInputStream);
                    try {
                        tCast = cls.cast(OpenFileInput.readObject());
                        getLogger().debug("Read %s: %s", str2, tCast);
                    } catch (java.lang.ClassCastException e2) {
                        getLogger().error("Failed to cast %s object (%s)", str2, e2.getMessage());
                    } catch (java.lang.ClassNotFoundException e3) {
                        getLogger().error("Failed to find %s class (%s)", str2, e3.getMessage());
                    } catch (java.lang.Exception e4) {
                        getLogger().error("Failed to read %s object (%s)", str2, e4.getMessage());
                    }
                } catch (java.io.FileNotFoundException unused) {
                    getLogger().debug("%s file not found", str2);
                    r8 = bufferedInputStream;
                    OpenFileInput = r8;
                } catch (java.lang.Exception e5) {
                    e = e5;
                    getLogger().error("Failed to open %s file for reading (%s)", str2, e);
                    r8 = bufferedInputStream;
                    OpenFileInput = r8;
                }
            } catch (java.io.FileNotFoundException unused2) {
                T t3 = tCast;
                tCast = (T) OpenFileInput;
                t2 = t3;
                bufferedInputStream = tCast;
                tCast = t2;
                getLogger().debug("%s file not found", str2);
                r8 = bufferedInputStream;
                OpenFileInput = r8;
                if (OpenFileInput != 0) {
                    try {
                        OpenFileInput.close();
                    } catch (java.lang.Exception e6) {
                        getLogger().error("Failed to close %s file for reading (%s)", str2, e6);
                    }
                }
                return tCast;
            } catch (java.lang.Exception e7) {
                e = e7;
                T t4 = tCast;
                tCast = (T) OpenFileInput;
                t = t4;
                T t5 = tCast;
                tCast = t;
                e = e;
                bufferedInputStream = t5;
                getLogger().error("Failed to open %s file for reading (%s)", str2, e);
                r8 = bufferedInputStream;
                OpenFileInput = r8;
                if (OpenFileInput != 0) {
                    OpenFileInput.close();
                }
                return tCast;
            }
        } catch (java.io.FileNotFoundException unused3) {
            t2 = null;
        } catch (java.lang.Exception e8) {
            e = e8;
            t = null;
        }
        if (OpenFileInput != 0) {
            OpenFileInput.close();
        }
        return tCast;
    }

    public static <T> T readObjectField(java.io.ObjectInputStream.GetField getField, java.lang.String str, T t) {
        try {
            return (T) getField.get(str, t);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return t;
        }
    }

    public static java.lang.String readStringField(java.io.ObjectInputStream.GetField getField, java.lang.String str, java.lang.String str2) {
        return (java.lang.String) readObjectField(getField, str, str2);
    }

    public static boolean resolveContentProvider(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().resolveContentProvider(str, 0) != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static <R> R runSyncInPlayAdIdSchedulerWithTimeout(android.content.Context context, java.util.concurrent.Callable<R> callable, long j) {
        if (playAdIdScheduler == null) {
            synchronized (com.adjust.sdk.Util.class) {
                if (playAdIdScheduler == null) {
                    playAdIdScheduler = new com.adjust.sdk.scheduler.SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return (R) playAdIdScheduler.scheduleFutureWithReturn(callable, 0L).get(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    public static <T> void writeObject(T t, android.content.Context context, java.lang.String str, java.lang.String str2) {
        ?? OpenFileOutput;
        ?? bufferedOutputStream;
        ?? r6;
        try {
            OpenFileOutput = context.openFileOutput(str, 0);
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(OpenFileOutput);
                try {
                    OpenFileOutput = new java.io.ObjectOutputStream(bufferedOutputStream);
                    try {
                        OpenFileOutput.writeObject(t);
                        getLogger().debug("Wrote %s: %s", str2, t);
                        r6 = OpenFileOutput;
                    } catch (java.io.NotSerializableException unused) {
                        getLogger().error("Failed to serialize %s", str2);
                        r6 = OpenFileOutput;
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    getLogger().error("Failed to open %s for writing (%s)", str2, e);
                    r6 = bufferedOutputStream;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                bufferedOutputStream = OpenFileOutput;
                getLogger().error("Failed to open %s for writing (%s)", str2, e);
                r6 = bufferedOutputStream;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            OpenFileOutput = 0;
        }
        if (r6 != 0) {
            try {
                r6.close();
            } catch (java.lang.Exception e4) {
                getLogger().error("Failed to close %s file for writing (%s)", str2, e4);
            }
        }
    }

    public static void getGoogleAdId(android.content.Context context, com.adjust.sdk.OnGoogleAdIdReadListener onGoogleAdIdReadListener) {
        new com.adjust.sdk.Util.d(onGoogleAdIdReadListener).execute(context);
    }
}

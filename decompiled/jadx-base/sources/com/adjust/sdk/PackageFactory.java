package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class PackageFactory {
    private static final java.lang.String ADJUST_PREFIX = "adjust_";

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r2 = r11.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage(android.net.Uri uri, long j, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        java.lang.String string;
        if (uri == null || string == null || string.length() == 0) {
            return null;
        }
        try {
            string = java.net.URLDecoder.decode(string, com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (java.lang.IllegalArgumentException e2) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (java.lang.Exception e3) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Deeplink url decoding failed. Message: (%s)", e3.getMessage());
        }
        com.adjust.sdk.AdjustFactory.getLogger().verbose("Url to parse (%s)", string);
        android.net.UrlQuerySanitizer urlQuerySanitizer = new android.net.UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseUrl(string);
        com.adjust.sdk.PackageBuilder packageBuilderQueryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, internalState);
        if (packageBuilderQueryStringClickPackageBuilder == null) {
            return null;
        }
        packageBuilderQueryStringClickPackageBuilder.deeplink = uri.toString();
        packageBuilderQueryStringClickPackageBuilder.clickTimeInMilliseconds = j;
        return packageBuilderQueryStringClickPackageBuilder.buildClickPackage(com.adjust.sdk.Constants.DEEPLINK);
    }

    public static com.adjust.sdk.ActivityPackage buildInstallReferrerSdkClickPackage(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, java.lang.System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.referrer = referrerDetails.installReferrer;
        packageBuilder.clickTimeInSeconds = referrerDetails.referrerClickTimestampSeconds;
        packageBuilder.installBeginTimeInSeconds = referrerDetails.installBeginTimestampSeconds;
        packageBuilder.clickTimeServerInSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        packageBuilder.installBeginTimeServerInSeconds = referrerDetails.installBeginTimestampServerSeconds;
        packageBuilder.installVersion = referrerDetails.installVersion;
        packageBuilder.googlePlayInstant = referrerDetails.googlePlayInstant;
        packageBuilder.isClick = referrerDetails.isClick;
        packageBuilder.referrerApi = str;
        return packageBuilder.buildClickPackage(com.adjust.sdk.Constants.INSTALL_REFERRER);
    }

    public static com.adjust.sdk.ActivityPackage buildPreinstallSdkClickPackage(java.lang.String str, java.lang.String str2, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, java.lang.System.currentTimeMillis());
        packageBuilder.preinstallPayload = str;
        packageBuilder.preinstallLocation = str2;
        return packageBuilder.buildClickPackage(com.adjust.sdk.Constants.PREINSTALL);
    }

    public static com.adjust.sdk.ActivityPackage buildReftagSdkClickPackage(java.lang.String str, long j, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        java.lang.String strDecode = com.adjust.sdk.Constants.MALFORMED;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            strDecode = java.net.URLDecoder.decode(str, com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (java.lang.IllegalArgumentException e2) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (java.lang.Exception e3) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e3.getMessage());
        }
        com.adjust.sdk.AdjustFactory.getLogger().verbose("Referrer to parse (%s)", strDecode);
        android.net.UrlQuerySanitizer urlQuerySanitizer = new android.net.UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(strDecode);
        com.adjust.sdk.PackageBuilder packageBuilderQueryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, internalState);
        if (packageBuilderQueryStringClickPackageBuilder == null) {
            return null;
        }
        packageBuilderQueryStringClickPackageBuilder.referrer = strDecode;
        packageBuilderQueryStringClickPackageBuilder.clickTimeInMilliseconds = j;
        packageBuilderQueryStringClickPackageBuilder.rawReferrer = str;
        return packageBuilderQueryStringClickPackageBuilder.buildClickPackage(com.adjust.sdk.Constants.REFTAG);
    }

    private static com.adjust.sdk.PackageBuilder queryStringClickPackageBuilder(java.util.List<android.net.UrlQuerySanitizer.ParameterValuePair> list, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        if (list == null) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.adjust.sdk.AdjustAttribution adjustAttribution = new com.adjust.sdk.AdjustAttribution();
        for (android.net.UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            readQueryString(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, adjustAttribution);
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = (java.lang.String) linkedHashMap.remove(com.adjust.sdk.Constants.REFTAG);
        if (activityState != null) {
            activityState.lastInterval = jCurrentTimeMillis - activityState.lastActivity;
        }
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, jCurrentTimeMillis);
        packageBuilder.internalState = internalState;
        packageBuilder.extraParameters = linkedHashMap;
        packageBuilder.attribution = adjustAttribution;
        packageBuilder.reftag = str;
        return packageBuilder;
    }

    private static boolean readQueryString(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, com.adjust.sdk.AdjustAttribution adjustAttribution) {
        if (str == null || str2 == null || !str.startsWith(ADJUST_PREFIX)) {
            return false;
        }
        java.lang.String strSubstring = str.substring(7);
        if (strSubstring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (tryToSetAttribution(adjustAttribution, strSubstring, str2)) {
            return true;
        }
        map.put(strSubstring, str2);
        return true;
    }

    private static boolean tryToSetAttribution(com.adjust.sdk.AdjustAttribution adjustAttribution, java.lang.String str, java.lang.String str2) {
        if (str.equals("tracker")) {
            adjustAttribution.trackerName = str2;
            return true;
        }
        if (str.equals("campaign")) {
            adjustAttribution.campaign = str2;
            return true;
        }
        if (str.equals("adgroup")) {
            adjustAttribution.adgroup = str2;
            return true;
        }
        if (!str.equals("creative")) {
            return false;
        }
        adjustAttribution.creative = str2;
        return true;
    }
}

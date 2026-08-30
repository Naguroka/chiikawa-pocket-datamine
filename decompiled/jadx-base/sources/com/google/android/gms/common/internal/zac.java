package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zac {
    private static final androidx.collection.SimpleArrayMap zaa = new androidx.collection.SimpleArrayMap();
    private static java.util.Locale zab;

    public static java.lang.String zaa(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static java.lang.String zab(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
        }
        return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
    }

    public static java.lang.String zac(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strZaa = zaa(context);
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, strZaa);
        }
        if (i == 2) {
            return com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, strZaa);
        }
        if (i == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i == 9) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static java.lang.String zae(android.content.Context context, int i) {
        java.lang.String strZah = i == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i);
        return strZah == null ? context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : strZah;
    }

    public static java.lang.String zaf(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                android.util.Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static java.lang.String zag(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return java.lang.String.format(resources.getConfiguration().locale, strZah, str2);
    }

    private static java.lang.String zah(android.content.Context context, java.lang.String str) {
        androidx.collection.SimpleArrayMap simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            java.util.Locale locale = androidx.core.os.ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(zab)) {
                simpleArrayMap.clear();
                zab = locale;
            }
            java.lang.String str2 = (java.lang.String) simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            android.content.res.Resources remoteResource = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "com.google.android.gms");
            if (identifier == 0) {
                android.util.Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            java.lang.String string = remoteResource.getString(identifier);
            if (!android.text.TextUtils.isEmpty(string)) {
                simpleArrayMap.put(str, string);
                return string;
            }
            android.util.Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }

    public static java.lang.String zad(android.content.Context context, int i) {
        return (i == 6 || i == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i);
    }
}

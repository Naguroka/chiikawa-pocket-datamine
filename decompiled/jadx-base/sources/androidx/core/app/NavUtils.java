package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class NavUtils {
    public static final java.lang.String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final java.lang.String TAG = "NavUtils";

    public static boolean shouldUpRecreateTask(android.app.Activity activity, android.content.Intent intent) {
        return androidx.core.app.NavUtils.Api16Impl.shouldUpRecreateTask(activity, intent);
    }

    public static void navigateUpFromSameTask(android.app.Activity activity) {
        android.content.Intent parentActivityIntent = getParentActivityIntent(activity);
        if (parentActivityIntent == null) {
            throw new java.lang.IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        }
        navigateUpTo(activity, parentActivityIntent);
    }

    public static void navigateUpTo(android.app.Activity activity, android.content.Intent intent) {
        androidx.core.app.NavUtils.Api16Impl.navigateUpTo(activity, intent);
    }

    public static android.content.Intent getParentActivityIntent(android.app.Activity activity) {
        android.content.Intent parentActivityIntent = androidx.core.app.NavUtils.Api16Impl.getParentActivityIntent(activity);
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        java.lang.String parentActivityName = getParentActivityName(activity);
        if (parentActivityName == null) {
            return null;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(activity, parentActivityName);
        try {
            if (getParentActivityName(activity, componentName) == null) {
                return android.content.Intent.makeMainActivity(componentName);
            }
            return new android.content.Intent().setComponent(componentName);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.e(TAG, "getParentActivityIntent: bad parentActivityName '" + parentActivityName + "' in manifest");
            return null;
        }
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context context, java.lang.Class<?> cls) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String parentActivityName = getParentActivityName(context, new android.content.ComponentName(context, cls));
        if (parentActivityName == null) {
            return null;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(context, parentActivityName);
        if (getParentActivityName(context, componentName) == null) {
            return android.content.Intent.makeMainActivity(componentName);
        }
        return new android.content.Intent().setComponent(componentName);
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String parentActivityName = getParentActivityName(context, componentName);
        if (parentActivityName == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), parentActivityName);
        if (getParentActivityName(context, componentName2) == null) {
            return android.content.Intent.makeMainActivity(componentName2);
        }
        return new android.content.Intent().setComponent(componentName2);
    }

    public static java.lang.String getParentActivityName(android.app.Activity activity) {
        try {
            return getParentActivityName(activity, activity.getComponentName());
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static java.lang.String getParentActivityName(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, android.os.Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString(PARENT_ACTIVITY)) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? context.getPackageName() + string : string;
    }

    private NavUtils() {
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static boolean shouldUpRecreateTask(android.app.Activity activity, android.content.Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }

        static boolean navigateUpTo(android.app.Activity activity, android.content.Intent intent) {
            return activity.navigateUpTo(intent);
        }

        static android.content.Intent getParentActivityIntent(android.app.Activity activity) {
            return activity.getParentActivityIntent();
        }
    }
}

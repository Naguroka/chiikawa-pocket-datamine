package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class AppLaunchChecker {
    private static final java.lang.String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
    private static final java.lang.String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";

    public static boolean hasStartedFromLauncher(android.content.Context context) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0).getBoolean(KEY_STARTED_FROM_LAUNCHER, false);
    }

    public static void onActivityCreate(android.app.Activity activity) {
        android.content.Intent intent;
        android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences(SHARED_PREFS_NAME, 0);
        if (sharedPreferences.getBoolean(KEY_STARTED_FROM_LAUNCHER, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(androidx.core.content.IntentCompat.CATEGORY_LEANBACK_LAUNCHER)) {
            sharedPreferences.edit().putBoolean(KEY_STARTED_FROM_LAUNCHER, true).apply();
        }
    }

    @java.lang.Deprecated
    public AppLaunchChecker() {
    }
}

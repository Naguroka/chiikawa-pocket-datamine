package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements androidx.media3.common.Player.Listener {
    public static final long DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS = java.util.concurrent.TimeUnit.MINUTES.toMillis(5);
    private static final java.lang.String EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT = "EXTRA_CLOSE_ON_CONNECT";
    private static final java.lang.String EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY = "EXTRA_CONNECTION_ONLY";
    private static final java.lang.String EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE = "android.bluetooth.devicepicker.extra.FILTER_TYPE";
    private static final java.lang.String EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME = "com.android.settings.panel.extra.PACKAGE_NAME";
    private static final int FILTER_TYPE_AUDIO = 1;
    private static final java.lang.String OUTPUT_SWITCHER_INTENT_ACTION_NAME = "com.android.settings.panel.action.MEDIA_OUTPUT";
    private final android.content.Context applicationContext;
    private final long autoResumeTimeoutAfterUnsuitableOutputSuppressionMs;
    private final androidx.media3.common.util.Clock clock;
    private long unsuitableOutputPlaybackSuppressionStartRealtimeMs;

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(android.content.Context context) {
        this(context, DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS);
    }

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(android.content.Context context, long j) {
        this(context, j, androidx.media3.common.util.SystemClock.DEFAULT);
    }

    WearUnsuitableOutputPlaybackSuppressionResolverListener(android.content.Context context, long j, androidx.media3.common.util.Clock clock) {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        this.applicationContext = context.getApplicationContext();
        this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs = j;
        this.clock = clock;
        this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
        if (androidx.media3.common.util.Util.isWear(this.applicationContext)) {
            if ((events.contains(6) || events.contains(5)) && player.getPlayWhenReady() && player.getPlaybackSuppressionReason() == 3) {
                player.pause();
                this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = this.clock.elapsedRealtime();
                if (events.contains(5)) {
                    launchSystemMediaOutputSwitcherUi(this.applicationContext);
                    return;
                }
                return;
            }
            if (!events.contains(6) || player.getPlaybackSuppressionReason() != 0 || this.unsuitableOutputPlaybackSuppressionStartRealtimeMs == androidx.media3.common.C.TIME_UNSET || this.clock.elapsedRealtime() - this.unsuitableOutputPlaybackSuppressionStartRealtimeMs >= this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs) {
                return;
            }
            this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = androidx.media3.common.C.TIME_UNSET;
            player.play();
        }
    }

    private static void launchSystemMediaOutputSwitcherUi(android.content.Context context) {
        android.content.Intent intentPutExtra = new android.content.Intent(OUTPUT_SWITCHER_INTENT_ACTION_NAME).addFlags(268435456).putExtra(EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME, context.getPackageName());
        android.content.ComponentName systemOrSystemUpdatedAppComponent = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra);
        if (systemOrSystemUpdatedAppComponent != null) {
            intentPutExtra.setComponent(systemOrSystemUpdatedAppComponent);
            context.startActivity(intentPutExtra);
            return;
        }
        android.content.Intent intentPutExtra2 = new android.content.Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE, 1);
        android.content.ComponentName systemOrSystemUpdatedAppComponent2 = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra2);
        if (systemOrSystemUpdatedAppComponent2 != null) {
            intentPutExtra2.setComponent(systemOrSystemUpdatedAppComponent2);
            context.startActivity(intentPutExtra2);
        }
    }

    private static android.content.ComponentName getSystemOrSystemUpdatedAppComponent(android.content.Context context, android.content.Intent intent) {
        java.util.Iterator<android.content.pm.ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 129) != 0) {
                return new android.content.ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }
}

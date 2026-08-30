package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
public final class Utils {
    private static final java.lang.String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    private static com.google.firebase.installations.Utils singleton;
    private final com.google.firebase.installations.time.Clock clock;
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = java.util.concurrent.TimeUnit.HOURS.toSeconds(1);
    private static final java.util.regex.Pattern API_KEY_FORMAT = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");

    private Utils(com.google.firebase.installations.time.Clock clock) {
        this.clock = clock;
    }

    public static com.google.firebase.installations.Utils getInstance() {
        return getInstance(com.google.firebase.installations.time.SystemClock.getInstance());
    }

    public static com.google.firebase.installations.Utils getInstance(com.google.firebase.installations.time.Clock clock) {
        if (singleton == null) {
            singleton = new com.google.firebase.installations.Utils(clock);
        }
        return singleton;
    }

    public boolean isAuthTokenExpired(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        return android.text.TextUtils.isEmpty(persistedInstallationEntry.getAuthToken()) || persistedInstallationEntry.getTokenCreationEpochInSecs() + persistedInstallationEntry.getExpiresInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }

    public long currentTimeInSecs() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public long currentTimeInMillis() {
        return this.clock.currentTimeMillis();
    }

    static boolean isValidAppIdFormat(java.lang.String str) {
        return str.contains(APP_ID_IDENTIFICATION_SUBSTRING);
    }

    static boolean isValidApiKeyFormat(java.lang.String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (java.lang.Math.random() * 1000.0d);
    }
}

package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes5.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = java.util.concurrent.TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);
    private int attemptCount;
    private long nextRequestTime;
    private final com.google.firebase.installations.Utils utils;

    private static boolean isRetryableError(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    RequestLimiter(com.google.firebase.installations.Utils utils) {
        this.utils = utils;
    }

    RequestLimiter() {
        this.utils = com.google.firebase.installations.Utils.getInstance();
    }

    public synchronized void setNextRequestTime(int i) {
        if (isSuccessfulOrRequiresNewFidCreation(i)) {
            resetBackoffStrategy();
            return;
        }
        this.attemptCount++;
        this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i);
    }

    private synchronized void resetBackoffStrategy() {
        this.attemptCount = 0;
    }

    private synchronized long getBackoffDuration(int i) {
        if (!isRetryableError(i)) {
            return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
        }
        return (long) java.lang.Math.min(java.lang.Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
    }

    public synchronized boolean isRequestAllowed() {
        return this.attemptCount == 0 || this.utils.currentTimeInMillis() > this.nextRequestTime;
    }
}

package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class OverflowAvoidingLockSupport {
    static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    private OverflowAvoidingLockSupport() {
    }

    static void parkNanos(@javax.annotation.CheckForNull java.lang.Object blocker, long nanos) {
        java.util.concurrent.locks.LockSupport.parkNanos(blocker, java.lang.Math.min(nanos, MAX_NANOSECONDS_THRESHOLD));
    }
}

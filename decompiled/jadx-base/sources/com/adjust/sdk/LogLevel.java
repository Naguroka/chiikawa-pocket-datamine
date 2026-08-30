package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    SUPPRESS(8);

    final int androidLogLevel;

    LogLevel(int i) {
        this.androidLogLevel = i;
    }

    public int getAndroidLogLevel() {
        return this.androidLogLevel;
    }
}

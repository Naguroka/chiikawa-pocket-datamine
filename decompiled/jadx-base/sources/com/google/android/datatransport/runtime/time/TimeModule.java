package com.google.android.datatransport.runtime.time;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.Module
public abstract class TimeModule {
    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.time.Clock eventClock() {
        return new com.google.android.datatransport.runtime.time.WallTimeClock();
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.time.Clock uptimeClock() {
        return new com.google.android.datatransport.runtime.time.UptimeClock();
    }
}

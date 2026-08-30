package com.google.android.datatransport.runtime.time;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeModule_UptimeClockFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.time.Clock> {
    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.time.Clock get() {
        return uptimeClock();
    }

    public static com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory create() {
        return com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.InstanceHolder.INSTANCE;
    }

    public static com.google.android.datatransport.runtime.time.Clock uptimeClock() {
        return (com.google.android.datatransport.runtime.time.Clock) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.android.datatransport.runtime.time.TimeModule.uptimeClock());
    }

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory INSTANCE = new com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory();

        private InstanceHolder() {
        }
    }
}

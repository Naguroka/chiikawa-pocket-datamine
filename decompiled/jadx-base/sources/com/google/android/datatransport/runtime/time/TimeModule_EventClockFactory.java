package com.google.android.datatransport.runtime.time;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeModule_EventClockFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.time.Clock> {
    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.time.Clock get() {
        return eventClock();
    }

    public static com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory create() {
        return com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.InstanceHolder.INSTANCE;
    }

    public static com.google.android.datatransport.runtime.time.Clock eventClock() {
        return (com.google.android.datatransport.runtime.time.Clock) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.android.datatransport.runtime.time.TimeModule.eventClock());
    }

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory INSTANCE = new com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory();

        private InstanceHolder() {
        }
    }
}

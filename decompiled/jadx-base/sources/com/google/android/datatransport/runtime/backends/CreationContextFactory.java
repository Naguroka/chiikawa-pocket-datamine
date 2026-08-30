package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
class CreationContextFactory {
    private final android.content.Context applicationContext;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    @javax.inject.Inject
    CreationContextFactory(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2) {
        this.applicationContext = context;
        this.wallClock = clock;
        this.monotonicClock = clock2;
    }

    com.google.android.datatransport.runtime.backends.CreationContext create(java.lang.String str) {
        return com.google.android.datatransport.runtime.backends.CreationContext.create(this.applicationContext, this.wallClock, this.monotonicClock, str);
    }
}

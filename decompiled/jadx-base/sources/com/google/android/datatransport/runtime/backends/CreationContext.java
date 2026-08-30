package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CreationContext {
    private static final java.lang.String DEFAULT_BACKEND_NAME = "cct";

    public abstract android.content.Context getApplicationContext();

    public abstract java.lang.String getBackendName();

    public abstract com.google.android.datatransport.runtime.time.Clock getMonotonicClock();

    public abstract com.google.android.datatransport.runtime.time.Clock getWallClock();

    public static com.google.android.datatransport.runtime.backends.CreationContext create(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2) {
        return new com.google.android.datatransport.runtime.backends.AutoValue_CreationContext(context, clock, clock2, DEFAULT_BACKEND_NAME);
    }

    public static com.google.android.datatransport.runtime.backends.CreationContext create(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, java.lang.String str) {
        return new com.google.android.datatransport.runtime.backends.AutoValue_CreationContext(context, clock, clock2, str);
    }
}

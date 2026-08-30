package com.google.firebase.crashlytics.ktx;

/* JADX INFO: compiled from: KeyValueBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", com.ironsource.y8.h.W, "", "", "value", "", "", "", "", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyValueBuilder {
    private final com.google.firebase.crashlytics.FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(com.google.firebase.crashlytics.FirebaseCrashlytics crashlytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    @kotlin.Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final void key(java.lang.String key, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @kotlin.Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final void key(java.lang.String key, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @kotlin.Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final void key(java.lang.String key, float value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @kotlin.Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final void key(java.lang.String key, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @kotlin.Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final void key(java.lang.String key, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @kotlin.Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final void key(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }
}

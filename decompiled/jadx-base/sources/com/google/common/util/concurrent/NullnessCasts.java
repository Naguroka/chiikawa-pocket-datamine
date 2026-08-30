package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class NullnessCasts {
    @com.google.common.util.concurrent.ParametricNullness
    static <T> T uncheckedCastNullableTToT(@javax.annotation.CheckForNull T t) {
        return t;
    }

    @com.google.common.util.concurrent.ParametricNullness
    static <T> T uncheckedNull() {
        return null;
    }

    private NullnessCasts() {
    }
}

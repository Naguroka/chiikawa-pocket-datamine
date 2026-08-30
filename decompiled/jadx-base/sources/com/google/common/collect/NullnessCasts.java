package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class NullnessCasts {
    @com.google.common.collect.ParametricNullness
    static <T> T uncheckedCastNullableTToT(@javax.annotation.CheckForNull T t) {
        return t;
    }

    @com.google.common.collect.ParametricNullness
    static <T> T unsafeNull() {
        return null;
    }

    private NullnessCasts() {
    }
}

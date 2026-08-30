package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
final class NullnessCasts {
    @com.google.common.base.ParametricNullness
    static <T> T uncheckedCastNullableTToT(@javax.annotation.CheckForNull T t) {
        return t;
    }

    private NullnessCasts() {
    }
}

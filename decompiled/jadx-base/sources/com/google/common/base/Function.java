package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public interface Function<F, T> {
    @com.google.common.base.ParametricNullness
    T apply(@com.google.common.base.ParametricNullness F input);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);
}

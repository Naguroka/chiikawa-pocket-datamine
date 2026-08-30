package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public interface Predicate<T> {
    boolean apply(@com.google.common.base.ParametricNullness T input);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);
}

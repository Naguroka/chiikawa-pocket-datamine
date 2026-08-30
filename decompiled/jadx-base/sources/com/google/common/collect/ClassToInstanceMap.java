package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface ClassToInstanceMap<B> extends java.util.Map<java.lang.Class<? extends B>, B> {
    @javax.annotation.CheckForNull
    <T extends B> T getInstance(java.lang.Class<T> type);

    @javax.annotation.CheckForNull
    <T extends B> T putInstance(java.lang.Class<T> type, @com.google.common.collect.ParametricNullness T value);
}

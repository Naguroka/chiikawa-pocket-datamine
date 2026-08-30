package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public interface LineProcessor<T> {
    @com.google.common.io.ParametricNullness
    T getResult();

    boolean processLine(java.lang.String line) throws java.io.IOException;
}

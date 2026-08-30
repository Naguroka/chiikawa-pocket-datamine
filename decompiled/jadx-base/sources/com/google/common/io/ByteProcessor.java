package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.DoNotMock("Implement it normally")
public interface ByteProcessor<T> {
    @com.google.common.io.ParametricNullness
    T getResult();

    boolean processBytes(byte[] buf, int off, int len) throws java.io.IOException;
}

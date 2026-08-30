package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use Interners.new*Interner")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Interner<E> {
    E intern(E sample);
}

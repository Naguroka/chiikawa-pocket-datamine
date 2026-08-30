package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use an instance of one of the Finalizable*Reference classes")
@com.google.common.base.ElementTypesAreNonnullByDefault
public interface FinalizableReference {
    void finalizeReferent();
}

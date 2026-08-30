package com.google.android.datatransport.runtime.retries;

/* JADX INFO: loaded from: classes4.dex */
public interface Function<TInput, TResult, TException extends java.lang.Throwable> {
    TResult apply(TInput tinput) throws java.lang.Throwable;
}

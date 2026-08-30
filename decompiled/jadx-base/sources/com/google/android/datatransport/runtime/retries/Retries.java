package com.google.android.datatransport.runtime.retries;

/* JADX INFO: loaded from: classes4.dex */
public final class Retries {
    private Retries() {
    }

    public static <TInput, TResult, TException extends java.lang.Throwable> TResult retry(int i, TInput tinput, com.google.android.datatransport.runtime.retries.Function<TInput, TResult, TException> function, com.google.android.datatransport.runtime.retries.RetryStrategy<TInput, TResult> retryStrategy) throws java.lang.Throwable {
        TResult tresultApply;
        if (i < 1) {
            return function.apply(tinput);
        }
        do {
            tresultApply = function.apply(tinput);
            tinput = retryStrategy.shouldRetry(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return tresultApply;
    }
}

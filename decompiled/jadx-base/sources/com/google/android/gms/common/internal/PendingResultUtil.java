package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PendingResultUtil {
    private static final com.google.android.gms.common.internal.zas zaa = new com.google.android.gms.common.internal.zao();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public interface ResultConverter<R extends com.google.android.gms.common.api.Result, T> {
        T convert(R r);
    }

    public static <R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.Response<R>> com.google.android.gms.tasks.Task<T> toResponseTask(com.google.android.gms.common.api.PendingResult<R> pendingResult, T t) {
        return toTask(pendingResult, new com.google.android.gms.common.internal.zaq(t));
    }

    public static <R extends com.google.android.gms.common.api.Result, T> com.google.android.gms.tasks.Task<T> toTask(com.google.android.gms.common.api.PendingResult<R> pendingResult, com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<R, T> resultConverter) {
        com.google.android.gms.common.internal.zas zasVar = zaa;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        pendingResult.addStatusListener(new com.google.android.gms.common.internal.zap(pendingResult, taskCompletionSource, resultConverter, zasVar));
        return taskCompletionSource.getTask();
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.tasks.Task<java.lang.Void> toVoidTask(com.google.android.gms.common.api.PendingResult<R> pendingResult) {
        return toTask(pendingResult, new com.google.android.gms.common.internal.zar());
    }
}

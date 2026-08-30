package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class TaskUtil {
    public static void setResultOrApiException(com.google.android.gms.common.api.Status status, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        setResultOrApiException(status, null, taskCompletionSource);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.tasks.Task<java.lang.Void> toVoidTaskThatFailsOnFalse(com.google.android.gms.tasks.Task<java.lang.Boolean> task) {
        return task.continueWith(new com.google.android.gms.common.api.internal.zacu());
    }

    public static <ResultT> boolean trySetResultOrApiException(com.google.android.gms.common.api.Status status, ResultT resultt, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.isSuccess() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
    }

    public static <ResultT> void setResultOrApiException(com.google.android.gms.common.api.Status status, ResultT resultt, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }

    public static <ResultT> boolean trySetResultOrApiException(com.google.android.gms.common.api.Status status, ResultT resultt, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        return trySetResultOrApiException(status, resultt, taskCompletionSource);
    }

    public static <ResultT> void setResultOrApiException(com.google.android.gms.common.api.Status status, ResultT resultt, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        setResultOrApiException(status, resultt, taskCompletionSource);
    }
}

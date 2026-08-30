package com.unity3d.services.core.request.metrics;

/* JADX INFO: loaded from: classes6.dex */
public class ScarMetric {
    private static final java.lang.String ASYNC_PREFIX = "async";
    private static final java.lang.String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_%s_fetch_failure";
    private static final java.lang.String HB_SIGNALS_FETCH_START = "native_hb_signals_%s_fetch_start";
    private static final java.lang.String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_%s_fetch_success";
    private static final java.lang.String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_%s_upload_failure";
    private static final java.lang.String HB_SIGNALS_UPLOAD_START = "native_hb_signals_%s_upload_start";
    private static final java.lang.String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_%s_upload_success";
    private static final java.lang.String REASON = "reason";
    private static final java.lang.String SYNC_PREFIX = "sync";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - _fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - _uploadStartTime);
    }

    public static com.unity3d.services.core.request.metrics.Metric hbSignalsFetchStart(boolean z) {
        _fetchStartTime = java.lang.System.nanoTime();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z ? ASYNC_PREFIX : "sync";
        return new com.unity3d.services.core.request.metrics.Metric(java.lang.String.format(HB_SIGNALS_FETCH_START, objArr), null);
    }

    public static com.unity3d.services.core.request.metrics.Metric hbSignalsFetchSuccess(boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z ? ASYNC_PREFIX : "sync";
        return new com.unity3d.services.core.request.metrics.Metric(java.lang.String.format(HB_SIGNALS_FETCH_SUCCESS, objArr), java.lang.Long.valueOf(getTotalFetchTime()));
    }

    public static com.unity3d.services.core.request.metrics.Metric hbSignalsFetchFailure(boolean z, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z ? ASYNC_PREFIX : "sync";
        return new com.unity3d.services.core.request.metrics.Metric(java.lang.String.format(HB_SIGNALS_FETCH_FAILURE, objArr), java.lang.Long.valueOf(getTotalFetchTime()), map);
    }

    public static com.unity3d.services.core.request.metrics.Metric hbSignalsUploadStart(boolean z) {
        _uploadStartTime = java.lang.System.nanoTime();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z ? ASYNC_PREFIX : "sync";
        return new com.unity3d.services.core.request.metrics.Metric(java.lang.String.format(HB_SIGNALS_UPLOAD_START, objArr), null);
    }

    public static com.unity3d.services.core.request.metrics.Metric hbSignalsUploadSuccess(boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z ? ASYNC_PREFIX : "sync";
        return new com.unity3d.services.core.request.metrics.Metric(java.lang.String.format(HB_SIGNALS_UPLOAD_SUCCESS, objArr), java.lang.Long.valueOf(getTotalUploadTime()));
    }

    public static com.unity3d.services.core.request.metrics.Metric hbSignalsUploadFailure(boolean z, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z ? ASYNC_PREFIX : "sync";
        return new com.unity3d.services.core.request.metrics.Metric(java.lang.String.format(HB_SIGNALS_UPLOAD_FAILURE, objArr), java.lang.Long.valueOf(getTotalUploadTime()), map);
    }
}

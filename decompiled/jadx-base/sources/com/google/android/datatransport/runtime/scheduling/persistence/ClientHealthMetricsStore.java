package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public interface ClientHealthMetricsStore {
    com.google.android.datatransport.runtime.firebase.transport.ClientMetrics loadClientMetrics();

    void recordLogEventDropped(long j, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason, java.lang.String str);

    void resetClientMetrics();
}

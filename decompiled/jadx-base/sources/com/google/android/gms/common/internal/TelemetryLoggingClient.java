package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface TelemetryLoggingClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.internal.TelemetryLoggingOptions> {
    com.google.android.gms.tasks.Task<java.lang.Void> log(com.google.android.gms.common.internal.TelemetryData telemetryData);
}

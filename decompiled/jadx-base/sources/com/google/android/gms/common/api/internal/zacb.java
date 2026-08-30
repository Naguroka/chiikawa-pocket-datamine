package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zacb implements com.google.android.gms.tasks.OnCompleteListener {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private final long zad;
    private final long zae;

    zacb(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i, com.google.android.gms.common.api.internal.ApiKey apiKey, long j, long j2, java.lang.String str, java.lang.String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    static com.google.android.gms.common.api.internal.zacb zaa(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i, com.google.android.gms.common.api.internal.ApiKey apiKey) {
        boolean methodTimingTelemetryEnabled;
        if (!googleApiManager.zaD()) {
            return null;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            methodTimingTelemetryEnabled = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            methodTimingTelemetryEnabled = config.getMethodTimingTelemetryEnabled();
            com.google.android.gms.common.api.internal.zabo zaboVarZai = googleApiManager.zai(apiKey);
            if (zaboVarZai != null) {
                if (!(zaboVarZai.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                    return null;
                }
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zaboVarZai.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfigurationZab = zab(zaboVarZai, baseGmsClient, i);
                    if (connectionTelemetryConfigurationZab == null) {
                        return null;
                    }
                    zaboVarZai.zaq();
                    methodTimingTelemetryEnabled = connectionTelemetryConfigurationZab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new com.google.android.gms.common.api.internal.zacb(googleApiManager, i, apiKey, methodTimingTelemetryEnabled ? java.lang.System.currentTimeMillis() : 0L, methodTimingTelemetryEnabled ? android.os.SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabo zaboVar, com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zaboVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a A[PHI: r9
  0x009a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0098, B:44:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        com.google.android.gms.common.api.internal.zabo zaboVarZai;
        int version;
        int i;
        int i2;
        int errorCode;
        long j;
        long j2;
        int iElapsedRealtime;
        if (this.zaa.zaD()) {
            com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zaboVarZai = this.zaa.zai(this.zac)) != null && (zaboVarZai.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zaboVarZai.zaf();
                int i3 = 0;
                boolean methodTimingTelemetryEnabled = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int statusCode = 100;
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    version = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfigurationZab = zab(zaboVarZai, baseGmsClient, this.zab);
                        if (connectionTelemetryConfigurationZab == null) {
                            return;
                        }
                        boolean z = connectionTelemetryConfigurationZab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                        maxMethodInvocationsInBatch = connectionTelemetryConfigurationZab.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z;
                    }
                    i2 = batchPeriodMillis;
                    i = maxMethodInvocationsInBatch;
                } else {
                    version = 0;
                    i = 100;
                    i2 = 5000;
                }
                com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else if (task.isCanceled()) {
                    i3 = statusCode;
                    errorCode = -1;
                } else {
                    java.lang.Exception exception = task.getException();
                    if (exception instanceof com.google.android.gms.common.api.ApiException) {
                        com.google.android.gms.common.api.Status status = ((com.google.android.gms.common.api.ApiException) exception).getStatus();
                        statusCode = status.getStatusCode();
                        com.google.android.gms.common.ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult == null) {
                            i3 = statusCode;
                            errorCode = -1;
                        } else {
                            errorCode = connectionResult.getErrorCode();
                            i3 = statusCode;
                        }
                    } else {
                        i3 = 101;
                        errorCode = -1;
                    }
                }
                if (methodTimingTelemetryEnabled) {
                    long j3 = this.zad;
                    long j4 = this.zae;
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    iElapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j4);
                    j2 = jCurrentTimeMillis;
                    j = j3;
                } else {
                    j = 0;
                    j2 = 0;
                    iElapsedRealtime = -1;
                }
                googleApiManager.zaw(new com.google.android.gms.common.internal.MethodInvocation(this.zab, i3, errorCode, j, j2, null, null, gCoreServiceId, iElapsedRealtime), version, i2, i);
            }
        }
    }
}

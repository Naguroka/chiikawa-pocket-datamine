package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zao extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.internal.TelemetryLoggingClient {
    public static final /* synthetic */ int zab = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey zac;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zad;
    private static final com.google.android.gms.common.api.Api zae;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zac = clientKey;
        com.google.android.gms.common.internal.service.zan zanVar = new com.google.android.gms.common.internal.service.zan();
        zad = zanVar;
        zae = new com.google.android.gms.common.api.Api("ClientTelemetry.API", zanVar, clientKey);
    }

    public zao(android.content.Context context, com.google.android.gms.common.internal.TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.internal.TelemetryLoggingOptions>) zae, telemetryLoggingOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> log(final com.google.android.gms.common.internal.TelemetryData telemetryData) {
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        builder.setFeatures(com.google.android.gms.internal.base.zad.zaa);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.internal.service.zam
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                int i = com.google.android.gms.common.internal.service.zao.zab;
                ((com.google.android.gms.common.internal.service.zai) ((com.google.android.gms.common.internal.service.zap) obj).getService()).zae(telemetryData);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(builder.build());
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends android.content.BroadcastReceiver {
    static /* synthetic */ void lambda$onReceive$0() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String queryParameter = intent.getData().getQueryParameter("backendName");
        java.lang.String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = java.lang.Integer.valueOf(intent.getData().getQueryParameter(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.TransportRuntime.initialize(context);
        com.google.android.datatransport.runtime.TransportContext.Builder priority = com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(queryParameter).setPriority(com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(iIntValue));
        if (queryParameter2 != null) {
            priority.setExtras(android.util.Base64.decode(queryParameter2, 0));
        }
        com.google.android.datatransport.runtime.TransportRuntime.getInstance().getUploader().upload(priority.build(), i, new java.lang.Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
            }
        });
    }
}

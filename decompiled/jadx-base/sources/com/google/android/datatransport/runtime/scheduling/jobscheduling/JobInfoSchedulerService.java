package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
public class JobInfoSchedulerService extends android.app.job.JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final android.app.job.JobParameters jobParameters) {
        java.lang.String string = jobParameters.getExtras().getString("backendName");
        java.lang.String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.TransportRuntime.initialize(getApplicationContext());
        com.google.android.datatransport.runtime.TransportContext.Builder priority = com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(string).setPriority(com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(i));
        if (string2 != null) {
            priority.setExtras(android.util.Base64.decode(string2, 0));
        }
        com.google.android.datatransport.runtime.TransportRuntime.getInstance().getUploader().upload(priority.build(), i2, new java.lang.Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m746x1ff6a938(jobParameters);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: lambda$onStartJob$0$com-google-android-datatransport-runtime-scheduling-jobscheduling-JobInfoSchedulerService, reason: not valid java name */
    /* synthetic */ void m746x1ff6a938(android.app.job.JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}

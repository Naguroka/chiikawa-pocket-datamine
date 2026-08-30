package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
public class JobInfoScheduler implements com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler {
    static final java.lang.String ATTEMPT_NUMBER = "attemptNumber";
    static final java.lang.String BACKEND_NAME = "backendName";
    static final java.lang.String EVENT_PRIORITY = "priority";
    static final java.lang.String EXTRAS = "extras";
    private static final java.lang.String LOG_TAG = "JobInfoScheduler";
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;

    public JobInfoScheduler(android.content.Context context, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig) {
        this.context = context;
        this.eventStore = eventStore;
        this.config = schedulerConfig;
    }

    int getJobId(com.google.android.datatransport.runtime.TransportContext transportContext) {
        java.util.zip.Adler32 adler32 = new java.util.zip.Adler32();
        adler32.update(this.context.getPackageName().getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING)));
        adler32.update(transportContext.getBackendName().getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING)));
        adler32.update(java.nio.ByteBuffer.allocate(4).putInt(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority())).array());
        if (transportContext.getExtras() != null) {
            adler32.update(transportContext.getExtras());
        }
        return (int) adler32.getValue();
    }

    private boolean isJobServiceOn(android.app.job.JobScheduler jobScheduler, int i, int i2) {
        for (android.app.job.JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt(ATTEMPT_NUMBER);
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        schedule(transportContext, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext transportContext, int i, boolean z) {
        android.content.ComponentName componentName = new android.content.ComponentName(this.context, (java.lang.Class<?>) com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class);
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) this.context.getSystemService("jobscheduler");
        int jobId = getJobId(transportContext);
        if (!z && isJobServiceOn(jobScheduler, jobId, i)) {
            com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.eventStore.getNextCallTime(transportContext);
        android.app.job.JobInfo.Builder builderConfigureJob = this.config.configureJob(new android.app.job.JobInfo.Builder(jobId, componentName), transportContext.getPriority(), nextCallTime, i);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt(ATTEMPT_NUMBER, i);
        persistableBundle.putString(BACKEND_NAME, transportContext.getBackendName());
        persistableBundle.putInt("priority", com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority()));
        if (transportContext.getExtras() != null) {
            persistableBundle.putString(EXTRAS, android.util.Base64.encodeToString(transportContext.getExtras(), 0));
        }
        builderConfigureJob.setExtras(persistableBundle);
        com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, java.lang.Integer.valueOf(jobId), java.lang.Long.valueOf(this.config.getScheduleDelay(transportContext.getPriority(), nextCallTime, i)), java.lang.Long.valueOf(nextCallTime), java.lang.Integer.valueOf(i));
        jobScheduler.schedule(builderConfigureJob.build());
    }
}

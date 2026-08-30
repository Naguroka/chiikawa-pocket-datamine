package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
public class AlarmManagerScheduler implements com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler {
    static final java.lang.String ATTEMPT_NUMBER = "attemptNumber";
    static final java.lang.String BACKEND_NAME = "backendName";
    static final java.lang.String EVENT_PRIORITY = "priority";
    static final java.lang.String EXTRAS = "extras";
    private static final java.lang.String LOG_TAG = "AlarmManagerScheduler";
    private android.app.AlarmManager alarmManager;
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;

    public AlarmManagerScheduler(android.content.Context context, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig) {
        this(context, eventStore, (android.app.AlarmManager) context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM), clock, schedulerConfig);
    }

    AlarmManagerScheduler(android.content.Context context, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, android.app.AlarmManager alarmManager, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig) {
        this.context = context;
        this.eventStore = eventStore;
        this.alarmManager = alarmManager;
        this.clock = clock;
        this.config = schedulerConfig;
    }

    boolean isJobServiceOn(android.content.Intent intent) {
        return android.app.PendingIntent.getBroadcast(this.context, 0, intent, 603979776) != null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        schedule(transportContext, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext transportContext, int i, boolean z) {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.appendQueryParameter(BACKEND_NAME, transportContext.getBackendName());
        builder.appendQueryParameter("priority", java.lang.String.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority())));
        if (transportContext.getExtras() != null) {
            builder.appendQueryParameter(EXTRAS, android.util.Base64.encodeToString(transportContext.getExtras(), 0));
        }
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(ATTEMPT_NUMBER, i);
        if (!z && isJobServiceOn(intent)) {
            com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.eventStore.getNextCallTime(transportContext);
        long scheduleDelay = this.config.getScheduleDelay(transportContext.getPriority(), nextCallTime, i);
        com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, java.lang.Long.valueOf(scheduleDelay), java.lang.Long.valueOf(nextCallTime), java.lang.Integer.valueOf(i));
        this.alarmManager.set(3, this.clock.getTime() + scheduleDelay, android.app.PendingIntent.getBroadcast(this.context, 0, intent, 67108864));
    }
}

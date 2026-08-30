package com.applovin.impl.communicator;

/* JADX INFO: loaded from: classes3.dex */
public class MessagingServiceImpl implements com.applovin.communicator.AppLovinCommunicatorMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ScheduledThreadPoolExecutor f689a;
    private final java.lang.Object b = new java.lang.Object();

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(final com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = a();
        this.f689a = scheduledThreadPoolExecutorA;
        scheduledThreadPoolExecutorA.execute(new java.lang.Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastSync(appLovinCommunicatorMessage, null);
            }
        });
    }

    public java.lang.String toString() {
        return "MessagingServiceImpl{}";
    }

    private java.util.concurrent.ScheduledThreadPoolExecutor a() {
        synchronized (this.b) {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f689a;
            if (scheduledThreadPoolExecutor != null) {
                return scheduledThreadPoolExecutor;
            }
            return new java.util.concurrent.ScheduledThreadPoolExecutor(1, new java.util.concurrent.ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.ThreadFactory
                public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                    return com.applovin.impl.communicator.MessagingServiceImpl.a(runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Thread a(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}

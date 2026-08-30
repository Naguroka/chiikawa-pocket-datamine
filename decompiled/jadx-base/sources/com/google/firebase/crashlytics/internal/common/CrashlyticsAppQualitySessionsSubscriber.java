package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements com.google.firebase.sessions.api.SessionSubscriber {
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore appQualitySessionsStore;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;

    public CrashlyticsAppQualitySessionsSubscriber(com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.appQualitySessionsStore = new com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore(fileStore);
    }

    public java.lang.String getAppQualitySessionId(java.lang.String str) {
        return this.appQualitySessionsStore.getAppQualitySessionId(str);
    }

    public void setSessionId(java.lang.String str) {
        this.appQualitySessionsStore.rotateSessionId(str);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(com.google.firebase.sessions.api.SessionSubscriber.SessionDetails sessionDetails) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("App Quality Sessions session changed: " + sessionDetails);
        this.appQualitySessionsStore.rotateAppQualitySessionId(sessionDetails.getSessionId());
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public com.google.firebase.sessions.api.SessionSubscriber.Name getSessionSubscriberName() {
        return com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS;
    }
}

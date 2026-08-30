package com.google.firebase.sessions;

/* JADX INFO: compiled from: EventGDTLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "(Lcom/google/firebase/inject/Provider;)V", "encode", "", "value", "Lcom/google/firebase/sessions/SessionEvent;", "log", "", "sessionEvent", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventGDTLogger implements com.google.firebase.sessions.EventGDTLoggerInterface {
    private static final java.lang.String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    private static final java.lang.String TAG = "EventGDTLogger";
    private final com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> transportFactoryProvider;

    @javax.inject.Inject
    public EventGDTLogger(com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> transportFactoryProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(com.google.firebase.sessions.SessionEvent sessionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().getTransport(AQS_LOG_SOURCE, com.google.firebase.sessions.SessionEvent.class, com.google.android.datatransport.Encoding.of("json"), new com.google.android.datatransport.Transformer() { // from class: com.google.firebase.sessions.EventGDTLogger$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.Transformer
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.encode((com.google.firebase.sessions.SessionEvent) obj);
            }
        }).send(com.google.android.datatransport.Event.ofData(sessionEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(com.google.firebase.sessions.SessionEvent value) {
        java.lang.String strEncode = com.google.firebase.sessions.SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strEncode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        android.util.Log.d(TAG, "Session Event Type: " + value.getEventType().name());
        byte[] bytes = strEncode.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}

package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
public final class ForcedSender {
    private static final java.lang.String LOG_TAG = "ForcedSender";

    public static void sendBlocking(com.google.android.datatransport.Transport<?> transport, com.google.android.datatransport.Priority priority) {
        if (transport instanceof com.google.android.datatransport.runtime.TransportImpl) {
            com.google.android.datatransport.runtime.TransportRuntime.getInstance().getUploader().logAndUpdateState(((com.google.android.datatransport.runtime.TransportImpl) transport).getTransportContext().withPriority(priority), 1);
        } else {
            com.google.android.datatransport.runtime.logging.Logging.w(LOG_TAG, "Expected instance of `TransportImpl`, got `%s`.", transport);
        }
    }

    private ForcedSender() {
    }
}

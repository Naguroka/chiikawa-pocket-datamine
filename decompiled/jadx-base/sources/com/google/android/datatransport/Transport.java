package com.google.android.datatransport;

/* JADX INFO: loaded from: classes4.dex */
public interface Transport<T> {
    void schedule(com.google.android.datatransport.Event<T> event, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback);

    void send(com.google.android.datatransport.Event<T> event);
}

package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface EventsClient {
    void increment(java.lang.String str, int i);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> load(boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> loadByIds(boolean z, java.lang.String... strArr);
}

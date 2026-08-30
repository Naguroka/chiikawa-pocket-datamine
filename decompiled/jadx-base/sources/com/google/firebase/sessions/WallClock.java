package com.google.firebase.sessions;

/* JADX INFO: compiled from: TimeProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/WallClock;", "Lcom/google/firebase/sessions/TimeProvider;", "()V", "US_PER_MILLIS", "", "currentTimeUs", "elapsedRealtime", "Lkotlin/time/Duration;", "elapsedRealtime-UwyO8pc", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WallClock implements com.google.firebase.sessions.TimeProvider {
    public static final com.google.firebase.sessions.WallClock INSTANCE = new com.google.firebase.sessions.WallClock();
    private static final long US_PER_MILLIS = 1000;

    private WallClock() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc */
    public long mo884elapsedRealtimeUwyO8pc() {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.DurationKt.toDuration(android.os.SystemClock.elapsedRealtime(), kotlin.time.DurationUnit.MILLISECONDS);
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return java.lang.System.currentTimeMillis() * 1000;
    }
}

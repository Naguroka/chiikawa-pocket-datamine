package com.google.android.datatransport.runtime.time;

/* JADX INFO: loaded from: classes4.dex */
public class UptimeClock implements com.google.android.datatransport.runtime.time.Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return android.os.SystemClock.elapsedRealtime();
    }
}

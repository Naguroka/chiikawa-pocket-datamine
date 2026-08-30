package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(androidx.media3.ui.TimeBar timeBar, long j);

        void onScrubStart(androidx.media3.ui.TimeBar timeBar, long j);

        void onScrubStop(androidx.media3.ui.TimeBar timeBar, long j, boolean z);
    }

    void addListener(androidx.media3.ui.TimeBar.OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(androidx.media3.ui.TimeBar.OnScrubListener onScrubListener);

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setKeyCountIncrement(int i);

    void setKeyTimeIncrement(long j);

    void setPosition(long j);
}

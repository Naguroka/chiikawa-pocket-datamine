package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface BandwidthMeter {
    void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    androidx.media3.datasource.TransferListener getTransferListener();

    void removeEventListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener);

    public interface EventListener {
        void onBandwidthSample(int i, long j, long j2);

        public static final class EventDispatcher {
            private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> listeners = new java.util.concurrent.CopyOnWriteArrayList<>();

            public void addListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
                androidx.media3.common.util.Assertions.checkNotNull(handler);
                androidx.media3.common.util.Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener(handler, eventListener));
            }

            public void removeListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
                for (androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.listener == eventListener) {
                        handlerAndListener.release();
                        this.listeners.remove(handlerAndListener);
                    }
                }
            }

            public void bandwidthSample(final int i, final long j, final long j2) {
                for (final androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : this.listeners) {
                    if (!handlerAndListener.released) {
                        handlerAndListener.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.upstream.BandwidthMeter$EventListener$EventDispatcher$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                handlerAndListener.listener.onBandwidthSample(i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            static final class HandlerAndListener {
                private final android.os.Handler handler;
                private final androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener listener;
                private boolean released;

                public HandlerAndListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }

                public void release() {
                    this.released = true;
                }
            }
        }
    }
}

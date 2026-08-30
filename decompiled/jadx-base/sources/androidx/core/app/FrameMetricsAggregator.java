package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    private static final int LAST_INDEX = 8;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;
    private final androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl mInstance;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i) {
        this.mInstance = new androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl(i);
    }

    public void add(android.app.Activity activity) {
        this.mInstance.add(activity);
    }

    public android.util.SparseIntArray[] remove(android.app.Activity activity) {
        return this.mInstance.remove(activity);
    }

    public android.util.SparseIntArray[] stop() {
        return this.mInstance.stop();
    }

    public android.util.SparseIntArray[] reset() {
        return this.mInstance.reset();
    }

    public android.util.SparseIntArray[] getMetrics() {
        return this.mInstance.getMetrics();
    }

    private static class FrameMetricsBaseImpl {
        public void add(android.app.Activity activity) {
        }

        public android.util.SparseIntArray[] getMetrics() {
            return null;
        }

        public android.util.SparseIntArray[] remove(android.app.Activity activity) {
            return null;
        }

        public android.util.SparseIntArray[] reset() {
            return null;
        }

        public android.util.SparseIntArray[] stop() {
            return null;
        }

        FrameMetricsBaseImpl() {
        }
    }

    private static class FrameMetricsApi24Impl extends androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl {
        private static final int NANOS_PER_MS = 1000000;
        private static final int NANOS_ROUNDING_VALUE = 500000;
        private static android.os.Handler sHandler;
        private static android.os.HandlerThread sHandlerThread;
        int mTrackingFlags;
        android.util.SparseIntArray[] mMetrics = new android.util.SparseIntArray[9];
        private final java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> mActivities = new java.util.ArrayList<>();
        android.view.Window.OnFrameMetricsAvailableListener mListener = new android.view.Window.OnFrameMetricsAvailableListener() { // from class: androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i) {
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 1) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[0], frameMetrics.getMetric(8));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 2) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl2 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl2.addDurationItem(frameMetricsApi24Impl2.mMetrics[1], frameMetrics.getMetric(1));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 4) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl3 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl3.addDurationItem(frameMetricsApi24Impl3.mMetrics[2], frameMetrics.getMetric(3));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 8) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl4 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl4.addDurationItem(frameMetricsApi24Impl4.mMetrics[3], frameMetrics.getMetric(4));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 16) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl5 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl5.addDurationItem(frameMetricsApi24Impl5.mMetrics[4], frameMetrics.getMetric(5));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 64) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl6 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl6.addDurationItem(frameMetricsApi24Impl6.mMetrics[6], frameMetrics.getMetric(7));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 32) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl7 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl7.addDurationItem(frameMetricsApi24Impl7.mMetrics[5], frameMetrics.getMetric(6));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 128) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl8 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl8.addDurationItem(frameMetricsApi24Impl8.mMetrics[7], frameMetrics.getMetric(0));
                }
                if ((androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this.mTrackingFlags & 256) != 0) {
                    androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl frameMetricsApi24Impl9 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.this;
                    frameMetricsApi24Impl9.addDurationItem(frameMetricsApi24Impl9.mMetrics[8], frameMetrics.getMetric(2));
                }
            }
        };

        FrameMetricsApi24Impl(int i) {
            this.mTrackingFlags = i;
        }

        void addDurationItem(android.util.SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public void add(android.app.Activity activity) {
            if (sHandlerThread == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("FrameMetricsAggregator");
                sHandlerThread = handlerThread;
                handlerThread.start();
                sHandler = new android.os.Handler(sHandlerThread.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                android.util.SparseIntArray[] sparseIntArrayArr = this.mMetrics;
                if (sparseIntArrayArr[i] == null && (this.mTrackingFlags & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new android.util.SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.mListener, sHandler);
            this.mActivities.add(new java.lang.ref.WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] remove(android.app.Activity activity) {
            for (java.lang.ref.WeakReference<android.app.Activity> weakReference : this.mActivities) {
                if (weakReference.get() == activity) {
                    this.mActivities.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] stop() {
            for (int size = this.mActivities.size() - 1; size >= 0; size--) {
                java.lang.ref.WeakReference<android.app.Activity> weakReference = this.mActivities.get(size);
                android.app.Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
                    this.mActivities.remove(size);
                }
            }
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] getMetrics() {
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] reset() {
            android.util.SparseIntArray[] sparseIntArrayArr = this.mMetrics;
            this.mMetrics = new android.util.SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }
}

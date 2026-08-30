package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public interface HandlerWrapper {

    public interface Message {
        androidx.media3.common.util.HandlerWrapper getTarget();

        void sendToTarget();
    }

    android.os.Looper getLooper();

    boolean hasMessages(int i);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, int i2, int i3);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, int i2, int i3, java.lang.Object obj);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, java.lang.Object obj);

    boolean post(java.lang.Runnable runnable);

    boolean postAtFrontOfQueue(java.lang.Runnable runnable);

    boolean postDelayed(java.lang.Runnable runnable, long j);

    void removeCallbacksAndMessages(java.lang.Object obj);

    void removeMessages(int i);

    boolean sendEmptyMessage(int i);

    boolean sendEmptyMessageAtTime(int i, long j);

    boolean sendEmptyMessageDelayed(int i, int i2);

    boolean sendMessageAtFrontOfQueue(androidx.media3.common.util.HandlerWrapper.Message message);
}

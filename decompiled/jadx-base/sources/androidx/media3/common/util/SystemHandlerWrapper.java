package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
final class SystemHandlerWrapper implements androidx.media3.common.util.HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;
    private static final java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> messagePool = new java.util.ArrayList(50);
    private final android.os.Handler handler;

    public SystemHandlerWrapper(android.os.Handler handler) {
        this.handler = handler;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public android.os.Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean hasMessages(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i != 0);
        return this.handler.hasMessages(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, java.lang.Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, obj), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, int i2, int i3) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, i2, i3), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, int i2, int i3, java.lang.Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(androidx.media3.common.util.HandlerWrapper.Message message) {
        return ((androidx.media3.common.util.SystemHandlerWrapper.SystemMessage) message).sendAtFrontOfQueue(this.handler);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessage(int i) {
        return this.handler.sendEmptyMessage(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.handler.sendEmptyMessageDelayed(i, i2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.handler.sendEmptyMessageAtTime(i, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeMessages(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i != 0);
        this.handler.removeMessages(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeCallbacksAndMessages(java.lang.Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean post(java.lang.Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postDelayed(java.lang.Runnable runnable, long j) {
        return this.handler.postDelayed(runnable, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    private static androidx.media3.common.util.SystemHandlerWrapper.SystemMessage obtainSystemMessage() {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage systemMessageRemove;
        java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> list = messagePool;
        synchronized (list) {
            if (list.isEmpty()) {
                systemMessageRemove = new androidx.media3.common.util.SystemHandlerWrapper.SystemMessage();
            } else {
                systemMessageRemove = list.remove(list.size() - 1);
            }
        }
        return systemMessageRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(androidx.media3.common.util.SystemHandlerWrapper.SystemMessage systemMessage) {
        java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> list = messagePool;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(systemMessage);
            }
        }
    }

    private static final class SystemMessage implements androidx.media3.common.util.HandlerWrapper.Message {
        private androidx.media3.common.util.SystemHandlerWrapper handler;
        private android.os.Message message;

        private SystemMessage() {
        }

        public androidx.media3.common.util.SystemHandlerWrapper.SystemMessage setMessage(android.os.Message message, androidx.media3.common.util.SystemHandlerWrapper systemHandlerWrapper) {
            this.message = message;
            this.handler = systemHandlerWrapper;
            return this;
        }

        public boolean sendAtFrontOfQueue(android.os.Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((android.os.Message) androidx.media3.common.util.Assertions.checkNotNull(this.message));
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((android.os.Message) androidx.media3.common.util.Assertions.checkNotNull(this.message)).sendToTarget();
            recycle();
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public androidx.media3.common.util.HandlerWrapper getTarget() {
            return (androidx.media3.common.util.HandlerWrapper) androidx.media3.common.util.Assertions.checkNotNull(this.handler);
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            androidx.media3.common.util.SystemHandlerWrapper.recycleMessage(this);
        }
    }
}

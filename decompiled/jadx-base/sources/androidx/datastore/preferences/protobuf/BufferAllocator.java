package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
abstract class BufferAllocator {
    private static final androidx.datastore.preferences.protobuf.BufferAllocator UNPOOLED = new androidx.datastore.preferences.protobuf.BufferAllocator() { // from class: androidx.datastore.preferences.protobuf.BufferAllocator.1
        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public androidx.datastore.preferences.protobuf.AllocatedBuffer allocateHeapBuffer(int capacity) {
            return androidx.datastore.preferences.protobuf.AllocatedBuffer.wrap(new byte[capacity]);
        }

        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public androidx.datastore.preferences.protobuf.AllocatedBuffer allocateDirectBuffer(int capacity) {
            return androidx.datastore.preferences.protobuf.AllocatedBuffer.wrap(java.nio.ByteBuffer.allocateDirect(capacity));
        }
    };

    public abstract androidx.datastore.preferences.protobuf.AllocatedBuffer allocateDirectBuffer(int capacity);

    public abstract androidx.datastore.preferences.protobuf.AllocatedBuffer allocateHeapBuffer(int capacity);

    BufferAllocator() {
    }

    public static androidx.datastore.preferences.protobuf.BufferAllocator unpooled() {
        return UNPOOLED;
    }
}

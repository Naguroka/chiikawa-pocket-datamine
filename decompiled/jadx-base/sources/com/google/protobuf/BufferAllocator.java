package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
abstract class BufferAllocator {
    private static final com.google.protobuf.BufferAllocator UNPOOLED = new com.google.protobuf.BufferAllocator() { // from class: com.google.protobuf.BufferAllocator.1
        @Override // com.google.protobuf.BufferAllocator
        public com.google.protobuf.AllocatedBuffer allocateHeapBuffer(int i) {
            return com.google.protobuf.AllocatedBuffer.wrap(new byte[i]);
        }

        @Override // com.google.protobuf.BufferAllocator
        public com.google.protobuf.AllocatedBuffer allocateDirectBuffer(int i) {
            return com.google.protobuf.AllocatedBuffer.wrap(java.nio.ByteBuffer.allocateDirect(i));
        }
    };

    public abstract com.google.protobuf.AllocatedBuffer allocateDirectBuffer(int i);

    public abstract com.google.protobuf.AllocatedBuffer allocateHeapBuffer(int i);

    BufferAllocator() {
    }

    public static com.google.protobuf.BufferAllocator unpooled() {
        return UNPOOLED;
    }
}

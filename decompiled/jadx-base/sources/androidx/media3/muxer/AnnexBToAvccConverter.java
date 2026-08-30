package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
public interface AnnexBToAvccConverter {
    public static final androidx.media3.muxer.AnnexBToAvccConverter DEFAULT = new androidx.media3.muxer.AnnexBToAvccConverter() { // from class: androidx.media3.muxer.AnnexBToAvccConverter$$ExternalSyntheticLambda0
        @Override // androidx.media3.muxer.AnnexBToAvccConverter
        public final java.nio.ByteBuffer process(java.nio.ByteBuffer byteBuffer) {
            return androidx.media3.muxer.AnnexBToAvccConverter.lambda$static$0(byteBuffer);
        }
    };

    java.nio.ByteBuffer process(java.nio.ByteBuffer byteBuffer);

    static /* synthetic */ java.nio.ByteBuffer lambda$static$0(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        androidx.media3.common.util.Assertions.checkArgument(byteBuffer.position() == 0, "The input buffer should have position set to 0.");
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> immutableListFindNalUnits = androidx.media3.muxer.AnnexBUtils.findNalUnits(byteBuffer);
        int iRemaining = 0;
        for (int i = 0; i < immutableListFindNalUnits.size(); i++) {
            iRemaining += immutableListFindNalUnits.get(i).remaining() + 4;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(iRemaining);
        for (int i2 = 0; i2 < immutableListFindNalUnits.size(); i2++) {
            java.nio.ByteBuffer byteBuffer2 = immutableListFindNalUnits.get(i2);
            byteBufferAllocate.putInt(byteBuffer2.remaining());
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }
}

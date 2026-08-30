package androidx.media3.extractor.metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleMetadataDecoder implements androidx.media3.extractor.metadata.MetadataDecoder {
    protected abstract androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer);

    @Override // androidx.media3.extractor.metadata.MetadataDecoder
    public final androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(metadataInputBuffer.data);
        androidx.media3.common.util.Assertions.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return decode(metadataInputBuffer, byteBuffer);
    }
}

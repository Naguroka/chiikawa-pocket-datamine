package androidx.media3.extractor.metadata.emsg;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessageDecoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        return new androidx.media3.common.Metadata(decode(new androidx.media3.common.util.ParsableByteArray(byteBuffer.array(), byteBuffer.limit())));
    }

    public androidx.media3.extractor.metadata.emsg.EventMessage decode(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        return new androidx.media3.extractor.metadata.emsg.EventMessage((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString()), (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString()), parsableByteArray.readLong(), parsableByteArray.readLong(), java.util.Arrays.copyOfRange(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.limit()));
    }
}

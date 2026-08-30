package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Peeker {
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(10);

    public androidx.media3.common.Metadata peekId3Data(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) throws java.io.IOException {
        androidx.media3.common.Metadata metadataDecode = null;
        int i = 0;
        while (true) {
            try {
                extractorInput.peekFully(this.scratch.getData(), 0, 10);
                this.scratch.setPosition(0);
                if (this.scratch.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.scratch.skipBytes(3);
                int synchSafeInt = this.scratch.readSynchSafeInt();
                int i2 = synchSafeInt + 10;
                if (metadataDecode == null) {
                    byte[] bArr = new byte[i2];
                    java.lang.System.arraycopy(this.scratch.getData(), 0, bArr, 0, 10);
                    extractorInput.peekFully(bArr, 10, synchSafeInt);
                    metadataDecode = new androidx.media3.extractor.metadata.id3.Id3Decoder(framePredicate).decode(bArr, i2);
                } else {
                    extractorInput.advancePeekPosition(synchSafeInt);
                }
                i += i2;
            } catch (java.io.EOFException unused) {
            }
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        return metadataDecode;
    }
}

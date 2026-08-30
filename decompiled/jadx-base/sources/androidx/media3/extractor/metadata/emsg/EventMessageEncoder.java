package androidx.media3.extractor.metadata.emsg;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessageEncoder {
    private final java.io.ByteArrayOutputStream byteArrayOutputStream;
    private final java.io.DataOutputStream dataOutputStream;

    public EventMessageEncoder() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
        this.byteArrayOutputStream = byteArrayOutputStream;
        this.dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
    }

    public byte[] encode(androidx.media3.extractor.metadata.emsg.EventMessage eventMessage) {
        this.byteArrayOutputStream.reset();
        try {
            writeNullTerminatedString(this.dataOutputStream, eventMessage.schemeIdUri);
            writeNullTerminatedString(this.dataOutputStream, eventMessage.value != null ? eventMessage.value : "");
            this.dataOutputStream.writeLong(eventMessage.durationMs);
            this.dataOutputStream.writeLong(eventMessage.id);
            this.dataOutputStream.write(eventMessage.messageData);
            this.dataOutputStream.flush();
            return this.byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static void writeNullTerminatedString(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}

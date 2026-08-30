package org.jacoco.core.data;

/* JADX INFO: loaded from: classes6.dex */
public class ExecutionDataWriter implements org.jacoco.core.data.ISessionInfoVisitor, org.jacoco.core.data.IExecutionDataVisitor {
    public static final byte BLOCK_EXECUTIONDATA = 17;
    public static final byte BLOCK_HEADER = 1;
    public static final byte BLOCK_SESSIONINFO = 16;
    public static final char FORMAT_VERSION = 4103;
    public static final char MAGIC_NUMBER = 49344;
    protected final org.jacoco.core.internal.data.CompactDataOutput out;

    public ExecutionDataWriter(java.io.OutputStream outputStream) throws java.io.IOException {
        this.out = new org.jacoco.core.internal.data.CompactDataOutput(outputStream);
        writeHeader();
    }

    private void writeHeader() throws java.io.IOException {
        this.out.writeByte(1);
        this.out.writeChar(49344);
        this.out.writeChar(FORMAT_VERSION);
    }

    public void flush() throws java.io.IOException {
        this.out.flush();
    }

    @Override // org.jacoco.core.data.ISessionInfoVisitor
    public void visitSessionInfo(org.jacoco.core.data.SessionInfo sessionInfo) {
        try {
            this.out.writeByte(16);
            this.out.writeUTF(sessionInfo.getId());
            this.out.writeLong(sessionInfo.getStartTimeStamp());
            this.out.writeLong(sessionInfo.getDumpTimeStamp());
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // org.jacoco.core.data.IExecutionDataVisitor
    public void visitClassExecution(org.jacoco.core.data.ExecutionData executionData) {
        if (executionData.hasHits()) {
            try {
                this.out.writeByte(17);
                this.out.writeLong(executionData.getId());
                this.out.writeUTF(executionData.getName());
                this.out.writeBooleanArray(executionData.getProbes());
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public static final byte[] getFileHeader() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            new org.jacoco.core.data.ExecutionDataWriter(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}

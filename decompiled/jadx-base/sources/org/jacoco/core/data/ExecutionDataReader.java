package org.jacoco.core.data;

/* JADX INFO: loaded from: classes6.dex */
public class ExecutionDataReader {
    protected final org.jacoco.core.internal.data.CompactDataInput in;
    private org.jacoco.core.data.ISessionInfoVisitor sessionInfoVisitor = null;
    private org.jacoco.core.data.IExecutionDataVisitor executionDataVisitor = null;
    private boolean firstBlock = true;

    public ExecutionDataReader(java.io.InputStream inputStream) {
        this.in = new org.jacoco.core.internal.data.CompactDataInput(inputStream);
    }

    public void setSessionInfoVisitor(org.jacoco.core.data.ISessionInfoVisitor iSessionInfoVisitor) {
        this.sessionInfoVisitor = iSessionInfoVisitor;
    }

    public void setExecutionDataVisitor(org.jacoco.core.data.IExecutionDataVisitor iExecutionDataVisitor) {
        this.executionDataVisitor = iExecutionDataVisitor;
    }

    public boolean read() throws java.io.IOException {
        byte b;
        do {
            int i = this.in.read();
            if (i == -1) {
                return false;
            }
            b = (byte) i;
            if (this.firstBlock && b != 1) {
                throw new java.io.IOException("Invalid execution data file.");
            }
            this.firstBlock = false;
        } while (readBlock(b));
        return true;
    }

    protected boolean readBlock(byte b) throws java.io.IOException {
        if (b == 1) {
            readHeader();
            return true;
        }
        if (b == 16) {
            readSessionInfo();
            return true;
        }
        if (b == 17) {
            readExecutionData();
            return true;
        }
        throw new java.io.IOException(java.lang.String.format("Unknown block type %x.", java.lang.Byte.valueOf(b)));
    }

    private void readHeader() throws java.io.IOException {
        if (this.in.readChar() != 49344) {
            throw new java.io.IOException("Invalid execution data file.");
        }
        char c = this.in.readChar();
        if (c != org.jacoco.core.data.ExecutionDataWriter.FORMAT_VERSION) {
            throw new org.jacoco.core.data.IncompatibleExecDataVersionException(c);
        }
    }

    private void readSessionInfo() throws java.io.IOException {
        if (this.sessionInfoVisitor == null) {
            throw new java.io.IOException("No session info visitor.");
        }
        this.sessionInfoVisitor.visitSessionInfo(new org.jacoco.core.data.SessionInfo(this.in.readUTF(), this.in.readLong(), this.in.readLong()));
    }

    private void readExecutionData() throws java.io.IOException {
        if (this.executionDataVisitor == null) {
            throw new java.io.IOException("No execution data visitor.");
        }
        this.executionDataVisitor.visitClassExecution(new org.jacoco.core.data.ExecutionData(this.in.readLong(), this.in.readUTF(), this.in.readBooleanArray()));
    }
}

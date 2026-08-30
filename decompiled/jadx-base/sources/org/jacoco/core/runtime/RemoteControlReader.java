package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class RemoteControlReader extends org.jacoco.core.data.ExecutionDataReader {
    private org.jacoco.core.runtime.IRemoteCommandVisitor remoteCommandVisitor;

    public RemoteControlReader(java.io.InputStream inputStream) throws java.io.IOException {
        super(inputStream);
    }

    @Override // org.jacoco.core.data.ExecutionDataReader
    protected boolean readBlock(byte b) throws java.io.IOException {
        if (b == 32) {
            return false;
        }
        if (b == 64) {
            readDumpCommand();
            return true;
        }
        return super.readBlock(b);
    }

    public void setRemoteCommandVisitor(org.jacoco.core.runtime.IRemoteCommandVisitor iRemoteCommandVisitor) {
        this.remoteCommandVisitor = iRemoteCommandVisitor;
    }

    private void readDumpCommand() throws java.io.IOException {
        if (this.remoteCommandVisitor == null) {
            throw new java.io.IOException("No remote command visitor.");
        }
        this.remoteCommandVisitor.visitDumpCommand(this.in.readBoolean(), this.in.readBoolean());
    }
}

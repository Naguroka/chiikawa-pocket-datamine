package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class RemoteControlWriter extends org.jacoco.core.data.ExecutionDataWriter implements org.jacoco.core.runtime.IRemoteCommandVisitor {
    public static final byte BLOCK_CMDDUMP = 64;
    public static final byte BLOCK_CMDOK = 32;

    public RemoteControlWriter(java.io.OutputStream outputStream) throws java.io.IOException {
        super(outputStream);
    }

    public void sendCmdOk() throws java.io.IOException {
        this.out.writeByte(32);
    }

    @Override // org.jacoco.core.runtime.IRemoteCommandVisitor
    public void visitDumpCommand(boolean z, boolean z2) throws java.io.IOException {
        this.out.writeByte(64);
        this.out.writeBoolean(z);
        this.out.writeBoolean(z2);
    }
}

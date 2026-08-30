package org.jacoco.core.data;

/* JADX INFO: loaded from: classes6.dex */
public class IncompatibleExecDataVersionException extends java.io.IOException {
    private static final long serialVersionUID = 1;
    private final int actualVersion;

    public IncompatibleExecDataVersionException(int i) {
        super(java.lang.String.format("Cannot read execution data version 0x%x. This version of JaCoCo uses execution data version 0x%x.", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(org.jacoco.core.data.ExecutionDataWriter.FORMAT_VERSION)));
        this.actualVersion = i;
    }

    public int getExpectedVersion() {
        return org.jacoco.core.data.ExecutionDataWriter.FORMAT_VERSION;
    }

    public int getActualVersion() {
        return this.actualVersion;
    }
}

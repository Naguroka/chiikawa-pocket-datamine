package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRuntime implements org.jacoco.core.runtime.IRuntime {
    private static final java.util.Random RANDOM = new java.util.Random();
    protected org.jacoco.core.runtime.RuntimeData data;

    @Override // org.jacoco.core.runtime.IRuntime
    public void startup(org.jacoco.core.runtime.RuntimeData runtimeData) throws java.lang.Exception {
        this.data = runtimeData;
    }

    public static java.lang.String createRandomId() {
        return java.lang.Integer.toHexString(RANDOM.nextInt());
    }
}

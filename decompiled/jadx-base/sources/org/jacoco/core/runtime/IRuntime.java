package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public interface IRuntime extends org.jacoco.core.runtime.IExecutionDataAccessorGenerator {
    void shutdown();

    void startup(org.jacoco.core.runtime.RuntimeData runtimeData) throws java.lang.Exception;
}

package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class LoggerRuntime extends org.jacoco.core.runtime.AbstractRuntime {
    private static final java.lang.String CHANNEL = "jacoco-runtime";
    private final java.lang.String key = java.lang.Integer.toHexString(hashCode());
    private final java.util.logging.Logger logger = configureLogger();
    private final java.util.logging.Handler handler = new org.jacoco.core.runtime.LoggerRuntime.RuntimeHandler();

    private java.util.logging.Logger configureLogger() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CHANNEL);
        logger.setUseParentHandlers(false);
        logger.setLevel(java.util.logging.Level.ALL);
        return logger;
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, java.lang.String str, int i, org.objectweb.asm.MethodVisitor methodVisitor) {
        org.jacoco.core.runtime.RuntimeData.generateArgumentArray(j, str, i, methodVisitor);
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn(CHANNEL);
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
        methodVisitor.visitInsn(95);
        methodVisitor.visitFieldInsn(org.objectweb.asm.Opcodes.GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
        methodVisitor.visitInsn(95);
        methodVisitor.visitLdcInsn(this.key);
        methodVisitor.visitInsn(95);
        methodVisitor.visitMethodInsn(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V", false);
        methodVisitor.visitInsn(3);
        methodVisitor.visitInsn(50);
        methodVisitor.visitTypeInsn(192, org.jacoco.core.internal.instr.InstrSupport.DATAFIELD_DESC);
        return 5;
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(org.jacoco.core.runtime.RuntimeData runtimeData) throws java.lang.Exception {
        super.startup(runtimeData);
        this.logger.addHandler(this.handler);
    }

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
        this.logger.removeHandler(this.handler);
    }

    private class RuntimeHandler extends java.util.logging.Handler {
        @Override // java.util.logging.Handler
        public void flush() {
        }

        private RuntimeHandler() {
        }

        @Override // java.util.logging.Handler
        public void publish(java.util.logging.LogRecord logRecord) {
            if (org.jacoco.core.runtime.LoggerRuntime.this.key.equals(logRecord.getMessage())) {
                org.jacoco.core.runtime.LoggerRuntime.this.data.getProbes(logRecord.getParameters());
            }
        }

        @Override // java.util.logging.Handler
        public void close() throws java.lang.SecurityException {
            org.jacoco.core.runtime.LoggerRuntime.this.logger.addHandler(org.jacoco.core.runtime.LoggerRuntime.this.handler);
        }
    }
}

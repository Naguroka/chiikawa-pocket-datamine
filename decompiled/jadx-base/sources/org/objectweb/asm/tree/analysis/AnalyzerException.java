package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class AnalyzerException extends java.lang.Exception {
    private static final long serialVersionUID = 3154190448018943333L;
    public final transient org.objectweb.asm.tree.AbstractInsnNode node;

    public AnalyzerException(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.lang.String str) {
        super(str);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.lang.String str, java.lang.Object obj, org.objectweb.asm.tree.analysis.Value value) {
        super((str == null ? "Expected " : str + ": expected ") + obj + ", but found " + value);
        this.node = abstractInsnNode;
    }
}

package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Interpreter<V extends org.objectweb.asm.tree.analysis.Value> {
    protected final int api;

    public abstract V binaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, V v, V v2) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V copyOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, V v) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V merge(V v, V v2);

    public abstract V naryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.List<? extends V> list) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V newOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V newValue(org.objectweb.asm.Type type);

    public abstract void returnOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, V v, V v2) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, V v, V v2, V v3) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V unaryOperation(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, V v) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    protected Interpreter(int i) {
        this.api = i;
    }

    public V newParameterValue(boolean z, int i, org.objectweb.asm.Type type) {
        return (V) newValue(type);
    }

    public V newReturnTypeValue(org.objectweb.asm.Type type) {
        return (V) newValue(type);
    }

    public V newEmptyValue(int i) {
        return (V) newValue(null);
    }

    public V newExceptionValue(org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode, org.objectweb.asm.tree.analysis.Frame<V> frame, org.objectweb.asm.Type type) {
        return (V) newValue(type);
    }
}

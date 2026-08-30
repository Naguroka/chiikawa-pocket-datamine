package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class SourceValue implements org.objectweb.asm.tree.analysis.Value {
    public final java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> insns;
    public final int size;

    public SourceValue(int i) {
        this(i, new org.objectweb.asm.tree.analysis.SmallSet());
    }

    public SourceValue(int i, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        this.size = i;
        this.insns = new org.objectweb.asm.tree.analysis.SmallSet(abstractInsnNode);
    }

    public SourceValue(int i, java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> set) {
        this.size = i;
        this.insns = set;
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
        return this.size;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.objectweb.asm.tree.analysis.SourceValue)) {
            return false;
        }
        org.objectweb.asm.tree.analysis.SourceValue sourceValue = (org.objectweb.asm.tree.analysis.SourceValue) obj;
        return this.size == sourceValue.size && this.insns.equals(sourceValue.insns);
    }

    public int hashCode() {
        return this.insns.hashCode();
    }
}

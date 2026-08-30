package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public interface IFilterOutput {
    void ignore(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2);

    void merge(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2);

    void replaceBranches(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> set);
}

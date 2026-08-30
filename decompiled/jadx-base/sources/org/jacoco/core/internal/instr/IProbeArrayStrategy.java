package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
public interface IProbeArrayStrategy {
    void addMembers(org.objectweb.asm.ClassVisitor classVisitor, int i);

    int storeInstance(org.objectweb.asm.MethodVisitor methodVisitor, boolean z, int i);
}

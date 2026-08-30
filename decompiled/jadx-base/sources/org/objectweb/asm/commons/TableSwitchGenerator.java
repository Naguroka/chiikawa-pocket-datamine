package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public interface TableSwitchGenerator {
    void generateCase(int i, org.objectweb.asm.Label label);

    void generateDefault();
}

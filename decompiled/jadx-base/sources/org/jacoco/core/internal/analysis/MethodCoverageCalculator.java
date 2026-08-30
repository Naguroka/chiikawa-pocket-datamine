package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
class MethodCoverageCalculator implements org.jacoco.core.internal.analysis.filter.IFilterOutput {
    private final java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> instructions;
    private final java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> ignored = new java.util.HashSet();
    private final java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode> merged = new java.util.HashMap();
    private final java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, java.util.Set<org.objectweb.asm.tree.AbstractInsnNode>> replacements = new java.util.HashMap();

    MethodCoverageCalculator(java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> map) {
        this.instructions = map;
    }

    void calculate(org.jacoco.core.internal.analysis.MethodCoverageImpl methodCoverageImpl) {
        applyMerges();
        applyReplacements();
        ensureCapacity(methodCoverageImpl);
        for (java.util.Map.Entry<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> entry : this.instructions.entrySet()) {
            if (!this.ignored.contains(entry.getKey())) {
                org.jacoco.core.internal.analysis.Instruction value = entry.getValue();
                methodCoverageImpl.increment(value.getInstructionCounter(), value.getBranchCounter(), value.getLine());
            }
        }
        methodCoverageImpl.incrementMethodCounter();
    }

    private void applyMerges() {
        for (java.util.Map.Entry<org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode> entry : this.merged.entrySet()) {
            org.objectweb.asm.tree.AbstractInsnNode key = entry.getKey();
            org.jacoco.core.internal.analysis.Instruction instruction = this.instructions.get(key);
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNodeFindRepresentative = findRepresentative(key);
            this.ignored.add(key);
            java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> map = this.instructions;
            map.put(abstractInsnNodeFindRepresentative, map.get(abstractInsnNodeFindRepresentative).merge(instruction));
            entry.setValue(abstractInsnNodeFindRepresentative);
        }
        for (java.util.Map.Entry<org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode> entry2 : this.merged.entrySet()) {
            this.instructions.put(entry2.getKey(), this.instructions.get(entry2.getValue()));
        }
    }

    private void applyReplacements() {
        for (java.util.Map.Entry<org.objectweb.asm.tree.AbstractInsnNode, java.util.Set<org.objectweb.asm.tree.AbstractInsnNode>> entry : this.replacements.entrySet()) {
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> value = entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(value.size());
            java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(this.instructions.get(it.next()));
            }
            org.objectweb.asm.tree.AbstractInsnNode key = entry.getKey();
            java.util.Map<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> map = this.instructions;
            map.put(key, map.get(key).replaceBranches(arrayList));
        }
    }

    private void ensureCapacity(org.jacoco.core.internal.analysis.MethodCoverageImpl methodCoverageImpl) {
        int line;
        int i = -1;
        int i2 = -1;
        for (java.util.Map.Entry<org.objectweb.asm.tree.AbstractInsnNode, org.jacoco.core.internal.analysis.Instruction> entry : this.instructions.entrySet()) {
            if (!this.ignored.contains(entry.getKey()) && (line = entry.getValue().getLine()) != -1) {
                if (i > line || i2 == -1) {
                    i = line;
                }
                if (i2 < line) {
                    i2 = line;
                }
            }
        }
        methodCoverageImpl.ensureCapacity(i, i2);
    }

    private org.objectweb.asm.tree.AbstractInsnNode findRepresentative(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        while (true) {
            org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2 = this.merged.get(abstractInsnNode);
            if (abstractInsnNode2 == null) {
                return abstractInsnNode;
            }
            abstractInsnNode = abstractInsnNode2;
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterOutput
    public void ignore(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
        while (abstractInsnNode != abstractInsnNode2) {
            this.ignored.add(abstractInsnNode);
            abstractInsnNode = abstractInsnNode.getNext();
        }
        this.ignored.add(abstractInsnNode2);
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterOutput
    public void merge(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode2) {
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNodeFindRepresentative = findRepresentative(abstractInsnNode);
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNodeFindRepresentative2 = findRepresentative(abstractInsnNode2);
        if (abstractInsnNodeFindRepresentative != abstractInsnNodeFindRepresentative2) {
            this.merged.put(abstractInsnNodeFindRepresentative2, abstractInsnNodeFindRepresentative);
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilterOutput
    public void replaceBranches(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode, java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> set) {
        this.replacements.put(abstractInsnNode, set);
    }
}

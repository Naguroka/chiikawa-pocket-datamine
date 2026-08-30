package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class CurrentFrame extends org.objectweb.asm.Frame {
    CurrentFrame(org.objectweb.asm.Label label) {
        super(label);
    }

    @Override // org.objectweb.asm.Frame
    void execute(int i, int i2, org.objectweb.asm.Symbol symbol, org.objectweb.asm.SymbolTable symbolTable) {
        super.execute(i, i2, symbol, symbolTable);
        org.objectweb.asm.Frame frame = new org.objectweb.asm.Frame(null);
        merge(symbolTable, frame, 0);
        copyFrom(frame);
    }
}
